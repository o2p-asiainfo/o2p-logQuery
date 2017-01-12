/** 
 * Project Name:logQuery 
 * File Name:HbaseQueryDaoImpl.java 
 * Package Name:com.asiainfo.log.query.dao.impl 
 * Date:2015年10月21日下午2:23:52 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.log.query.dao.impl;  

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.reflect.FieldUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.KeyValue;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HConnection;
import org.apache.hadoop.hbase.client.HConnectionManager;
import org.apache.hadoop.hbase.client.HTableInterface;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.asiainfo.integration.o2p.log.common.bo.HbContractInteraction;
import com.asiainfo.integration.o2p.log.common.bo.HbEndpointInteraction;
import com.asiainfo.integration.o2p.log.common.bo.SimpleCIObject;
import com.asiainfo.integration.o2p.log.common.bo.SimpleEIObject;
import com.asiainfo.integration.o2p.log.common.hbase.fields.EmbeddedExpAndCtgLogKeys;
import com.asiainfo.integration.o2p.log.common.hbase.type.TypeHandler;
import com.asiainfo.integration.o2p.log.common.hbase.type.handler.DefaultTypeHandlers;
import com.asiainfo.integration.o2p.log.common.solr.HbaseConfig;
import com.asiainfo.integration.o2p.log.query.dao.IHbaseQueryDao;
import com.asiainfo.integration.o2p.log.query.util.LogQueryUtil;
import com.asiainfo.integration.o2p.log.query.util.SFJsonCommonUtil;

/** 
 * ClassName:HbaseQueryDaoImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年10月21日 下午2:23:52 <br/> 
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class HbaseQueryDaoImpl implements IHbaseQueryDao {

    public static final Logger LOG = LoggerFactory.getLogger(HbaseQueryDaoImpl.class);
    private  Configuration hbaseConf;
    
    private transient HConnection connection;
    
    public void init(){
        try {
            connection = HConnectionManager.createConnection(hbaseConf);
        } catch (IOException e) {
            LOG.error("init hbase Connection err，cause by：",e);
        }
    }
    
    public long queryCICount(Map<String, Object> conMap) {
        return 0;
    }

    @SuppressWarnings("unchecked")
    public List<SimpleCIObject> queryCIDataPage(Map<String, Object> conMap) {
        List<SimpleCIObject> list = new ArrayList<SimpleCIObject>();
        HTableInterface table = null;
        List<Get> gets = (List<Get>) conMap.get("gets");
        for(Get get:gets){
            get.addFamily(Bytes.toBytes(HbaseConfig.FAMILY_CI));
        }
        Result[] results = null; 
        try {
             table = connection.getTable(HbaseConfig.TAB_CI);
             results = table.get(gets);
             if(!results[0].isEmpty()){
                 list = this.resultToBeans(results, SimpleCIObject.class);
             }
        } catch (IOException e) {
            LOG.error("query from hbase err,cause by:",e);
        } catch (InstantiationException e) {
            LOG.error("query from hbase err,cause by:",e);
        } catch (IllegalAccessException e) {
            LOG.error("query from hbase err,cause by:",e);
        }finally{
            LogQueryUtil.realeTable(table);
        }
        return list;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<HbContractInteraction> queryCIByRowkey(
            Map<String, Object> conMap) {
        List<HbContractInteraction> list = new ArrayList<HbContractInteraction>();
        HTableInterface table = null;
        Result[] results = new Result[1];
        Get get = new Get(Bytes.toBytes(String.valueOf(conMap.get("rowkey"))));
        get.addFamily(Bytes.toBytes(HbaseConfig.FAMILY_CI));
        Result result = null; 
        try {
             table = connection.getTable(HbaseConfig.TAB_CI);
             result = table.get(get);
             results[0] = result;
             if(!results[0].isEmpty()){
                 list = this.resultToBeans(results, HbContractInteraction.class);
             }
        } catch (IOException e) {
            LOG.error("query from hbase err,cause by:",e);
        } catch (InstantiationException e) {
            LOG.error("query from hbase err,cause by:",e);
        } catch (IllegalAccessException e) {
            LOG.error("query from hbase err,cause by:",e);
        }finally{
            LogQueryUtil.realeTable(table);
        }
        return list;
    }

    @Override
    public long queryEICount(Map<String, Object> conMap) {
        long count = 0l;
        String rowkey = (String) conMap.get("rowkey");
        Get get = new Get(Bytes.toBytes(rowkey));
        get.addFamily(Bytes.toBytes(HbaseConfig.FAMILY_EI));
        HTableInterface table = null;
        Result result = null; 
        try {
             table = connection.getTable(HbaseConfig.TAB_CI);
             result = table.get(get);
             byte[] b = result.getValue(
                     Bytes.toBytes(HbaseConfig.FAMILY_EI),
                     Bytes.toBytes(HbaseConfig.QUALIFIER_EIORILOG));
             String eiAndOriMsg = Bytes.toString(b);
             JSONArray eis = JSONArray.fromObject(eiAndOriMsg);
             count = eis.size(); 
        } catch (IOException e) {
            LOG.error("query from hbase err,cause by:",e);
        }finally{
            LogQueryUtil.realeTable(table);
        }
        return count;
    }

    @Override
    public List<SimpleEIObject> queryEIDataPage(Map<String, Object> conMap) {
        String rowkey = (String) conMap.get("rowkey");
        int start = (Integer) conMap.get("start");
        int end = (Integer) conMap.get("end");
        Get get = new Get(Bytes.toBytes(rowkey));
        get.addFamily(Bytes.toBytes(HbaseConfig.FAMILY_EI));
        get.addColumn(Bytes.toBytes(HbaseConfig.FAMILY_EI), Bytes.toBytes(HbaseConfig.QUALIFIER_EIORILOG));
        HTableInterface table = null;
        Result result = null; 
        JSONArray results = new JSONArray();
        List<SimpleEIObject> resultEis = new ArrayList<SimpleEIObject>();
        try {
             table = connection.getTable(HbaseConfig.TAB_CI);
             result = table.get(get);
             
             byte[] b = result.getValue(
                     Bytes.toBytes(HbaseConfig.FAMILY_EI),
                     Bytes.toBytes(HbaseConfig.QUALIFIER_EIORILOG));
             String eiAndOriMsg = "[]";
             if(!result.isEmpty() && b != null){
                 eiAndOriMsg = Bytes.toString(b);
             }
             JSONArray eis = JSONArray.fromObject(eiAndOriMsg);
            
             //分页
             for(int i =start;i<end;i++){
                 if(i<eis.size()){
                     results.add(eis.getJSONObject(i));
                 }
             }
             if(results.size()>0){
                 resultEis = this.jsonArrayToBeans(results, SimpleEIObject.class);
             }
        } catch (IOException e) {
            LOG.error("query from hbase err,cause by:",e);
        } catch (InstantiationException e) {
            LOG.error("query from hbase err,cause by:",e);
        } catch (IllegalAccessException e) {
            LOG.error("query from hbase err,cause by:",e);
        }finally{
            LogQueryUtil.realeTable(table);
        }
        return resultEis;
    }

    @Override
    public List<HbEndpointInteraction> queryEIByRowkey(
            Map<String, Object> conMap) {
        
        String rowkey = (String) conMap.get("ciId");
        String eiId = (String)conMap.get("eiId");
        Get get = new Get(Bytes.toBytes(rowkey));
        get.addFamily(Bytes.toBytes(HbaseConfig.FAMILY_EI));
        get.addColumn(Bytes.toBytes(HbaseConfig.FAMILY_EI), Bytes.toBytes(HbaseConfig.QUALIFIER_EIORILOG));
        HTableInterface table = null;
        Result result = null;
        List<HbEndpointInteraction> er = new ArrayList<HbEndpointInteraction>();
        try {
            table = connection.getTable(HbaseConfig.TAB_CI);
            result = table.get(get);
            byte[] b = result.getValue(
                    Bytes.toBytes(HbaseConfig.FAMILY_EI),
                    Bytes.toBytes(HbaseConfig.QUALIFIER_EIORILOG));
            String eiAndOriMsg = "[]";
            if(!result.isEmpty() && b != null){
                eiAndOriMsg = Bytes.toString(b);
            }
            JSONArray eis = JSONArray.fromObject(eiAndOriMsg);
            JSONArray tmpei = new JSONArray();
            for(int i=0;i<eis.size();i++){
                if(eiId.equals(String.valueOf(eis.getJSONObject(i).get("endpointInteractionId")))){
                    tmpei.add(eis.getJSONObject(i));
                }
            }
            if(tmpei.size()>0){
                er = this.jsonArrayToBeans(tmpei, HbEndpointInteraction.class);
            }
            
       } catch (IOException e) {
           LOG.error("query from hbase err,cause by:",e);
       } catch (InstantiationException e) {
           LOG.error("query from hbase err,cause by:",e);
       }catch (IllegalAccessException e) {
           LOG.error("query from hbase err,cause by:",e);
       }finally{
           LogQueryUtil.realeTable(table);
       }
        return er;
    }

    @Override
    public long queryCtgCount(Map<String, Object> conMap) {
        return 0;
    }

    @Override
    public List<Map<String, String>> queryCtgDataPage(Map<String, Object> conMap) {
        List<Map<String,String>> retResult = new ArrayList<Map<String,String>>();
        HTableInterface table = null;
        List<Get> gets = (List<Get>) conMap.get("gets");
        for(Get get :gets){
            get.addColumn(Bytes.toBytes(HbaseConfig.FAMILY_CI),Bytes.toBytes(HbaseConfig.QUALIFIER_ROWKEY))
            .addColumn(Bytes.toBytes(HbaseConfig.FAMILY_CI),Bytes.toBytes(HbaseConfig.QUELIFIER_CREATETIME))
            .addColumn(Bytes.toBytes(HbaseConfig.FAMILY_CI),Bytes.toBytes(HbaseConfig.QUELIFIER_SRCSYSSIGN))
            .addColumn(Bytes.toBytes(HbaseConfig.FAMILY_CI),Bytes.toBytes(HbaseConfig.QUALIFIER_CTG));
        }
        Result[] results = null; 
        try {
             table = connection.getTable(HbaseConfig.TAB_CI);
             results = table.get(gets);
             if(!results[0].isEmpty()){
                 retResult = this.resultToMaps(results);
             }
        } catch (IOException e) {
            LOG.error("query from hbase err,cause by:",e);
        }finally{
            LogQueryUtil.realeTable(table);
        }
        return retResult;
    }

    @Override
    public List<Map<String, String>> queryCtgByRowkey(Map<String, Object> conMap) {
        List<Map<String,String>> retResult = new ArrayList<Map<String,String>>();
        HTableInterface table = null;
        List<Get> gets = (List<Get>) conMap.get("gets");
        for(Get get :gets){
            get.addColumn(Bytes.toBytes(HbaseConfig.FAMILY_CI),Bytes.toBytes(HbaseConfig.QUALIFIER_ROWKEY))
            .addColumn(Bytes.toBytes(HbaseConfig.FAMILY_CI),Bytes.toBytes(HbaseConfig.QUELIFIER_CREATETIME))
            .addColumn(Bytes.toBytes(HbaseConfig.FAMILY_CI),Bytes.toBytes(HbaseConfig.QUELIFIER_SRCSYSSIGN))
            .addColumn(Bytes.toBytes(HbaseConfig.FAMILY_CI),Bytes.toBytes(HbaseConfig.QUALIFIER_CTG));
        }
        Result[] results = null; 
        try {
             table = connection.getTable(HbaseConfig.TAB_CI);
             results = table.get(gets);
             if(!results[0].isEmpty()){
                 retResult = this.resultToMaps(results);
             }
        } catch (IOException e) {
            LOG.error("query from hbase err,cause by:",e);
        }finally{
            LogQueryUtil.realeTable(table);
        }
        return retResult;
    }

    
    
    
    @SuppressWarnings("deprecation")
    public <T> List<T> resultToBeans(Result[] results,Class<? extends T> clazz) throws InstantiationException, IllegalAccessException{
        List<T> list = new ArrayList<T>();
        for (Result result : results) {
            T clazzObj  = clazz.newInstance();
            for (KeyValue keyValue : result.raw()) {
                Field field = FieldUtils.getField(clazz,
                        Bytes.toString(keyValue.getQualifier()), true);
                if (field != null) {
                    TypeHandler typeHandler = DefaultTypeHandlers
                            .findDefaultHandler((Class<?>) field.getType());
                    Object obj = typeHandler
                            .toObject((Class<?>) field.getType(),
                                    keyValue.getValue());
                    field.set(clazzObj, obj);
                }
            }
            list.add(clazzObj);
        }
        return list;
    }
    
    
    public <T> List<T> jsonArrayToBeans(JSONArray ja,Class<? extends T> clazz) throws InstantiationException, IllegalAccessException{
        List<T> list = new ArrayList<T>();
        for(int i = 0;i<ja.size();i++){
            JSONObject jo = ja.getJSONObject(i);
            T clazzObj  = clazz.newInstance();
            Set<String> keys = jo.keySet();
            for(String key:keys){
                Field field = FieldUtils.getField(clazz,
                        key, true);
                if (field != null) {
                    TypeHandler typeHandler = DefaultTypeHandlers
                            .findDefaultHandler((Class<?>) field.getType());
                    Object obj = typeHandler
                            .toObject((Class<?>) field.getType(),
                                    Bytes.toBytes(String.valueOf(jo.get(key))));
                    field.set(clazzObj, obj);
                }
            }
            list.add(clazzObj);
        }
        return list;
    }
    
    public List<Map<String,String>> resultToMaps(Result[] results){
        List<Map<String,String>> retResult = new ArrayList<Map<String,String>>();
        for(Result rl:results){
            byte[] ctgBytes = rl.getValue(
                    Bytes.toBytes(HbaseConfig.FAMILY_CI),
                    Bytes.toBytes(HbaseConfig.QUALIFIER_CTG));
            byte[] createTimeBytes = rl.getValue(
                    Bytes.toBytes(HbaseConfig.FAMILY_CI),
                    Bytes.toBytes(HbaseConfig.QUELIFIER_CREATETIME));
            byte[] srcSignBytes = rl.getValue(
                    Bytes.toBytes(HbaseConfig.FAMILY_CI),
                    Bytes.toBytes(HbaseConfig.QUELIFIER_SRCSYSSIGN));
            byte[] rowkeyBytes = rl.getValue(
                    Bytes.toBytes(HbaseConfig.FAMILY_CI),
                    Bytes.toBytes(HbaseConfig.QUALIFIER_ROWKEY));
            String ctgMsg = "[]";
            long createTime = 0l;
            String srcSign = "";
            String rowkey = "";
            if(createTimeBytes != null){
                createTime = Bytes.toLong(createTimeBytes);
            }
            if(ctgBytes != null){
                ctgMsg = Bytes.toString(ctgBytes);
            }
            if(srcSignBytes != null){
                srcSign = Bytes.toString(srcSignBytes);
            }
            if(rowkeyBytes != null){
                rowkey = Bytes.toString(rowkeyBytes);
            }
            
            JSONArray jsonArray = JSONArray.fromObject(ctgMsg);
            Map<String,String> map = new HashMap<String,String>();
            map.put("contractionInteractionId", rowkey);
            map.put("createDate",SFJsonCommonUtil.longToDate(createTime));
            map.put("srcSysSign",srcSign);
            String errMsg = "";
            String errCode = "";
            String funName = "";
            String status = "";
            String desc = "";
            if(jsonArray.size()>0 && jsonArray.getJSONObject(0)!=null){
                errMsg = String.valueOf(
                        jsonArray.getJSONObject(0).get(EmbeddedExpAndCtgLogKeys.CTG_ERR_MSG) == null?"":
                            jsonArray.getJSONObject(0).get(EmbeddedExpAndCtgLogKeys.CTG_ERR_MSG));
                errCode = String.valueOf(jsonArray.getJSONObject(0).get(EmbeddedExpAndCtgLogKeys.CTG_ERR_CODE) == null?"":
                    jsonArray.getJSONObject(0).get(EmbeddedExpAndCtgLogKeys.CTG_ERR_CODE));
                funName = String.valueOf(jsonArray.getJSONObject(0).get(EmbeddedExpAndCtgLogKeys.CTG_FUN_NAME)== null?"":
                    jsonArray.getJSONObject(0).get(EmbeddedExpAndCtgLogKeys.CTG_FUN_NAME));
                status = String.valueOf(jsonArray.getJSONObject(0).get(EmbeddedExpAndCtgLogKeys.CTG_STATUS) == null?"":
                    jsonArray.getJSONObject(0).get(EmbeddedExpAndCtgLogKeys.CTG_STATUS));
                desc = String.valueOf(jsonArray.getJSONObject(0).get(EmbeddedExpAndCtgLogKeys.CTG_DESC) == null?"":
                    jsonArray.getJSONObject(0).get(EmbeddedExpAndCtgLogKeys.CTG_DESC));
            }
            map.put("errMsg",errMsg);
            map.put("errCode",errCode);
            map.put("funName",funName);
            map.put("status",status);
            map.put("descriptor",desc);
            map.put("logSeq",rowkey);
            retResult.add(map);
        }
        return retResult;    
    }
      
    
    
    
    
    public Configuration getHbaseConf() {
        return hbaseConf;
    }

    public void setHbaseConf(Configuration hbaseConf) {
        this.hbaseConf = hbaseConf;
    }
    
}
