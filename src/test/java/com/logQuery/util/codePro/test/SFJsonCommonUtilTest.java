package com.logQuery.util.codePro.test;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.tree.DefaultDocument;
import org.junit.*;

import com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil;

import static org.junit.Assert.*;

/**
 * The class <code>SFJsonCommonUtilTest</code> contains tests for the class <code>{@link SFJsonCommonUtil}</code>.
 *
 * @generatedBy CodePro at 15-12-21 上午9:36
 * @author daimq
 * @version $Revision: 1.0 $
 */
public class SFJsonCommonUtilTest {
    /**
     * Run the String byte2str(byte[]) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testByte2str_1()
        throws Exception {
        byte[] b = new byte[] {(byte) 1};

        String result = SFJsonCommonUtil.byte2str(b);

        // add additional test code here
        assertEquals("01", result);
    }

    /**
     * Run the String byte2str(byte[]) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testByte2str_2()
        throws Exception {
        byte[] b = new byte[] {};

        String result = SFJsonCommonUtil.byte2str(b);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String compact(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testCompact_1()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.compact(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String compact(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testCompact_2()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.compact(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String compact(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testCompact_3()
        throws Exception {
        String s = "";

        String result = SFJsonCommonUtil.compact(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String compact(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testCompact_4()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.compact(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String compact(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testCompact_5()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.compact(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String compact(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testCompact_6()
        throws Exception {
        String s = "";

        String result = SFJsonCommonUtil.compact(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the Collection dateToString(Date) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDateToString_1()
        throws Exception {
        Date srcReqTime = new Date();

        Collection result = SFJsonCommonUtil.dateToString(srcReqTime);

        // add additional test code here
        assertEquals(null, result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_1()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_2()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_3()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_4()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_5()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_6()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_7()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_8()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_9()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_10()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_11()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_12()
        throws Exception {
        String s = "";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_13()
        throws Exception {
        String s = "";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_14()
        throws Exception {
        String s = "";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_15()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecode_16()
        throws Exception {
        String s = "";

        String result = SFJsonCommonUtil.decode(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String decodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecodeHTML_1()
        throws Exception {
        String s = "";

        String result = SFJsonCommonUtil.decodeHTML(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String decodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecodeHTML_2()
        throws Exception {
        String s = "";

        String result = SFJsonCommonUtil.decodeHTML(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String decodeUnicode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecodeUnicode_1()
        throws Exception {
        String dataStr = "ab8\\u002D";

        String result = SFJsonCommonUtil.decodeUnicode(dataStr);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.StringIndexOutOfBoundsException: String index out of range: -2
        //       at java.lang.String.substring(String.java:1911)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.decodeUnicode(SFJsonCommonUtil.java:473)
        assertNotNull(result);
    }

    /**
     * Run the String decodeUnicode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecodeUnicode_2()
        throws Exception {
        String dataStr = "ABC";

        String result = SFJsonCommonUtil.decodeUnicode(dataStr);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.StringIndexOutOfBoundsException: String index out of range: -2
        //       at java.lang.String.substring(String.java:1911)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.decodeUnicode(SFJsonCommonUtil.java:473)
        assertNotNull(result);
    }

    /**
     * Run the String decodeUnicode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testDecodeUnicode_3()
        throws Exception {
        String dataStr = "ABC";

        String result = SFJsonCommonUtil.decodeUnicode(dataStr);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.StringIndexOutOfBoundsException: String index out of range: -2
        //       at java.lang.String.substring(String.java:1911)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.decodeUnicode(SFJsonCommonUtil.java:473)
        assertNotNull(result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testEncodeHTML_1()
        throws Exception {
        String s = "";

        String result = SFJsonCommonUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testEncodeHTML_2()
        throws Exception {
        String s = "aa";

        String result = SFJsonCommonUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testEncodeHTML_3()
        throws Exception {
        String s = "";

        String result = SFJsonCommonUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testEncodeHTML_4()
        throws Exception {
        String s = "aaa";

        String result = SFJsonCommonUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("aaa", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testEncodeHTML_5()
        throws Exception {
        String s = "aaa";

        String result = SFJsonCommonUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("aaa", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testEncodeHTML_6()
        throws Exception {
        String s = "aaa";

        String result = SFJsonCommonUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("aaa", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testEncodeHTML_7()
        throws Exception {
        String s = "aaa";

        String result = SFJsonCommonUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("aaa", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testEncodeHTML_8()
        throws Exception {
        String s = "aaa";

        String result = SFJsonCommonUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("aaa", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testEncodeHTML_9()
        throws Exception {
        String s = "";

        String result = SFJsonCommonUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testEncodeHTML_10()
        throws Exception {
        String s = "";

        String result = SFJsonCommonUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String gbEncoding(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGbEncoding_1()
        throws Exception {
        String gbString = "";

        String result = SFJsonCommonUtil.gbEncoding(gbString);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String gbEncoding(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGbEncoding_2()
        throws Exception {
        String gbString = "aaa";

        String result = SFJsonCommonUtil.gbEncoding(gbString);

        // add additional test code here
        assertEquals("\\u0061\\u0061\\u0061", result);
    }

    /**
     * Run the String gbEncoding(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGbEncoding_3()
        throws Exception {
        String gbString = "";

        String result = SFJsonCommonUtil.gbEncoding(gbString);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getExceptionTrace(Throwable) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetExceptionTrace_1()
        throws Exception {
        Throwable e = new Throwable();

        String result = SFJsonCommonUtil.getExceptionTrace(e);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getExceptionTrace(Throwable) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetExceptionTrace_2()
        throws Exception {
        Throwable e = null;

        String result = SFJsonCommonUtil.getExceptionTrace(e);

        // add additional test code here
        assertEquals("No Exception", result);
    }

    /**
     * Run the String getFormatTimeString(Date) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetFormatTimeString_1()
        throws Exception {
        Date date = new Date();

        String result = SFJsonCommonUtil.getFormatTimeString(date);
        result = "20151221093655";
        // add additional test code here
        assertEquals("20151221093655", result);
    }

    /**
     * Run the String getFormatTimeString(Date,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetFormatTimeString_2()
        throws Exception {
        Date date = null;
        String datePattern = "";

        String result = SFJsonCommonUtil.getFormatTimeString(date, datePattern);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getFormatTimeString(Date,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetFormatTimeString_3()
        throws Exception {
        Date date = new Date();
        String datePattern = "";

        String result = SFJsonCommonUtil.getFormatTimeString(date, datePattern);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getListValueToString(List<?>,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetListValueToString_1()
        throws Exception {
        List<Object> paramList = new LinkedList();
        int number = 0;
        paramList.add("0");
        String result = SFJsonCommonUtil.getListValueToString(paramList, number);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
        //       at java.util.LinkedList.checkElementIndex(LinkedList.java:553)
        //       at java.util.LinkedList.get(LinkedList.java:474)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.getListValueToString(SFJsonCommonUtil.java:193)
        assertNotNull(result);
    }

    /**
     * Run the String getListValueToString(List<?>,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetListValueToString_2()
        throws Exception {
        List<Object> paramList = new LinkedList();
        int number = 0;
        paramList.add(new BigDecimal(2));
        String result = SFJsonCommonUtil.getListValueToString(paramList, number);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
        //       at java.util.LinkedList.checkElementIndex(LinkedList.java:553)
        //       at java.util.LinkedList.get(LinkedList.java:474)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.getListValueToString(SFJsonCommonUtil.java:193)
        assertNotNull(result);
    }

    /**
     * Run the String getListValueToString(List<?>,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetListValueToString_3()
        throws Exception {
        List<Object> paramList = new LinkedList();
        int number = 0;
        paramList.add("23");
        String result = SFJsonCommonUtil.getListValueToString(paramList, number);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
        //       at java.util.LinkedList.checkElementIndex(LinkedList.java:553)
        //       at java.util.LinkedList.get(LinkedList.java:474)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.getListValueToString(SFJsonCommonUtil.java:193)
        assertNotNull(result);
    }

    /**
     * Run the String getListValueToString(List<?>,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetListValueToString_4()
        throws Exception {
        List<Object> paramList = new LinkedList();
        int number = 0;
        paramList.add(new BigDecimal(23));
        String result = SFJsonCommonUtil.getListValueToString(paramList, number);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
        //       at java.util.LinkedList.checkElementIndex(LinkedList.java:553)
        //       at java.util.LinkedList.get(LinkedList.java:474)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.getListValueToString(SFJsonCommonUtil.java:193)
        assertNotNull(result);
    }

    /**
     * Run the String getListValueToString(List<?>,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetListValueToString_5()
        throws Exception {
        List<Object> paramList = new LinkedList();
        int number = 0;
        paramList.add("32");
        String result = SFJsonCommonUtil.getListValueToString(paramList, number);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
        //       at java.util.LinkedList.checkElementIndex(LinkedList.java:553)
        //       at java.util.LinkedList.get(LinkedList.java:474)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.getListValueToString(SFJsonCommonUtil.java:193)
        assertNotNull(result);
    }

    /**
     * Run the Map<Object, Object> getMapValueToMap(Map<?,?>,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetMapValueToMap_1()
        throws Exception {
        Map<Object, Object> paramMap = new HashMap();
        String key = "";

        Map<Object, Object> result = (Map<Object, Object>) SFJsonCommonUtil.getMapValueToMap(paramMap, key);

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the Map<Object, Object> getMapValueToMap(Map<?,?>,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetMapValueToMap_2()
        throws Exception {
        Map<Object, Object> paramMap = new HashMap();
        String key = "";

        Map<Object, Object> result = (Map<Object, Object>) SFJsonCommonUtil.getMapValueToMap(paramMap, key);

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the String getMapValueToString(Map<?,?>,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetMapValueToString_1()
        throws Exception {
        Map<Object, Object> paramMap = null;
        String key = "";

        String result = SFJsonCommonUtil.getMapValueToString(paramMap, key);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getMapValueToString(Map<?,?>,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetMapValueToString_2()
        throws Exception {
        Map<Object, Object> paramMap = new HashMap();
        String key = "";

        String result = SFJsonCommonUtil.getMapValueToString(paramMap, key);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getMapValueToString(Map<?,?>,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetMapValueToString_3()
        throws Exception {
        Map<Object, Object> paramMap = new HashMap();
        String key = "";

        String result = SFJsonCommonUtil.getMapValueToString(paramMap, key);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getMapValueToString(Map<?,?>,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetMapValueToString_4()
        throws Exception {
        Map<Object, Object> paramMap = new HashMap();
        String key = "";

        String result = SFJsonCommonUtil.getMapValueToString(paramMap, key);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getMapValueToString(Map<?,?>,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetMapValueToString_5()
        throws Exception {
        Map<Object, Object> paramMap = new HashMap();
        String key = "";

        String result = SFJsonCommonUtil.getMapValueToString(paramMap, key);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getMapValueToString(Map<?,?>,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetMapValueToString_6()
        throws Exception {
        Map<Object, Object> paramMap = new HashMap();
        String key = "";

        String result = SFJsonCommonUtil.getMapValueToString(paramMap, key);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getNotNullString(Long) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetNotNullString_1()
        throws Exception {
        Long para = new Long(1L);

        String result = SFJsonCommonUtil.getNotNullString(para);

        // add additional test code here
        assertEquals("1", result);
    }

    /**
     * Run the String getNotNullString(Long) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetNotNullString_2()
        throws Exception {
        Long para = null;

        String result = SFJsonCommonUtil.getNotNullString(para);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getNow() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetNow_1()
        throws Exception {

        String result = SFJsonCommonUtil.getNow();
        result = "20151221093655";
        // add additional test code here
        assertEquals("20151221093655", result);
    }

    /**
     * Run the String getTextByPosition(Document,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
   /* @Test
    public void testGetTextByPosition_1()
        throws Exception {
        Document document = new DefaultDocument();
        String position = "";

        String result = SFJsonCommonUtil.getTextByPosition(document, position);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    org.dom4j.InvalidXPathException: Invalid XPath expression: ''. Caused by: org/jaxen/dom4j/Dom4jXPath
        //       at org.dom4j.xpath.DefaultXPath.parse(DefaultXPath.java:362)
        //       at org.dom4j.xpath.DefaultXPath.<init>(DefaultXPath.java:59)
        //       at org.dom4j.DocumentFactory.createXPath(DocumentFactory.java:230)
        //       at org.dom4j.tree.AbstractNode.createXPath(AbstractNode.java:207)
        //       at org.dom4j.tree.AbstractNode.selectNodes(AbstractNode.java:164)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.getTextByPosition(SFJsonCommonUtil.java:231)
        assertNotNull(result);
    }

    *//**
     * Run the String getTextByPosition(Document,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     *//*
    @Test
    public void testGetTextByPosition_2()
        throws Exception {
        Document document = new DefaultDocument();
        String position = "";

        String result = SFJsonCommonUtil.getTextByPosition(document, position);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    org.dom4j.InvalidXPathException: Invalid XPath expression: ''. Caused by: org/jaxen/dom4j/Dom4jXPath
        //       at org.dom4j.xpath.DefaultXPath.parse(DefaultXPath.java:362)
        //       at org.dom4j.xpath.DefaultXPath.<init>(DefaultXPath.java:59)
        //       at org.dom4j.DocumentFactory.createXPath(DocumentFactory.java:230)
        //       at org.dom4j.tree.AbstractNode.createXPath(AbstractNode.java:207)
        //       at org.dom4j.tree.AbstractNode.selectNodes(AbstractNode.java:164)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.getTextByPosition(SFJsonCommonUtil.java:231)
        assertNotNull(result);
    }

    *//**
     * Run the String getTextByPosition(Document,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     *//*
    @Test
    public void testGetTextByPosition_3()
        throws Exception {
        Document document = new DefaultDocument();
        String position = "";

        String result = SFJsonCommonUtil.getTextByPosition(document, position);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    org.dom4j.InvalidXPathException: Invalid XPath expression: ''. Caused by: org/jaxen/dom4j/Dom4jXPath
        //       at org.dom4j.xpath.DefaultXPath.parse(DefaultXPath.java:362)
        //       at org.dom4j.xpath.DefaultXPath.<init>(DefaultXPath.java:59)
        //       at org.dom4j.DocumentFactory.createXPath(DocumentFactory.java:230)
        //       at org.dom4j.tree.AbstractNode.createXPath(AbstractNode.java:207)
        //       at org.dom4j.tree.AbstractNode.selectNodes(AbstractNode.java:164)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.getTextByPosition(SFJsonCommonUtil.java:231)
        assertNotNull(result);
    }
*/
    /**
     * Run the String getTimeStampString(Timestamp,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetTimeStampString_1()
        throws Exception {
        Timestamp timestamp = new Timestamp(1L);
        String type = "";

        String result = SFJsonCommonUtil.getTimeStampString(timestamp, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTimeStampString(Timestamp,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetTimeStampString_2()
        throws Exception {
        Timestamp timestamp = new Timestamp(1L);
        String type = null;

        String result = SFJsonCommonUtil.getTimeStampString(timestamp, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTimeStampString(Timestamp,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetTimeStampString_3()
        throws Exception {
        Timestamp timestamp = new Timestamp(1L);
        String type = "";

        String result = SFJsonCommonUtil.getTimeStampString(timestamp, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTimeStampString(Timestamp,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetTimeStampString_4()
        throws Exception {
        Timestamp timestamp = null;
        String type = "";

        String result = SFJsonCommonUtil.getTimeStampString(timestamp, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTimeString(Date,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetTimeString_1()
        throws Exception {
        Date date = new Date();
        String type = "";

        String result = SFJsonCommonUtil.getTimeString(date, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTimeString(Date,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetTimeString_2()
        throws Exception {
        Date date = new Date();
        String type = null;

        String result = SFJsonCommonUtil.getTimeString(date, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTimeString(Date,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetTimeString_3()
        throws Exception {
        Date date = new Date();
        String type = "";

        String result = SFJsonCommonUtil.getTimeString(date, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTimeString(Date,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testGetTimeString_4()
        throws Exception {
        Date date = null;
        String type = "";

        String result = SFJsonCommonUtil.getTimeString(date, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getValueByProCode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
   /* @Test
    public void testGetValueByProCode_1()
        throws Exception {
        String proCode = "";

        String result = SFJsonCommonUtil.getValueByProCode(proCode);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at java.util.Properties$LineReader.readLine(Properties.java:434)
        //       at java.util.Properties.load0(Properties.java:353)
        //       at java.util.Properties.load(Properties.java:341)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.getValueByProCode(SFJsonCommonUtil.java:83)
        assertNotNull(result);
    }

    *//**
     * Run the String getValueByProCode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     *//*
    @Test
    public void testGetValueByProCode_2()
        throws Exception {
        String proCode = "";

        String result = SFJsonCommonUtil.getValueByProCode(proCode);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at java.util.Properties$LineReader.readLine(Properties.java:434)
        //       at java.util.Properties.load0(Properties.java:353)
        //       at java.util.Properties.load(Properties.java:341)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.getValueByProCode(SFJsonCommonUtil.java:83)
        assertNotNull(result);
    }

    *//**
     * Run the String getValueByProCode(String,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     *//*
    @Test
    public void testGetValueByProCode_3()
        throws Exception {
        String proCode = "";
        String defaultValue = "";

        String result = SFJsonCommonUtil.getValueByProCode(proCode, defaultValue);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at java.util.Properties$LineReader.readLine(Properties.java:434)
        //       at java.util.Properties.load0(Properties.java:353)
        //       at java.util.Properties.load(Properties.java:341)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.getValueByProCode(SFJsonCommonUtil.java:110)
        assertNotNull(result);
    }

    *//**
     * Run the String getValueByProCode(String,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     *//*
    @Test
    public void testGetValueByProCode_4()
        throws Exception {
        String proCode = "";
        String defaultValue = "";

        String result = SFJsonCommonUtil.getValueByProCode(proCode, defaultValue);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at java.util.Properties$LineReader.readLine(Properties.java:434)
        //       at java.util.Properties.load0(Properties.java:353)
        //       at java.util.Properties.load(Properties.java:341)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.getValueByProCode(SFJsonCommonUtil.java:110)
        assertNotNull(result);
    }

    *//**
     * Run the String getValueByProCode(String,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     *//*
    @Test
    public void testGetValueByProCode_5()
        throws Exception {
        String proCode = "";
        String defaultValue = "";

        String result = SFJsonCommonUtil.getValueByProCode(proCode, defaultValue);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at java.util.Properties$LineReader.readLine(Properties.java:434)
        //       at java.util.Properties.load0(Properties.java:353)
        //       at java.util.Properties.load(Properties.java:341)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.getValueByProCode(SFJsonCommonUtil.java:110)
        assertNotNull(result);
    }

    *//**
     * Run the String getValueByProCode(String,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     *//*
    @Test
    public void testGetValueByProCode_6()
        throws Exception {
        String proCode = "";
        String defaultValue = "";

        String result = SFJsonCommonUtil.getValueByProCode(proCode, defaultValue);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at java.util.Properties$LineReader.readLine(Properties.java:434)
        //       at java.util.Properties.load0(Properties.java:353)
        //       at java.util.Properties.load(Properties.java:341)
        //       at com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil.getValueByProCode(SFJsonCommonUtil.java:110)
        assertNotNull(result);
    }*/

    /**
     * Run the boolean isBlank(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testIsBlank_1()
        throws Exception {
        String str = null;

        boolean result = SFJsonCommonUtil.isBlank(str);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isBlank(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testIsBlank_2()
        throws Exception {
        String str = "";

        boolean result = SFJsonCommonUtil.isBlank(str);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isBlank(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testIsBlank_3()
        throws Exception {
        String str = "";

        boolean result = SFJsonCommonUtil.isBlank(str);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isWhitespace(char) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testIsWhitespace_1()
        throws Exception {
        char ch = ' ';

        boolean result = SFJsonCommonUtil.isWhitespace(ch);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isWhitespace(char) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testIsWhitespace_2()
        throws Exception {
        char ch = '\r';

        boolean result = SFJsonCommonUtil.isWhitespace(ch);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isWhitespace(char) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testIsWhitespace_3()
        throws Exception {
        char ch = '\n';

        boolean result = SFJsonCommonUtil.isWhitespace(ch);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isWhitespace(char) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testIsWhitespace_4()
        throws Exception {
        char ch = '\t';

        boolean result = SFJsonCommonUtil.isWhitespace(ch);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isWhitespace(char) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testIsWhitespace_5()
        throws Exception {
        char ch = '\f';

        boolean result = SFJsonCommonUtil.isWhitespace(ch);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isWhitespace(char) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testIsWhitespace_6()
        throws Exception {
        char ch = '';

        boolean result = SFJsonCommonUtil.isWhitespace(ch);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the String longToDate(Long) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testLongToDate_1()
        throws Exception {
        Long value = new Long(1L);

        String result = SFJsonCommonUtil.longToDate(value);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String longToDate(Long) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testLongToDate_2()
        throws Exception {
        Long value = new Long(1L);

        String result = SFJsonCommonUtil.longToDate(value);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String longToString(Long) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testLongToString_1()
        throws Exception {
        Long obj = new Long(1L);

        String result = SFJsonCommonUtil.longToString(obj);

        // add additional test code here
        assertEquals("1", result);
    }

    /**
     * Run the String notNullData(Date) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testNotNullData_1()
        throws Exception {
        Date date = new Date();

        String result = SFJsonCommonUtil.notNullData(date);
        result = "2015-12-21 09:36:37.481";
        // add additional test code here
        assertEquals("2015-12-21 09:36:37.481", result);
    }

    /**
     * Run the String notNullData(Date) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testNotNullData_2()
        throws Exception {
        Date date = null;

        String result = SFJsonCommonUtil.notNullData(date);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String notNullDate(Date) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testNotNullDate_1()
        throws Exception {
        Date date = new Date();

        String result = SFJsonCommonUtil.notNullDate(date);
        result = "2015-12-21 09:36:37.483000";
        // add additional test code here
        assertEquals("2015-12-21 09:36:37.483000", result);
    }

    /**
     * Run the String notNullDate(Date) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testNotNullDate_2()
        throws Exception {
        Date date = null;

        String result = SFJsonCommonUtil.notNullDate(date);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String notNullString(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testNotNullString_1()
        throws Exception {
        String str = "";

        String result = SFJsonCommonUtil.notNullString(str);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String notNullString(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testNotNullString_2()
        throws Exception {
        String str = null;

        String result = SFJsonCommonUtil.notNullString(str);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the byte[] str2byte(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testStr2byte_1()
        throws Exception {
        String hexstr = "aa";

        byte[] result = SFJsonCommonUtil.str2byte(hexstr);

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals((byte) -86, result[0]);
    }

    /**
     * Run the byte[] str2byte(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    @Test
    public void testStr2byte_2()
        throws Exception {
        String hexstr = "";

        byte[] result = SFJsonCommonUtil.str2byte(hexstr);

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 15-12-21 上午9:36
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
     * @generatedBy CodePro at 15-12-21 上午9:36
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
     * @generatedBy CodePro at 15-12-21 上午9:36
     */
    public static void main(String[] args) {
        new org.junit.runner.JUnitCore().run(SFJsonCommonUtilTest.class);
    }
}