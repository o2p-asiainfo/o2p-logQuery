/** 
 * Project Name:logQuery 
 * File Name:QueryDaoImpl.java 
 * Package Name:com.asiainfo.log.query.dao.impl 
 * Date:2015年10月19日下午2:19:30 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.log.query.dao.impl;  

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.asiainfo.integration.o2p.log.common.util.Compressor;
import com.asiainfo.integration.o2p.log.query.bean.ContractInteractionDetail;
import com.asiainfo.integration.o2p.log.query.bean.EndpointInteractionDetail;
import com.asiainfo.integration.o2p.log.query.dao.IQueryDao;
import com.asiainfo.integration.o2p.log.query.util.CommonMethodUtil;
import com.ailk.eaap.op2.bo.ContractInteraction;
import com.ailk.eaap.op2.bo.EndpointInteraction;

/** 
 * ClassName:QueryDaoImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年10月19日 下午2:19:30 <br/> 
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class QueryDaoImpl extends SqlSessionDaoSupport implements IQueryDao, Serializable {

	private static final long serialVersionUID = 1L;
	public static final Log LOG = LogFactory.getLog(QueryDaoImpl.class);
    public long queryCICount(Map<String, Object> conMap) {
        long result = 0l;
        try {
            List list =this.getSqlSession().selectList("mapper.contractInteraction.queryCount", conMap);
            if(list!=null && list.get(0)!=null){
                result =  Long.parseLong(String.valueOf(list.get(0)));
            }
        } catch (NumberFormatException e) {
            LOG.error("query ci count err,cause by:",e);
        }catch(Exception e){
            LOG.error("query ci count err,cause by:",e);
        }
        return result;
    }

    public List<ContractInteraction> queryCIDataPage(Map<String, Object> conMap) {
        try {
        	return this.getSqlSession().selectList("mapper.contractInteraction.queryContractInteraction",conMap);
        } catch (Exception e) {
            LOG.error("query ci data err,cause by:",e);
        }
        return null;
    }

    public List<ContractInteractionDetail> queryCIByRowkey(
            Map<String, Object> conMap) {
        List<ContractInteractionDetail> list = new ArrayList<ContractInteractionDetail>();
        try {
            list = this.getSqlSession().selectList("mapper.contractInteraction.queryContractInteractionDetail",conMap);
            List<ContractInteractionDetail> exception = this.getSqlSession().selectList("mapper.contractInteraction.queryContractInteractionDetailOfException",conMap);
            List<ContractInteractionDetail> ctg = this.getSqlSession().selectList("mapper.contractInteraction.queryContractInteractionDetailOfCtg",conMap);
            ContractInteractionDetail c = null;
            if(list != null && list.size()>0){
                c = list.get(0);
            }
            if(exception != null && exception.size()>0){
                if(exception.get(0) != null){
                    c.setExceptionSpecId(exception.get(0).getExceptionSpecId());
                    c.setExceptionMessage(exception.get(0).getExceptionMessage());
                    c.setContent(exception.get(0).getContent());
                    c.setStaffNbr(exception.get(0).getStaffNbr());
                }
            }
            if(ctg != null && ctg.size() >0){
                if(ctg.get(0) != null){
                    c.setErrCode(ctg.get(0).getErrCode());
                    c.setFunName(ctg.get(0).getFunName());
                    c.setErrorMsg(ctg.get(0).getErrorMsg());
                    c.setDescriptor(ctg.get(0).getDescriptor());
                    c.setStatus(ctg.get(0).getStatus());
                }
            }
        } catch (Exception e) {
            LOG.error("query ci data detail err,cause by:",e);
        }
        return list;
    }


    public List<EndpointInteractionDetail> queryEIByRowkey(
            Map<String, Object> conMap) {
        List<EndpointInteractionDetail> list = new ArrayList<EndpointInteractionDetail>();
          try {
                list = this.getSqlSession().selectList("mapper.endpointInteraction.queryEndpointInteractionDetail",conMap);
                //List<EndpointInteractionDetail> ori = this.getSqlSession().selectList("mapper.endpointInteraction.queryEndpointInteractionDetailOfOri",conMap);
                EndpointInteractionDetail e = null;
                if(!CommonMethodUtil.isListEmpty(list)){
                    e = list.get(0);
                    e.setOutMsg(Compressor.unGzip(e.getOutMsg()));
                    e.setInMsg(Compressor.unGzip(e.getInMsg()));
                }
    //        if(!CommonMethodUtil.isListEmpty(ori)){
    //            e.setSrcSysCode(ori.get(0).getSrcSysCode());
    //            e.setSrcOrgCode(ori.get(0).getSrcOrgCode());
    //            for(EndpointInteractionDetail ejoino:ori){
    //                if("0".equals(ejoino.getReqOrRes())){
    //                    e.setInMsg(Compressor.unGzip(ejoino.getMsg()));
    //                }
    //                if("1".equals(ejoino.getReqOrRes())){
    //                    e.setOutMsg(Compressor.unGzip(ejoino.getMsg()));
    //                    //当前端点明细已当前端点出去时的信息为准
    //                    e.setFailMsg(ejoino.getFailMsg());
    //                }
    //            }
    //        }
        } catch (Exception e) {
            LOG.error("query ei data detail err,cause by:",e);
        }
      return list;
    }

    public long queryEICount(Map<String, Object> conMap) {
        long result = 0l;
        try {
            List list = this.getSqlSession().selectList("mapper.endpointInteraction.queryCount",conMap);
            if(list!=null && list.get(0)!=null){
                result = Long.parseLong(String.valueOf(list.get(0)));
            }
        } catch (NumberFormatException e) {
            LOG.error("query ei count detail err,cause by:",e);
        }catch(Exception e){
            LOG.error("query ei count detail err,cause by:",e);
        }
        return result;
    }

    public List<EndpointInteraction> queryEIDataPage(Map<String, Object> conMap) {
        List<EndpointInteraction> list = new ArrayList<EndpointInteraction>();
        try {
            list = this.getSqlSession().selectList("mapper.endpointInteraction.queryEndpointInteraction",conMap);
        } catch (Exception e) {
            LOG.error("query ei data err,cause by:",e);
        }
        return list;
    }

    public long queryCtgCount(Map<String, Object> conMap) {
        long result = 0l;
        try {
            List list = this.getSqlSession().selectList("mapper.ctgLogs.queryCount", conMap);
            if(list!=null && list.get(0)!=null){
                result = Long.parseLong(String.valueOf(list.get(0)));
            }
        } catch (NumberFormatException e) {
            LOG.error("query ctg count  err,cause by:",e);
        }catch (Exception e) {
            LOG.error("query ctg count  err,cause by:",e);
        }
        return result;
    }

    public List<Map<String,String>> queryCtgDataPage(Map<String, Object> conMap) {
        List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        try {
            list = this.getSqlSession().selectList("mapper.ctgLogs.queryCtgLogs", conMap);
        } catch (Exception e) {
            LOG.error("query ctg data  err,cause by:",e);
        }
        return list;
    }

    public List<Map<String,String>> queryCtgByRowkey(Map<String, Object> conMap) {
        List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        try {
            list = this.getSqlSession().selectList("mapper.ctgLogs.queryCtgLogs", conMap);
        } catch (Exception e) {
            LOG.error("query ctg data detail err,cause by:",e);
        }
        return list;
    }

}
