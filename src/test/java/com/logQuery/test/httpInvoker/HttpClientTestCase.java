/** 
 * Project Name:logQuery 
 * File Name:HttpClient.java 
 * Package Name:com.logQuery.test.httpInvoker 
 * Date:2015年10月20日下午4:24:31 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.logQuery.test.httpInvoker;  

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.bo.QueryBean;
import com.asiainfo.integration.o2p.log.query.service.IQueryService;


/** 
 * ClassName:HttpClient <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年10月20日 下午4:24:31 <br/> 
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class HttpClientTestCase {

    
    //private RmiClient client;
    private QueryBean queryBean;
    private IQueryService client;
    @Before
    public void init(){
        ClassPathXmlApplicationContext ct =
                new ClassPathXmlApplicationContext("logQuery-application.xml");
        client = (IQueryService) ct.getBean("rmdblogQueryServie");
        queryBean = new QueryBean(); 
       // queryBean.setJfSrcSysCode("8000000004");
        queryBean.setStartSrcReqTime("2015-12-01 02:15:44.769000");
        queryBean.setEndSrcReqTime("2015-12-30 02:15:44.855000");
    }
    
    
    @Test
    public void testQueryCiCount(){
        System.out.println("test ci count result:"+client.queryCICount(queryBean));
    }
    @Test
    public void testQueryCiPageData(){
        System.out.println("test ci page result:"+client.queryCIDataPage(queryBean, 1, 10));
    }
    @Test
    public void testQueryCiDetailByRowkey(){
        //rmdb 查询
        String rowkey = "unknown_1511_2ae1145216b6524eef70f85d38627ab9_2015-11-11 02:15:44.855000";
        //hbase 查询 
        //String rowkey = "f55f307d6d0bc7ed9866659bb355350b";
        System.out.println("test ci detail result:"+client.queryCIByRowkey(rowkey, CacheKey.defaultTenantId));
    }
    @Test
    public void testQueryEiCount(){
        QueryBean qec = new QueryBean();
        //rmdb 查询
        qec.setContractInteractionId("unknown_1511_2ae1145216b6524eef70f85d38627ab9_2015-11-11 02:15:44.855000");
        //hbase 查询
        //qec.setContractInteractionId("f55f307d6d0bc7ed9866659bb355350b");
        System.out.println("test query ei count result :"+client.queryEICount(qec));
    }
    @Test
    public void testQueryEiPageData(){
        QueryBean qec = new QueryBean();
        //rmdb 查询
        qec.setContractInteractionId("unknown_1511_2ae1145216b6524eef70f85d38627ab9_2015-11-11 02:15:44.855000");
        //hbase 查询
        //qec.setContractInteractionId("f55f307d6d0bc7ed9866659bb355350b");
        System.out.println("test ei page result:"+client.queryEIDataPage(qec, 1, 10));
    }
    @Test
    public void testQueryEiDetailByRowkey(){
        //rmdb 查询
        String rowkey = "2ae1145216b6524eef70f85d38627ab9_FFD15AD89F9F443A9F7879748E643717_unknown_1511_2015-11-11 02:15:44.855000";
        //hbase 查询
        //String rowkey = "f55f307d6d0bc7ed9866659bb355350b_2B850ACE527345B38F365098BC174536";
        System.out.println(
                client.queryEIByRowkey(rowkey, CacheKey.defaultTenantId)
        );
    }
    @Test
    public void testQueryCtgCount(){
        QueryBean qctg = new QueryBean();
        queryBean.setErrCode("001");
        System.out.println("test ctg result:"+client.queryCtgCount(queryBean));
    }
    @Test
    public void testQueryCtgPageData(){
        queryBean.setErrCode("001");
        System.out.println("test ctg page result:"+client.queryCtgDataPage(queryBean, 1, 10));
    }
    @Test
    public void testQueryCtgDetailByRowkey(){
        //rmdb查询
        String rowkey = "unknown_1511_6fb646a70fcd01380fd136b68b4af1e1";
        //hbase 查询
        //String rowkey = "af8241373a21ba96ecde84993fec6ed4222";
        System.out.println("test ctg detail result :"+client.queryCtgByRowkey(rowkey, CacheKey.defaultTenantId));
    }
    
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("classpath:client-spring.xml");
        RmiClient client = (RmiClient) ct.getBean("rmiClient");
        //System.out.println(client.test("test"));
        QueryBean queryBean = new QueryBean();
        queryBean.setStartSrcReqTime("2015-12-01 01:25:24");
        queryBean.setEndSrcReqTime("2015-12-30 14:25:29");
        System.out.println(client.queryCICount(queryBean));
        System.out.println(client.queryCIDataPage(queryBean, 1, 10));
//        QueryBean queryBeanRowkey = new QueryBean();
//        queryBeanRowkey.setContractInteractionId("unknown_1510_D66B7E3AB7B34005B2A445F82EE96D02_2015-10-05 14:25:29.386000");
//        System.out.println(client.queryCIByRowkey(queryBeanRowkey.getContractInteractionId()));
//        
//        
//        System.out.println(client.queryEICount(queryBeanRowkey));
//        System.out.println(client.queryEIDataPage(queryBeanRowkey, 1, 10));
//        System.out.println(
//                client.queryEIByRowkey("D66B7E3AB7B34005B2A445F82EE96D02_4563C4733AAF4D6189F988B2921D0F12_unknown_1510_2015-10-05 14:25:29.386000")
//        );  
//        
//        System.out.println(client.queryCtgCount(queryBean));
//        queryBean.setFunName("232323");
//        System.out.println(client.queryCtgDataPage(queryBean, 1, 10));
//        System.out.println(client.queryCtgByRowkey("unknown_1510_skdjsdds"));
    }
    
    
}
