package com.jeecms.common.web.springmvc;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

/**
 * <h3>概要:</h3> 
 *    国际化信息帮助类
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
public final class MessageResolver {

	/**
	 * <b>概要：</b>
	 * 	获得国际化信息 
	 * <b>作者：</b>SUXH </br>
	 * <b>日期：</b>Apr 10, 2016 </br>
	 * @param request 请求
	 * @param code 国际化代码 也即properties文件中的key
	 * @param args 替换参数
	 * @return 国际化资源
	 */
	public static String getMessage(HttpServletRequest request, String code,
			Object... args) {
		WebApplicationContext messageSource = RequestContextUtils
				.getWebApplicationContext(request);
		if (messageSource == null) {
			throw new IllegalStateException("WebApplicationContext not found!");
		}
		LocaleResolver localeResolver = RequestContextUtils
				.getLocaleResolver(request);
		Locale locale;
		if (localeResolver != null) {
			locale = localeResolver.resolveLocale(request);
		} else {
			locale = request.getLocale();
		}
		return messageSource.getMessage(code, args, locale);
	}
}
