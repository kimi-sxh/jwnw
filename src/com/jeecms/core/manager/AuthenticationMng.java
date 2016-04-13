package com.jeecms.core.manager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jeecms.common.page.Pagination;
import com.jeecms.common.security.BadCredentialsException;
import com.jeecms.common.security.UsernameNotFoundException;
import com.jeecms.common.web.session.SessionProvider;
import com.jeecms.core.entity.Authentication;
import com.jeecms.core.entity.UnifiedUser;

/**
 * <h3>概要:</h3> 
 *    认证信息管理接口
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
public interface AuthenticationMng {
	
	/** 认证信息session key */
	public static final String AUTH_KEY = "auth_key";
	
	/**
	 * <b>概要：</b>
	 * 	通过认证ID，获得认证信息。本方法会检查认证是否过期。
	 * <b>作者：</b>SUXH </br>
	 * <b>日期：</b>Apr 10, 2016 </br>
	 * @param authId 认证ID
	 * @return 返回Authentication对象。如果authId不存在或已经过期，则返回null。
	 */
	public Authentication retrieve(String authId);

	/**
	 * <b>概要：</b>
	 * 	从SessionProvider获得userId
	 * <b>作者：</b>SUXH </br>
	 * <b>日期：</b>Apr 10, 2016 </br>
	 * @param sessionProvider Session提供者（需考虑到分布式）
	 * @param request 请求（其中存放有Authentication#id）
	 * @return 用户id
	 */
	public Integer retrieveUserIdFromSessionProvider(SessionProvider sessionProvider,
			HttpServletRequest request);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void storeAuthIdToSession(SessionProvider session,
			HttpServletRequest request, HttpServletResponse response,
			String authId);



	/**
	 * 登录
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @param ip
	 *            登录IP
	 * @return 认证信息
	 * @throws UsernameNotFoundException
	 *             用户名没有找到
	 * @throws BadCredentialsException
	 *             错误的认证信息，比如密码错误
	 */
	public Authentication login(String username, String password, String ip,
			HttpServletRequest request, HttpServletResponse response,
			SessionProvider session) throws UsernameNotFoundException,
			BadCredentialsException;
	
	/**
	 * 注册后登录
	 * @param user
	 * @param ip
	 * 			登录IP
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	public Authentication activeLogin(UnifiedUser user, String ip,
			HttpServletRequest request, HttpServletResponse response,
			SessionProvider session);
	/**
	 * 获得认证分页信息
	 * 
	 * @param pageNo
	 *            当前页数
	 * @param pageSize
	 *            页数
	 * @return
	 */
	public Pagination getPage(int pageNo, int pageSize);

	/**
	 * 根据认证ID查找认证信息
	 * 
	 * @param id
	 *            认证ID
	 * @return
	 */
	public Authentication findById(String id);

	/**
	 * 保存认证信息
	 * 
	 * @param bean
	 * @return
	 */
	public Authentication save(Authentication bean);

	/**
	 * 删除认证信息
	 * 
	 * @param id
	 * @return
	 */
	public Authentication deleteById(String id);

	/**
	 * 删除认证信息
	 * 
	 * @param ids
	 * @return
	 */
	public Authentication[] deleteByIds(String[] ids);

}