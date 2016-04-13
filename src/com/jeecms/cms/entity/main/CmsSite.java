package com.jeecms.cms.entity.main;

import static com.jeecms.cms.Constants.RES_PATH;
import static com.jeecms.cms.Constants.TPL_BASE;
import static com.jeecms.cms.Constants.UPLOAD_PATH;
import static com.jeecms.cms.Constants.LIBRARY_PATH;
import static com.jeecms.common.web.Constants.DEFAULT;

import java.util.Collection;

import org.apache.commons.lang.StringUtils;

import com.jeecms.cms.entity.main.base.BaseCmsSite;

/**
 * <h3>概要:</h3> 
 *    CMS站点
 * <br>
 * <h3>功能:</h3>
 * <ol>
 * 		<li>TODO(这里用一句话描述功能点)</li>
 * </ol>
 * <h3>履历:</h3>
 * <ol>
 * 		<li>Apr 9, 2016[SUXH] 新建</li>
 * </ol>
 */
public class CmsSite extends BaseCmsSite {
	private static final long serialVersionUID = 1L;

	/**
	 * 获得站点url
	 * 
	 * @return
	 */
	public String getUrl() {
		if (getStaticIndex()) {
			return getUrlStatic();
		} else {
			return getUrlDynamic();
		}
	}

	/**
	 * 获得完整路径。在给其他网站提供客户端包含时也可以使用。
	 * 
	 * @return
	 */
	public String getUrlWhole() {
		if (getStaticIndex()) {
			return getUrlBuffer(false, true, false).append("/").toString();
		} else {
			return getUrlBuffer(true, true, false).append("/").toString();
		}
	}

	public String getUrlDynamic() {
		return getUrlBuffer(true, null, false).append("/").toString();
	}

	public String getUrlStatic() {
		return getUrlBuffer(false, null, true).append("/").toString();
	}

	public StringBuilder getUrlBuffer(boolean dynamic, Boolean whole,
			boolean forIndex) {
		boolean relative = whole != null ? !whole : getRelativePath();
		String ctx = getContextPath();
		StringBuilder url = new StringBuilder();
		if (!relative) {
			url.append(getProtocol()).append(getDomain());
			if (getPort() != null) {
				url.append(":").append(getPort());
			}
		}
		if (!StringUtils.isBlank(ctx)) {
			url.append(ctx);
		}
		if (dynamic) {
			String servlet = getServletPoint();
			if (!StringUtils.isBlank(servlet)) {
				url.append(servlet);
			}
		} else {
			if (!forIndex) {
				String staticDir = getStaticDir();
				if (!StringUtils.isBlank(staticDir)) {
					url.append(staticDir);
				}
			}
		}
		return url;
	}

	/**
	 * 获得模板路径。如：/WEB-INF/t/cms/www
	 * 
	 * @return
	 */
	public String getTplPath() {
		return TPL_BASE + "/" + getPath();
	}

	/**
	 * <b>概要：</b>
	 * 	获得模板方案路径。
	 * <b>作者：</b>SUXH </br>
	 * <b>日期：</b>Apr 9, 2016 </br>
	 * @return 如：/WEB-INF/t/cms/www/default
	 */
	public String getSolutionPath() {
		return TPL_BASE + "/" + getPath() + "/" + getTplSolution();
	}

	/**
	 * 获得模板资源路径。如：/r/cms/www
	 * 
	 * @return
	 */
	public String getResPath() {
		return RES_PATH + "/" + getPath();
	}

	/**
	 * 获得上传路径。如：/u/jeecms/path
	 * 
	 * @return
	 */
	public String getUploadPath() {
		return UPLOAD_PATH + getPath();
	}
	/**
	 * 获得文库路径。如：/wenku/path
	 * 
	 * @return
	 */
	public String getLibraryPath() {
		return LIBRARY_PATH + getPath();
	}

	/**
	 * 获得上传访问前缀。
	 * 
	 * 根据配置识别上传至数据、FTP和本地
	 * 
	 * @return
	 */
	public String getUploadBase() {
		CmsConfig config = getConfig();
		String ctx = config.getContextPath();
		if (config.getUploadToDb()) {
			if (!StringUtils.isBlank(ctx)) {
				return ctx + config.getDbFileUri();
			} else {
				return config.getDbFileUri();
			}
		} else if (getUploadFtp() != null) {
			return getUploadFtp().getUrl();
		} else {
			if (!StringUtils.isBlank(ctx)) {
				return ctx;
			} else {
				return "";
			}
		}
	}

	public String getServletPoint() {
		CmsConfig config = getConfig();
		if (config != null) {
			return config.getServletPoint();
		} else {
			return null;
		}
	}

	public String getContextPath() {
		CmsConfig config = getConfig();
		if (config != null) {
			return config.getContextPath();
		} else {
			return null;
		}
	}

	public Integer getPort() {
		CmsConfig config = getConfig();
		if (config != null) {
			return config.getPort();
		} else {
			return null;
		}
	}

	public String getDefImg() {
		CmsConfig config = getConfig();
		if (config != null) {
			return config.getDefImg();
		} else {
			return null;
		}
	}

	public String getLoginUrl() {
		CmsConfig config = getConfig();
		if (config != null) {
			return config.getLoginUrl();
		} else {
			return null;
		}
	}

	public String getProcessUrl() {
		CmsConfig config = getConfig();
		if (config != null) {
			return config.getProcessUrl();
		} else {
			return null;
		}
	}

	public int getUsernameMinLen() {
		return getConfig().getMemberConfig().getUsernameMinLen();
	}

	public int getPasswordMinLen() {
		return getConfig().getMemberConfig().getPasswordMinLen();
	}

	public static Integer[] fetchIds(Collection<CmsSite> sites) {
		if (sites == null) {
			return null;
		}
		Integer[] ids = new Integer[sites.size()];
		int i = 0;
		for (CmsSite s : sites) {
			ids[i++] = s.getId();
		}
		return ids;
	}

	public void init() {
		if (StringUtils.isBlank(getProtocol())) {
			setProtocol("http://");
		}
		if (StringUtils.isBlank(getTplSolution())) {
			setTplSolution(DEFAULT);
		}
		if (getFinalStep() == null) {
			byte step = 2;
			setFinalStep(step);
		}
	}

	/* [CONSTRUCTOR MARKER BEGIN] */
	public CmsSite () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public CmsSite (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public CmsSite (Integer id,CmsConfig config,String domain,String path,String name,String protocol,String dynamicSuffix,
		String staticSuffix,Boolean indexToRoot,Boolean staticIndex,String localeAdmin,String localeFront,
		String tplSolution,Byte finalStep,Byte afterCheck,Boolean relativePath,Boolean resycleOn) {
		super (id,config,domain, path, name, protocol, dynamicSuffix,
				staticSuffix, indexToRoot, staticIndex, localeAdmin,
				localeFront, tplSolution, finalStep, afterCheck, relativePath,
				resycleOn);
	}

	/* [CONSTRUCTOR MARKER END] */

}