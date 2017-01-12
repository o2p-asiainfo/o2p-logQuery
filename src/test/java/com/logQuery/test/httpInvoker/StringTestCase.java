/** 
 * Project Name:logQuery 
 * File Name:StringTest.java 
 * Package Name:com.logQuery.test.httpInvoker 
 * Date:2015年11月23日下午2:46:35 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.logQuery.test.httpInvoker;  
/** 
 * ClassName:StringTest <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年11月23日 下午2:46:35 <br/> 
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class StringTestCase {
    
    public static void main(String[] args) {
        String s = "create_time";
        System.out.println(s.matches("(.*)TIME"));
        System.out.println(s.matches("(.*)time"));
    }

}
