/*
 * @(#)ContractInteractionProcessor.java        2014-1-3
 *
 * Copyright (c) 2014 asiainfo-linkage
 * All rights reserved.
 *
 */

package com.asiainfo.integration.o2p.log.query.json;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonBeanProcessor;

import com.asiainfo.integration.o2p.log.query.bean.ContractInteractionDetail;
import com.asiainfo.integration.o2p.log.query.util.CommonMethodUtil;
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

public class ContractInteractionProcessor implements JsonBeanProcessor{
	
	 public JSONObject processBean( Object bean, JsonConfig jsonConfig ){ 
		 ContractInteractionDetail contractInteraction = (ContractInteractionDetail) bean;
		 JSONObject jSONObject = new JSONObject();
		 jSONObject.element("contractInteractionId", CommonMethodUtil.getNotNullString(contractInteraction.getContractInteractionId()))
		 		   .element("bizFuncCode", CommonMethodUtil.getNotNullString(contractInteraction.getBizFuncCode()))
		 		   .element("bizIntfCode", CommonMethodUtil.getNotNullString(contractInteraction.getBizIntfCode()))
		 		   .element("contractVersion", CommonMethodUtil.getNotNullString(contractInteraction.getContractVersion()))
		 		   .element("regSerCode", CommonMethodUtil.getNotNullString(contractInteraction.getRegSerCode()))
		 		   .element("regSerVersion", CommonMethodUtil.getNotNullString(contractInteraction.getRegSerVersion()))
		 		   .element("srcTranId", CommonMethodUtil.getNotNullString(contractInteraction.getSrcTranId()))
		 		   .element("dstTranId", CommonMethodUtil.getNotNullString(contractInteraction.getDstTranId()))
		 		   .element("serviceLevel", CommonMethodUtil.getNotNullString(contractInteraction.getServiceLevel()))
		 		   .element("srcOrgCode", CommonMethodUtil.getNotNullString(contractInteraction.getSrcOrgCode()))
		 		   .element("dstOrgCode", CommonMethodUtil.getNotNullString(contractInteraction.getDstOrgCode()))
		 		   .element("srcSysCode", CommonMethodUtil.getNotNullString(contractInteraction.getSrcSysCode()))
		 		   .element("dstSysCode", CommonMethodUtil.getNotNullString(contractInteraction.getDstSysCode()))
		 		   .element("testFlag", CommonMethodUtil.getNotNullString(contractInteraction.getTestFlag()))
		 		   .element("srcReqTime", SFJsonCommonUtil.notNullData(contractInteraction.getSrcReqTime()))
		 		   .element("centerRecReqTime", SFJsonCommonUtil.notNullData(contractInteraction.getCenterRecReqTime()))
		 		   .element("centerFwd2DstTime", SFJsonCommonUtil.notNullData(contractInteraction.getCenterFwd2DstTime()))
		 		   .element("dstRecTime", SFJsonCommonUtil.notNullData(contractInteraction.getDstRecTime()))
		 		   .element("dstReplyTime", SFJsonCommonUtil.notNullData(contractInteraction.getDstReplyTime()))
		 		   .element("centerRecDstTime", SFJsonCommonUtil.notNullData(contractInteraction.getCenterRecDstTime()))
		 		   .element("centerFwd2SrcTime", SFJsonCommonUtil.notNullData(contractInteraction.getCenterFwd2SrcTime()))
		 		   .element("srcConfirmTime", SFJsonCommonUtil.notNullData(contractInteraction.getSrcConfirmTime()))
		 		   .element("srcResponseTime", SFJsonCommonUtil.notNullData(contractInteraction.getSrcResponseTime()))
		 		   .element("responseType", CommonMethodUtil.getNotNullString(contractInteraction.getResponseType()))
		 		   .element("responseCode", CommonMethodUtil.getNotNullString(contractInteraction.getResponseCode()))
		 		   .element("responseDes", CommonMethodUtil.getNotNullString(contractInteraction.getResponseDes()))
		 		   .element("createTime", SFJsonCommonUtil.notNullData(contractInteraction.getCreateTime()))
		 
				   .element("exceptionSpecId", CommonMethodUtil.getNotNullString(contractInteraction.getExceptionSpecId()))
				   .element("exceptionMessage", CommonMethodUtil.getNotNullString(contractInteraction.getExceptionMessage()))
				   .element("content", CommonMethodUtil.getNotNullString(contractInteraction.getContent()))
				   .element("staffNbr", CommonMethodUtil.getNotNullString(contractInteraction.getStaffNbr()))
				   
				   .element("errCode", CommonMethodUtil.getNotNullString(contractInteraction.getErrCode()))
				   .element("funName", CommonMethodUtil.getNotNullString(contractInteraction.getFunName()))
				   .element("errorMsg", CommonMethodUtil.getNotNullString(contractInteraction.getErrorMsg()))
				   .element("descriptor", CommonMethodUtil.getNotNullString(contractInteraction.getDescriptor()))
				   .element("status", CommonMethodUtil.getNotNullString(contractInteraction.getStatus()))
				   
				   .element("srcIp", CommonMethodUtil.getNotNullString(contractInteraction.getSrcIp()))
				   .element("inputFileNum", CommonMethodUtil.getNotNullString(contractInteraction.getInputFileNum()))
				   .element("outputSuccessFileNum", CommonMethodUtil.getNotNullString(contractInteraction.getOutputSuccessFileNum()))
				   .element("outputErrFileNum", CommonMethodUtil.getNotNullString(contractInteraction.getOuputErrFileNum()));
		  
		 return jSONObject;  
	 }
}