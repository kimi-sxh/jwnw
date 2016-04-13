package com.jeecms.cms.web;

import javax.servlet.http.HttpServletRequest;

import com.jeecms.cms.entity.main.CmsSite;
import com.jeecms.cms.entity.main.CmsUser;

/**
 * <h3>概要:</h3> 
 *    提供一些CMS系统中使用到的共用方法
 *    比如获得会员信息,获得后台站点信息
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
public class CmsUtils {
	
	/** 用户KEY */
	public static final String USER_KEY = "_user_key";
	
	/** 站点KEY */
	public static final String SITE_KEY = "_site_key";

	/**
	 * <b>概要：</b>
	 * 	请求范围内获得用户
	 * <b>作者：</b>SUXH </br>
	 * <b>日期：</b>Apr 10, 2016 </br>
	 * @param request 请求范围
	 * @return 用户信息
	 */
	public static CmsUser getUser(HttpServletRequest request) {
		return (CmsUser) request.getAttribute(USER_KEY);
	}
	
	/**
	 * <b>概要：</b>
	 * 	请求范围内设置用户信息
	 * <b>作者：</b>SUXH </br>
	 * <b>日期：</b>Apr 10, 2016 </br>
	 * @param request 请求
	 * @param user 用户
	 */
	public static void setUser(HttpServletRequest request, CmsUser user) {
		request.setAttribute(USER_KEY, user);
	}
	
	/**
	 * <b>概要：</b>
	 * 	请求中获得站点数据（key:_site_key）
	 * <b>作者：</b>SUXH </br>
	 * <b>日期：</b>Apr 10, 2016 </br>
	 * @param request 请求
	 * @return 站点数据
	 */
	public static CmsSite getSite(HttpServletRequest request) {
		return (CmsSite) request.getAttribute(SITE_KEY);
	}

	/**
	 * <b>概要：</b>
	 * 	请求中设置站点数据（key:_site_key）
	 * <b>作者：</b>SUXH </br>
	 * <b>日期：</b>Apr 10, 2016 </br>
	 * @param request 请求
	 * @param site 站点
	 */
	public static void setSite(HttpServletRequest request, CmsSite site) {
		request.setAttribute(SITE_KEY, site);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * 获得用户ID
	 * 
	 * @param request
	 * @return
	 */
	public static Integer getUserId(HttpServletRequest request) {
		CmsUser user = getUser(request);
		if (user != null) {
			return user.getId();
		} else {
			return null;
		}
	}





	/**
	 * 获得站点ID
	 * 
	 * @param request
	 * @return
	 */
	public static Integer getSiteId(HttpServletRequest request) {
		return getSite(request).getId();
	}
}
