/** 
 * Project Name:logQuery 
 * File Name:HbaseQueryServiceImpl.java 
 * Package Name:com.asiainfo.log.query.service.impl 
 * Date:2015年10月21日下午2:34:06 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.log.query.service.impl;  

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minidev.json.JSONArray;

import org.apache.commons.collections.CollectionUtils;
import org.apache.hadoop.hbase.client.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ailk.eaap.op2.bo.QueryBean;
import com.asiainfo.integration.o2p.log.common.bo.HbContractInteraction;
import com.asiainfo.integration.o2p.log.common.bo.HbEndpointInteraction;
import com.asiainfo.integration.o2p.log.common.bo.SimpleCIObject;
import com.asiainfo.integration.o2p.log.common.bo.SimpleEIObject;
import com.asiainfo.integration.o2p.log.common.solr.SolrConfig;
import com.asiainfo.integration.o2p.log.common.util.Compressor;
import com.asiainfo.integration.o2p.log.query.dao.IHbaseQueryDao;
import com.asiainfo.integration.o2p.log.query.dao.ISolrQueryDao;
import com.asiainfo.integration.o2p.log.query.json.ObjectToJsonUtil;
import com.asiainfo.integration.o2p.log.query.service.IQueryService;

/** 
 * ClassName:HbaseQueryServiceImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年10月21日 下午2:34:06 <br/> 
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class HbaseQueryServiceImpl implements IQueryService {

    
    private IHbaseQueryDao hbaseQueryDao;
    private ISolrQueryDao solrQueryDao;
    private  static  final Logger LOG = LoggerFactory.getLogger(HbaseQueryServiceImpl.class);
    public String queryCIDataPage(QueryBean queryBean, int pageNo, int pageSize) {
        
        List<SimpleCIObject> objList = null;
        try {
            queryBean.setTable(SolrConfig.table_CI);
            List<String> list = solrQueryDao.queryRowKey(queryBean,pageNo,pageSize);
            List<Get> gets = new ArrayList<Get>();
            if(!CollectionUtils.isEmpty(list)){
                for(String rowKey :list){
                    gets.add(new Get(rowKey.getBytes()));
                }
            }
            Map<String,Object> conMap = new HashMap<String,Object>();
            conMap.put("gets",gets);
            objList = this.hbaseQueryDao.queryCIDataPage(conMap);
        } catch (Exception e) {
            LOG.error("queryCIDataPage err,cause by:",e);
        }
        return ObjectToJsonUtil.listToJson(objList);
    }

    public String queryEIDataPage(QueryBean queryBean, int pageNo, int pageSize) {
        List<SimpleEIObject> eis = null;
        try {
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("rowkey",queryBean.getContractInteractionId());
            int start = (pageNo-1) * pageSize;
            int end = pageNo * pageSize;
            map.put("start",start);
            map.put("end", end);
            eis = this.hbaseQueryDao.queryEIDataPage(map);
        } catch (Exception e) {
            LOG.error("queryEIDataPage err,cause by:",e);
        }
        return ObjectToJsonUtil.listToJson(eis);
    }

    public long queryCICount(QueryBean queryBean) {
        long result = 0l;
        try {
            queryBean.setTable(SolrConfig.table_CI);
            result =  this.solrQueryDao.queryCount(queryBean);
        } catch (Exception e) {
            LOG.error("queryCICount err,cause by:",e);
        }
        return result;
    }

    public long queryEICount(QueryBean queryBean) {
        long result = 0l;
        try {
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("rowkey",queryBean.getContractInteractionId());
            result = this.hbaseQueryDao.queryEICount(map);
        } catch (Exception e) {
            LOG.error("queryEICount err,cause by:",e);
        }
        return result;
    }

    public String queryCIByRowkey(String rowkey, Integer tenantId) {
        List<HbContractInteraction> result = null;
        try {
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("rowkey", rowkey);
            map.put("tenantId", tenantId);
            result = this.hbaseQueryDao.queryCIByRowkey(map);
        } catch (Exception e) {
            LOG.error("queryCIByRowkey err,cause by:",e);
        }
        return ObjectToJsonUtil.listToJson(result);
    }

    public String queryEIByRowkey(String rowkey, Integer tenantId) {
        List<HbEndpointInteraction> list = null;
        try {
            Map<String,Object> map = new HashMap<String,Object>();
            String[] keys = rowkey.split("_");
            String ciId = keys[0];
            String eiId = keys[1];
            map.put("ciId",ciId);
            map.put("eiId", eiId);
            map.put("tenantId", tenantId);
            list = this.hbaseQueryDao.queryEIByRowkey(map);
            if(!CollectionUtils.isEmpty(list)){
                for(HbEndpointInteraction he:list){
                    he.setInMsg(Compressor.unGzip(he.getInMsg()));
                    he.setOutMsg(Compressor.unGzip(he.getOutMsg()));
                }
            }
        } catch (Exception e) {
            LOG.error("queryEIByRowkey err,cause by:",e);
        }
        return ObjectToJsonUtil.listToJson(list);
    }

    public String queryCtgDataPage(QueryBean queryBean, int pageNo, int pageSize) {
        List<Map<String, String>> objList = null;
        try {
            queryBean.setTable(SolrConfig.table_CI);
            List<String> list = solrQueryDao.queryRowKey(queryBean,pageNo,pageSize);
            List<Get> gets = new ArrayList<Get>();
            if(!CollectionUtils.isEmpty(list)){
                for(String rowKey :list){
                    gets.add(new Get(rowKey.getBytes()));
                }
                
            }
            Map<String,Object> conMap = new HashMap<String,Object>();
            conMap.put("gets",gets);
            objList = this.hbaseQueryDao.queryCtgDataPage(conMap);
        } catch (Exception e) {
            LOG.error("queryCtgDataPage err,cause by:",e);
        }
        return JSONArray.toJSONString(objList);
    }

    public long queryCtgCount(QueryBean queryBean) {
        long result = 0l;
        try {
            queryBean.setTable(SolrConfig.table_CI);
            result = this.solrQueryDao.queryCount(queryBean);
        } catch (Exception e) {
            LOG.error("queryCtgCount err,cause by:",e);
        }
        return result;
    }

    public String queryCtgByRowkey(String rowkey, Integer tenantId) {
        List<Map<String, String>> objList = null;
        try {
            Map<String,Object> map = new HashMap<String,Object>();
            List<Get> gets = new ArrayList<Get>();
            gets.add(new Get(rowkey.getBytes()));
            map.put("gets", gets);
            map.put("tenantId", tenantId);
            objList = this.hbaseQueryDao.queryCtgByRowkey(map);
        } catch (Exception e) {
            LOG.error("queryCtgCount err,cause by:",e);
        }
        return JSONArray.toJSONString(objList);
    }

    public String test(String test) {
        return null;
    }


    public IHbaseQueryDao getHbaseQueryDao() {
        return hbaseQueryDao;
    }

    public void setHbaseQueryDao(IHbaseQueryDao hbaseQueryDao) {
        this.hbaseQueryDao = hbaseQueryDao;
    }

    public ISolrQueryDao getSolrQueryDao() {
        return solrQueryDao;
    }

    public void setSolrQueryDao(ISolrQueryDao solrQueryDao) {
        this.solrQueryDao = solrQueryDao;
    }

    
}
