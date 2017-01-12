/** 
 * Project Name:stormDemo 
 * File Name:SrpingContext.java 
 * Package Name:com.ai.mine.util 
 * Date:2015年8月24日下午11:12:05 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.log.query.util;  

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


/** 
 * ClassName:SrpingContext <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年8月24日 下午11:12:05 <br/> 
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public final class SpringContext{

    private  static ApplicationContext propertiesContext;
    private static ApplicationContext beansContext;
    
    public static ApplicationContext getPropertiesContext() {
        return propertiesContext;
    }
    public static void setPropertiesContext(ApplicationContext propertiesContext) {
        SpringContext.propertiesContext = propertiesContext;
    }
    public static ApplicationContext getBeansContext() {
        if(beansContext == null){
            GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
            ctx.getEnvironment().setActiveProfiles(Properties.getInstance().getDatabaseType());
            ctx.load("classpath:logQuery-application.xml");
            ctx.refresh();
            SpringContext.setBeansContext(ctx);
        }
        return beansContext;
    }
    public static void setBeansContext(ApplicationContext beansContext) {
        SpringContext.beansContext = beansContext;
    }
    
    private SpringContext(){
    }
    
}
