package com.jeecms.cms.dao.main;

import java.util.List;

import com.jeecms.cms.entity.main.CmsSite;
import com.jeecms.common.hibernate3.Updater;

/**
 * 站点DAO接口
 */
public interface CmsSiteDao {

	/**
	 * <b>概要：</b>
	 * 获得站点数量
	 * <b>作者：</b>SUXH </br>
	 * <b>日期：</b>Apr 10, 2016 </br>
	 * @param cacheable Should the query results be cacheable? 是否缓存查询（查询缓存依赖二级缓存）
	 * @return 获得站点数量
	 */
	public int siteCount(boolean cacheable);

	/**
	 * <b>概要：</b>
	 * 获得所有站点
	 * <b>作者：</b>SUXH </br>
	 * <b>日期：</b>Apr 10, 2016 </br>
	 * @param cacheable  Should the query results be cacheable? 是否缓存查询（查询缓存依赖二级缓存）
	 * @return 站点集合
	 */
	public List<CmsSite> getList(boolean cacheable);
	
	public List<CmsSite> getListByMaster(Boolean master);

	public CmsSite findByDomain(String domain, boolean cacheable);

	public CmsSite findById(Integer id);

	public CmsSite save(CmsSite bean);

	public CmsSite updateByUpdater(Updater<CmsSite> updater);

	public CmsSite deleteById(Integer id);

	
}