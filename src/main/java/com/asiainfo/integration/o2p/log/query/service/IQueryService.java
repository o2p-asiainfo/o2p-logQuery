/** 
 * Project Name:logQuery 
 * File Name:IQueryServer.java 
 * Package Name:com.asiainfo.log.query 
 * Date:2015年10月19日下午2:14:21 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.log.query.service;  

import com.ailk.eaap.op2.bo.QueryBean;

/** 
 * ClassName:IQueryServer <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年10月19日 下午2:14:21 <br/> 
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public interface IQueryService {
    
    public String queryCIDataPage(QueryBean queryBean,int pageNo, int pageSize);

    public String queryEIDataPage(QueryBean queryBean,int pageNo, int pageSize);
    
    public long queryCICount(QueryBean queryBean);

    public long queryEICount(QueryBean queryBean);
    
    public String queryCIByRowkey(String rowkey, Integer tenantId);

    public String queryEIByRowkey(String rowkey, Integer tenantId);
    
    public String queryCtgDataPage(QueryBean queryBean,int pageNo, int pageSize);
    
    public long queryCtgCount(QueryBean queryBean);
    
    public String queryCtgByRowkey(String rowkey, Integer tenantId);
    
    public String test(String test);
    
}
