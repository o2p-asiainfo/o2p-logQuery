package com.logQuery.util.codePro.test;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.dom4j.Document;
import org.dom4j.tree.DefaultDocument;
import org.junit.*;

import com.asiainfo.integration.o2p.log.query.util.CommonMethodUtil;

import static org.junit.Assert.*;

/**
 * The class <code>CommonMethodUtilTest</code> contains tests for the class <code>{@link CommonMethodUtil}</code>.
 *
 * @generatedBy CodePro at 15-12-21 上午9:37
 * @author daimq
 * @version $Revision: 1.0 $
 */
public class CommonMethodUtilTest {
    /**
     * Run the String byte2str(byte[]) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testByte2str_1()
        throws Exception {
        byte[] b = new byte[] {(byte) 1};

        String result = CommonMethodUtil.byte2str(b);

        // add additional test code here
        assertEquals("01", result);
    }

    /**
     * Run the String byte2str(byte[]) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testByte2str_2()
        throws Exception {
        byte[] b = new byte[] {};

        String result = CommonMethodUtil.byte2str(b);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String compact(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testCompact_1()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.compact(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String compact(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testCompact_2()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.compact(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String compact(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testCompact_3()
        throws Exception {
        String s = "";

        String result = CommonMethodUtil.compact(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String compact(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testCompact_4()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.compact(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String compact(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testCompact_5()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.compact(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String compact(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testCompact_6()
        throws Exception {
        String s = "";

        String result = CommonMethodUtil.compact(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_1()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_2()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_3()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_4()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_5()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_6()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_7()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_8()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_9()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_10()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_11()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_12()
        throws Exception {
        String s = "";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_13()
        throws Exception {
        String s = "";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_14()
        throws Exception {
        String s = "";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_15()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String decode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecode_16()
        throws Exception {
        String s = "";

        String result = CommonMethodUtil.decode(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String decodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecodeHTML_1()
        throws Exception {
        String s = "";

        String result = CommonMethodUtil.decodeHTML(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String decodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecodeHTML_2()
        throws Exception {
        String s = "";

        String result = CommonMethodUtil.decodeHTML(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String decodeUnicode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecodeUnicode_1()
        throws Exception {
        String dataStr = "ab8\\u002D";

        String result = CommonMethodUtil.decodeUnicode(dataStr);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.StringIndexOutOfBoundsException: String index out of range: -2
        //       at java.lang.String.substring(String.java:1911)
        //       at com.asiainfo.integration.o2p.log.query.util.CommonMethodUtil.decodeUnicode(CommonMethodUtil.java:461)
        assertNotNull(result);
    }

    /**
     * Run the String decodeUnicode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecodeUnicode_2()
        throws Exception {
        String dataStr = "abc";

        String result = CommonMethodUtil.decodeUnicode(dataStr);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.StringIndexOutOfBoundsException: String index out of range: -2
        //       at java.lang.String.substring(String.java:1911)
        //       at com.asiainfo.integration.o2p.log.query.util.CommonMethodUtil.decodeUnicode(CommonMethodUtil.java:461)
        assertNotNull(result);
    }

    /**
     * Run the String decodeUnicode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testDecodeUnicode_3()
        throws Exception {
        String dataStr = "abc";

        String result = CommonMethodUtil.decodeUnicode(dataStr);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.StringIndexOutOfBoundsException: String index out of range: -2
        //       at java.lang.String.substring(String.java:1911)
        //       at com.asiainfo.integration.o2p.log.query.util.CommonMethodUtil.decodeUnicode(CommonMethodUtil.java:461)
        assertNotNull(result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testEncodeHTML_1()
        throws Exception {
        String s = "";

        String result = CommonMethodUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testEncodeHTML_2()
        throws Exception {
        String s = "aa";

        String result = CommonMethodUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("aa", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testEncodeHTML_3()
        throws Exception {
        String s = "";

        String result = CommonMethodUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testEncodeHTML_4()
        throws Exception {
        String s = "aaa";

        String result = CommonMethodUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("aaa", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testEncodeHTML_5()
        throws Exception {
        String s = "aaa";

        String result = CommonMethodUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("aaa", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testEncodeHTML_6()
        throws Exception {
        String s = "aaa";

        String result = CommonMethodUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("aaa", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testEncodeHTML_7()
        throws Exception {
        String s = "aaa";

        String result = CommonMethodUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("aaa", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testEncodeHTML_8()
        throws Exception {
        String s = "aaa";

        String result = CommonMethodUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("aaa", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testEncodeHTML_9()
        throws Exception {
        String s = "";

        String result = CommonMethodUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String encodeHTML(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testEncodeHTML_10()
        throws Exception {
        String s = "";

        String result = CommonMethodUtil.encodeHTML(s);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String gbEncoding(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGbEncoding_1()
        throws Exception {
        String gbString = "";

        String result = CommonMethodUtil.gbEncoding(gbString);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String gbEncoding(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGbEncoding_2()
        throws Exception {
        String gbString = "aaa";

        String result = CommonMethodUtil.gbEncoding(gbString);

        // add additional test code here
        assertEquals("\\u0061\\u0061\\u0061", result);
    }

    /**
     * Run the String gbEncoding(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGbEncoding_3()
        throws Exception {
        String gbString = "";

        String result = CommonMethodUtil.gbEncoding(gbString);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String genUUID() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGenUUID_1()
        throws Exception {

        String result = CommonMethodUtil.genUUID();
        result = "5FD370201A4144FBB40BAE254F097BDB";
        // add additional test code here
        assertEquals("5FD370201A4144FBB40BAE254F097BDB", result);
    }

    /**
     * Run the String getEaapCommonConfig(String,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetEaapCommonConfig_1()
        throws Exception {
        String key = "";
        String defaultValue = "";

        String result = CommonMethodUtil.getEaapCommonConfig(key, defaultValue);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getEaapCommonConfig(String,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetEaapCommonConfig_2()
        throws Exception {
        String key = "";
        String defaultValue = "";

        String result = CommonMethodUtil.getEaapCommonConfig(key, defaultValue);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getEaapCommonConfig(String,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetEaapCommonConfig_3()
        throws Exception {
        String key = "";
        String defaultValue = "";

        String result = CommonMethodUtil.getEaapCommonConfig(key, defaultValue);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getExceptionTrace(Throwable) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetExceptionTrace_1()
        throws Exception {
        Throwable e = new Throwable();

        String result = CommonMethodUtil.getExceptionTrace(e);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getExceptionTrace(Throwable) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetExceptionTrace_2()
        throws Exception {
        Throwable e = null;

        String result = CommonMethodUtil.getExceptionTrace(e);

        // add additional test code here
        assertEquals("No Exception", result);
    }

    /**
     * Run the String getFormatTimeString(Date) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetFormatTimeString_1()
        throws Exception {
        Date date = new Date();

        String result = CommonMethodUtil.getFormatTimeString(date);
        result = "20151221093709";
        // add additional test code here
        assertEquals("20151221093709", result);
    }

    /**
     * Run the String getFormatTimeString(Date,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetFormatTimeString_2()
        throws Exception {
        Date date = null;
        String datePattern = "";

        String result = CommonMethodUtil.getFormatTimeString(date, datePattern);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getFormatTimeString(Date,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetFormatTimeString_3()
        throws Exception {
        Date date = new Date();
        String datePattern = "";

        String result = CommonMethodUtil.getFormatTimeString(date, datePattern);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getListValueToString(List,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetListValueToString_1()
        throws Exception {
        List paramList = new Vector();
        int number = 0;
        paramList.add("1");
        String result = CommonMethodUtil.getListValueToString(paramList, number);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 1
        //       at java.util.Vector.get(Vector.java:744)
        //       at com.asiainfo.integration.o2p.log.query.util.CommonMethodUtil.getListValueToString(CommonMethodUtil.java:204)
        assertNotNull(result);
    }

    /**
     * Run the String getListValueToString(List,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetListValueToString_2()
        throws Exception {
        List paramList = new Vector();
        int number = 0;
        paramList.add(new BigDecimal(2));
        String result = CommonMethodUtil.getListValueToString(paramList, number);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 1
        //       at java.util.Vector.get(Vector.java:744)
        //       at com.asiainfo.integration.o2p.log.query.util.CommonMethodUtil.getListValueToString(CommonMethodUtil.java:204)
        assertNotNull(result);
    }

    /**
     * Run the String getListValueToString(List,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetListValueToString_3()
        throws Exception {
        List paramList = new Vector();
        int number = 0;

        String result = CommonMethodUtil.getListValueToString(paramList, number);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 1
        //       at java.util.Vector.get(Vector.java:744)
        //       at com.asiainfo.integration.o2p.log.query.util.CommonMethodUtil.getListValueToString(CommonMethodUtil.java:204)
        assertNotNull(result);
    }

    /**
     * Run the String getListValueToString(List,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetListValueToString_4()
        throws Exception {
        List paramList = new Vector();
        int number = 1;

        String result = CommonMethodUtil.getListValueToString(paramList, number);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 1
        //       at java.util.Vector.get(Vector.java:744)
        //       at com.asiainfo.integration.o2p.log.query.util.CommonMethodUtil.getListValueToString(CommonMethodUtil.java:204)
        assertNotNull(result);
    }

    /**
     * Run the String getListValueToString(List,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetListValueToString_5()
        throws Exception {
        List paramList = new Vector();
        int number = 1;

        String result = CommonMethodUtil.getListValueToString(paramList, number);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 1
        //       at java.util.Vector.get(Vector.java:744)
        //       at com.asiainfo.integration.o2p.log.query.util.CommonMethodUtil.getListValueToString(CommonMethodUtil.java:204)
        assertNotNull(result);
    }

    /**
     * Run the Map getMapValueToMap(Map,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetMapValueToMap_1()
        throws Exception {
        Map paramMap = new HashMap();
        String key = "";

        Map result = CommonMethodUtil.getMapValueToMap(paramMap, key);

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the Map getMapValueToMap(Map,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetMapValueToMap_2()
        throws Exception {
        Map paramMap = new HashMap();
        String key = "";

        Map result = CommonMethodUtil.getMapValueToMap(paramMap, key);

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the String getMapValueToString(Map,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetMapValueToString_1()
        throws Exception {
        Map paramMap = null;
        String key = "";

        String result = CommonMethodUtil.getMapValueToString(paramMap, key);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getMapValueToString(Map,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetMapValueToString_2()
        throws Exception {
        Map paramMap = new HashMap();
        String key = "";

        String result = CommonMethodUtil.getMapValueToString(paramMap, key);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getMapValueToString(Map,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetMapValueToString_3()
        throws Exception {
        Map paramMap = new HashMap();
        String key = "";

        String result = CommonMethodUtil.getMapValueToString(paramMap, key);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getMapValueToString(Map,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetMapValueToString_4()
        throws Exception {
        Map paramMap = new HashMap();
        String key = "";

        String result = CommonMethodUtil.getMapValueToString(paramMap, key);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getMapValueToString(Map,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetMapValueToString_5()
        throws Exception {
        Map paramMap = new HashMap();
        String key = "";

        String result = CommonMethodUtil.getMapValueToString(paramMap, key);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getMapValueToString(Map,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetMapValueToString_6()
        throws Exception {
        Map paramMap = new HashMap();
        String key = "";

        String result = CommonMethodUtil.getMapValueToString(paramMap, key);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getNotDate(Date) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetNotDate_1()
        throws Exception {
        Date date = new Date();

        String result = CommonMethodUtil.getNotDate(date);
        result = "2015-12-21 09:36:59";
        // add additional test code here
        assertEquals("2015-12-21 09:36:59", result);
    }

    /**
     * Run the String getNotDate(Date) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetNotDate_2()
        throws Exception {
        Date date = null;

        String result = CommonMethodUtil.getNotDate(date);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getNotNullString(Integer) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetNotNullString_1()
        throws Exception {
        Integer para = new Integer(1);

        String result = CommonMethodUtil.getNotNullString(para);

        // add additional test code here
        assertEquals("1", result);
    }

    /**
     * Run the String getNotNullString(Integer) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetNotNullString_2()
        throws Exception {
        Integer para = null;

        String result = CommonMethodUtil.getNotNullString(para);

        // add additional test code here
        assertEquals("0", result);
    }

    /**
     * Run the String getNotNullString(Long) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetNotNullString_3()
        throws Exception {
        Long para = new Long(1L);

        String result = CommonMethodUtil.getNotNullString(para);

        // add additional test code here
        assertEquals("1", result);
    }

    /**
     * Run the String getNotNullString(Long) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetNotNullString_4()
        throws Exception {
        Long para = null;

        String result = CommonMethodUtil.getNotNullString(para);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getNotNullString(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetNotNullString_5()
        throws Exception {
        String str = "";

        String result = CommonMethodUtil.getNotNullString(str);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getNotNullString(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetNotNullString_6()
        throws Exception {
        String str = null;

        String result = CommonMethodUtil.getNotNullString(str);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getNow() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetNow_1()
        throws Exception {

        String result = CommonMethodUtil.getNow();
        result = "20151221093709";
        // add additional test code here
        assertEquals("20151221093709", result);
    }

    /**
     * Run the String getTextByPosition(Document,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
   /* @Test
    public void testGetTextByPosition_1()
        throws Exception {
        Document document = new DefaultDocument();
        String position = "";

        String result = CommonMethodUtil.getTextByPosition(document, position);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    org.dom4j.InvalidXPathException: Invalid XPath expression: ''. Caused by: org/jaxen/dom4j/Dom4jXPath
        //       at org.dom4j.xpath.DefaultXPath.parse(DefaultXPath.java:362)
        //       at org.dom4j.xpath.DefaultXPath.<init>(DefaultXPath.java:59)
        //       at org.dom4j.DocumentFactory.createXPath(DocumentFactory.java:230)
        //       at org.dom4j.tree.AbstractNode.createXPath(AbstractNode.java:207)
        //       at org.dom4j.tree.AbstractNode.selectNodes(AbstractNode.java:164)
        //       at com.asiainfo.integration.o2p.log.query.util.CommonMethodUtil.getTextByPosition(CommonMethodUtil.java:240)
        assertNotNull(result);
    }

    *//**
     * Run the String getTextByPosition(Document,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     *//*
    @Test
    public void testGetTextByPosition_2()
        throws Exception {
        Document document = new DefaultDocument();
        String position = "";

        String result = CommonMethodUtil.getTextByPosition(document, position);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    org.dom4j.InvalidXPathException: Invalid XPath expression: ''. Caused by: org/jaxen/dom4j/Dom4jXPath
        //       at org.dom4j.xpath.DefaultXPath.parse(DefaultXPath.java:362)
        //       at org.dom4j.xpath.DefaultXPath.<init>(DefaultXPath.java:59)
        //       at org.dom4j.DocumentFactory.createXPath(DocumentFactory.java:230)
        //       at org.dom4j.tree.AbstractNode.createXPath(AbstractNode.java:207)
        //       at org.dom4j.tree.AbstractNode.selectNodes(AbstractNode.java:164)
        //       at com.asiainfo.integration.o2p.log.query.util.CommonMethodUtil.getTextByPosition(CommonMethodUtil.java:240)
        assertNotNull(result);
    }

    *//**
     * Run the String getTextByPosition(Document,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     *//*
    @Test
    public void testGetTextByPosition_3()
        throws Exception {
        Document document = new DefaultDocument();
        String position = "";

        String result = CommonMethodUtil.getTextByPosition(document, position);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    org.dom4j.InvalidXPathException: Invalid XPath expression: ''. Caused by: org/jaxen/dom4j/Dom4jXPath
        //       at org.dom4j.xpath.DefaultXPath.parse(DefaultXPath.java:362)
        //       at org.dom4j.xpath.DefaultXPath.<init>(DefaultXPath.java:59)
        //       at org.dom4j.DocumentFactory.createXPath(DocumentFactory.java:230)
        //       at org.dom4j.tree.AbstractNode.createXPath(AbstractNode.java:207)
        //       at org.dom4j.tree.AbstractNode.selectNodes(AbstractNode.java:164)
        //       at com.asiainfo.integration.o2p.log.query.util.CommonMethodUtil.getTextByPosition(CommonMethodUtil.java:240)
        assertNotNull(result);
    }*/

    /**
     * Run the String getTimeStampString(Timestamp,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetTimeStampString_1()
        throws Exception {
        Timestamp timestamp = new Timestamp(1L);
        String type = "";

        String result = CommonMethodUtil.getTimeStampString(timestamp, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTimeStampString(Timestamp,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetTimeStampString_2()
        throws Exception {
        Timestamp timestamp = new Timestamp(1L);
        String type = null;

        String result = CommonMethodUtil.getTimeStampString(timestamp, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTimeStampString(Timestamp,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetTimeStampString_3()
        throws Exception {
        Timestamp timestamp = new Timestamp(1L);
        String type = "";

        String result = CommonMethodUtil.getTimeStampString(timestamp, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTimeStampString(Timestamp,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetTimeStampString_4()
        throws Exception {
        Timestamp timestamp = null;
        String type = "";

        String result = CommonMethodUtil.getTimeStampString(timestamp, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTimeString(Date,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetTimeString_1()
        throws Exception {
        Date date = new Date();
        String type = "";

        String result = CommonMethodUtil.getTimeString(date, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTimeString(Date,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetTimeString_2()
        throws Exception {
        Date date = new Date();
        String type = null;

        String result = CommonMethodUtil.getTimeString(date, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTimeString(Date,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetTimeString_3()
        throws Exception {
        Date date = new Date();
        String type = "";

        String result = CommonMethodUtil.getTimeString(date, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTimeString(Date,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetTimeString_4()
        throws Exception {
        Date date = null;
        String type = "";

        String result = CommonMethodUtil.getTimeString(date, type);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getValueByProCode(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetValueByProCode_1()
        throws Exception {
        String proCode = "";

        String result = CommonMethodUtil.getValueByProCode(proCode);

        // add additional test code here
        assertEquals(null, result);
    }

    /**
     * Run the String getValueByProCode(String,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetValueByProCode_2()
        throws Exception {
        String proCode = "";
        String defaultValue = "";

        String result = CommonMethodUtil.getValueByProCode(proCode, defaultValue);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getValueByProCode(String,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetValueByProCode_3()
        throws Exception {
        String proCode = "";
        String defaultValue = "";

        String result = CommonMethodUtil.getValueByProCode(proCode, defaultValue);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getValueByProCode(String,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testGetValueByProCode_4()
        throws Exception {
        String proCode = "";
        String defaultValue = "";

        String result = CommonMethodUtil.getValueByProCode(proCode, defaultValue);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the boolean isBlank(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testIsBlank_1()
        throws Exception {
        String str = null;

        boolean result = CommonMethodUtil.isBlank(str);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isBlank(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testIsBlank_2()
        throws Exception {
        String str = "";

        boolean result = CommonMethodUtil.isBlank(str);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isBlank(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testIsBlank_3()
        throws Exception {
        String str = "";

        boolean result = CommonMethodUtil.isBlank(str);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isListEmpty(List) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testIsListEmpty_1()
        throws Exception {
        List list = new Vector();

        boolean result = CommonMethodUtil.isListEmpty(list);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isListEmpty(List) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testIsListEmpty_2()
        throws Exception {
        List list = new Vector();

        boolean result = CommonMethodUtil.isListEmpty(list);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isListEmpty(List) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testIsListEmpty_3()
        throws Exception {
        List list = null;

        boolean result = CommonMethodUtil.isListEmpty(list);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isWhitespace(char) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testIsWhitespace_1()
        throws Exception {
        char ch = ' ';

        boolean result = CommonMethodUtil.isWhitespace(ch);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isWhitespace(char) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testIsWhitespace_2()
        throws Exception {
        char ch = '\r';

        boolean result = CommonMethodUtil.isWhitespace(ch);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isWhitespace(char) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testIsWhitespace_3()
        throws Exception {
        char ch = '\n';

        boolean result = CommonMethodUtil.isWhitespace(ch);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isWhitespace(char) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testIsWhitespace_4()
        throws Exception {
        char ch = '\t';

        boolean result = CommonMethodUtil.isWhitespace(ch);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isWhitespace(char) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testIsWhitespace_5()
        throws Exception {
        char ch = '\f';

        boolean result = CommonMethodUtil.isWhitespace(ch);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isWhitespace(char) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testIsWhitespace_6()
        throws Exception {
        char ch = '';

        boolean result = CommonMethodUtil.isWhitespace(ch);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the String replaceInvalidCharacter(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testReplaceInvalidCharacter_1()
        throws Exception {
        String str = "";

        String result = CommonMethodUtil.replaceInvalidCharacter(str);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String replaceInvalidCharacter(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testReplaceInvalidCharacter_2()
        throws Exception {
        String str = null;

        String result = CommonMethodUtil.replaceInvalidCharacter(str);

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the byte[] str2byte(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testStr2byte_1()
        throws Exception {
        String hexstr = "aa";

        byte[] result = CommonMethodUtil.str2byte(hexstr);

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
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testStr2byte_2()
        throws Exception {
        String hexstr = "";

        byte[] result = CommonMethodUtil.str2byte(hexstr);

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.length);
    }

    /**
     * Run the void threadSleep(long) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testThreadSleep_1()
        throws Exception {
        long time = 1L;

        CommonMethodUtil.threadSleep(time);

        // add additional test code here
    }

    /**
     * Run the void threadSleep(long) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testThreadSleep_2()
        throws Exception {
        long time = 1L;

        CommonMethodUtil.threadSleep(time);

        // add additional test code here
    }

    /**
     * Run the void waitSleep(long) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testWaitSleep_1()
        throws Exception {
        long time = 1L;

        CommonMethodUtil.waitSleep(time);

        // add additional test code here
    }

    /**
     * Run the void waitSleep(long) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    @Test
    public void testWaitSleep_2()
        throws Exception {
        long time = 1L;

        CommonMethodUtil.waitSleep(time);

        // add additional test code here
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 15-12-21 上午9:37
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
     * @generatedBy CodePro at 15-12-21 上午9:37
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
     * @generatedBy CodePro at 15-12-21 上午9:37
     */
    public static void main(String[] args) {
        new org.junit.runner.JUnitCore().run(CommonMethodUtilTest.class);
    }
}