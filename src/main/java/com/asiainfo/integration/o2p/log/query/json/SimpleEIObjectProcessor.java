package com.asiainfo.integration.o2p.log.query.json;

/*
 *
 * Copyright (c) 2014 asiainfo-linkage
 * All rights reserved.
 *
 */


import com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil;
import com.ailk.eaap.op2.bo.EndpointInteraction;

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

public class SimpleEIObjectProcessor implements JsonBeanProcessor{
	
	 public JSONObject processBean( Object bean, JsonConfig jsonConfig ){ 
		 EndpointInteraction ei = (EndpointInteraction) bean;
		 JSONObject jSONObject = new JSONObject();
		 jSONObject.element("contractInteractionId", SFJsonCommonUtil.notNullString(ei.getContractInteractionId()))
		 		   //rowkey:contractInteractionId+"_"+endpointInteractionId
		 		   .element("rowkeyValue", 
		 		           SFJsonCommonUtil.notNullString(ei.getContractInteractionId())+"_"+SFJsonCommonUtil.notNullString(ei.getEndpointInteractionId())+"_"+SFJsonCommonUtil.notNullDate(ei.getCreateDate()))
		 		   .element("endpointInteractionId", SFJsonCommonUtil.notNullString(ei.getEndpointInteractionId().split("_")[0]))
		 		   .element("reqOrRes", SFJsonCommonUtil.notNullString(ei.getReqOrRes()))
		 		   .element("endpointId", SFJsonCommonUtil.longToString(ei.getEndpointId()))
		 		   .element("createDate", SFJsonCommonUtil.notNullData(ei.getCreateDate()));
		 return jSONObject;  
	 }
}
