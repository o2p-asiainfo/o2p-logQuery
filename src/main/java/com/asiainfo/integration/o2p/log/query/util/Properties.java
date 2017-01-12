/** 
 * Project Name:logQuery 
 * File Name:Properties.java 
 * Package Name:com.asiainfo.log.query.util 
 * Date:2015年10月20日上午11:14:54 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.log.query.util;  

import org.springframework.context.support.ClassPathXmlApplicationContext;


/** 
 * ClassName:Properties <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年10月20日 上午11:14:54 <br/> 
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class Properties {

    private String databaseType;

    private String rmdbType;
    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }
    
    
    
    public String getRmdbType() {
        return rmdbType;
    }

    public void setRmdbType(String rmdbType) {
        this.rmdbType = rmdbType;
    }

    public static Properties getInstance(){
        if(SpringContext.getPropertiesContext() == null){
            ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("classpath:queryProperties.xml");
            SpringContext.setPropertiesContext(ct);
        }
        return (Properties) SpringContext.getPropertiesContext().getBean("confProps");
    }
    
}
