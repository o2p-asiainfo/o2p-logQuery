/** 
 * Project Name:logQuery 
 * File Name:SolrQueryDaoImpl.java 
 * Package Name:com.asiainfo.log.query.dao.impl 
 * Date:2015年11月19日下午8:06:05 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
*/  
  
package com.asiainfo.integration.o2p.log.query.dao.impl;  

import java.util.ArrayList;
import java.util.List;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ailk.eaap.op2.bo.QueryBean;
import com.asiainfo.integration.o2p.log.common.bo.SolrBean;
import com.asiainfo.integration.o2p.log.common.solr.SolrServer;
import com.asiainfo.integration.o2p.log.query.dao.ISolrQueryDao;
import com.asiainfo.integration.o2p.log.query.util.QueryHander;

/** 
 * ClassName:SolrQueryDaoImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2015年11月19日 下午8:06:05 <br/> 
 * @author   daimq 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class SolrQueryDaoImpl implements ISolrQueryDao{
    
    public static final Logger LOG = LoggerFactory.getLogger(SolrQueryDaoImpl.class);
    private SolrServer solrServer;

   
    
    @Override
    public List<String> queryRowKey(QueryBean queryBean, int currPage,int pageCount) {
        List<String> rowkeylist = new ArrayList<String>();
        try {
            SolrQuery query = new SolrQuery();
            query.setQuery(QueryHander.buildParam(queryBean));
            //数据起始行，分页用
            query.setStart((currPage -1) * pageCount);  
            //返回记录数，分页用
            query.setRows(pageCount);  
            QueryResponse rsp = solrServer.getCommonsHttpSolrServer().query(query);
            List<SolrBean> beans = rsp.getBeans(SolrBean.class);
            // 输出结果
            for (int i = 0; i < beans.size(); i++) {
                SolrBean friend = beans.get(i);
                rowkeylist.add(friend.getContractInteractionId());
            }
        } catch (SolrServerException e) {
            LOG.error("query rowkey from solr Server err,cause by:",e);
        }
        return rowkeylist;
    }

    @Override
    public Long queryCount(QueryBean queryBean) {
        long result = 0l;
        try {
            SolrQuery query = new SolrQuery();
            query.setQuery(QueryHander.buildParam(queryBean));
            QueryResponse rsp = solrServer.getCommonsHttpSolrServer().query(query);
            SolrDocumentList docs = rsp.getResults();
            result = docs.getNumFound();
        } catch (SolrServerException e) {
            LOG.error("query rowCount from solr Server err,cause by:",e);
        }
        return result;
    }

    public SolrServer getSolrServer() {
        return solrServer;
    }

    public void setSolrServer(SolrServer solrServer) {
        this.solrServer = solrServer;
    }
    
    

    
}
