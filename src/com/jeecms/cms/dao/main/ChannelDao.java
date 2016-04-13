package com.jeecms.cms.dao.main;

import java.util.List;

import com.jeecms.cms.entity.main.Channel;
import com.jeecms.common.hibernate3.Updater;
import com.jeecms.common.page.Pagination;

public interface ChannelDao {
	
	/**
	 * <b>概要：</b>
	 * 	根据path和站点id获得拉鲁 
	 * <b>作者：</b>SUXH </br>
	 * <b>日期：</b>Apr 10, 2016 </br>
	 * @param path 栏目路径 如：picture download
	 * @param siteId 站点id
	 * @param cacheable 是否启用查询缓存（基于二级缓存）
	 * @return 对应栏目信息
	 */
	public Channel findByPath(String path, Integer siteId, boolean cacheable);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<Channel> getTopList(Integer siteId, boolean hasContentOnly,boolean displayOnly, boolean cacheable);

	public Pagination getTopPage(Integer siteId, boolean hasContentOnly,boolean displayOnly, boolean cacheable, int pageNo, int pageSize);

	public List<Channel> getTopListByRigth(Integer userId, Integer siteId,boolean hasContentOnly);
	
	public List<Channel> getChildList(Integer parentId, boolean hasContentOnly,boolean displayOnly, boolean cacheable);

	public Pagination getChildPage(Integer parentId, boolean hasContentOnly,boolean displayOnly, boolean cacheable, int pageNo, int pageSize);

	public List<Channel> getChildListByRight(Integer userId, Integer parentId,boolean hasContentOnly);

	public List<Channel> getTopListForDepartId(Integer departId,Integer siteId,boolean hasContentOnly);
	
	public List<Channel> getChildListByDepartId(Integer departId,Integer  siteId,Integer parentId, boolean hasContentOnly);



	public Channel findById(Integer id);

	public Channel save(Channel bean);

	public Channel updateByUpdater(Updater<Channel> updater);

	public Channel deleteById(Integer id);
	
	public void initWorkFlow(Integer workflowId);
}