package com.asiainfo.integration.o2p.log.query.util;

/*
 * @(#)CommonMethodUtil.java        2013-2-1
 *
 * Copyright (c) 2013 asiainfo-linkage
 * All rights reserved.
 *
 */

/**
 * 类名称 CommonMethodUtil <br>
 * 常用的方法工具类
 * <p>
 * @version 1.0
 * @author linfeng 2013-2-1
 * <hr>
 * 修改记录
 * <hr>
 * 1、修改人员:    修改时间:<br>       
 *    修改内容:
 * <hr>
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.dom4j.Document;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author linf
 *
 */
public final class SFJsonCommonUtil {
	
	private final static byte[] hex = "0123456789ABCDEF".getBytes(Charset.forName("UTF-8"));
	
	private final static Logger LOG = LoggerFactory.getLogger(SFJsonCommonUtil.class);
	
	private SFJsonCommonUtil(){
	    
	}
	
	
	/**
	 * 将异常信息转成字符串输出
     * Get the stack trace of the exception. 
     * @param e The exception instance.
     * @return The full stack trace of the exception.
     */
    public static String getExceptionTrace(Throwable e) {
           if (e != null) {
                  StringWriter sw = new StringWriter();
                  return sw.toString();
           }
           return "No Exception";
    }	
    
	/**
	 * 从属性文件获取固定值
	 * @param proCode
	 * @return
	 */
	public static String getValueByProCode(String proCode) {
		Properties p = new Properties();
		InputStream in = null;
		try {
		    in = SFJsonCommonUtil.class.getResourceAsStream("/logserver.properties");
			p.load(in);
			return (String) p.get(proCode);
		} catch (IOException e) {
		    LOG.error("load prop err", e);
			return null;
		}finally{
		    if(in != null){
		        try {
                    in.close();
                } catch (IOException e) {
                    LOG.error("load prop err", e);
                }
		    }
		}
	}
	
	/**
	 * 从属性文件获取固定值
	 * @param proCode
	 * @return
	 */
	public static String getValueByProCode(String proCode,String defaultValue) {
		Properties p = new Properties();
		InputStream in = null;
		try {
			String returnValue="";
			in = SFJsonCommonUtil.class.getResourceAsStream("/logserver.properties");
			p.load(in);
			if(p.get(proCode)==null||p.get(proCode).equals("")){
				returnValue = defaultValue;
			}else{ 
				returnValue = (String) p.get(proCode);
			}	
			return returnValue;
		} catch (IOException e) {
		    LOG.error("load prop err", e);
			return null;
		}finally{
		    if(in != null){
		        try {
                    in.close();
                } catch (IOException e) {
                    LOG.error("load prop err", e);
                }
		    }
		}
	}
	
	public static String notNullString(String str){
		if(str!=null){
			return str;
		}else{
			return "";
		}
	}
	
	public static String notNullData(Date date){
	   SimpleDateFormat sdfSSSFm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		if(date!=null){
			return sdfSSSFm.format(date);
		}else{
			return "";
		}
		
	}
    public static String notNullDate(Date date){
        SimpleDateFormat sdfSSSformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        if(date!=null){
            return sdfSSSformat.format(date)+"000";
        }else{
            return "";
        }
    }
    
	public static String getNotNullString(Long para){
		if(para!=null){
			return para.toString();
		}else{
			return "";
		}
	}	
	
	//将paramMap根据key获取的值转成String并返回
	public static String getMapValueToString (Map<?, ?> paramMap,String key){
		String value ="";
		if (paramMap==null){
		    return value;
		}
		if(paramMap.get(key)!=null){
			if(paramMap.get(key) instanceof String){
				value =(String)paramMap.get(key);
				return value;
			}	
			if(paramMap.get(key) instanceof java.math.BigDecimal){
				value =((java.math.BigDecimal)paramMap.get(key)).toString();
				return value;
			}			
			if(paramMap.get(key) instanceof Boolean){
				value =((Boolean)paramMap.get(key)).toString();
				return value;
			}
		}else{
			value = "";
		}
		return value;
	}
	
	//将paramList根据number获取的值转成String并返回
	public static String getListValueToString (List<?> paramList,int number){
		String value ="";
		if(paramList.get(number)!=null){
			if(paramList != null &&  paramList.size()>0 && paramList.get(number) instanceof String){
				value =(String)paramList.get(number);
				return value;
			}	
			if(paramList.get(number) instanceof java.math.BigDecimal){
				value =((java.math.BigDecimal)paramList.get(number)).toString();
				return value;
			}			
			if(paramList.get(number) instanceof Boolean){
				value =((Boolean)paramList.get(number)).toString();
				return value;
			}
		}else{
			value = "";
		}
		return value;
	}
	
	@SuppressWarnings("rawtypes")
	public static Map<?, ?> getMapValueToMap (Map<?, ?> paramMap,String key){
		Map<?, ?> map =null;
		if(paramMap.get(key)!=null){
			map = (Map<?, ?>)paramMap.get(key);
		}else{
			map=new HashMap();
		}
		return map;
	}	
	
	
	/**
	 * 获取document文档中的文本内容
	 * @param document  文档
	 * @param position  路径
	 * @return
	 */
	public static String getTextByPosition(Document document, String position) {
		List<?> list = document.selectNodes(position);
		if (list != null && list.size() != 0) {
			return ((Element) list.get(0)).getText();
		} else {
			return null;
		}
	}	
	
	/**
	 * 取当前系统时间,格式:yyyyMMddHHmmss，例如20080808122135
	 * @return
	 */
	public static String getNow() {
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return sDateFormat.format(new Date());
	}
	

	/**
	 * 取格式化时间,格式:yyyyMMddHHmmss，例如20080808122135
	 * @return
	 */
	public static String getFormatTimeString(Date date) {
		SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		return sDateFormat.format(date);
	}
	
	/**
	 * 取格式化时间,格式:yyyyMMddHHmmss，例如20080808122135
	 * @return
	 */
	public static String getFormatTimeString(Date date,String datePattern) {
		if(date==null){
			return "";
		}	
		SimpleDateFormat sDateFormat = new SimpleDateFormat(datePattern);
		return sDateFormat.format(date);
	}
	
	/**
	 * 获取TimeStamp的字符串类型
	 * @return
	 */
	public static String getTimeString(Date date,String type) {
		String result="";
		if(type!=null&&type.toUpperCase().equals("LONG")&&date!=null){
			result =((Long)date.getTime()).toString();
		}
		return result;
	}
	
	/**
	 * 获取TimeStamp的字符串类型
	 * @return
	 */
	public static String longToString(Long obj) {
		return Long.toString(obj);
	}	
	
	/**
	 * 获取TimeStamp的字符串类型
	 * @return
	 */
	public static String getTimeStampString(Timestamp timestamp,String type) {
		String result="";
		if(type!=null&&type.toUpperCase().equals("LONG")&&timestamp!=null){
			result =((Long)timestamp.getTime()).toString();
		}
		return result;
	}	

	/**
	 * 从字节数组到十六进制字符串转换
	 * @param b
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String byte2str(byte[] b) throws UnsupportedEncodingException {
		byte[] buff = new byte[2 * b.length];
		for (int i = 0; i < b.length; i++) {
			buff[2 * i] = hex[(b[i] >> 4) & 0x0f];
			buff[2 * i + 1] = hex[b[i] & 0x0f];
		}
		return new String(buff,"UTF-8");
	}

	/**
	 * 从十六进制字符串到字节数组转换
	 * @param hexstr
	 * @return
	 */
	public static byte[] str2byte(String hexstr) {
		byte[] b = new byte[hexstr.length() / 2];
		int j = 0;
		for (int i = 0; i < b.length; i++) {
			char c0 = hexstr.charAt(j++);
			char c1 = hexstr.charAt(j++);
			b[i] = (byte) ((parseInt(c0) << 4) | parseInt(c1));
		}
		return b;
	}	
	
	/**
	 * 将字符转换成整数
	 * @param c
	 * @return
	 */
	private static int parseInt(char c) {
		return Integer.parseInt(String.valueOf(c), 16);
	}	    
	
	/**
	 * 
	  * 函数名称：isBlank<br>
	  * 函数功能：检查字符串str去掉首尾空格是否为空值(null也为空值)<br>
	  * 例： StringUtil.isBlank("   abc ") 输出：false<br>
	  * @param str - 要检查的字符串<br>
	  * @return boolean str为空返回true，否则返回false
	 */
	public static boolean isBlank(String str) {
		return str == null || "".equals(str.trim());
	}	
	
	/**
	 * 
	  * 函数名称：decodeHTML<br>
	  * 函数功能：解码HTML(将&gt;,&lt;,&quot;,&amp;转换成>,<,",& )<br>
	  *  例：String temp="&lt;input type=text name='test' value='123' /&gt;"; <br>
	  *    System.out.println( StringUtil.decodeHTML(temp));<br>
	  *    输出：<input type=text name='test' value='123' />
	  * @param s - 解码字符串
	  * @return String
	 */
	public static String decodeHTML(String s) {
		if (isBlank(s)){
		    return "";
		}
		s = s.replaceAll("&amp;", "&");
		s = s.replaceAll("&lt;", "<");
		s = s.replaceAll("&gt;", ">");
		s = s.replaceAll("&quot;", "\"");
		return s;
	}
	
	
	public static String longToDate(Long value) {
		
		if(value < 1000000){
			
			return "";
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		
		return sdf.format(value);
	}

	/**
	 * 
	 * 函数名称： encodeHTML<br>
	 * 函数功能：编码HTML(将>,<,",&转换成&gt;,&lt;,&quot;,&amp;)
	 * (高效率，来自FreeMarker模板源码，比replaceAll速度快很多) <br>
	 * 例：String temp="<input type=text name='test' value='123' />";<br> 
	 *    System.out.println( StringUtil.decodeHTML(temp));<br>
	 *    输出：&lt;input type=text name='test' value='123' /&gt;
	 * @param s
	 * @return String
	 */
	public static String encodeHTML(String s) {
		if (isBlank(s)){
		    return "";
		}
		int ln = s.length();
		char c;
		StringBuffer b;
		for (int i = 0; i < ln; i++) {
			c = s.charAt(i);
			if (c == '<' || c == '>' || c == '&' || c == '"') {
				b = new StringBuffer(s.substring(0, i));
				switch (c) {
				case '<':
					b.append("&lt;");
					break;
				case '>':
					b.append("&gt;");
					break;
				case '&':
					b.append("&amp;");
					break;
				case '"':
					b.append("&quot;");
					break;
				default:break;
				}
				i++;
				int next = i;
				while (i < ln) {
					c = s.charAt(i);
					if (c == '<' || c == '>' || c == '&' || c == '"') {
						b.append(s.substring(next, i));
						switch (c) {
						case '<':
							b.append("&lt;");
							break;
						case '>':
							b.append("&gt;");
							break;
						case '&':
							b.append("&amp;");
							break;
						case '"':
							b.append("&quot;");
							break;
						default:break;
						}
						next = i + 1;
					}
					i++;
				}
				if (next < ln){
				    b.append(s.substring(next));
				}
				s = b.toString();
				break;
			}
		}
		return s;
	}	
	
	/**
	 * 将unicode编码转换成中文
	 * @param dataStr
	 * @return
	 */
	 public static String decodeUnicode(final String dataStr){
	    int start = 0;  
		int end = 0;  
		final StringBuffer buffer = new StringBuffer();  
		while (start > -1) {  
		    end = dataStr.indexOf("\\u", start + 2);  
			String charStr = "";  
			if (end == -1) {  
			     charStr = dataStr.substring(start + 2, dataStr.length());  
			} else {  
			     charStr = dataStr.substring(start + 2, end);  
			}  
			char letter = (char) Integer.parseInt(charStr, 16); // 16进制parse整形字符串。  
			buffer.append(Character.valueOf(letter).toString());  
			start = end;  
		}  
		//System.out.println(buffer.toString());
		return buffer.toString();  
	 }
	 
	/**
	 * 将中文转换成unicode编码
	 * @param gbString
	 * @return
	 */
	public static String gbEncoding(final String gbString) {  
	         char[] utfBytes = gbString.toCharArray();  
	         //String unicodeBytes = "";  
	         StringBuilder unicodeBytes = new StringBuilder();
		for (int byteIndex = 0; byteIndex < utfBytes.length; byteIndex++) {  
			String hexB = Integer.toHexString(utfBytes[byteIndex]);  
			if (hexB.length() <= 2) {  
				hexB = "00" + hexB;  
			}  
			unicodeBytes = unicodeBytes.append("\\u").append(hexB);
		}  
		//System.out.println("unicodeBytes is: " + unicodeBytes);  
	    return unicodeBytes.toString();  
	 } 
	   
	 public static final HashMap<String, Character> charTable; 
	 
	 /**
	  * 字符串decode
	  * @param s
	  * @return
	  */
	 public static String decode(String s) { 
	     String t; 
	     Character ch; 
	     int tmpPos, i; 
	     int maxPos = s.length(); 
	     StringBuffer sb = new StringBuffer(maxPos); 
	     int curPos = 0; 
	     while (curPos < maxPos) { 
	       char c = s.charAt(curPos++); 
	       if (c == '&') { 
	         tmpPos = curPos; 
	         if (tmpPos < maxPos) { 
	           char d = s.charAt(tmpPos++); 
	           if (d == '#') {  
	             if (tmpPos < maxPos) { 
	               d = s.charAt(tmpPos++); 
	               if ((d == 'x') || (d == 'X')) { 
	                 if (tmpPos < maxPos) { 
	                   d = s.charAt(tmpPos++); 
	                   if (isHexDigit(d)) { 
	                     while (tmpPos < maxPos) { 
	                       d = s.charAt(tmpPos++); 
	                       if (!isHexDigit(d)) { 
	                         if (d == ';') { 
	                           t = 
	                             s.substring( 
	                               curPos + 2, 
	                               tmpPos - 1); 
	                           try { 
	                             i = 
	                               Integer.parseInt( 
	                                 t, 
	                                 16); 
	                             if ((i >= 0) 
	                               && (i < 65536)) { 
	                               c = (char) i; 
	                               curPos = tmpPos; 
	                             } 
	                           } catch (NumberFormatException e) { 
	                               LOG.error("decode  err", e);
	                           } 
	                         } 
	                         break; 
	                       } 
	                     } 
	                   } 
	                 } 
	               } else if (isDigit(d)) { 
	                 while (tmpPos < maxPos) { 
	                   d = s.charAt(tmpPos++); 
	                   if (!isDigit(d)) { 
	                     if (d == ';') { 
	                       t = 
	                         s.substring( 
	                           curPos + 1, 
	                           tmpPos - 1); 
	                       try { 
	                         i = Integer.parseInt(t); 
	                         if ((i >= 0) && (i < 65536)) { 
	                           c = (char) i; 
	                           curPos = tmpPos; 
	                         } 
	                       } catch (NumberFormatException e) { 
	                           LOG.error("decode err", e);
	                       } 
	                     } 
	                     break; 
	                   } 
	                 } 
	               } 
	             } 
	           } else if (isLetter(d)) { 
	             while (tmpPos < maxPos) { 
	               d = s.charAt(tmpPos++); 
	               if (!isLetterOrDigit(d)) { 
	                 if (d == ';') { 
	                   t = s.substring(curPos, tmpPos - 1); 
	                   ch = (Character) charTable.get(t); 
	                   if (ch != null) { 
	                     c = ch.charValue(); 
	                     curPos = tmpPos; 
	                   } 
	                 } 
	                 break; 
	               } 
	             } 
	           } 
	         } 
	       } 
	       sb.append(c); 
	     } 
	     return sb.toString(); 
	   } 
	   private static boolean isLetterOrDigit(char c) { 
	     return isLetter(c) || isDigit(c); 
	   } 
	   private static boolean isHexDigit(char c) { 
	     return isHexLetter(c) || isDigit(c); 
	   } 
	   private static boolean isLetter(char c) { 
	     return ((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')); 
	   } 
	   private static boolean isHexLetter(char c) { 
	     return ((c >= 'a') && (c <= 'f')) || ((c >= 'A') && (c <= 'F')); 
	   } 
	   private static boolean isDigit(char c) { 
	     return (c >= '0') && (c <= '9'); 
	   } 
	   public static String compact(String s) { 
	     int maxPos = s.length(); 
	     StringBuffer sb = new StringBuffer(maxPos); 
	     int curPos = 0; 
	     while (curPos < maxPos) { 
	       char c = s.charAt(curPos++); 
	       if (isWhitespace(c)) { 
	         while ((curPos < maxPos) && isWhitespace(s.charAt(curPos))) { 
	           curPos++; 
	                 } 
	         c = '\u0020'; 
	       } 
	       sb.append(c); 
	     } 
	     return sb.toString(); 
	   } 
	   // HTML is very particular about what constitutes white space. 
	   public static boolean isWhitespace(char ch) { 
	     return (ch == '\u0020') 
	       || (ch == '\r') 
	       || (ch == '\n') 
	       || (ch == '\u0009') 
	       || (ch == '\u000c') 
	       || (ch == '\u200b'); 
	   } 
	   static { 
	     charTable = new HashMap<String, Character>(); 
	     charTable.put("quot", Character.valueOf((char)34)); 
	     charTable.put("amp", Character.valueOf((char)38)); 
	     charTable.put("apos", Character.valueOf((char)39)); 
	     charTable.put("lt", Character.valueOf((char)60)); 
	     charTable.put("gt", Character.valueOf((char)62)); 
	     charTable.put("nbsp", Character.valueOf((char)160)); 
	     charTable.put("iexcl", Character.valueOf((char)161)); 
	     charTable.put("cent", Character.valueOf((char)162)); 
	     charTable.put("pound", Character.valueOf((char)163)); 
	     charTable.put("curren", Character.valueOf((char)164)); 
	     charTable.put("yen", Character.valueOf((char)165)); 
	     charTable.put("brvbar", Character.valueOf((char)166)); 
	     charTable.put("sect", Character.valueOf((char)167)); 
	     charTable.put("uml", Character.valueOf((char)168)); 
	     charTable.put("copy", Character.valueOf((char)169)); 
	     charTable.put("ordf", Character.valueOf((char)170)); 
	     charTable.put("laquo", Character.valueOf((char)171)); 
	     charTable.put("not", Character.valueOf((char)172)); 
	     charTable.put("shy", Character.valueOf((char)173)); 
	     charTable.put("reg", Character.valueOf((char)174)); 
	     charTable.put("macr", Character.valueOf((char)175)); 
	     charTable.put("deg", Character.valueOf((char)176)); 
	     charTable.put("plusmn", Character.valueOf((char)177)); 
	     charTable.put("sup2", Character.valueOf((char)178)); 
	     charTable.put("sup3", Character.valueOf((char)179)); 
	     charTable.put("acute", Character.valueOf((char)180)); 
	     charTable.put("micro", Character.valueOf((char)181)); 
	     charTable.put("para", Character.valueOf((char)182)); 
	     charTable.put("middot", Character.valueOf((char)183)); 
	     charTable.put("cedil", Character.valueOf((char)184)); 
	     charTable.put("sup1", Character.valueOf((char)185)); 
	     charTable.put("ordm", Character.valueOf((char)186)); 
	     charTable.put("raquo", Character.valueOf((char)187)); 
	     charTable.put("frac14", Character.valueOf((char)188)); 
	     charTable.put("frac12", Character.valueOf((char)189)); 
	     charTable.put("frac34", Character.valueOf((char)190)); 
	     charTable.put("iquest", Character.valueOf((char)191)); 
	     charTable.put("Agrave", Character.valueOf((char)192)); 
	     charTable.put("Aacute", Character.valueOf((char)193)); 
	     charTable.put("Acirc", Character.valueOf((char)194)); 
	     charTable.put("Atilde", Character.valueOf((char)195)); 
	     charTable.put("Auml", Character.valueOf((char)196)); 
	     charTable.put("Aring", Character.valueOf((char)197)); 
	     charTable.put("AElig", Character.valueOf((char)198)); 
	     charTable.put("Ccedil", Character.valueOf((char)199)); 
	     charTable.put("Egrave", Character.valueOf((char)200)); 
	     charTable.put("Eacute", Character.valueOf((char)201)); 
	     charTable.put("Ecirc", Character.valueOf((char)202)); 
	     charTable.put("Euml", Character.valueOf((char)203)); 
	     charTable.put("Igrave", Character.valueOf((char)204)); 
	     charTable.put("Iacute", Character.valueOf((char)205)); 
	     charTable.put("Icirc", Character.valueOf((char)206)); 
	     charTable.put("Iuml", Character.valueOf((char)207)); 
	     charTable.put("ETH", Character.valueOf((char)208)); 
	     charTable.put("Ntilde", Character.valueOf((char)209)); 
	     charTable.put("Ograve", Character.valueOf((char)210)); 
	     charTable.put("Oacute", Character.valueOf((char)211)); 
	     charTable.put("Ocirc", Character.valueOf((char)212)); 
	     charTable.put("Otilde", Character.valueOf((char)213)); 
	     charTable.put("Ouml", Character.valueOf((char)214)); 
	     charTable.put("times", Character.valueOf((char)215)); 
	     charTable.put("Oslash", Character.valueOf((char)216)); 
	     charTable.put("Ugrave", Character.valueOf((char)217)); 
	     charTable.put("Uacute", Character.valueOf((char)218)); 
	     charTable.put("Ucirc", Character.valueOf((char)219)); 
	     charTable.put("Uuml", Character.valueOf((char)220)); 
	     charTable.put("Yacute", Character.valueOf((char)221)); 
	     charTable.put("THORN", Character.valueOf((char)222)); 
	     charTable.put("szlig", Character.valueOf((char)223)); 
	     charTable.put("agrave", Character.valueOf((char)224)); 
	     charTable.put("aacute", Character.valueOf((char)225)); 
	     charTable.put("acirc", Character.valueOf((char)226)); 
	     charTable.put("atilde", Character.valueOf((char)227)); 
	     charTable.put("auml", Character.valueOf((char)228)); 
	     charTable.put("aring", Character.valueOf((char)229)); 
	     charTable.put("aelig", Character.valueOf((char)230)); 
	     charTable.put("ccedil", Character.valueOf((char)231)); 
	     charTable.put("egrave", Character.valueOf((char)232)); 
	     charTable.put("eacute", Character.valueOf((char)233)); 
	     charTable.put("ecirc", Character.valueOf((char)234)); 
	     charTable.put("euml", Character.valueOf((char)235)); 
	     charTable.put("igrave", Character.valueOf((char)236)); 
	     charTable.put("iacute", Character.valueOf((char)237)); 
	     charTable.put("icirc", Character.valueOf((char)238)); 
	     charTable.put("iuml", Character.valueOf((char)239)); 
	     charTable.put("eth", Character.valueOf((char)240)); 
	     charTable.put("ntilde", Character.valueOf((char)241)); 
	     charTable.put("ograve", Character.valueOf((char)242)); 
	     charTable.put("oacute", Character.valueOf((char)243)); 
	     charTable.put("ocirc", Character.valueOf((char)244)); 
	     charTable.put("otilde", Character.valueOf((char)245)); 
	     charTable.put("ouml", Character.valueOf((char)246)); 
	     charTable.put("divide", Character.valueOf((char)247)); 
	     charTable.put("oslash", Character.valueOf((char)248)); 
	     charTable.put("ugrave", Character.valueOf((char)249)); 
	     charTable.put("uacute", Character.valueOf((char)250)); 
	     charTable.put("ucirc", Character.valueOf((char)251)); 
	     charTable.put("uuml", Character.valueOf((char)252)); 
	     charTable.put("yacute", Character.valueOf((char)253)); 
	     charTable.put("thorn", Character.valueOf((char)254)); 
	     charTable.put("yuml", Character.valueOf((char)255)); 
	     charTable.put("OElig", Character.valueOf((char)338)); 
	     charTable.put("oelig", Character.valueOf((char)339)); 
	     charTable.put("Scaron", Character.valueOf((char)352)); 
	     charTable.put("scaron", Character.valueOf((char)353)); 
	     charTable.put("fnof", Character.valueOf((char)402)); 
	     charTable.put("circ", Character.valueOf((char)710)); 
	     charTable.put("tilde", Character.valueOf((char)732)); 
	     charTable.put("Alpha", Character.valueOf((char)913)); 
	     charTable.put("Beta", Character.valueOf((char)914)); 
	     charTable.put("Gamma", Character.valueOf((char)915)); 
	     charTable.put("Delta", Character.valueOf((char)916)); 
	     charTable.put("Epsilon", Character.valueOf((char)917)); 
	     charTable.put("Zeta", Character.valueOf((char)918)); 
	     charTable.put("Eta", Character.valueOf((char)919)); 
	     charTable.put("Theta", Character.valueOf((char)920)); 
	     charTable.put("Iota", Character.valueOf((char)921)); 
	     charTable.put("Kappa", Character.valueOf((char)922)); 
	     charTable.put("Lambda", Character.valueOf((char)923)); 
	     charTable.put("Mu", Character.valueOf((char)924)); 
	     charTable.put("Nu", Character.valueOf((char)925)); 
	     charTable.put("Xi", Character.valueOf((char)926)); 
	     charTable.put("Omicron", Character.valueOf((char)927)); 
	     charTable.put("i", Character.valueOf((char)928)); 
	     charTable.put("Rho", Character.valueOf((char)929)); 
	     charTable.put("Sigma", Character.valueOf((char)931)); 
	     charTable.put("Tau", Character.valueOf((char)932)); 
	     charTable.put("Upsilon", Character.valueOf((char)933)); 
	     charTable.put("hi", Character.valueOf((char)934)); 
	     charTable.put("Chi", Character.valueOf((char)935)); 
	     charTable.put("si", Character.valueOf((char)936)); 
	     charTable.put("Omega", Character.valueOf((char)937)); 
	     charTable.put("alpha", Character.valueOf((char)945)); 
	     charTable.put("beta", Character.valueOf((char)946)); 
	     charTable.put("gamma", Character.valueOf((char)947)); 
	     charTable.put("delta", Character.valueOf((char)948)); 
	     charTable.put("epsilon", Character.valueOf((char)949)); 
	     charTable.put("zeta", Character.valueOf((char)950)); 
	     charTable.put("eta", Character.valueOf((char)951)); 
	     charTable.put("theta", Character.valueOf((char)952)); 
	     charTable.put("iota", Character.valueOf((char)953)); 
	     charTable.put("kappa", Character.valueOf((char)954)); 
	     charTable.put("lambda", Character.valueOf((char)955)); 
	     charTable.put("mu", Character.valueOf((char)956)); 
	     charTable.put("nu", Character.valueOf((char)957)); 
	     charTable.put("xi", Character.valueOf((char)958)); 
	     charTable.put("omicron", Character.valueOf((char)959)); 
	     charTable.put("pi", Character.valueOf((char)960)); 
	     charTable.put("rho", Character.valueOf((char)961)); 
	     charTable.put("sigmaf", Character.valueOf((char)962)); 
	     charTable.put("sigma", Character.valueOf((char)963)); 
	     charTable.put("tau", Character.valueOf((char)964)); 
	     charTable.put("upsilon", Character.valueOf((char)965)); 
	     charTable.put("phi", Character.valueOf((char)966)); 
	     charTable.put("chi", Character.valueOf((char)967)); 
	     charTable.put("psi", Character.valueOf((char)968)); 
	     charTable.put("omega", Character.valueOf((char)969)); 
	     charTable.put("thetasym", Character.valueOf((char)977)); 
	     charTable.put("upsih", Character.valueOf((char)978)); 
	     charTable.put("piv", Character.valueOf((char)982)); 
	     charTable.put("ensp", Character.valueOf((char)8194)); 
	     charTable.put("emsp", Character.valueOf((char)8195)); 
	     charTable.put("thinsp", Character.valueOf((char)8201)); 
	     charTable.put("zwnj", Character.valueOf((char)8204)); 
	     charTable.put("zwj", Character.valueOf((char)8205)); 
	     charTable.put("lrm", Character.valueOf((char)8206)); 
	     charTable.put("rlm", Character.valueOf((char)8207)); 
	     charTable.put("ndash", Character.valueOf((char)8211)); 
	     charTable.put("mdash", Character.valueOf((char)8212)); 
	     charTable.put("lsquo", Character.valueOf((char)8216)); 
	     charTable.put("rsquo", Character.valueOf((char)8217)); 
	     charTable.put("sbquo", Character.valueOf((char)8218)); 
	     charTable.put("ldquo", Character.valueOf((char)8220)); 
	     charTable.put("rdquo", Character.valueOf((char)8221)); 
	     charTable.put("bdquo", Character.valueOf((char)8222)); 
	     charTable.put("dagger", Character.valueOf((char)8224)); 
	     charTable.put("Dagger", Character.valueOf((char)8225)); 
	     charTable.put("bull", Character.valueOf((char)8226)); 
	     charTable.put("hellip", Character.valueOf((char)8230)); 
	     charTable.put("permil", Character.valueOf((char)8240)); 
	     charTable.put("prime", Character.valueOf((char)8242)); 
	     charTable.put("rime", Character.valueOf((char)8243)); 
	     charTable.put("lsaquo", Character.valueOf((char)8249)); 
	     charTable.put("rsaquo", Character.valueOf((char)8250)); 
	     charTable.put("oline", Character.valueOf((char)8254)); 
	     charTable.put("frasl", Character.valueOf((char)8260)); 
	     charTable.put("euro", Character.valueOf((char)8364)); 
	     charTable.put("image", Character.valueOf((char)8465)); 
	     charTable.put("weierp", Character.valueOf((char)8472)); 
	     charTable.put("real", Character.valueOf((char)8476)); 
	     charTable.put("trade", Character.valueOf((char)8482)); 
	     charTable.put("alefsym", Character.valueOf((char)8501)); 
	     charTable.put("larr", Character.valueOf((char)8592)); 
	     charTable.put("uarr", Character.valueOf((char)8593)); 
	     charTable.put("rarr", Character.valueOf((char)8594)); 
	     charTable.put("darr", Character.valueOf((char)8595)); 
	     charTable.put("harr", Character.valueOf((char)8596)); 
	     charTable.put("crarr", Character.valueOf((char)8629)); 
	     charTable.put("lArr", Character.valueOf((char)8656)); 
	     charTable.put("uArr", Character.valueOf((char)8657)); 
	     charTable.put("rArr", Character.valueOf((char)8658)); 
	     charTable.put("dArr", Character.valueOf((char)8659)); 
	     charTable.put("hArr", Character.valueOf((char)8660)); 
	     charTable.put("forall", Character.valueOf((char)8704)); 
	     charTable.put("part", Character.valueOf((char)8706)); 
	     charTable.put("exist", Character.valueOf((char)8707)); 
	     charTable.put("empty", Character.valueOf((char)8709)); 
	     charTable.put("nabla", Character.valueOf((char)8711)); 
	     charTable.put("isin", Character.valueOf((char)8712)); 
	     charTable.put("notin", Character.valueOf((char)8713)); 
	     charTable.put("ni", Character.valueOf((char)8715)); 
	     charTable.put("prod", Character.valueOf((char)8719)); 
	     charTable.put("sum", Character.valueOf((char)8721)); 
	     charTable.put("minus", Character.valueOf((char)8722)); 
	     charTable.put("lowast", Character.valueOf((char)8727)); 
	     charTable.put("radic", Character.valueOf((char)8730)); 
	     charTable.put("prop", Character.valueOf((char)8733)); 
	     charTable.put("infin", Character.valueOf((char)8734)); 
	     charTable.put("ang", Character.valueOf((char)8736)); 
	     charTable.put("and", Character.valueOf((char)8743)); 
	     charTable.put("or", Character.valueOf((char)8744)); 
	     charTable.put("cap", Character.valueOf((char)8745)); 
	     charTable.put("cup", Character.valueOf((char)8746)); 
	     charTable.put("int", Character.valueOf((char)8747)); 
	     charTable.put("there4", Character.valueOf((char)8756)); 
	     charTable.put("sim", Character.valueOf((char)8764)); 
	     charTable.put("cong", Character.valueOf((char)8773)); 
	     charTable.put("asymp", Character.valueOf((char)8776)); 
	     charTable.put("ne", Character.valueOf((char)8800)); 
	     charTable.put("equiv", Character.valueOf((char)8801)); 
	     charTable.put("le", Character.valueOf((char)8804)); 
	     charTable.put("ge", Character.valueOf((char)8805)); 
	     charTable.put("sub", Character.valueOf((char)8834)); 
	     charTable.put("sup", Character.valueOf((char)8835)); 
	     charTable.put("nsub", Character.valueOf((char)8836)); 
	     charTable.put("sube", Character.valueOf((char)8838)); 
	     charTable.put("supe", Character.valueOf((char)8839)); 
	     charTable.put("oplus", Character.valueOf((char)8853)); 
	     charTable.put("otimes", Character.valueOf((char)8855)); 
	     charTable.put("perp", Character.valueOf((char)8869)); 
	     charTable.put("sdot", Character.valueOf((char)8901)); 
	     charTable.put("lceil", Character.valueOf((char)8968)); 
	     charTable.put("rceil", Character.valueOf((char)8969)); 
	     charTable.put("lfloor", Character.valueOf((char)8970)); 
	     charTable.put("rfloor", Character.valueOf((char)8971)); 
	     charTable.put("lang", Character.valueOf((char)9001)); 
	     charTable.put("rang", Character.valueOf((char)9002)); 
	     charTable.put("loz", Character.valueOf((char)9674)); 
	     charTable.put("spades", Character.valueOf((char)9824)); 
	     charTable.put("clubs", Character.valueOf((char)9827)); 
	     charTable.put("hearts", Character.valueOf((char)9829)); 
	     charTable.put("diams", Character.valueOf((char)9830)); 
	   }
	public static Collection dateToString(Date srcReqTime) {
		
		return null;
	} 
}
