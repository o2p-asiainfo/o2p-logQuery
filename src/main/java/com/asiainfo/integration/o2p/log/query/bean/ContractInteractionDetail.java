package com.asiainfo.integration.o2p.log.query.bean;

import java.io.Serializable;
import java.util.Date;

public class ContractInteractionDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7635098928657719400L;

	String rowkeyValue;

	String contractInteractionId;

	String bizFuncCode;

	String bizIntfCode;

	String contractVersion;

	String regSerCode;

	String regSerVersion;

	String srcTranId;

	String dstTranId;

	String serviceLevel;

	String srcOrgCode;

	String dstOrgCode;

	String srcSysCode;

	String dstSysCode;

	String testFlag;

	Date srcReqTime;

	Date centerRecReqTime;

	Date centerFwd2DstTime;

	Date dstRecTime;

	Date dstReplyTime;

	Date centerRecDstTime;

	Date centerFwd2SrcTime;

	Date srcConfirmTime;

	Date srcResponseTime;

	String responseType;

	String responseCode;

	String responseDes;

	Date createTime;

	String exceptionSpecId;

	String exceptionMessage;

	String content;

	String staffNbr;

	String errCode;

	String funName;

	String errorMsg;

	String descriptor;

	String status;

	Date receiveTime;

	Date storeTime;
	
	String srcIp;
	Integer inputFileNum;
	Integer outputSuccessFileNum;
	Integer ouputErrFileNum;
	public String getExceptionSpecId() {
		return exceptionSpecId;
	}

	public void setExceptionSpecId(final String exceptionSpecId) {
		this.exceptionSpecId = exceptionSpecId;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(final String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public String getStaffNbr() {
		return staffNbr;
	}

	public void setStaffNbr(final String staffNbr) {
		this.staffNbr = staffNbr;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(final String errCode) {
		this.errCode = errCode;
	}

	public String getFunName() {
		return funName;
	}

	public void setFunName(final String funName) {
		this.funName = funName;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(final String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Date getReceiveTime() {
	    if(null != receiveTime){
	        return (Date) receiveTime.clone();
	    }else{
	        return null;
	    }
	}

	public void setReceiveTime(final Date receiveTime) {
	    if(null != receiveTime){
	        this.receiveTime = (Date) receiveTime.clone();
	    }else{
	        this.receiveTime = null;
	    }
	}

	public Date getStoreTime() {
	    if(null != storeTime){
	        return (Date) storeTime.clone();
	    }else{
	        return null;
	    }
	}

	public void setStoreTime(final Date storeTime) {
	    if(null != storeTime){
	        this.storeTime = (Date) storeTime.clone();
	    }else{
	        this.storeTime = null;
	    }
	}

	public String getContractInteractionId() {
		return contractInteractionId;
	}

	public void setContractInteractionId(final String contractInteractionId) {
		this.contractInteractionId = contractInteractionId;
	}

	public Date getDstRecTime() {
	    if(null != dstRecTime){
	        return (Date) dstRecTime.clone();
	    }else{
	        return null;
	    }
		
	}

	public void setDstRecTime(final Date dstRecTime) {
	    if(null != dstRecTime){
	        this.dstRecTime = (Date) dstRecTime.clone();
	    }else{
	        this.dstRecTime = null;
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

	public Date getCenterRecDstTime() {
	    if(null != centerRecDstTime){
            return (Date) centerRecDstTime.clone();
        }else{
            return null;
        }
	}

	public void setCenterRecDstTime(final Date centerRecDstTime) {
	    if(null != centerRecDstTime){
	        this.centerRecDstTime = (Date) centerRecDstTime.clone();
	    }else{
	        this.centerRecDstTime = null;
	    }
		
	}

	public Date getCenterFwd2SrcTime() {
	    if(null != centerFwd2SrcTime){
            return (Date) centerFwd2SrcTime.clone();
        }else{
            return null;
        }
	}

	public void setCenterFwd2SrcTime(final Date centerFwd2SrcTime) {
	    if(null != centerFwd2SrcTime){
	        this.centerFwd2SrcTime = (Date) centerFwd2SrcTime.clone();
	    }else{
	        this.centerFwd2SrcTime = null;
	    }
		
	}

	public Date getSrcConfirmTime() {
	    if(null != srcConfirmTime){
            return (Date) srcConfirmTime.clone();
        }else{
            return null;
        }
	}

	public void setSrcConfirmTime(final Date srcConfirmTime) {
	    if(null != srcConfirmTime){
	        this.srcConfirmTime = (Date) srcConfirmTime.clone();
	    }else{
	        this.srcConfirmTime = null;
	    }
		
	}

	public Date getSrcResponseTime() {
	    if(null != srcResponseTime){
            return (Date) srcResponseTime.clone();
        }else{
            return null;
        }
	}

	public void setSrcResponseTime(final Date srcResponseTime) {
	    if(null != srcResponseTime){
	        this.srcResponseTime = (Date) srcResponseTime.clone();
	    }else{
	        this.srcResponseTime = null;
	    }
		
	}

	public String getResponseType() {
		return responseType;
	}

	public void setResponseType(final String responseType) {
		this.responseType = responseType;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(final String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDes() {
		return responseDes;
	}

	public void setResponseDes(final String responseDes) {
		this.responseDes = responseDes;
	}

	public Date getCreateTime() {
	    if(null != createTime){
	        return (Date) createTime.clone();
	    }else{
	        return null;
	    }
	}

	public void setCreateTime(final Date createTime) {
	    if(null != createTime){
	        this.createTime = (Date) createTime.clone();
	    }else{
	        this.createTime = null;
	    }
		
	}

	public String getDstSysCode() {
		return dstSysCode;
	}

	public void setDstSysCode(final String dstSysCode) {
		this.dstSysCode = dstSysCode;
	}

	public String getTestFlag() {
		return testFlag;
	}

	public void setTestFlag(final String testFlag) {
		this.testFlag = testFlag;
	}

	public Date getSrcReqTime() {
	    if(null != srcReqTime){
	        return (Date) srcReqTime.clone();
	    }else{
	        return null;
	    }
		
	}

	public void setSrcReqTime(final Date srcReqTime) {
	    if(null != srcReqTime){
	        this.srcReqTime = (Date) srcReqTime.clone();
	    }else{
	        this.srcReqTime = null;
	    }
		
	}

	public Date getCenterRecReqTime() {
	    if(null != centerRecReqTime){
	        return (Date) centerRecReqTime.clone();
	    }else{
	        return null;
	    }
	}

	public void setCenterRecReqTime(final Date centerRecReqTime) {
	    if(null != centerRecReqTime){
	        this.centerRecReqTime = (Date) centerRecReqTime.clone();
	    }else{
	        this.centerRecReqTime = null;
	    }
		
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

	public String getDstTranId() {
		return dstTranId;
	}

	public void setDstTranId(final String dstTranId) {
		this.dstTranId = dstTranId;
	}

	public String getServiceLevel() {
		return serviceLevel;
	}

	public void setServiceLevel(final String serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	public String getSrcOrgCode() {
		return srcOrgCode;
	}

	public void setSrcOrgCode(final String srcOrgCode) {
		this.srcOrgCode = srcOrgCode;
	}

	public String getDstOrgCode() {
		return dstOrgCode;
	}

	public void setDstOrgCode(final String dstOrgCode) {
		this.dstOrgCode = dstOrgCode;
	}

	public String getSrcSysCode() {
		return srcSysCode;
	}

	public void setSrcSysCode(final String srcSysCode) {
		this.srcSysCode = srcSysCode;
	}

	public String getRegSerCode() {
		return regSerCode;
	}

	public void setRegSerCode(final String regSerCode) {
		this.regSerCode = regSerCode;
	}

	public String getRegSerVersion() {
		return regSerVersion;
	}

	public void setRegSerVersion(final String regSerVersion) {
		this.regSerVersion = regSerVersion;
	}

	public String getSrcTranId() {
		return srcTranId;
	}

	public void setSrcTranId(final String srcTranId) {
		this.srcTranId = srcTranId;
	}

	public String getBizIntfCode() {
		return bizIntfCode;
	}

	public void setBizIntfCode(final String bizIntfCode) {
		this.bizIntfCode = bizIntfCode;
	}

	public String getContractVersion() {
		return contractVersion;
	}

	public void setContractVersion(final String contractVersion) {
		this.contractVersion = contractVersion;
	}

	public String getBizFuncCode() {
		return bizFuncCode;
	}

	public void setBizFuncCode(final String bizFuncCode) {
		this.bizFuncCode = bizFuncCode;
	}

	public String getContent() {
		return content;
	}

	public void setContent(final String content) {
		this.content = content;
	}

	public String getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(final String descriptor) {
		this.descriptor = descriptor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public String getRowkeyValue() {
		return rowkeyValue;
	}

	public void setRowkeyValue(final String rowkeyValue) {
		this.rowkeyValue = rowkeyValue;
	}

    public String getSrcIp() {
        return srcIp;
    }

    public void setSrcIp(final String srcIp) {
        this.srcIp = srcIp;
    }

    public Integer getInputFileNum() {
        return inputFileNum;
    }

    public void setInputFileNum(final Integer inputFileNum) {
        this.inputFileNum = inputFileNum;
    }

    public Integer getOutputSuccessFileNum() {
        return outputSuccessFileNum;
    }

    public void setOutputSuccessFileNum(final Integer outputSuccessFileNum) {
        this.outputSuccessFileNum = outputSuccessFileNum;
    }

    public Integer getOuputErrFileNum() {
        return ouputErrFileNum;
    }

    public void setOuputErrFileNum(final Integer ouputErrFileNum) {
        this.ouputErrFileNum = ouputErrFileNum;
    }

}
