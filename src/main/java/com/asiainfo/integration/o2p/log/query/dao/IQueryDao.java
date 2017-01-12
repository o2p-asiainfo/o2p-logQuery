/** 
 * Project Name:logQuery 
 * File Name:IQueryDao.java 
 * Package Name:com.asiainfo.log.query.dao 
 * Date:2015年10月19日下午2:18:57 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.log.query.dao;  

import java.util.List;
import java.util.Map;

import com.asiainfo.integration.o2p.log.query.bean.ContractInteractionDetail;
import com.asiainfo.integration.o2p.log.query.bean.EndpointInteractionDetail;
import com.ailk.eaap.op2.bo.ContractInteraction;
import com.ailk.eaap.op2.bo.EndpointInteraction;

/** 
 * ClassName:IQueryDao <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年10月19日 下午2:18:57 <br/> 
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public interface IQueryDao {

    public long queryCICount(Map<String, Object> conMap);

    public List<ContractInteraction> queryCIDataPage(Map<String, Object> conMap);

    public List<ContractInteractionDetail> queryCIByRowkey(Map<String, Object> conMap);
    
    public long queryEICount(Map<String, Object> conMap);
    
    public List<EndpointInteraction> queryEIDataPage(Map<String, Object> conMap);

    public List<EndpointInteractionDetail> queryEIByRowkey(Map<String, Object> conMap);
    
    public long queryCtgCount(Map<String, Object> conMap);
    
    public List<Map<String,String>> queryCtgDataPage(Map<String, Object> conMap);

    public List<Map<String,String>> queryCtgByRowkey(Map<String, Object> conMap);
}
