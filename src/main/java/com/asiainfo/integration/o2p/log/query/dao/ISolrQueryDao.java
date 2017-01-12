package com.asiainfo.integration.o2p.log.query.dao;

import java.util.List;

import com.ailk.eaap.op2.bo.QueryBean;

public interface ISolrQueryDao {
	
	List<String> queryRowKey(QueryBean queryBean,int currPage, int pageCount);
	Long queryCount(QueryBean queryBean);

}