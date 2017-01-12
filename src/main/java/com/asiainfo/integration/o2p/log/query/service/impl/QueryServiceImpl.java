/** 
 * Project Name:logQuery 
 * File Name:QueryServiceImpl.java 
 * Package Name:com.asiainfo.log.query.service.impl 
 * Date:2015年10月19日下午2:17:17 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/

package com.asiainfo.integration.o2p.log.query.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.CollectionUtils;

import net.minidev.json.JSONArray;

import com.ailk.eaap.o2p.common.cache.ICacheFactory;
import com.ailk.eaap.op2.bo.QueryBean;
import com.asiainfo.integration.o2p.log.common.util.CacheUtils;
import com.asiainfo.integration.o2p.log.common.util.LogUtils;
import com.asiainfo.integration.o2p.log.query.bean.ContractInteractionDetail;
import com.asiainfo.integration.o2p.log.query.bean.EndpointInteractionDetail;
import com.asiainfo.integration.o2p.log.query.dao.IQueryDao;
import com.asiainfo.integration.o2p.log.query.dao.impl.QueryDaoImpl;
import com.asiainfo.integration.o2p.log.query.json.ObjectToJsonUtil;
import com.asiainfo.integration.o2p.log.query.service.IQueryService;
import com.asiainfo.integration.o2p.log.query.util.LogQueryUtil;
import com.ailk.eaap.op2.bo.ContractInteraction;
import com.ailk.eaap.op2.bo.EndpointInteraction;
import com.ailk.eaap.op2.bo.JdbcDataSource;

/**
 * ClassName:QueryServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2015年10月19日 下午2:17:17 <br/>
 * 
 * @author daimq
 * @version
 * @since JDK 1.6
 * @see
 */
public class QueryServiceImpl implements IQueryService {

	private IQueryDao queryDao;
	@Resource(name = "cacheFactory")
	private ICacheFactory<String, Object> cacheFactory;

	public ICacheFactory<String, Object> getCacheFactory() {
		return cacheFactory;
	}

	public void setCacheFactory(ICacheFactory<String, Object> cacheFactory) {
		this.cacheFactory = cacheFactory;
	}

	private static final Log LOG = LogFactory.getLog(QueryServiceImpl.class);

	public long queryCICount(QueryBean queryBean) {

		Integer tenantId = queryBean.getTenantId();
		if (tenantId == null) {
			LOG.warn("param tenantId is null!");
			return 0;
		}
		// get all datasource from cache by tenant
		List<JdbcDataSource> dataSourceList = CacheUtils.getDataSourceListByTenantId(tenantId,
				cacheFactory.getCacheClient());
		if (dataSourceList == null || dataSourceList.isEmpty()) {
			LOG.warn(
					"There is no datasource config data in cache for any tenant, please check the tennat or datasource config data in db!");
			return 0;
		}

		Map<String, Object> conMap = new HashMap<String, Object>();
		conMap.put("srcTranId", queryBean.getJfTransactionID());// queryBean.getSrcTranId()
		conMap.put("srcSysCode", queryBean.getJfSrcSysCode());// queryBean.getSrcSysCode()
		conMap.put("dstSysCode", queryBean.getDstSysCode());
		conMap.put("startSrcReqTime", queryBean.getStartSrcReqTime());
		conMap.put("endSrcReqTime", queryBean.getEndSrcReqTime());
		conMap.put("contractVersion", queryBean.getContractVersion());
		conMap.put("responseCode", queryBean.getResponseCode());
		conMap.put("status", queryBean.getStatus());
		conMap.put("tenantId", queryBean.getTenantId());
		Long ciCount = 0L;
		for (JdbcDataSource jds : dataSourceList) {
			if (String.valueOf(jds.getDataSourceId()).equals(queryBean.getDataSourceId())) {
				String tabSuffixStr = CacheUtils.getTabSuffix(jds.getTenantId(), jds.getDataSourceId(),
						cacheFactory.getCacheClient());
				List<String> tabSuffixList = LogQueryUtil.maketabSuffixList(queryBean, tabSuffixStr);
				for (String tabSuffix : tabSuffixList) {
					conMap.put("tabSuffix", tabSuffix);
					queryDao = (IQueryDao) LogUtils.getDaoObject("queryDaoImpl", jds);
					ciCount += queryDao.queryCICount(conMap);
				}
				break;
			}
		}
		return ciCount;
	}

	public String queryCIDataPage(QueryBean queryBean, int pageNo, int pageSize) {
		Integer tenantId = queryBean.getTenantId();
		if (tenantId == null) {
			LOG.warn("param tenantId is null!");
			return null;
		}
		// get all datasource from cache by tenant
		List<JdbcDataSource> dataSourceList = CacheUtils.getDataSourceListByTenantId(tenantId,
				cacheFactory.getCacheClient());
		if (dataSourceList == null || dataSourceList.isEmpty()) {
			LOG.warn(
					"There is no datasource config data in cache for any tenant, please check the tennat or datasource config data in db!");
			return null;
		}

		Map<String, Object> conMap = new HashMap<String, Object>();
		int startRow = (pageNo - 1) * pageSize;
		int endRow = LogQueryUtil.calEndRowByStartRow(startRow, pageSize);

		String dataSourceKey = "unknown";
		// dataSourceKey = databaseLocate(this.getRoutingRules(queryBean));

		// String tabSuffix = LogQueryUtil.maketabSuffix(queryBean);//_YYMM

		conMap.put("srcTranId", queryBean.getJfTransactionID());// queryBean.getSrcTranId()
		conMap.put("srcSysCode", queryBean.getJfSrcSysCode());// queryBean.getSrcSysCode()
		conMap.put("dstSysCode", queryBean.getDstSysCode());
		conMap.put("startSrcReqTime", queryBean.getStartSrcReqTime());// 实际获取的是createTime
		conMap.put("endSrcReqTime", queryBean.getEndSrcReqTime());// 实际获取的是createTime
		conMap.put("contractVersion", queryBean.getContractVersion());
		conMap.put("status", queryBean.getStatus());
		conMap.put("responseCode", queryBean.getResponseCode());
		conMap.put("tenantId", queryBean.getTenantId());

		Long ciCount=0L;
		List<ContractInteraction> list = new ArrayList<ContractInteraction>();
		for (JdbcDataSource jds : dataSourceList) {
			if (String.valueOf(jds.getDataSourceId()).equals(queryBean.getDataSourceId())) {
				String tabSuffixStr = CacheUtils.getTabSuffix(jds.getTenantId(), jds.getDataSourceId(),
						cacheFactory.getCacheClient());
				List<String> tabSuffixList = LogQueryUtil.maketabSuffixList(queryBean, tabSuffixStr);
				if(tabSuffixList!=null){
					Collections.reverse(tabSuffixList);
				}
				for (String tabSuffix : tabSuffixList) {
					conMap.put("tabSuffix", tabSuffix);
					// set datasource
					queryDao = (QueryDaoImpl) LogUtils.getDaoObject("queryDaoImpl", jds);
					
					conMap.put("startRow", "");
					conMap.put("endRow", "");
					ciCount = queryDao.queryCICount(conMap);
					endRow = LogQueryUtil.calEndRowByStartRow(startRow, pageSize);
					if(ciCount>startRow){
						conMap.put("startRow", startRow);
						conMap.put("endRow", endRow);
						// execute query
						List<ContractInteraction> objList = queryDao.queryCIDataPage(conMap);
						if (!CollectionUtils.isEmpty(objList)) {
							for (ContractInteraction contractInteraction : objList) {
								// System.out.println("===contractInteraction="+contractInteraction.getSrcTranId());
								contractInteraction.setContractInteractionId(
										dataSourceKey + tabSuffix + "_" + contractInteraction.getContractInteractionId());
								list.add(contractInteraction);
								if(list.size()>=pageSize){
									break;
								}
							}
						}
						startRow=0;
					}else{
						startRow=(int) (startRow-ciCount);
					}
					if(list.size()>=pageSize){
						break;
					}
				}
				break;
			}
		}
		String res = ObjectToJsonUtil.listToJson(list);
		// 最终格式化后的形式：rowkey = dskey+tableSuffix+ciid+createtime
		return res;
	}

	public String queryCIByRowkey(String rowkey, Integer tenantId) {
		if (tenantId == null) {
			LOG.warn("param tenantId is null!");
			return null;
		}
		// get all datasource from cache by tenant
		List<JdbcDataSource> dataSourceList = CacheUtils.getDataSourceListByTenantId(tenantId,
				cacheFactory.getCacheClient());
		if (dataSourceList == null || dataSourceList.isEmpty()) {
			LOG.warn(
					"There is no datasource config data in cache for any tenant, please check the tennat or datasource config data in db!");
			return null;
		}
		String[] key = rowkey.split("_");
		// String dataSourceName = key[0];
		String tabSuffix = "_" + key[1];
		rowkey = key[2];
		String createTime = key[3];
		QueryBean queryBean = new QueryBean();
		queryBean.setContractInteractionId(rowkey);
		// String tabSuffix = this.maketabSuffix(queryBean);

		Map<String, Object> conMap = new HashMap<String, Object>();

		conMap.put("contractInteractionId", queryBean.getContractInteractionId());
		conMap.put("tabSuffix", tabSuffix);
		conMap.put("createTime", createTime);
		conMap.put("tenantId", tenantId);

		List<ContractInteractionDetail> list = new ArrayList<ContractInteractionDetail>();
		for (JdbcDataSource jds : dataSourceList) {
			// set datasource
			queryDao = (IQueryDao) LogUtils.getDaoObject("queryDaoImpl", jds);
			// execute query
			List<ContractInteractionDetail> objList = queryDao.queryCIByRowkey(conMap);
			if (!CollectionUtils.isEmpty(objList)) {
				list.addAll(objList);
			}
		}
		return ObjectToJsonUtil.listToJson(list);
	}

	public String queryEIByRowkey(String rowkey, Integer tenantId) {
		if (tenantId == null) {
			LOG.warn("param tenantId is null!");
			return null;
		}
		// get all datasource from cache by tenant
		List<JdbcDataSource> dataSourceList = CacheUtils.getDataSourceListByTenantId(tenantId,
				cacheFactory.getCacheClient());
		if (dataSourceList == null || dataSourceList.isEmpty()) {
			LOG.warn(
					"There is no datasource config data in cache for any tenant, please check the tennat or datasource config data in db!");
			return null;
		}
		String[] array = rowkey.split("_");
		// array[0]->协议流水号
		// ;array[1]->端点交互id;array[2]->dataSourceName,array[3]->表后缀;array[4]->createTime
		QueryBean queryBean = new QueryBean();

		queryBean.setContractInteractionId(array[0]);
		// String dataSourceName = array[2];
		String tabSuffix = "_" + array[3];
		String createTime = array[4];
		// DataSourceRouteUtil.putContextDataSourceName(dataSourceName);
		// String tabSuffix = this.maketabSuffix(queryBean);

		Map<String, Object> conMap = new HashMap<String, Object>();

		conMap.put("endpointInteractionId", array[1]);
		conMap.put("tabSuffix", tabSuffix);
		conMap.put("createTime", createTime);
		List<EndpointInteractionDetail> list = new ArrayList<EndpointInteractionDetail>();
		for (JdbcDataSource jds : dataSourceList) {
			// set datasource
			queryDao = (IQueryDao) LogUtils.getDaoObject("queryDaoImpl", jds);
			// execute query
			List<EndpointInteractionDetail> objList = this.queryDao.queryEIByRowkey(conMap);
			if (!CollectionUtils.isEmpty(objList)) {
				list.addAll(objList);
			}
		}
		return ObjectToJsonUtil.listToJson(list);
	}

	public long queryEICount(QueryBean queryBean) {
		Long count = 0L;
		Integer tenantId = queryBean.getTenantId();
		if (tenantId == null) {
			LOG.warn("param tenantId is null!");
			return count;
		}
		// get all datasource from cache by tenant
		List<JdbcDataSource> dataSourceList = CacheUtils.getDataSourceListByTenantId(tenantId,
				cacheFactory.getCacheClient());
		if (dataSourceList == null || dataSourceList.isEmpty()) {
			LOG.warn(
					"There is no datasource config data in cache for any tenant, please check the tennat or datasource config data in db!");
			return count;
		}

		Map<String, Object> conMap = new HashMap<String, Object>();
		String rowkey = queryBean.getContractInteractionId();
		String[] key = rowkey.split("_");
		// String dataSourceName = key[0];
		String tabSuffix = "_" + key[1];
		rowkey = key[2];
		queryBean.setContractInteractionId(rowkey);
		// DataSourceRouteUtil.putContextDataSourceName(dataSourceName);
		// String tabSuffix = this.maketabSuffix(queryBean);
		conMap.put("contractInteractionId", queryBean.getContractInteractionId());
		conMap.put("tabSuffix", tabSuffix);
		for (JdbcDataSource jds : dataSourceList) {
			// set datasource
			queryDao = (IQueryDao) LogUtils.getDaoObject("queryDaoImpl", jds);
			// execute query
			count += this.queryDao.queryEICount(conMap);
		}
		return count;
	}

	public String queryEIDataPage(QueryBean queryBean, int pageNo, int pageSize) {
		Integer tenantId = queryBean.getTenantId();
		if (tenantId == null) {
			LOG.warn("param tenantId is null!");
			return null;
		}
		// get all datasource from cache by tenant
		List<JdbcDataSource> dataSourceList = CacheUtils.getDataSourceListByTenantId(tenantId,
				cacheFactory.getCacheClient());
		if (dataSourceList == null || dataSourceList.isEmpty()) {
			LOG.warn(
					"There is no datasource config data in cache for any tenant, please check the tennat or datasource config data in db!");
			return null;
		}
		Map<String, Object> conMap = new HashMap<String, Object>();

		int startRow = (pageNo - 1) * pageSize;
		int endRow = LogQueryUtil.calEndRow(pageNo, pageSize);
		String rowkey = queryBean.getContractInteractionId();
		String[] key = rowkey.split("_");
		String dataSourceName = key[0];
		String tabSuffix = "_" + key[1];
		rowkey = key[2];
		queryBean.setContractInteractionId(rowkey);
		// DataSourceRouteUtil.putContextDataSourceName(dataSourceName);
		// String tabSuffix = this.maketabSuffix(queryBean);

		conMap.put("contractInteractionId", queryBean.getContractInteractionId());
		conMap.put("tabSuffix", tabSuffix);
		conMap.put("startRow", startRow);
		conMap.put("endRow", endRow);

		List<EndpointInteraction> list = new ArrayList<EndpointInteraction>();
		for (JdbcDataSource jds : dataSourceList) {
			// set datasource
			queryDao = (IQueryDao) LogUtils.getDaoObject("queryDaoImpl", jds);
			// execute query
			List<EndpointInteraction> objList = this.queryDao.queryEIDataPage(conMap);
			if (!CollectionUtils.isEmpty(objList)) {
				for (EndpointInteraction endpointInteraction : objList) {
					endpointInteraction.setEndpointInteractionId(
							endpointInteraction.getEndpointInteractionId() + "_" + dataSourceName + tabSuffix);
					// 最后json返回的格式：rowkey是协议流水号_端点ID_dataSourcekey_YYMM_创建时间
					list.add(endpointInteraction);
				}
			}
		}
		return ObjectToJsonUtil.listToJson(list);
	}

	public String queryCtgDataPage(QueryBean queryBean, int pageNo, int pageSize) {
		Integer tenantId = queryBean.getTenantId();
		if (tenantId == null) {
			LOG.warn("param tenantId is null!");
			return null;
		}
		// get all datasource from cache by tenant
		List<JdbcDataSource> dataSourceList = CacheUtils.getDataSourceListByTenantId(tenantId,
				cacheFactory.getCacheClient());
		if (dataSourceList == null || dataSourceList.isEmpty()) {
			LOG.warn(
					"There is no datasource config data in cache for any tenant, please check the tennat or datasource config data in db!");
			return null;
		}
		Map<String, Object> conMap = new HashMap<String, Object>();
		int startRow = (pageNo - 1) * pageSize;
		int endRow = LogQueryUtil.calEndRowByStartRow(startRow, pageSize);
		String dataSourceKey = null;
		// dataSourceKey = databaseLocate(this.getRoutingRules(queryBean));

		conMap.put("contractInteractionId", queryBean.getJfTransactionID());// queryBean.getSrcTranId()
		conMap.put("logSeq", queryBean.getLogSeq());// queryBean.getSrcSysCode()
		conMap.put("errCode", queryBean.getErrCode());
		conMap.put("funName", queryBean.getFunName());
		conMap.put("startCreateDate", queryBean.getStartSrcReqTime());
		conMap.put("endCreateDate", queryBean.getEndSrcReqTime());
		conMap.put("tenantId", queryBean.getTenantId());
		
		Long ctgCount=0L;
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		for (JdbcDataSource jds : dataSourceList) {
			if (String.valueOf(jds.getDataSourceId()).equals(queryBean.getDataSourceId())) {
				String tabSuffixStr = CacheUtils.getTabSuffix(jds.getTenantId(), jds.getDataSourceId(),
						cacheFactory.getCacheClient());
				List<String> tabSuffixList = LogQueryUtil.maketabSuffixList(queryBean, tabSuffixStr);
				if (tabSuffixList != null) {
					Collections.reverse(tabSuffixList);
				}
				for (String tabSuffix : tabSuffixList) {
					conMap.put("tabSuffix", tabSuffix);
					// set datasource
					queryDao = (IQueryDao) LogUtils.getDaoObject("queryDaoImpl", jds);

					conMap.put("startRow", "");
					conMap.put("endRow", "");
					ctgCount = queryDao.queryCtgCount(conMap);
					endRow = LogQueryUtil.calEndRowByStartRow(startRow, pageSize);
					if (ctgCount > startRow) {
						conMap.put("startRow", startRow);
						conMap.put("endRow", endRow);
						// execute query
						List<Map<String, String>> objList = this.queryDao.queryCtgDataPage(conMap);
						if (!CollectionUtils.isEmpty(objList)) {
							for (Map<String, String> map : objList) {
								map.put("rowkeyValue", dataSourceKey + tabSuffix + "_" + map.get("logSeq"));
								list.add(map);
								if (list.size() >= pageSize) {
									break;
								}
							}
						}
						startRow = 0;
					} else {
						startRow = (int) (startRow - ctgCount);
					}
					if (list.size() >= pageSize) {
						break;
					}
				}
				break;
			}
		}
		return JSONArray.toJSONString(list);
	}

	public long queryCtgCount(QueryBean queryBean) {
		Long count = 0L;
		Integer tenantId = queryBean.getTenantId();
		if (tenantId == null) {
			LOG.warn("param tenantId is null!");
			return count;
		}
		// get all datasource from cache by tenant
		List<JdbcDataSource> dataSourceList = CacheUtils.getDataSourceListByTenantId(tenantId,
				cacheFactory.getCacheClient());
		if (dataSourceList == null || dataSourceList.isEmpty()) {
			LOG.warn(
					"There is no datasource config data in cache for any tenant, please check the tennat or datasource config data in db!");
			return count;
		}
		Map<String, Object> conMap = new HashMap<String, Object>();
		// databaseLocate(this.getRoutingRules(queryBean));

		conMap.put("contractInteractionId", queryBean.getJfTransactionID());// queryBean.getSrcTranId()
		conMap.put("logSeq", queryBean.getLogSeq());// queryBean.getSrcSysCode()
		conMap.put("errCode", queryBean.getErrCode());
		conMap.put("funName", queryBean.getFunName());
		conMap.put("startCreateDate", queryBean.getStartSrcReqTime());
		conMap.put("endCreateDate", queryBean.getEndSrcReqTime());
		conMap.put("tenantId", queryBean.getTenantId());
		for (JdbcDataSource jds : dataSourceList) {
			if (String.valueOf(jds.getDataSourceId()).equals(queryBean.getDataSourceId())) {
				String tabSuffixStr = CacheUtils.getTabSuffix(jds.getTenantId(), jds.getDataSourceId(),
						cacheFactory.getCacheClient());
				List<String> tabSuffixList = LogQueryUtil.maketabSuffixList(queryBean, tabSuffixStr);
				for (String tabSuffix : tabSuffixList) {
					conMap.put("tabSuffix", tabSuffix);
					// set datasource
					queryDao = (IQueryDao) LogUtils.getDaoObject("queryDaoImpl", jds);
					// execute query
					count += this.queryDao.queryCtgCount(conMap);
				}
				break;
			}
		}
		return count;
	}

	public String queryCtgByRowkey(String rowkey, Integer tenantId) {
		if (tenantId == null) {
			LOG.warn("param tenantId is null!");
			return null;
		}
		// get all datasource from cache by tenant
		List<JdbcDataSource> dataSourceList = CacheUtils.getDataSourceListByTenantId(tenantId,
				cacheFactory.getCacheClient());
		if (dataSourceList == null || dataSourceList.isEmpty()) {
			LOG.warn(
					"There is no datasource config data in cache for any tenant, please check the tennat or datasource config data in db!");
			return null;
		}
		String[] key = rowkey.split("_");
		// String dataSourceName = key[0];
		String tabSuffix = "_" + key[1];
		rowkey = key[2];
		// DataSourceRouteUtil.putContextDataSourceName(dataSourceName);
		QueryBean queryBean = new QueryBean();
		queryBean.setLogSeq(rowkey);
		// String tabSuffix = this.maketabSuffix(queryBean);

		Map<String, Object> conMap = new HashMap<String, Object>();

		conMap.put("logSeq", queryBean.getLogSeq());
		conMap.put("tabSuffix", tabSuffix);

		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		for (JdbcDataSource jds : dataSourceList) {
			// set datasource
			queryDao = (IQueryDao) LogUtils.getDaoObject("queryDaoImpl", jds);
			// execute query
			List<Map<String, String>> objList = this.queryDao.queryCtgByRowkey(conMap);
			if (!CollectionUtils.isEmpty(objList)) {
				list.addAll(objList);
			}
		}
		return JSONArray.toJSONString(list);
	}

	public String test(String test) {
		return test;
	}
}
