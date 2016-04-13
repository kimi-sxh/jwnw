package com.jeecms.core.entity;

import java.sql.Timestamp;
import java.util.Date;

import com.jeecms.core.entity.base.BaseAuthentication;

/**
 * <h3>概要:</h3> 
 *    cms认证信息
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
public class Authentication extends BaseAuthentication {
	private static final long serialVersionUID = 1L;

	public void init() {
		Date now = new Timestamp(System.currentTimeMillis());
		setLoginTime(now);
		setUpdateTime(now);
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public Authentication () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Authentication (java.lang.String id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Authentication (
		java.lang.String id,
		java.lang.Integer uid,
		java.lang.String username,
		java.util.Date loginTime,
		java.lang.String loginIp,
		java.util.Date updateTime) {

		super (
			id,
			uid,
			username,
			loginTime,
			loginIp,
			updateTime);
	}

	/* [CONSTRUCTOR MARKER END] */

}