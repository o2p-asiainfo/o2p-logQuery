/** 
 * Project Name:logQuery 
 * File Name:LogQueryUtil.java 
 * Package Name:com.asiainfo.log.query.util 
 * Date:2015年10月20日上午10:48:12 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.log.query.util;  

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hbase.client.HTableInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ailk.eaap.op2.bo.QueryBean;
import com.asiainfo.integration.o2p.log.common.util.Properties;

/** 
 * ClassName:LogQueryUtil <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年10月20日 上午10:48:12 <br/> 
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public final class LogQueryUtil {
    
    public static final Logger LOG = LoggerFactory.getLogger(LogQueryUtil.class);
    
    private static String getCyc(String strDate,String format){
        StringBuffer result = new StringBuffer();
        if(format != null){
            int iLength = format.length();
            if(iLength>0){          
                char preChar = format.charAt(0);
                int iPreIndex=0;
                for(int i=1;i<iLength;i++){
                    char c = format.charAt(i);
                    if(c!=preChar){
                        String ff =  format.substring(iPreIndex,i);
                        replace(result,strDate,ff);
                        preChar = c;
                        iPreIndex = i;
                    }
                }
                String ff =  format.substring(iPreIndex,iLength);
                replace(result,strDate,ff);
            }
        }
        return result.toString();
    }
    
    private static String getCyc(Date strDate,String format){
    	String suffix = "";
        SimpleDateFormat sdf = new SimpleDateFormat(format.substring(1));
        suffix = sdf.format(new Timestamp(strDate.getTime()));
        return "_"+suffix;
    }
    
    private static void replace(StringBuffer result,String strDate,String ff){
        if(ff.equalsIgnoreCase("YYYY")){
            result.append(strDate.substring(0,4));
        }else if(ff.equalsIgnoreCase("YY")){
            result.append(strDate.substring(2,4));
        }else if(ff.equalsIgnoreCase("MM")){
            result.append(strDate.substring(4,6));
        }else if(ff.equalsIgnoreCase("W")){
            int iDate = Integer.parseInt(strDate.substring(6,8));
            result.append((iDate-1)/7+1);
        }else if(ff.equalsIgnoreCase("Q")){
            int iMon = Integer.parseInt(strDate.substring(4,6));
            result.append((iMon-1)/3+1);
        }else if(ff.equalsIgnoreCase("BB")){
            int iMon = Integer.parseInt(strDate.substring(4,6));
            result.append((iMon-1)/2+1);
        }else{
            result.append(ff);
        }
    }
    
    public static void main(String[] args){
    	QueryBean queryBean = new QueryBean();
    	queryBean.setStartSrcReqTime("2016-07-01 10:24:41");
    	queryBean.setEndSrcReqTime("2016-08-15 00:00:01");
    	System.out.println(maketabSuffixList(queryBean, "_YYMMW"));
    }
    
    @SuppressWarnings("static-access")
	public static List<String> maketabSuffixList(QueryBean queryBean, String tag){
    	if(StringUtils.isBlank(queryBean.getStartSrcReqTime()) || StringUtils.isBlank(queryBean.getEndSrcReqTime())){
    		LOG.warn("start or end time is empty!");
    		return null;
    	}
    	Calendar startCal = new GregorianCalendar();
    	Calendar endCal = new GregorianCalendar();
    	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	try {
        	startCal.setTime(sdf1.parse(queryBean.getStartSrcReqTime()));
			endCal.setTime(sdf1.parse(queryBean.getEndSrcReqTime()));
		} catch (ParseException e) {
			LOG.error(e.getMessage());
		}
    	if(!startCal.before(endCal)){
    		LOG.warn("start time can not be larger to end time!");
    		return null;
    	}
    	List<String> list = new ArrayList<String>();
    	int month;
    	do{
        	list.add(maketabSuffix(queryBean, tag));
        	month = startCal.get(startCal.MONTH);
        	startCal.add(startCal.DATE, 7);
        	if(month!=startCal.get(startCal.MONTH)){//cross month
        		startCal.set(startCal.DATE, 1);
        		startCal.set(startCal.HOUR, 0);
        		startCal.set(startCal.MINUTE, 0);
        		startCal.set(startCal.SECOND, 0);
        	}
        	queryBean.setStartSrcReqTime(sdf1.format(startCal.getTime()));
    	}while(startCal.before(endCal));
    	
    	queryBean.setStartSrcReqTime(null);
    	String endTabSuffix=maketabSuffix(queryBean, tag);
    	if(!list.contains(endTabSuffix)){
    		list.add(endTabSuffix);
    	}
    	
    	return list;
    }
    
    /**
     * 计算分表后缀
     * @param queryBean
     * @return
     */
    @SuppressWarnings("unused")
    public static String maketabSuffix(QueryBean queryBean, String tag){
        String tabSuffix = "";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMddHHmmss");
        char ch = '_';
        if(StringUtils.isNotBlank(queryBean.getStartSrcReqTime())){
            Date date = null;
            try {
                date = sdf1.parse(queryBean.getStartSrcReqTime());
                tabSuffix = getCyc(date,tag);
            } catch (ParseException e) {
                LOG.error("make tableSuffix err,cause by:", e);
            }
            
        }else if(StringUtils.isNotBlank(queryBean.getEndSrcReqTime())){
            Date date = null;
            try {
                date = sdf1.parse(queryBean.getEndSrcReqTime());
                tabSuffix = getCyc(date,tag);
            } catch (ParseException e) {
                LOG.error("make tableSuffix err,cause by:", e);
            }
        }else{
            
            tabSuffix = getCyc(new Date(), tag);
        }
//        System.out.println(tabSuffix);
        return tabSuffix;
    }
    
    public static int calEndRow(int pageNo,int pageSize){
        int endRow = pageSize;
        if("oracle".equalsIgnoreCase(Properties.getInstance().getRmdbType())){
            endRow =  pageNo*pageSize;
        }
        return endRow;
    }
    
    public static int calEndRowByStartRow(int startRow,int pageSize){
        int endRow = pageSize;
        if("oracle".equalsIgnoreCase(Properties.getInstance().getRmdbType())){
            endRow =  startRow+pageSize;
        }
        return endRow;
    }
    
    public static void realeTable(HTableInterface tab){
        try {
            if(tab != null){
                tab.close();
            }
        } catch (IOException e) {
            LOG.error("close hbase table err,cause by:",e);
        }
    }
    
    private LogQueryUtil(){
        
    }
}
