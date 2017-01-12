package com.asiainfo.integration.o2p.log.query.json;

/*
 *
 * Copyright (c) 2014 asiainfo-linkage
 * All rights reserved.
 *
 */


import org.apache.commons.lang.StringUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonBeanProcessor;

import com.asiainfo.integration.o2p.log.common.bo.HbContractInteraction;
import com.asiainfo.integration.o2p.log.common.hbase.fields.EmbeddedExpAndCtgLogKeys;
import com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil;

/**
 * 类名称<br>
 * 这里是类的描述区域，概括出该的主要功能或者类的使用范围、注意事项等
 * <p>
 * @version 1.0
 * @author Administrator 2014-1-3
 * <hr>
 * 修改记录
 * <hr>
 * 1、修改人员:    修改时间:<br>       
 *    修改内容:
 * <hr>
 */

public class HbContractInteractionProcessor implements JsonBeanProcessor{
	
    
    public static void main(String[] args) {
//        String s= "[{\"key1\":\"v1\",\"key2\":\"v2\"},{\"key1\":\"v1\",\"key2\":\"v2\"}]";
//        JSONArray sa = JSONArray.fromObject(s);
//        JSONObject s1 = sa.getJSONObject(0);
//        System.out.println(s1.get("key1"));
//        System.out.println(s1.get("key2"));
    }
    
	 public JSONObject processBean( Object bean, JsonConfig jsonConfig ){ 
		 HbContractInteraction ci = (HbContractInteraction) bean;
		 
		 JSONArray exps = null;
		 if(!StringUtils.isEmpty(ci.getExceptionLogs())){
		     exps = JSONArray.fromObject(ci.getExceptionLogs());
		 }
		 JSONArray ctgs = null;
		 if(!StringUtils.isEmpty(ci.getCtgErrInfo())){
             ctgs = JSONArray.fromObject(ci.getCtgErrInfo());
         }
		 JSONObject jSONObject = new JSONObject();
		 jSONObject.element("contractInteractionId", SFJsonCommonUtil.notNullString(ci.getContractInteractionId()))
		 		   .element("bizFuncCode", SFJsonCommonUtil.notNullString(ci.getBizFuncCode()))
		 		   .element("bizIntfCode", SFJsonCommonUtil.notNullString(ci.getBizIntfCode()))
		 		   .element("contractVersion", SFJsonCommonUtil.notNullString(ci.getContractVersion()))
		 		   .element("srcTranId", SFJsonCommonUtil.notNullString(ci.getSrcTranId()))
		 		   .element("dstTranId", SFJsonCommonUtil.notNullString(ci.getDstTranId()))
		 		   .element("serviceLevel", SFJsonCommonUtil.notNullString(ci.getServiceLevel()))
		 		   .element("srcOrgCode", SFJsonCommonUtil.notNullString(ci.getSrcOrgCode()))
		 		   .element("dstOrgCode", SFJsonCommonUtil.notNullString(ci.getDstOrgCode()))
		 		   .element("srcSysCode", SFJsonCommonUtil.notNullString(ci.getSrcSysCode()))
		 		   .element("dstSysCode", SFJsonCommonUtil.notNullString(ci.getDstSysCode()))
		 		   .element("testFlag", SFJsonCommonUtil.notNullString(ci.getTestFlag()))
		 		   .element("srcReqTime", SFJsonCommonUtil.longToDate(ci.getSrcReqTime()))
		 		   .element("centerRecReqTime", SFJsonCommonUtil.longToDate(ci.getCenterRecReqTime()))
		 		   .element("centerFwd2DstTime", SFJsonCommonUtil.longToDate(ci.getCenterFwd2DstTime()))
		 		   .element("dstRecTime", SFJsonCommonUtil.longToDate(ci.getDstRecTime()))
		 		   .element("dstReplyTime", SFJsonCommonUtil.longToDate(ci.getDstReplyTime()))
		 		   .element("centerRecDstTime", SFJsonCommonUtil.longToDate(ci.getCenterRecDstTime()))
		 		   .element("centerFwd2SrcTime", SFJsonCommonUtil.longToDate(ci.getCenterFwd2SrcTime()))
		 		   .element("srcConfirmTime", SFJsonCommonUtil.longToDate(ci.getSrcConfirmTime()))
		 		   .element("srcResponseTime", SFJsonCommonUtil.longToDate(ci.getSrcResponseTime()))
		 		   .element("responseType", SFJsonCommonUtil.notNullString(ci.getResponseType()))
		 		   .element("responseCode", SFJsonCommonUtil.notNullString(ci.getResponseCode()))
		 		   .element("responseDes", SFJsonCommonUtil.notNullString(ci.getResponseDes()))
		 		   .element("createTime", SFJsonCommonUtil.longToDate(ci.getCreateTime()));
		 		   if(exps != null && exps.get(0) != null){
		 		       JSONObject exp = (JSONObject) exps.getJSONObject(0);
		 		      jSONObject.element("exceptionMessage", exp.get(EmbeddedExpAndCtgLogKeys.EXP_MSG))
		 		                .element("content", exp.get(EmbeddedExpAndCtgLogKeys.EXP_CONTENT));
		 		   }
		 		   if(ctgs != null && ctgs.get(0) != null){
		 		       JSONObject ctg = ctgs.getJSONObject(0);
		 		      jSONObject.element("errCode", ctg.get(EmbeddedExpAndCtgLogKeys.CTG_ERR_CODE))
		 		      .element("funName", ctg.get(EmbeddedExpAndCtgLogKeys.CTG_FUN_NAME))
		 		      .element("errorMsg", ctg.get(EmbeddedExpAndCtgLogKeys.EXP_MSG))
                      .element("descriptor", ctg.get(EmbeddedExpAndCtgLogKeys.CTG_DESC));
		 		   }
//		 		   .element("exceptionSpecId", SFJsonCommonUtil.notNullString(ci.getExceptionSpecId()))
//		 		   .element("exceptionMessage", SFJsonCommonUtil.notNullString(ci.getExceptionMessage()))
//		 		   .element("content", SFJsonCommonUtil.notNullString(ci.getContent()))
//		 		   .element("staffNbr", SFJsonCommonUtil.notNullString(ci.getStaffNbr()))
		 		   
//		 		   .element("errCode", SFJsonCommonUtil.notNullString(ci.getErrCode()))
//		 		   .element("funName", SFJsonCommonUtil.notNullString(ci.getFunName()))
//		 		   .element("errorMsg", SFJsonCommonUtil.notNullString(ci.getErrorMsg()))
//		 		   .element("descriptor", SFJsonCommonUtil.notNullString(ci.getDescriptor()))
//		 		   .element("status", SFJsonCommonUtil.notNullString(ci.getStatus()))
//		 		   .element("statusDesc", SFJsonCommonUtil.notNullString(ci.getStatusDesc()))
//		 		   .element("statusTime", SFJsonCommonUtil.LongToDate(ci.getStatusTime()));
		
		 return jSONObject;  
	 }
}
