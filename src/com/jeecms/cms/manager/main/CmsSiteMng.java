package com.jeecms.cms.manager.main;

import java.io.IOException;
import java.util.List;

import com.jeecms.cms.entity.main.CmsSite;
import com.jeecms.cms.entity.main.CmsUser;

public interface CmsSiteMng {
	
	/**
	 * <b>概要：</b>
	 * 从数据库中读取站点列表数据
	 * <b>作者：</b>SUXH </br>
	 * <b>日期：</b>Apr 10, 2016 </br>
	 * @return 站点列表
	 */
	public List<CmsSite> getList();

	/**
	 * <b>概要：</b>
	 * 	从“查询缓存”中读取站点列表数据
	 * <b>作者：</b>SUXH </br>
	 * <b>日期：</b>Apr 10, 2016 </br>
	 * @return 站点列表
	 */
	public List<CmsSite> getListFromCache();

	public CmsSite findByDomain(String domain, boolean cacheable);
	
	public List<CmsSite> getListByMaster(Boolean master);

	public CmsSite findById(Integer id);
	

	public CmsSite save(CmsSite currSite, CmsUser currUser, CmsSite bean,
			Integer uploadFtpId) throws IOException;

	public CmsSite update(CmsSite bean, Integer uploadFtpId);

	public void updateTplSolution(Integer siteId, String solution);

	public CmsSite deleteById(Integer id);

	public CmsSite[] deleteByIds(Integer[] ids);
}