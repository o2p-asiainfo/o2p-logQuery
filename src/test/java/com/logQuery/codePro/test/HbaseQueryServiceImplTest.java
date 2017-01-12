package com.logQuery.codePro.test;

import org.easymock.EasyMock;
import org.junit.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

import com.ailk.eaap.o2p.common.cache.CacheKey;
import com.ailk.eaap.op2.bo.QueryBean;
import com.asiainfo.integration.o2p.log.common.util.SpringContext;
import com.asiainfo.integration.o2p.log.query.dao.IHbaseQueryDao;
import com.asiainfo.integration.o2p.log.query.dao.ISolrQueryDao;
import com.asiainfo.integration.o2p.log.query.dao.impl.HbaseQueryDaoImpl;
import com.asiainfo.integration.o2p.log.query.dao.impl.SolrQueryDaoImpl;
import com.asiainfo.integration.o2p.log.query.service.impl.HbaseQueryServiceImpl;

/**
 * The class <code>HbaseQueryServiceImplTest</code> contains tests for the class <code>{@link HbaseQueryServiceImpl}</code>.
 *
 * @generatedBy CodePro at 15-12-16 下午3:52
 * @author daimq
 * @version $Revision: 1.0 $
 */
public class HbaseQueryServiceImplTest {
    /**
     * Run the IHbaseQueryDao getHbaseQueryDao() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    
    HbaseQueryServiceImpl fixture = EasyMock.createMock(HbaseQueryServiceImpl.class);
    SolrQueryDaoImpl solrQueryDaoImpl = EasyMock.createMock(SolrQueryDaoImpl.class);
    HbaseQueryDaoImpl hbaseQueryDaoImpl = EasyMock.createMock(HbaseQueryDaoImpl.class);
    @Test
    public void testGetHbaseQueryDao_1()
        throws Exception {
        HbaseQueryServiceImpl fixture = new  HbaseQueryServiceImpl();
        //SolrQueryDaoImpl solrQueryDaoImpl = EasyMock.createMock(SolrQueryDaoImpl.class);
        //HbaseQueryDaoImpl hbaseQueryDaoImpl = EasyMock.createMock(HbaseQueryDaoImpl.class);
        fixture.setSolrQueryDao(solrQueryDaoImpl);
        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);

        HbaseQueryDaoImpl result = (HbaseQueryDaoImpl) fixture.getHbaseQueryDao();

        // add additional test code here
        assertNotNull(result);
    }

    /**
     * Run the ISolrQueryDao getSolrQueryDao() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testGetSolrQueryDao_1()
        throws Exception {
        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
        fixture.setSolrQueryDao(solrQueryDaoImpl);
        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);

        ISolrQueryDao result = fixture.getSolrQueryDao();

        // add additional test code here
        assertNotNull(result);
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
        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
        fixture.setSolrQueryDao(solrQueryDaoImpl);
        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);
        String rowkey = "";

        String result = fixture.queryCIByRowkey(rowkey, CacheKey.defaultTenantId);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalArgumentException: Row length is 0
        //       at org.apache.hadoop.hbase.client.Mutation.checkRow(Mutation.java:425)
        //       at org.apache.hadoop.hbase.client.Mutation.checkRow(Mutation.java:409)
        //       at org.apache.hadoop.hbase.client.Get.<init>(Get.java:87)
        //       at com.asiainfo.integration.o2p.log.query.dao.impl.HbaseQueryDaoImpl.queryCIByRowkey(HbaseQueryDaoImpl.java:110)
        //       at com.asiainfo.integration.o2p.log.query.service.impl.HbaseQueryServiceImpl.queryCIByRowkey(HbaseQueryServiceImpl.java:90)
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
//        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
//        fixture.setSolrQueryDao(solrQueryDaoImpl);
//        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);
//        QueryBean queryBean = new QueryBean();
//
//        long result = fixture.queryCICount(queryBean);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at com.asiainfo.integration.o2p.log.query.dao.impl.SolrQueryDaoImpl.queryCount(SolrQueryDaoImpl.java:74)
        //       at com.asiainfo.integration.o2p.log.query.service.impl.HbaseQueryServiceImpl.queryCICount(HbaseQueryServiceImpl.java:78)
        //assertEquals(0L, result);
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
        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
        fixture.setSolrQueryDao(solrQueryDaoImpl);
        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);
        QueryBean queryBean = new QueryBean();
        int pageNo = 1;
        int pageSize = 1;

        String result = fixture.queryCIDataPage(queryBean, pageNo, pageSize);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at com.asiainfo.integration.o2p.log.query.dao.impl.SolrQueryDaoImpl.queryRowKey(SolrQueryDaoImpl.java:55)
        //       at com.asiainfo.integration.o2p.log.query.service.impl.HbaseQueryServiceImpl.queryCIDataPage(HbaseQueryServiceImpl.java:53)
        assertNotNull(result);
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
        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
        fixture.setSolrQueryDao(solrQueryDaoImpl);
        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);
        QueryBean queryBean = new QueryBean();
        int pageNo = 1;
        int pageSize = 1;

        String result = fixture.queryCIDataPage(queryBean, pageNo, pageSize);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at com.asiainfo.integration.o2p.log.query.dao.impl.SolrQueryDaoImpl.queryRowKey(SolrQueryDaoImpl.java:55)
        //       at com.asiainfo.integration.o2p.log.query.service.impl.HbaseQueryServiceImpl.queryCIDataPage(HbaseQueryServiceImpl.java:53)
        assertNotNull(result);
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
        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
        fixture.setSolrQueryDao(solrQueryDaoImpl);
        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);
        String rowkey = "af8241373a21ba96ecde84993fec6ed4222";

        String result = fixture.queryCtgByRowkey(rowkey, CacheKey.defaultTenantId);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalArgumentException: Row length is 0
        //       at org.apache.hadoop.hbase.client.Mutation.checkRow(Mutation.java:425)
        //       at org.apache.hadoop.hbase.client.Mutation.checkRow(Mutation.java:409)
        //       at org.apache.hadoop.hbase.client.Get.<init>(Get.java:87)
        //       at com.asiainfo.integration.o2p.log.query.service.impl.HbaseQueryServiceImpl.queryCtgByRowkey(HbaseQueryServiceImpl.java:133)
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
//        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
//        fixture.setSolrQueryDao(solrQueryDaoImpl);
//        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);
//        QueryBean queryBean = new QueryBean();
//
//        long result = fixture.queryCtgCount(queryBean);
//
//        // add additional test code here
//        // An unexpected exception was thrown in user code while executing this test:
//        //    java.lang.NullPointerException
//        //       at com.asiainfo.integration.o2p.log.query.dao.impl.SolrQueryDaoImpl.queryCount(SolrQueryDaoImpl.java:74)
//        //       at com.asiainfo.integration.o2p.log.query.service.impl.HbaseQueryServiceImpl.queryCtgCount(HbaseQueryServiceImpl.java:126)
//        assertEquals(0L, result);
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
        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
        fixture.setSolrQueryDao(solrQueryDaoImpl);
        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);
        QueryBean queryBean = new QueryBean();
        int pageNo = 1;
        int pageSize = 1;

        String result = fixture.queryCtgDataPage(queryBean, pageNo, pageSize);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at com.asiainfo.integration.o2p.log.query.dao.impl.SolrQueryDaoImpl.queryRowKey(SolrQueryDaoImpl.java:55)
        //       at com.asiainfo.integration.o2p.log.query.service.impl.HbaseQueryServiceImpl.queryCtgDataPage(HbaseQueryServiceImpl.java:112)
        assertNotNull(result);
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
        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
        fixture.setSolrQueryDao(solrQueryDaoImpl);
        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);
        QueryBean queryBean = new QueryBean();
        int pageNo = 1;
        int pageSize = 1;

        String result = fixture.queryCtgDataPage(queryBean, pageNo, pageSize);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at com.asiainfo.integration.o2p.log.query.dao.impl.SolrQueryDaoImpl.queryRowKey(SolrQueryDaoImpl.java:55)
        //       at com.asiainfo.integration.o2p.log.query.service.impl.HbaseQueryServiceImpl.queryCtgDataPage(HbaseQueryServiceImpl.java:112)
        assertNotNull(result);
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
        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
        fixture.setSolrQueryDao(solrQueryDaoImpl);
        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);
        String rowkey = "f55f307d6d0bc7ed9866659bb355350b_2B850ACE527345B38F365098BC174536";

        String result = fixture.queryEIByRowkey(rowkey, CacheKey.defaultTenantId);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.ArrayIndexOutOfBoundsException: 1
        //       at com.asiainfo.integration.o2p.log.query.service.impl.HbaseQueryServiceImpl.queryEIByRowkey(HbaseQueryServiceImpl.java:98)
        assertNotNull(result);
    }

    /**
     * Run the String queryEIByRowkey(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testQueryEIByRowkey_2()
        throws Exception {
        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
        fixture.setSolrQueryDao(solrQueryDaoImpl);
        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);
        String rowkey = "f55f307d6d0bc7ed9866659bb355350b_2B850ACE527345B38F365098BC174536";

        String result = fixture.queryEIByRowkey(rowkey, CacheKey.defaultTenantId);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.ArrayIndexOutOfBoundsException: 1
        //       at com.asiainfo.integration.o2p.log.query.service.impl.HbaseQueryServiceImpl.queryEIByRowkey(HbaseQueryServiceImpl.java:98)
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
        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
        fixture.setSolrQueryDao(solrQueryDaoImpl);
        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);
        QueryBean queryBean = new QueryBean();
        queryBean.setContractInteractionId("");

        long result = fixture.queryEICount(queryBean);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalArgumentException: Row length is 0
        //       at org.apache.hadoop.hbase.client.Mutation.checkRow(Mutation.java:425)
        //       at org.apache.hadoop.hbase.client.Mutation.checkRow(Mutation.java:409)
        //       at org.apache.hadoop.hbase.client.Get.<init>(Get.java:87)
        //       at com.asiainfo.integration.o2p.log.query.dao.impl.HbaseQueryDaoImpl.queryEICount(HbaseQueryDaoImpl.java:136)
        //       at com.asiainfo.integration.o2p.log.query.service.impl.HbaseQueryServiceImpl.queryEICount(HbaseQueryServiceImpl.java:84)
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
        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
        fixture.setSolrQueryDao(solrQueryDaoImpl);
        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);
        QueryBean queryBean = new QueryBean();
        queryBean.setContractInteractionId("");
        int pageNo = 1;
        int pageSize = 1;

        String result = fixture.queryEIDataPage(queryBean, pageNo, pageSize);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalArgumentException: Row length is 0
        //       at org.apache.hadoop.hbase.client.Mutation.checkRow(Mutation.java:425)
        //       at org.apache.hadoop.hbase.client.Mutation.checkRow(Mutation.java:409)
        //       at org.apache.hadoop.hbase.client.Get.<init>(Get.java:87)
        //       at com.asiainfo.integration.o2p.log.query.dao.impl.HbaseQueryDaoImpl.queryEIDataPage(HbaseQueryDaoImpl.java:162)
        //       at com.asiainfo.integration.o2p.log.query.service.impl.HbaseQueryServiceImpl.queryEIDataPage(HbaseQueryServiceImpl.java:72)
        assertNotNull(result);
    }

    /**
     * Run the void setHbaseQueryDao(IHbaseQueryDao) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testSetHbaseQueryDao_1()
        throws Exception {
        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
        fixture.setSolrQueryDao(solrQueryDaoImpl);
        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);
        IHbaseQueryDao hbaseQueryDao = new HbaseQueryDaoImpl();

        fixture.setHbaseQueryDao(hbaseQueryDao);

        // add additional test code here
    }

    /**
     * Run the void setSolrQueryDao(ISolrQueryDao) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-16 下午3:52
     */
    @Test
    public void testSetSolrQueryDao_1()
        throws Exception {
        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
        fixture.setSolrQueryDao(solrQueryDaoImpl);
        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);
        ISolrQueryDao solrQueryDao = new SolrQueryDaoImpl();

        fixture.setSolrQueryDao(solrQueryDao);

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
        HbaseQueryServiceImpl fixture = new HbaseQueryServiceImpl();
        fixture.setSolrQueryDao(solrQueryDaoImpl);
        fixture.setHbaseQueryDao(hbaseQueryDaoImpl);
        String test = "";

        String result = fixture.test(test);

        // add additional test code here
        assertEquals(null, result);
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
    public static void main(String[] args) {
        new org.junit.runner.JUnitCore().run(HbaseQueryServiceImplTest.class);
    }
}