package com.asiainfo.integration.o2p.log.query.bean;

import java.io.Serializable;
import java.util.Date;

public class EndpointInteractionDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6113476673304790749L;

	String rowkeyValue;

	String endpointInteractionId;

	String contractInteractionId;

	String serviceId;

	String endpointId;

	Date createDate;

	String srcTranId;

	String reqOrRes;

	String queueMsgId;

	String resQueue;

	String reqQueue;

	String dstTranId;

	String srcIp;

	String srcOrgCode;

	String srcSysCode;

	String dstOrgCode;

	String dstSysCode;

	Date centerFwd2DstTime;

	Date dstReplyTime;

	String descriptor;

	String msg;
	
	String inMsg;
	
	String outMsg;
	
	String endpointSpec;
	String failMsg;
	Integer failNum;
	Integer successNum;

//
//	long inCreateTime;
//
//	long outCeateTime;
//
//	long receiveTime;
//
//	long storeTime;

//	public long getInCreateTime() {
//		return inCreateTime;
//	}
//
//	public void setInCreateTime(long inCreateTime) {
//		this.inCreateTime = inCreateTime;
//	}
//
//	public long getOutCeateTime() {
//		return outCeateTime;
//	}
//
//	public void setOutCeateTime(long outCeateTime) {
//		this.outCeateTime = outCeateTime;
//	}
//
//	public long getReceiveTime() {
//		return receiveTime;
//	}
//
//	public void setReceiveTime(long receiveTime) {
//		this.receiveTime = receiveTime;
//	}
//
//	public long getStoreTime() {
//		return storeTime;
//	}
//
//	public void setStoreTime(long storeTime) {
//		this.storeTime = storeTime;
//	}

	public String getEndpointInteractionId() {
		return endpointInteractionId;
	}

	public void setEndpointInteractionId(String endpointInteractionId) {
		this.endpointInteractionId = endpointInteractionId;
	}

//	public String getInMsg() {
//		return inMsg;
//	}
//
//	public void setInMsg(String inMsg) {
//		this.inMsg = inMsg;
//	}
//
//	public String getOutMsg() {
//		return outMsg;
//	}
//
//	public void setOutMsg(String outMsg) {
//		this.outMsg = outMsg;
//	}

	public String getContractInteractionId() {
		return contractInteractionId;
	}

	public void setContractInteractionId(String contractInteractionId) {
		this.contractInteractionId = contractInteractionId;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getEndpointId() {
		return endpointId;
	}

	public void setEndpointId(String endpointId) {
		this.endpointId = endpointId;
	}

	public Date getCreateDate() {
	    if(null != createDate){
            return (Date) createDate.clone();
        }else{
            return null;
        }
	}

	public void setCreateDate(final Date createDate) {
	    if(null != createDate){
	        this.createDate = (Date) createDate.clone();
	    }else{
	        this.createDate = null;
	    }
		
	}

	public String getSrcTranId() {
		return srcTranId;
	}

	public void setSrcTranId(String srcTranId) {
		this.srcTranId = srcTranId;
	}

	public String getReqOrRes() {
		return reqOrRes;
	}

	public void setReqOrRes(String reqOrRes) {
		this.reqOrRes = reqOrRes;
	}

	public String getQueueMsgId() {
		return queueMsgId;
	}

	public void setQueueMsgId(String queueMsgId) {
		this.queueMsgId = queueMsgId;
	}

	public String getResQueue() {
		return resQueue;
	}

	public void setResQueue(String resQueue) {
		this.resQueue = resQueue;
	}

	public String getReqQueue() {
		return reqQueue;
	}

	public void setReqQueue(String reqQueue) {
		this.reqQueue = reqQueue;
	}

	public String getDstTranId() {
		return dstTranId;
	}

	public void setDstTranId(String dstTranId) {
		this.dstTranId = dstTranId;
	}

	public String getSrcIp() {
		return srcIp;
	}

	public void setSrcIp(String srcIp) {
		this.srcIp = srcIp;
	}

	public String getSrcOrgCode() {
		return srcOrgCode;
	}

	public void setSrcOrgCode(String srcOrgCode) {
		this.srcOrgCode = srcOrgCode;
	}

	public String getSrcSysCode() {
		return srcSysCode;
	}

	public void setSrcSysCode(String srcSysCode) {
		this.srcSysCode = srcSysCode;
	}

	public String getDstOrgCode() {
		return dstOrgCode;
	}

	public void setDstOrgCode(String dstOrgCode) {
		this.dstOrgCode = dstOrgCode;
	}

	public String getDstSysCode() {
		return dstSysCode;
	}

	public void setDstSysCode(String dstSysCode) {
		this.dstSysCode = dstSysCode;
	}

	public Date getCenterFwd2DstTime() {
	    if(null != centerFwd2DstTime){
            return (Date) centerFwd2DstTime.clone();
        }else{
            return null;
        }
	}

	public void setCenterFwd2DstTime(final Date centerFwd2DstTime) {
	    if(null != centerFwd2DstTime){
	        this.centerFwd2DstTime = (Date) centerFwd2DstTime.clone();
	    }else{
	        this.centerFwd2DstTime = null;
	    }
		
	}

	public Date getDstReplyTime() {
	    if(null != dstReplyTime){
            return (Date) dstReplyTime.clone();
        }else{
            return null;
        }
	}

	public void setDstReplyTime(final Date dstReplyTime) {
	    if(null != dstReplyTime){
	        this.dstReplyTime = (Date) dstReplyTime.clone();
	    }else{
	        this.dstReplyTime = null;
	    }
		
	}

	public String getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}

	public String getRowkeyValue() {
		return rowkeyValue;
	}

	public void setRowkeyValue(String rowkeyValue) {
		this.rowkeyValue = rowkeyValue;
	}

	public String getInMsg() {
		return inMsg;
	}

	public void setInMsg(String inMsg) {
		this.inMsg = inMsg;
	}

	public String getOutMsg() {
		return outMsg;
	}

	public void setOutMsg(String outMsg) {
		this.outMsg = outMsg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

    public String getEndpointSpec() {
        return endpointSpec;
    }

    public void setEndpointSpec(String endpointSpec) {
        this.endpointSpec = endpointSpec;
    }

    public String getFailMsg() {
        return failMsg;
    }

    public void setFailMsg(String failMsg) {
        this.failMsg = failMsg;
    }

    public Integer getFailNum() {
        return failNum;
    }

    public void setFailNum(Integer failNum) {
        this.failNum = failNum;
    }

    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }
	
	

}
