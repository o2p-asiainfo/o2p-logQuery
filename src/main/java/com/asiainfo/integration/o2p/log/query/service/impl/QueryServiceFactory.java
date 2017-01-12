/** 
 * Project Name:logQuery 
 * File Name:BaseQueryServiceImpl.java 
 * Package Name:com.asiainfo.log.query.service.impl 
 * Date:2015年10月21日上午9:45:19 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.log.query.service.impl;  

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ailk.eaap.op2.bo.QueryBean;
import com.asiainfo.integration.o2p.log.common.util.Properties;
import com.asiainfo.integration.o2p.log.query.service.IQueryService;

/** 
 * ClassName:BaseQueryServiceImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年10月21日 上午9:45:19 <br/> 
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class QueryServiceFactory implements IQueryService {
    
    private Map<String,IQueryService> factory;

    private  static final Logger LOG  = LoggerFactory.getLogger(QueryServiceFactory.class);
    public String queryCIDataPage(QueryBean queryBean, int pageNo, int pageSize) {
       String result = "";
       try {
           result =  factory.get(Properties.getInstance().getDatabaseType())
                   .queryCIDataPage(queryBean, pageNo, pageSize);
    } catch (Exception e) {
        LOG.error("queryCIDataPage err,cause by :",e);
    }
       return result;
    }

    public String queryEIDataPage(QueryBean queryBean, int pageNo, int pageSize) {
        String result = "";
        try {
            result =  factory.get(Properties.getInstance().getDatabaseType())
                    .queryEIDataPage(queryBean, pageNo, pageSize);
        } catch (Exception e) {
            LOG.error("queryEIDataPage err,cause by :",e);
        }
        return result;
    }

    public long queryCICount(QueryBean queryBean) {
        long result = 0l;
        try {
            result = factory.get(Properties.getInstance().getDatabaseType())
                    .queryCICount(queryBean);
        } catch (Exception e) {
            LOG.error("queryCICount err,cause by :",e);
        }
        return result;
    }

    public long queryEICount(QueryBean queryBean) {
        long result = 0l;
        try {
            result = factory.get(Properties.getInstance().getDatabaseType())
                    .queryEICount(queryBean);
        } catch (Exception e) {
            LOG.error("queryEICount err,cause by :",e);
        }
        return result;
    }

    public String queryCIByRowkey(String rowkey, Integer tenantId) {
        String result = "";
        try {
            result = factory.get(Properties.getInstance().getDatabaseType())
                    .queryCIByRowkey(rowkey, tenantId);
        } catch (Exception e) {
            LOG.error("queryCIByRowkey err,cause by :",e);
        }
        return result;
    }

    public String queryEIByRowkey(String rowkey, Integer tenantId) {
        String result = "";
        try {
            result =  factory.get(Properties.getInstance().getDatabaseType())
                    .queryEIByRowkey(rowkey, tenantId);
        } catch (Exception e) {
            LOG.error("queryEIByRowkey err,cause by :",e);
        }
        return result;
    }

    public String queryCtgDataPage(QueryBean queryBean, int pageNo, int pageSize) {
        String result = "";
        try {
            result = factory.get(Properties.getInstance().getDatabaseType())
                    .queryCtgDataPage(queryBean,pageNo,pageSize);
        } catch (Exception e) {
            LOG.error("queryCtgDataPage err,cause by :",e);
        }
        return result;
    }

    public long queryCtgCount(QueryBean queryBean) {
        long result = 0l;
        try {
            result =  factory.get(Properties.getInstance().getDatabaseType())
                    .queryCtgCount(queryBean);
        } catch (Exception e) {
            LOG.error("queryCtgCount err,cause by :",e);
        }
        return result;
    }

    public String queryCtgByRowkey(String rowkey, Integer tenantId) {
        String result = "";
        try {
            result =  factory.get(Properties.getInstance().getDatabaseType())
                    .queryCtgByRowkey(rowkey, tenantId);
        } catch (Exception e) {
            LOG.error("queryCtgByRowkey err,cause by :",e);
        }
        return result;
    }

    public String test(String test) {
    //        return factory.get(Properties.getInstance().getDatabaseType())
    //                .test(test);
        return "";
    }

    public Map<String, IQueryService> getFactory() {
        return factory;
    }

    public void setFactory(Map<String, IQueryService> factory) {
        this.factory = factory;
    }

    
}
