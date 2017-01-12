package com.asiainfo.integration.o2p.log.query.json;

/*
 *
 * Copyright (c) 2014 asiainfo-linkage
 * All rights reserved.
 *
 */


import com.asiainfo.integration.o2p.log.common.bo.SimpleEIObject;
import com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil;

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

public class HbSimpleEIObjectProcessor implements JsonBeanProcessor{
	
	 public JSONObject processBean( Object bean, JsonConfig jsonConfig ){ 
		 SimpleEIObject ei = (SimpleEIObject) bean;
		 JSONObject jSONObject = new JSONObject();
		 jSONObject.element("rowkeyValue", SFJsonCommonUtil.notNullString(ei.getContractInteractionId())+"_"+
		         SFJsonCommonUtil.notNullString(ei.getEndpointInteractionId()))
		 		   .element("endpointInteractionId", SFJsonCommonUtil.notNullString(ei.getEndpointInteractionId()))
		 		   .element("reqOrRes", SFJsonCommonUtil.notNullString(ei.getReqOrRes()))
		 		   .element("endpointId", SFJsonCommonUtil.notNullString(ei.getEndpointId()))
		 		   .element("createDate", SFJsonCommonUtil.longToDate(ei.getCreateDate()));
		 return jSONObject;  
	 }
}
