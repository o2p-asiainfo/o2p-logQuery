package com.logQuery.codePro.test;

import org.easymock.EasyMock;
import org.junit.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.bo.QueryBean;
import com.asiainfo.integration.o2p.log.common.util.SpringContext;
import com.asiainfo.integration.o2p.log.query.dao.IQueryDao;
import com.asiainfo.integration.o2p.log.query.dao.impl.QueryDaoImpl;
import com.asiainfo.integration.o2p.log.query.service.impl.QueryServiceImpl;

/**
 * The class <code>QueryServiceImplTest</code> contains tests for the class <code>{@link QueryServiceImpl}</code>.
 *
 * @generatedBy CodePro at 15-12-16 下午3:52
 * @author daimq
 * @version $Revision: 1.0 $
 */
public class QueryServiceImplTest {
    /**
     * Run the IQueryDao getQueryDao() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    QueryDaoImpl queryDaoImpl = EasyMock.createMock(QueryDaoImpl.class);
    @Test
    public void testGetQueryDao_1()
        throws Exception {
        QueryServiceImpl fixture = new QueryServiceImpl();
        

//        IQueryDao result = fixture.getQueryDao();

        // add additional test code here
        assertNotNull(queryDaoImpl);
    }

    /**
     * Run the String queryCIByRowkey(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testQueryCIByRowkey_1()
        throws Exception {
        QueryServiceImpl fixture = new QueryServiceImpl();
        
        String rowkey = "unknown_1511_2ae1145216b6524eef70f85d38627ab9_2015-11-11 02:15:44.855000";

        String result = fixture.queryCIByRowkey(rowkey, CacheKey.defaultTenantId);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.ArrayIndexOutOfBoundsException: 1
        //       at com.asiainfo.integration.o2p.log.query.service.impl.QueryServiceImpl.queryCIByRowkey(QueryServiceImpl.java:109)
        assertNotNull(result);
    }

    /**
     * Run the long queryCICount(QueryBean) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testQueryCICount_1()
        throws Exception {
        QueryServiceImpl fixture = new QueryServiceImpl();
        
        QueryBean queryBean = new QueryBean();
        queryBean.setEndSrcReqTime("");
        queryBean.setDstSysCode("");
        queryBean.setTenantId(new Integer(1));
        queryBean.setStartSrcReqTime("");
        queryBean.setJfTransactionID("");
        queryBean.setContractVersion("");
        queryBean.setJfSrcSysCode("");
        queryBean.setStatus("");
        queryBean.setResponseCode("");

        long result = fixture.queryCICount(queryBean);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at com.asiainfo.integration.o2p.log.query.dao.impl.QueryDaoImpl.queryCICount(QueryDaoImpl.java:44)
        //       at com.asiainfo.integration.o2p.log.query.service.impl.QueryServiceImpl.queryCICount(QueryServiceImpl.java:68)
        assertEquals(0L, result);
    }

    /**
     * Run the String queryCIDataPage(QueryBean,int,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testQueryCIDataPage_1()
        throws Exception {
        QueryServiceImpl fixture = new QueryServiceImpl();
        
        QueryBean queryBean = new QueryBean();
        queryBean.setEndSrcReqTime("");
        queryBean.setDstSysCode("");
        queryBean.setTenantId(new Integer(1));
        queryBean.setStartSrcReqTime("");
        queryBean.setJfTransactionID("");
        queryBean.setContractVersion("");
        queryBean.setJfSrcSysCode("");
        queryBean.setStatus("");
        queryBean.setResponseCode("");
        int pageNo = 1;
        int pageSize = 1;

        String result = fixture.queryCIDataPage(queryBean, pageNo, pageSize);

        // add additional test code here
        assertEquals("[]", result);
    }

    /**
     * Run the String queryCIDataPage(QueryBean,int,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testQueryCIDataPage_2()
        throws Exception {
        QueryServiceImpl fixture = new QueryServiceImpl();
        
        QueryBean queryBean = new QueryBean();
        queryBean.setEndSrcReqTime("");
        queryBean.setDstSysCode("");
        queryBean.setTenantId(new Integer(1));
        queryBean.setStartSrcReqTime("");
        queryBean.setJfTransactionID("");
        queryBean.setContractVersion("");
        queryBean.setJfSrcSysCode("");
        queryBean.setStatus("");
        queryBean.setResponseCode("");
        int pageNo = 1;
        int pageSize = 1;

        String result = fixture.queryCIDataPage(queryBean, pageNo, pageSize);

        // add additional test code here
        assertEquals("[]", result);
    }

    /**
     * Run the String queryCtgByRowkey(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testQueryCtgByRowkey_1()
        throws Exception {
        QueryServiceImpl fixture = new QueryServiceImpl();
        
        String rowkey = "unknown_1511_6fb646a70fcd01380fd136b68b4af1e1";

        String result = fixture.queryCtgByRowkey(rowkey, CacheKey.defaultTenantId);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.ArrayIndexOutOfBoundsException: 1
        //       at com.asiainfo.integration.o2p.log.query.service.impl.QueryServiceImpl.queryCtgByRowkey(QueryServiceImpl.java:242)
        assertNotNull(result);
    }

    /**
     * Run the long queryCtgCount(QueryBean) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testQueryCtgCount_1()
        throws Exception {
        QueryServiceImpl fixture = new QueryServiceImpl();
        
        QueryBean queryBean = new QueryBean();
        queryBean.setLogSeq("");
        queryBean.setTenantId(new Integer(1));
        queryBean.setJfTransactionID("");
        queryBean.setStartCreateDate("");
        queryBean.setErrCode("");
        queryBean.setFunName("");
        queryBean.setEndCreateDate("");

        long result = fixture.queryCtgCount(queryBean);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at com.asiainfo.integration.o2p.log.query.dao.impl.QueryDaoImpl.queryCtgCount(QueryDaoImpl.java:158)
        //       at com.asiainfo.integration.o2p.log.query.service.impl.QueryServiceImpl.queryCtgCount(QueryServiceImpl.java:236)
        assertEquals(0L, result);
    }

    /**
     * Run the String queryCtgDataPage(QueryBean,int,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testQueryCtgDataPage_1()
        throws Exception {
        QueryServiceImpl fixture = new QueryServiceImpl();
        
        QueryBean queryBean = new QueryBean();
        queryBean.setLogSeq("");
        queryBean.setTenantId(new Integer(1));
        queryBean.setJfTransactionID("");
        queryBean.setStartCreateDate("");
        queryBean.setErrCode("");
        queryBean.setFunName("");
        queryBean.setEndCreateDate("");
        int pageNo = 1;
        int pageSize = 1;

        String result = fixture.queryCtgDataPage(queryBean, pageNo, pageSize);

        // add additional test code here
        assertEquals("[]", result);
    }

    /**
     * Run the String queryCtgDataPage(QueryBean,int,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testQueryCtgDataPage_2()
        throws Exception {
        QueryServiceImpl fixture = new QueryServiceImpl();
        
        QueryBean queryBean = new QueryBean();
        queryBean.setLogSeq("");
        queryBean.setTenantId(new Integer(1));
        queryBean.setJfTransactionID("");
        queryBean.setStartCreateDate("");
        queryBean.setErrCode("");
        queryBean.setFunName("");
        queryBean.setEndCreateDate("");
        int pageNo = 1;
        int pageSize = 1;

        String result = fixture.queryCtgDataPage(queryBean, pageNo, pageSize);

        // add additional test code here
        assertEquals("[]", result);
    }

    /**
     * Run the String queryEIByRowkey(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testQueryEIByRowkey_1()
        throws Exception {
        QueryServiceImpl fixture = new QueryServiceImpl();
        
        String rowkey = "2ae1145216b6524eef70f85d38627ab9_FFD15AD89F9F443A9F7879748E643717_unknown_1511_2015-11-11 02:15:44.855000";

        String result = fixture.queryEIByRowkey(rowkey, CacheKey.defaultTenantId);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.ArrayIndexOutOfBoundsException: 3
        //       at com.asiainfo.integration.o2p.log.query.service.impl.QueryServiceImpl.queryEIByRowkey(QueryServiceImpl.java:135)
        assertNotNull(result);
    }

    /**
     * Run the long queryEICount(QueryBean) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testQueryEICount_1()
        throws Exception {
        QueryServiceImpl fixture = new QueryServiceImpl();
        
        QueryBean queryBean = new QueryBean();
        queryBean.setContractInteractionId("unknown_1511_2ae1145216b6524eef70f85d38627ab9_2015-11-11 02:15:44.855000");

        long result = fixture.queryEICount(queryBean);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.ArrayIndexOutOfBoundsException: 1
        //       at com.asiainfo.integration.o2p.log.query.service.impl.QueryServiceImpl.queryEICount(QueryServiceImpl.java:158)
        assertEquals(0L, result);
    }

    /**
     * Run the String queryEIDataPage(QueryBean,int,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testQueryEIDataPage_1()
        throws Exception {
        QueryServiceImpl fixture = new QueryServiceImpl();
        
        QueryBean queryBean = new QueryBean();
        queryBean.setContractInteractionId("unknown_1511_2ae1145216b6524eef70f85d38627ab9_2015-11-11 02:15:44.855000");
        int pageNo = 1;
        int pageSize = 1;

        String result = fixture.queryEIDataPage(queryBean, pageNo, pageSize);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.ArrayIndexOutOfBoundsException: 1
        //       at com.asiainfo.integration.o2p.log.query.service.impl.QueryServiceImpl.queryEIDataPage(QueryServiceImpl.java:176)
        assertNotNull(result);
    }

    /**
     * Run the String queryEIDataPage(QueryBean,int,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testQueryEIDataPage_2()
        throws Exception {
        QueryServiceImpl fixture = new QueryServiceImpl();
        
        QueryBean queryBean = new QueryBean();
        queryBean.setContractInteractionId("unknown_1511_2ae1145216b6524eef70f85d38627ab9_2015-11-11 02:15:44.855000");
        int pageNo = 1;
        int pageSize = 1;

        String result = fixture.queryEIDataPage(queryBean, pageNo, pageSize);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.ArrayIndexOutOfBoundsException: 1
        //       at com.asiainfo.integration.o2p.log.query.service.impl.QueryServiceImpl.queryEIDataPage(QueryServiceImpl.java:176)
        assertNotNull(result);
    }

    /**
     * Run the void setQueryDao(IQueryDao) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testSetQueryDao_1()
        throws Exception {
        QueryServiceImpl fixture = new QueryServiceImpl();
        
        IQueryDao queryDao = new QueryDaoImpl();

//        fixture.setQueryDao(queryDao);

        // add additional test code here
    }

    /**
     * Run the String test(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testTest_1()
        throws Exception {
        QueryServiceImpl fixture = new QueryServiceImpl();
        
        String test = "";

        String result = fixture.test(test);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Before
    public void setUp()
        throws Exception {
        ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("classpath:logQuery-application.xml");
        ClassPathXmlApplicationContext ctPro = new ClassPathXmlApplicationContext("classpath:queryProperties.xml");
        SpringContext.setPropertiesContext(ctPro);
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @After
    public void tearDown()
        throws Exception {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
//    public static void main(String[] args) {
//        new org.junit.runner.JUnitCore().run(QueryServiceImplTest.class);
//    }
}