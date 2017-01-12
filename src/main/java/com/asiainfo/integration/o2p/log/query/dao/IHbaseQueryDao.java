/** 
 * Project Name:logQuery 
 * File Name:IhbaseQueryDao.java 
 * Package Name:com.asiainfo.log.query.dao 
 * Date:2015年11月23日下午3:09:51 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.log.query.dao;  

import java.util.List;
import java.util.Map;

import com.asiainfo.integration.o2p.log.common.bo.HbContractInteraction;
import com.asiainfo.integration.o2p.log.common.bo.HbEndpointInteraction;
import com.asiainfo.integration.o2p.log.common.bo.SimpleCIObject;
import com.asiainfo.integration.o2p.log.common.bo.SimpleEIObject;

/** 
 * ClassName:IhbaseQueryDao <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年11月23日 下午3:09:51 <br/> 
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public interface IHbaseQueryDao {

    
    public long queryCICount(Map<String, Object> conMap);

    public List<SimpleCIObject> queryCIDataPage(Map<String, Object> conMap);

    public List<HbContractInteraction> queryCIByRowkey(Map<String, Object> conMap);
    
    public long queryEICount(Map<String, Object> conMap);
    
    public List<SimpleEIObject> queryEIDataPage(Map<String, Object> conMap);

    public List<HbEndpointInteraction> queryEIByRowkey(Map<String, Object> conMap);
    
    public long queryCtgCount(Map<String, Object> conMap);
    
    public List<Map<String,String>> queryCtgDataPage(Map<String, Object> conMap);

    public List<Map<String,String>> queryCtgByRowkey(Map<String, Object> conMap);
}
