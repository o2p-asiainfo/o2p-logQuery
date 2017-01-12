package com.asiainfo.integration.o2p.log.query.json;

import com.asiainfo.integration.o2p.log.common.bo.HbEndpointInteraction;
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

public class HbEndpointInteractionProcessor implements JsonBeanProcessor{
	
	public JSONObject processBean( Object bean, JsonConfig jsonConfig){
		HbEndpointInteraction ei =(HbEndpointInteraction)bean;
		JSONObject jSONObject = new JSONObject();
		jSONObject.element("endpointInteractionId", SFJsonCommonUtil.notNullString(ei.getEndpointInteractionId()))
				  .element("contractInteractionId", SFJsonCommonUtil.notNullString(ei.getContractInteractionId()))
				  .element("serviceId", SFJsonCommonUtil.notNullString(ei.getServiceId()))
				  .element("endpointId", SFJsonCommonUtil.notNullString(ei.getEndpointId()))
				  .element("createDate", SFJsonCommonUtil.longToDate(ei.getCreateDate()))
				  .element("srcTranId", SFJsonCommonUtil.notNullString(ei.getSrcTranId()))
				  .element("reqOrRes", SFJsonCommonUtil.notNullString(ei.getReqOrRes()))
				  .element("queueMsgId", SFJsonCommonUtil.notNullString(ei.getQueueMsgId()))
				  .element("resQueue", SFJsonCommonUtil.notNullString(ei.getResQueue()))
				  .element("reqQueue", SFJsonCommonUtil.notNullString(ei.getReqQueue()))
				  .element("dstTranId", SFJsonCommonUtil.notNullString(ei.getDstTranId()))
				  .element("srcIp", SFJsonCommonUtil.notNullString(ei.getSrcIp()))
				  .element("dstOrgCode", SFJsonCommonUtil.notNullString(ei.getDstOrgCode()))
				  .element("dstSysCode", SFJsonCommonUtil.notNullString(ei.getDstSysCode()))
				  .element("srcOrgCode", SFJsonCommonUtil.notNullString(ei.getSrcOrgCode()))
				  .element("srcSysCode", SFJsonCommonUtil.notNullString(ei.getSrcSysCode()))
				  .element("centerFwd2DstTime", SFJsonCommonUtil.longToDate(ei.getCenterFwd2DstTime()))
				  .element("dstReplyTime", SFJsonCommonUtil.longToDate(ei.getDstReplyTime()))
				  .element("descriptor", SFJsonCommonUtil.notNullString(ei.getDstSysCode()))
				  //.element("receiveTime", SFJsonCommonUtil.LongToDate(ei.getReceiveTime()))
				  .element("inMsg", SFJsonCommonUtil.notNullString(ei.getInMsg()))
				  .element("outMsg", SFJsonCommonUtil.notNullString(ei.getOutMsg()));
				//  .element("inCreateTime", SFJsonCommonUtil.LongToDate(ei.getInCreateTime()))
				  //.element("outCreateTime", SFJsonCommonUtil.LongToDate(ei.getOutCeateTime()))
		 		//  .element("storeTime", SFJsonCommonUtil.LongToDate(ei.getStoreTime()));
		return jSONObject;
	}
}
