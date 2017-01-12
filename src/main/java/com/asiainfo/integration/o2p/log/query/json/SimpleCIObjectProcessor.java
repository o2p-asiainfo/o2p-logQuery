package com.asiainfo.integration.o2p.log.query.json;

/*
 *
 * Copyright (c) 2014 asiainfo-linkage
 * All rights reserved.
 *
 */


import com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil;
import com.ailk.eaap.op2.bo.ContractInteraction;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonBeanProcessor;


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

public class SimpleCIObjectProcessor implements JsonBeanProcessor{
	
	 public JSONObject processBean( Object bean, JsonConfig jsonConfig ){ 
		 
		 ContractInteraction ci = (ContractInteraction) bean;
		 JSONObject jSONObject = new JSONObject();
		 jSONObject.element("contractInteractionId", SFJsonCommonUtil.notNullString(ci.getContractInteractionId().split("_")[2]))
			   .element("rowkeyValue", SFJsonCommonUtil.notNullString(ci.getContractInteractionId())+"_"+SFJsonCommonUtil.notNullDate(ci.getCreateTime()))
			   .element("contractVersion", SFJsonCommonUtil.notNullString(ci.getContractVersion()))
			   .element("serviceLevel", SFJsonCommonUtil.notNullString(ci.getServiceLevel()))
			   .element("responseCode", SFJsonCommonUtil.notNullString(ci.getResponseCode()))
			   .element("srcTranId", SFJsonCommonUtil.notNullString(ci.getSrcTranId()))
			   .element("srcSysCode", SFJsonCommonUtil.notNullString(ci.getSrcSysCode()))
			   .element("dstSysCode", SFJsonCommonUtil.notNullString(ci.getDstSysCode()))
//			   .element("status", SFJsonCommonUtil.notNullString(ci.getStatus()))
			   .element("srcReqTime", SFJsonCommonUtil.notNullData(ci.getSrcReqTime()));
		 return jSONObject;  
	 }
}
