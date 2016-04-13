package com.jeecms.cms.manager.main;

import java.util.List;
import java.util.Map;

import com.jeecms.cms.entity.main.Channel;
import com.jeecms.cms.entity.main.ChannelExt;
import com.jeecms.cms.entity.main.ChannelTxt;
import com.jeecms.common.page.Pagination;

/**
 * <h3>概要:</h3> 
 *   栏目管理接口
 * <br>
 * <h3>功能:</h3>
 * <ol>
 * 		<li>TODO(这里用一句话描述功能点)</li>
 * </ol>
 * <h3>履历:</h3>
 * <ol>
 * 		<li>Apr 10, 2016[SUXH] 新建</li>
 * </ol>
 */
public interface ChannelMng {
	
	/**
	 * <b>概要：</b>
	 * 	根据path和站点id获得拉鲁 
	 * <b>作者：</b>SUXH </br>
	 * <b>日期：</b>Apr 10, 2016 </br>
	 * @param path 栏目路径 如：picture download
	 * @param siteId 站点id
	 * @return 对应栏目信息
	 */
	public Channel findByPathForTag(String path, Integer siteId);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 获得顶级栏目
	 * 
	 * @param siteId
	 *            站点ID
	 * @param hasContentOnly
	 *            是否只获得有内容的栏目
	 * @return
	 */
	public List<Channel> getTopList(Integer siteId, boolean hasContentOnly);

	public List<Channel> getTopListByRigth(Integer userId, Integer siteId,boolean hasContentOnly);

	public List<Channel> getTopListForTag(Integer siteId, boolean hasContentOnly);

	public Pagination getTopPageForTag(Integer siteId, boolean hasContentOnly,int pageNo, int pageSize);

	public List<Channel> getChildList(Integer parentId, boolean hasContentOnly);

	public List<Channel> getChildListByRight(Integer userId, Integer siteId,Integer parentId, boolean hasContentOnly);

	public List<Channel> getChildListForTag(Integer parentId,boolean hasContentOnly);

	public Pagination getChildPageForTag(Integer parentId,boolean hasContentOnly, int pageNo, int pageSize);

	public List<Channel> getTopListForDepartId(Integer departId,Integer userId,Integer siteId,boolean hasContentOnly);
	
	public List<Channel> getChildListByDepartId(Integer departId,Integer siteId,Integer parentId, boolean hasContentOnly);

	public Channel findByPath(String path, Integer siteId);



	public Channel findById(Integer id);

	public Channel save(Channel bean, ChannelExt ext, ChannelTxt txt,
			Integer[] viewGroupIds, Integer[] contriGroupIds,
			Integer[] userIds, Integer siteId, Integer parentId, 
			Integer modelId,Integer workflowId,Integer[]modelIds,String[] tpls);

	public Channel update(Channel bean, ChannelExt ext, ChannelTxt txt,
			Integer[] viewGroupIds, Integer[] contriGroupIds,
			Integer[] userIds, Integer parentId, Map<String, String> attr,
			Integer workflowId,Integer[]modelIds,String[] tpls);

	public Channel deleteById(Integer id);

	public Channel[] deleteByIds(Integer[] ids);

	public Channel[] updatePriority(Integer[] ids, Integer[] priority);
	
	public void initWorkFlow(Integer workflowId);

	public String checkDelete(Integer id);
}