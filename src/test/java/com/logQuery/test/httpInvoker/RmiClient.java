/** 
 * Project Name:logQuery 
 * File Name:RmiClient.java 
 * Package Name:com.logQuery.test.httpInvoker 
 * Date:2015年10月20日下午4:28:56 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.logQuery.test.httpInvoker;  

import com.ailk.eaap.op2.bo.QueryBean;

/** 
 * ClassName:RmiClient <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年10月20日 下午4:28:56 <br/> 
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public interface RmiClient {

    public String queryCIDataPage(QueryBean queryBean,int pageNo, int pageSize);

    public String queryEIDataPage(QueryBean queryBean,int pageNo, int pageSize);
    
    public long queryCICount(QueryBean queryBean);

    public long queryEICount(QueryBean queryBean);
    
    public String queryCIByRowkey(String rowkey);

    public String queryEIByRowkey(String rowkey);
    
    public String queryCtgDataPage(QueryBean queryBean,int pageNo, int pageSize);
    
    public long queryCtgCount(QueryBean queryBean);
    
    public String queryCtgByRowkey(String rowkey);
    
    public String test(String test);
    
}
