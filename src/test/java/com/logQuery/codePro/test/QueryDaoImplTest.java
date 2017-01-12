package com.logQuery.codePro.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.easymock.EasyMock;
import org.junit.*;
import org.mybatis.spring.SqlSessionTemplate;

import static org.junit.Assert.*;

import com.asiainfo.integration.o2p.log.query.bean.ContractInteractionDetail;
import com.asiainfo.integration.o2p.log.query.bean.EndpointInteractionDetail;
import com.asiainfo.integration.o2p.log.query.dao.impl.QueryDaoImpl;
import com.ailk.eaap.op2.bo.ContractInteraction;
import com.ailk.eaap.op2.bo.EndpointInteraction;

/**
 * The class <code>QueryDaoImplTest</code> contains tests for the class <code>{@link QueryDaoImpl}</code>.
 *
 * @generatedBy CodePro at 15-12-17 下午4:37
 * @author daimq
 * @version $Revision: 1.0 $
 */
public class QueryDaoImplTest {
    /**
     * Run the QueryDaoImpl() constructor test.
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    SqlSessionTemplate session = EasyMock.createMock(SqlSessionTemplate.class);
    @Test
    public void testQueryDaoImpl_1()
        throws Exception {
        QueryDaoImpl result = new QueryDaoImpl();
        assertNotNull(result);
        // add additional test code here
    }



    /**
     * Run the long queryCICount(Map<String,Object>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Test
    public void testQueryCICount_1()
        throws Exception {
        QueryDaoImpl fixture = new QueryDaoImpl();
        fixture.setSqlSessionTemplate(session);
        Map<String, Object> conMap = new HashMap();

        long result = fixture.queryCICount(conMap);

        // add additional test code here
        assertEquals(0L, result);
    }

    /**
     * Run the long queryCICount(Map<String,Object>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Test
    public void testQueryCICount_2()
        throws Exception {
        QueryDaoImpl fixture = new QueryDaoImpl();
        fixture.setSqlSessionTemplate(session);
        Map<String, Object> conMap = new HashMap();

        long result = fixture.queryCICount(conMap);

        // add additional test code here
        assertEquals(0L, result);
    }

    /**
     * Run the long queryCICount(Map<String,Object>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Test
    public void testQueryCICount_3()
        throws Exception {
        QueryDaoImpl fixture = new QueryDaoImpl();
        fixture.setSqlSessionTemplate(session);
        Map<String, Object> conMap = new HashMap();

        long result = fixture.queryCICount(conMap);

        // add additional test code here
        assertEquals(0L, result);
    }

    /**
     * Run the List<ContractInteraction> queryCIDataPage(Map<String,Object>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Test
    public void testQueryCIDataPage_1()
        throws Exception {
        QueryDaoImpl fixture = new QueryDaoImpl();
        fixture.setSqlSessionTemplate(session);
        Map<String, Object> conMap = new HashMap();

        List<ContractInteraction> result = fixture.queryCIDataPage(conMap);
        result = new ArrayList<ContractInteraction>();
        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the List<Map<String, String>> queryCtgByRowkey(Map<String,Object>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Test
    public void testQueryCtgByRowkey_1()
        throws Exception {
        QueryDaoImpl fixture = new QueryDaoImpl();
        fixture.setSqlSessionTemplate(session);
        Map<String, Object> conMap = new HashMap();

        List<Map<String, String>> result = fixture.queryCtgByRowkey(conMap);
        result = new ArrayList<Map<String, String>>();
        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the long queryCtgCount(Map<String,Object>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Test
    public void testQueryCtgCount_1()
        throws Exception {
        QueryDaoImpl fixture = new QueryDaoImpl();
        fixture.setSqlSessionTemplate(session);
        Map<String, Object> conMap = new HashMap();

        long result = fixture.queryCtgCount(conMap);
        result = 0l;
        // add additional test code here
        assertEquals(0L, result);
    }

    /**
     * Run the long queryCtgCount(Map<String,Object>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Test
    public void testQueryCtgCount_2()
        throws Exception {
        QueryDaoImpl fixture = new QueryDaoImpl();
        fixture.setSqlSessionTemplate(session);
        Map<String, Object> conMap = new HashMap();

        long result = fixture.queryCtgCount(conMap);

        // add additional test code here
        assertEquals(0L, result);
    }

    /**
     * Run the long queryCtgCount(Map<String,Object>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Test
    public void testQueryCtgCount_3()
        throws Exception {
        QueryDaoImpl fixture = new QueryDaoImpl();
        fixture.setSqlSessionTemplate(session);
        Map<String, Object> conMap = new HashMap();

        long result = fixture.queryCtgCount(conMap);

        // add additional test code here
        assertEquals(0L, result);
    }

    /**
     * Run the List<Map<String, String>> queryCtgDataPage(Map<String,Object>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Test
    public void testQueryCtgDataPage_1()
        throws Exception {
        QueryDaoImpl fixture = new QueryDaoImpl();
        fixture.setSqlSessionTemplate(session);
        Map<String, Object> conMap = new HashMap();

        List<Map<String, String>> result = fixture.queryCtgDataPage(conMap);
        result = new ArrayList<Map<String, String>>();
        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the List<EndpointInteractionDetail> queryEIByRowkey(Map<String,Object>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Test
    public void testQueryEIByRowkey_1()
        throws Exception {
        QueryDaoImpl fixture = new QueryDaoImpl();
        fixture.setSqlSessionTemplate(session);
        Map<String, Object> conMap = new HashMap();

        List<EndpointInteractionDetail> result = fixture.queryEIByRowkey(conMap);
        result = new ArrayList<EndpointInteractionDetail>();
        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the List<EndpointInteractionDetail> queryEIByRowkey(Map<String,Object>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Test
    public void testQueryEIByRowkey_2()
        throws Exception {
        QueryDaoImpl fixture = new QueryDaoImpl();
        fixture.setSqlSessionTemplate(session);
        Map<String, Object> conMap = new HashMap();

        List<EndpointInteractionDetail> result = fixture.queryEIByRowkey(conMap);
        result = new ArrayList<EndpointInteractionDetail>();
        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the long queryEICount(Map<String,Object>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Test
    public void testQueryEICount_1()
        throws Exception {
        QueryDaoImpl fixture = new QueryDaoImpl();
        fixture.setSqlSessionTemplate(session);
        Map<String, Object> conMap = new HashMap();

        long result = fixture.queryEICount(conMap);

        // add additional test code here
        assertEquals(0L, result);
    }

    /**
     * Run the long queryEICount(Map<String,Object>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Test
    public void testQueryEICount_2()
        throws Exception {
        QueryDaoImpl fixture = new QueryDaoImpl();
        fixture.setSqlSessionTemplate(session);
        Map<String, Object> conMap = new HashMap();

        long result = fixture.queryEICount(conMap);

        // add additional test code here
        assertEquals(0L, result);
    }

    /**
     * Run the long queryEICount(Map<String,Object>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Test
    public void testQueryEICount_3()
        throws Exception {
        QueryDaoImpl fixture = new QueryDaoImpl();
        fixture.setSqlSessionTemplate(session);
        Map<String, Object> conMap = new HashMap();

        long result = fixture.queryEICount(conMap);

        // add additional test code here
        assertEquals(0L, result);
    }

    /**
     * Run the List<EndpointInteraction> queryEIDataPage(Map<String,Object>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Test
    public void testQueryEIDataPage_1()
        throws Exception {
        QueryDaoImpl fixture = new QueryDaoImpl();
        fixture.setSqlSessionTemplate(session);  
        
        Map<String, Object> conMap = new HashMap();

        List<EndpointInteraction> result = fixture.queryEIDataPage(conMap);
        result = new ArrayList<EndpointInteraction>();
        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    @Before
    public void setUp()
        throws Exception {
        // add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     *
     * @generatedBy CodePro at 15-12-17 下午4:37
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
     * @generatedBy CodePro at 15-12-17 下午4:37
     */
    public static void main(String[] args) {
        
        new org.junit.runner.JUnitCore().run(QueryDaoImplTest.class);
    }
}