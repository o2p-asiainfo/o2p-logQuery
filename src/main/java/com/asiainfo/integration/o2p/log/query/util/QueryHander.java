package com.asiainfo.integration.o2p.log.query.util;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ailk.eaap.op2.bo.QueryBean;



public final class QueryHander {
	
	private static final Logger LOG = LoggerFactory.getLogger(QueryHander.class);

	public static String buildParam(QueryBean queryBean) {
		
		StringBuffer param = new StringBuffer();
		if(!StringUtils.isBlank(queryBean.getTable())){
		    param.append("table:").append(queryBean.getTable());
		}
		if(queryBean.getTenantId() !=null){
		    param.append(" AND ");
		    param.append("tenantId:").append(queryBean.getTenantId());
		}
		if(!StringUtils.isBlank(queryBean.getContractInteractionId())){
			param.append(" AND ");
			param.append("contractInteractionId:").append(queryBean.getContractInteractionId());
		}
		if(!StringUtils.isBlank(queryBean.getContractVersion())){
			param.append(" AND ");
			param.append("contractVersion:").append(queryBean.getContractVersion());
		}
		
		if(!StringUtils.isBlank(queryBean.getDstSysCode())){
			param.append(" AND ");
			param.append("dstSysCode:").append(queryBean.getDstSysCode());
		}
		
		if(!StringUtils.isBlank(queryBean.getJfTransactionID())){
			param.append(" AND ");
			param.append("srcTranId:").append(queryBean.getJfTransactionID());
		}
		if(!StringUtils.isBlank(queryBean.getJfSrcSysCode())){
			param.append(" AND ");
			param.append("srcSysCode:").append(queryBean.getJfSrcSysCode());
		}
		if(!StringUtils.isBlank(queryBean.getStatus())){
			param.append(" AND ");
			param.append("status:").append(queryBean.getStatus());
		}
		
		if(!StringUtils.isBlank(queryBean.getResponseCode())){
			param.append(" AND ");
			param.append("responseCode:").append(queryBean.getResponseCode());
		}
		
		if(!StringUtils.isBlank(queryBean.getStartSrcReqTime()) || !StringUtils.isBlank(queryBean.getEndSrcReqTime())){
			param.append(" AND ");
			if(!StringUtils.isBlank(queryBean.getStartSrcReqTime())){
				param.append("createTime:[").append(getTime(queryBean.getStartSrcReqTime()));
			}else{
				param.append("createTime:[").append("*");
			}
			param.append(" TO ");
			if(!StringUtils.isBlank(queryBean.getEndSrcReqTime())){
				param.append(getTime(queryBean.getEndSrcReqTime())).append("]");
			}else{
				param.append("*").append("]");
			}
		}
		
		//ctg 查询条件
		if(!StringUtils.isBlank(queryBean.getErrCode())){
            param.append(" AND ");
            param.append("errCode:").append(queryBean.getErrCode());
        }
        if(!StringUtils.isBlank(queryBean.getFunName())){
            param.append(" AND ");
            param.append("funName:").append(queryBean.getFunName());
        }
        
        if(!StringUtils.isBlank(queryBean.getStartCreateDate()) || !StringUtils.isBlank(queryBean.getEndCreateDate())){
            param.append(" AND ");
            if(!StringUtils.isBlank(queryBean.getStartCreateDate())){
                param.append("createTime:[").append(getTime(queryBean.getStartCreateDate()));
            }else{
                param.append("createTime:[").append("*");
            }
            param.append(" TO ");
            if(!StringUtils.isBlank(queryBean.getEndCreateDate())){
                param.append(getTime(queryBean.getEndCreateDate())).append("]");
            }else{
                param.append("*").append("]");
            }
        }
	
		return param.toString();
	}


	// 将字符串转为时间戳 
	public static String getTime(String user_time) {
		String reTime = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d;
		try {
			d = sdf.parse(user_time);
			long l = d.getTime();
			reTime = String.valueOf(l);
		} catch (Exception e) {
			LOG.error("parse time err",e);
		}
		return reTime;
	}
	
	private QueryHander(){
	}
	
}
