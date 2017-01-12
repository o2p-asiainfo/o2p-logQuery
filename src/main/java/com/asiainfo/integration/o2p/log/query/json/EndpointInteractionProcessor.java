/*
 * @(#)EndpointInteractionProcessor.java        2014-1-6
 *
 * Copyright (c) 2014 asiainfo-linkage
 * All rights reserved.
 *
 */

package com.asiainfo.integration.o2p.log.query.json;

import com.asiainfo.integration.o2p.log.query.bean.EndpointInteractionDetail;
import com.asiainfo.integration.o2p.log.query.util.CommonMethodUtil;
import com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonBeanProcessor;


/**
 * 类名称<br>
 * 这里是类的描述区域，概括出该的主要功能或者类的使用范围、注意事项等
 * <p>
 * @version 1.0
 * @author Administrator 2014-1-6
 * <hr>
 * 修改记录
 * <hr>
 * 1、修改人员:    修改时间:<br>       
 *    修改内容:
 * <hr>
 */

public class EndpointInteractionProcessor implements JsonBeanProcessor{
	
	public JSONObject processBean( Object bean, JsonConfig jsonConfig){
		EndpointInteractionDetail endpointInteraction =(EndpointInteractionDetail)bean;
		JSONObject jSONObject = new JSONObject();
		jSONObject.element("endpointInteractionId", CommonMethodUtil.getNotNullString(endpointInteraction.getEndpointInteractionId()))
				  .element("contractInteractionId", CommonMethodUtil.getNotNullString(endpointInteraction.getContractInteractionId()))
				  .element("serviceId", CommonMethodUtil.getNotNullString(endpointInteraction.getServiceId()))
				  .element("endpointId", CommonMethodUtil.getNotNullString(endpointInteraction.getEndpointId()))
				  .element("createDate", SFJsonCommonUtil.notNullData(endpointInteraction.getCreateDate()))
				  .element("srcTranId", CommonMethodUtil.getNotNullString(endpointInteraction.getSrcTranId()))
				  .element("endpointId", CommonMethodUtil.getNotNullString(endpointInteraction.getEndpointId()))
				  .element("reqOrRes", CommonMethodUtil.getNotNullString(endpointInteraction.getReqOrRes()))
				  .element("queueMsgId", CommonMethodUtil.getNotNullString(endpointInteraction.getQueueMsgId()))
				  .element("resQueue", CommonMethodUtil.getNotNullString(endpointInteraction.getResQueue()))
				  .element("reqQueue", CommonMethodUtil.getNotNullString(endpointInteraction.getReqQueue()))
				  .element("dstTranId", CommonMethodUtil.getNotNullString(endpointInteraction.getDstTranId()))
				  .element("dstOrgCode", CommonMethodUtil.getNotNullString(endpointInteraction.getDstOrgCode()))
				  .element("dstSysCode", CommonMethodUtil.getNotNullString(endpointInteraction.getDstSysCode()))
				  .element("centerFwd2DstTime", SFJsonCommonUtil.notNullData(endpointInteraction.getCenterFwd2DstTime()))
				  .element("dstReplyTime", SFJsonCommonUtil.notNullData(endpointInteraction.getDstReplyTime()))
				  .element("descriptor", CommonMethodUtil.getNotNullString(endpointInteraction.getDstSysCode()))
				  .element("inMsg",  CommonMethodUtil.getNotNullString(endpointInteraction.getInMsg()))
				  .element("outMsg",  CommonMethodUtil.getNotNullString(endpointInteraction.getOutMsg()))
				  .element("endpointSpec",  CommonMethodUtil.getNotNullString(endpointInteraction.getEndpointSpec()))
				  .element("failMsg",  CommonMethodUtil.getNotNullString(endpointInteraction.getFailMsg()))
				  .element("failNum",  CommonMethodUtil.getNotNullString(endpointInteraction.getFailNum()))
				  .element("successNum",  CommonMethodUtil.getNotNullString(endpointInteraction.getSuccessNum()));
		
		return jSONObject;
	}
}