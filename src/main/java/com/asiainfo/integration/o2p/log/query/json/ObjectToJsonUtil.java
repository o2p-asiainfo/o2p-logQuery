package com.asiainfo.integration.o2p.log.query.json;



import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.Set;










import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.asiainfo.integration.o2p.log.common.bo.HbContractInteraction;
import com.asiainfo.integration.o2p.log.common.bo.HbEndpointInteraction;
import com.asiainfo.integration.o2p.log.common.bo.SimpleCIObject;
import com.asiainfo.integration.o2p.log.common.bo.SimpleEIObject;
import com.asiainfo.integration.o2p.log.query.bean.ContractInteractionDetail;
import com.asiainfo.integration.o2p.log.query.bean.EndpointInteractionDetail;
import com.ailk.eaap.op2.bo.ContractInteraction;
import com.ailk.eaap.op2.bo.EndpointInteraction;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;


/**
 * 对象转 JSON
 * 支持以下方式:
 * 1.objectToJson
 * 2.beanToJson
 * 3.listToJson(List<?>)
 * 4.arrayTojson(Object[])
 * 5.mapToJson(Map<?, ?>)
 * 6.stringToJson(String)
 */

public final class ObjectToJsonUtil {
	
    private static final Logger LOG = LoggerFactory.getLogger(ObjectToJsonUtil.class);
    private static final ThreadLocal<JsonConfig> contractInteractionJsonConfig=new ThreadLocal<JsonConfig>();

	private static final ThreadLocal<JsonConfig> simpleCIObjectJsonConfig=new ThreadLocal<JsonConfig>();

	private static final ThreadLocal<JsonConfig> simpleEIObjectJsonConfig=new ThreadLocal<JsonConfig>();
	
	private static final ThreadLocal<JsonConfig> endpointInteractionJsonConfig=new ThreadLocal<JsonConfig>();
	
	private static final ThreadLocal<JsonConfig> hbContractInteractionJsonConfig=new ThreadLocal<JsonConfig>();

    private static final ThreadLocal<JsonConfig> hbSimpleCIObjectJsonConfig=new ThreadLocal<JsonConfig>();

    private static final ThreadLocal<JsonConfig> hbSimpleEIObjectJsonConfig=new ThreadLocal<JsonConfig>();
    
    private static final ThreadLocal<JsonConfig> hbEndpointInteractionJsonConfig=new ThreadLocal<JsonConfig>();
	
	private static final JsonConfig jsonConfig=new JsonConfig();
	
	
	private ObjectToJsonUtil(){
	    
	}
	
    /**
     * @param obj 任意对象
     * @return String
     */
    public static String objectToJson(Object obj) {
        StringBuilder json = new StringBuilder();
        if (obj == null) {
            json.append("\"\"");
        } else if (obj instanceof String || obj instanceof Integer || obj instanceof Float || obj instanceof Boolean
                || obj instanceof Short || obj instanceof Double || obj instanceof Long || obj instanceof BigDecimal
                || obj instanceof BigInteger || obj instanceof Byte) {
            json.append("\"").append(stringToJson(obj.toString())).append("\"");
        }else if (obj instanceof SimpleCIObject) {
            json.append(hbSimpleCIObjectToJson(obj));
        }else if (obj instanceof ContractInteraction) {
            json.append(simpleCIObjectToJson(obj));
        }else if(obj instanceof HbContractInteraction){
            json.append(hbContractInteractionToJson(obj));
        }else if(obj instanceof ContractInteractionDetail){
        	json.append(contractInteractionToJson(obj));
        }else if(obj instanceof SimpleEIObject){
            json.append(hbSimpleEIObjectToJson(obj));
        }else if(obj instanceof EndpointInteraction){
        	json.append(simpleEIObjectToJson(obj));
        }else if (obj instanceof HbEndpointInteraction) {
            json.append(hbEndpointInteractionToJson(obj));
        }else if (obj instanceof EndpointInteractionDetail) {
            json.append(endpointInteractionToJson(obj));
        }else if (obj instanceof Object[]) {
            json.append(arrayTojson((Object[]) obj));
        } else if (obj instanceof List) {
            json.append(listToJson((List<?>) obj));
        } else if (obj instanceof Map) {
            json.append(mapToJson((Map<?, ?>) obj));
        } else if (obj instanceof Set) {
            json.append(setToJson((Set<?>) obj));
        }else {
            json.append(beanToJson(obj));
        }
        return json.toString();
    }	
    
    /**
     * @param bean bean对象
     * @return String
     */
    public static String beanToJson(Object bean) {
        StringBuilder json = new StringBuilder();
        json.append("{");
        PropertyDescriptor[] props = null;
        try {
            props = Introspector.getBeanInfo(bean.getClass(), Object.class).getPropertyDescriptors();
        } catch (IntrospectionException e1) {
            LOG.error("bean to json err,cause by:", e1);
        }
        
        if (props != null) {
            for (int i = 0; i < props.length; i++) {
                try {
                    String name = objectToJson(props[i].getName());
                  //  Object returnObejct = props[i].getReadMethod().invoke(bean);
                    String value ="";
/*                    if(returnObejct instanceof Timestamp){
                    	if(returnObejct!=null)
                    		value = CommonMethodUtil.getTimeStampString((Timestamp)returnObejct,"LONG");
                    	else
                    		value ="";
                    }else if(returnObejct instanceof Date){
                    	value = CommonMethodUtil.getFormatTimeString((Date)returnObejct, "yyyyMMddHHmmss");
                    }*/
                    value= objectToJson(props[i].getReadMethod().invoke(bean));
                    json.append(name);
                    json.append(":");
                    json.append(value);
                    json.append(",");
                } catch (Exception e) {
                    LOG.error("bean to json err,cause by:", e);
                }
            }
            json.setCharAt(json.length() - 1, '}');
        } else {
            json.append("}");
        }
        return json.toString();
    }    
    
    /**
     * @param list list对象
     * @return String
     */
    public static String listToJson(List<?> list) {
        StringBuilder json = new StringBuilder();
        json.append("[");
        if (list != null && list.size() > 0) {
            for (Object obj : list) {
                json.append(objectToJson(obj));
                json.append(",");
            }
            json.setCharAt(json.length() - 1, ']');
        } else {
            json.append("]");
        }
        return json.toString();
    }    
    
    /**
     * @param array 对象数组
     * @return String
     */
    public static String arrayTojson(Object[] array) {
        StringBuilder json = new StringBuilder();
        json.append("[");
        if (array != null && array.length > 0) {
            for (Object obj : array) {
                json.append(objectToJson(obj));
                json.append(",");
            }
            json.setCharAt(json.length() - 1, ']');
        } else {
            json.append("]");
        }
        return json.toString();
    }   
    
    /**
     * @param map map对象
     * @return String
     */
    public static String mapToJson(Map<?, ?> map) {
        StringBuilder json = new StringBuilder();
        json.append("{");
        if (map != null && map.size() > 0) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                json.append(objectToJson(String.valueOf(entry.getKey())));
                json.append(":");
                json.append(objectToJson(String.valueOf(entry.getValue())));
                json.append(",");
            }
            json.setCharAt(json.length() - 1, '}');
        } else {
            json.append("}");
        }
        return json.toString();
    }    
    
    /**
     * @param set 集合对象
     * @return String
     */
    public static String setToJson(Set<?> set) {
        StringBuilder json = new StringBuilder();
        json.append("[");
        if (set != null && set.size() > 0) {
            for (Object obj : set) {
                json.append(objectToJson(obj));
                json.append(",");
            }
            json.setCharAt(json.length() - 1, ']');
        } else {
            json.append("]");
        }
        return json.toString();
    }    
    
    /**
     * @param s 参数
     * @return String
     */
    public static String stringToJson(String s) {
        if (s == null){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
            case '"':
                sb.append("\\\"");
                break;
            case '\\':
                sb.append("\\\\");
                break;
            case '\b':
                sb.append("\\b");
                break;
            case '\f':
                sb.append("\\f");
                break;
            case '\n':
                sb.append("\\n");
                break;
            case '\r':
                sb.append("\\r");
                break;
            case '\t':
                sb.append("\\t");
                break;
            case '/':
                sb.append("\\/");
                break;
            default:
                if (ch >= '\u0000' && ch <= '\u001F') {
                    String ss = Integer.toHexString(ch);
                    sb.append("\\u");
                    for (int k = 0; k < 4 - ss.length(); k++) {
                        sb.append('0');
                    }
                    sb.append(ss.toUpperCase());
                } else {
                    sb.append(ch);
                }
                break;
            }
        }
        return sb.toString();
    }
	
    public static String contractInteractionToJson(Object obj){		 
        return (JSONObject.fromObject(obj, getContractInteractionJsonConfig()).toString());	
    }
    public static String hbContractInteractionToJson(Object obj){         
        return (JSONObject.fromObject(obj, getHbContractInteractionJsonConfig()).toString()); 
    }
    
    public static String simpleCIObjectToJson(Object obj){		 
    	return (JSONObject.fromObject(obj, getSimpleCIObjectJsonConfig()).toString());	
    }
    public static String hbSimpleCIObjectToJson(Object obj){       
        return (JSONObject.fromObject(obj, getHbSimpleCIObjectJsonConfig()).toString());  
    }
    
    public static String simpleEIObjectToJson(Object obj){		 
        return (JSONObject.fromObject(obj, getSimpleEIObjectJsonConfig()).toString());	
    }
    
    public static String hbSimpleEIObjectToJson(Object obj){       
        return (JSONObject.fromObject(obj, getHbSimpleEIObjectJsonConfig()).toString());  
    }
    
    public static String endpointInteractionToJson(Object obj){		 
        return (JSONObject.fromObject(obj, getEndpointInteractionJsonConfig()).toString());	
    }
    
    public static String hbEndpointInteractionToJson(Object obj){         
        return (JSONObject.fromObject(obj, getHbEndpointInteractionJsonConfig()).toString()); 
    }
    

    
    public static String toLogPlatformJson(String logType,String content){
    	StringBuilder resultJson = new StringBuilder();
    	resultJson.append("{");
    	resultJson.append("\"logType\"");
    	resultJson.append(":");
    	resultJson.append("\""+logType+"\"");
    	resultJson.append(",");
    	resultJson.append("\"logObj\"");
    	resultJson.append(":");
    	resultJson.append(content);
    	resultJson.append("}");
    	return resultJson.toString();
    }
    
    /**
	 * 获取threadLocalProcessModel中的当前流程模板对象(用于并发)
	 * 如果为空，那么新创建一个放threadLocalProcessModel中
	 * @return ProcessModel
	 */
	public static JsonConfig getContractInteractionJsonConfig(){
		if(contractInteractionJsonConfig.get()==null){
			jsonConfig.registerJsonBeanProcessor(ContractInteractionDetail.class, new ContractInteractionProcessor());
			contractInteractionJsonConfig.set(jsonConfig);
			return contractInteractionJsonConfig.get();
		}else{
			return contractInteractionJsonConfig.get();
		}		
	} 
	
	
	public static JsonConfig getHbContractInteractionJsonConfig(){
        if(hbContractInteractionJsonConfig.get()==null){
            jsonConfig.registerJsonBeanProcessor(HbContractInteraction.class, new HbContractInteractionProcessor());
            hbContractInteractionJsonConfig.set(jsonConfig);
            return hbContractInteractionJsonConfig.get();
        }else{
            return hbContractInteractionJsonConfig.get();
        }       
    } 
	
	public static JsonConfig getSimpleCIObjectJsonConfig(){
		if(simpleCIObjectJsonConfig.get()==null){
			jsonConfig.registerJsonBeanProcessor(ContractInteraction.class, new SimpleCIObjectProcessor());
			simpleCIObjectJsonConfig.set(jsonConfig);
			return simpleCIObjectJsonConfig.get();
		}else{
			return simpleCIObjectJsonConfig.get();
		}		
	} 
	
	
	public static JsonConfig getHbSimpleCIObjectJsonConfig(){
        if(hbSimpleCIObjectJsonConfig.get()==null){
            jsonConfig.registerJsonBeanProcessor(SimpleCIObject.class, new HbSimpleCIObjectProcessor());
            hbSimpleCIObjectJsonConfig.set(jsonConfig);
            return hbSimpleCIObjectJsonConfig.get();
        }else{
            return hbSimpleCIObjectJsonConfig.get();
        }       
    } 
	
	public static JsonConfig getSimpleEIObjectJsonConfig(){
		if(simpleEIObjectJsonConfig.get()==null){
			jsonConfig.registerJsonBeanProcessor(EndpointInteraction.class, new SimpleEIObjectProcessor());
			simpleEIObjectJsonConfig.set(jsonConfig);
			return simpleEIObjectJsonConfig.get();
		}else{
			return simpleEIObjectJsonConfig.get();
		}		
	} 
	public static JsonConfig getHbSimpleEIObjectJsonConfig(){
        if(hbSimpleEIObjectJsonConfig.get()==null){
            jsonConfig.registerJsonBeanProcessor(SimpleEIObject.class, new HbSimpleEIObjectProcessor());
            hbSimpleEIObjectJsonConfig.set(jsonConfig);
            return hbSimpleEIObjectJsonConfig.get();
        }else{
            return hbSimpleEIObjectJsonConfig.get();
        }       
    } 
	
	public static JsonConfig getEndpointInteractionJsonConfig(){
		if(endpointInteractionJsonConfig.get()==null){
			jsonConfig.registerJsonBeanProcessor(EndpointInteractionDetail.class, new EndpointInteractionProcessor());
			endpointInteractionJsonConfig.set(jsonConfig);
			return endpointInteractionJsonConfig.get();
		}else{
			return endpointInteractionJsonConfig.get();
		}		
	}	
	public static JsonConfig getHbEndpointInteractionJsonConfig(){
        if(hbEndpointInteractionJsonConfig.get()==null){
            jsonConfig.registerJsonBeanProcessor(HbEndpointInteraction.class, new HbEndpointInteractionProcessor());
            hbEndpointInteractionJsonConfig.set(jsonConfig);
            return hbEndpointInteractionJsonConfig.get();
        }else{
            return hbEndpointInteractionJsonConfig.get();
        }       
    }   
	
}
