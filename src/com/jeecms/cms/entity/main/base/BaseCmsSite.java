package com.jeecms.cms.entity.main.base;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.jeecms.cms.entity.main.CmsLog;


/**
 * This is an object that contains data related to the jc_site table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="jc_site"
 */

public class BaseCmsSite  implements Serializable {

	public static String REF = "CmsSite";
	public static String PROP_INDEX_TO_ROOT = "indexToRoot";
	public static String PROP_DOMAIN = "domain";
	public static String PROP_PROTOCOL = "protocol";
	public static String PROP_LOCALE_ADMIN = "localeAdmin";
	public static String PROP_DOMAIN_REDIRECT = "domainRedirect";
	public static String PROP_UPLOAD_FTP = "uploadFtp";
	public static String PROP_RESYCLE_ON = "resycleOn";
	public static String PROP_TPL_SOLUTION = "tplSolution";
	public static String PROP_STATIC_SUFFIX = "staticSuffix";
	public static String PROP_CONFIG = "config";
	public static String PROP_STATIC_INDEX = "staticIndex";
	public static String PROP_DYNAMIC_SUFFIX = "dynamicSuffix";
	public static String PROP_FINAL_STEP = "finalStep";
	public static String PROP_SHORT_NAME = "shortName";
	public static String PROP_STATIC_DIR = "staticDir";
	public static String PROP_DOMAIN_ALIAS = "domainAlias";
	public static String PROP_PATH = "path";
	public static String PROP_AFTER_CHECK = "afterCheck";
	public static String PROP_LOCALE_FRONT = "localeFront";
	public static String PROP_NAME = "name";
	public static String PROP_ID = "id";
	public static String PROP_RELATIVE_PATH = "relativePath";

	
	/** primary key */
	private java.lang.Integer id;

	/** 域名 */
	private java.lang.String domain;
	
	/** 路径 */
	private java.lang.String path;
	
	/** 网站名称 */
	private java.lang.String name;
	
	/** 简短名称 */
	private java.lang.String shortName;
	
	/** 协议 */
	private java.lang.String protocol;
	
	/** 动态页后缀 s*/
	private java.lang.String dynamicSuffix;
	
	/** 静态页后缀 */
	private java.lang.String staticSuffix;
	
	/** 静态页存放目录 */
	private java.lang.String staticDir;
	
	/** 是否使用将首页放在根目录下 */
	private java.lang.Boolean indexToRoot;
	
	/** 是否静态化首页 */
	private java.lang.Boolean staticIndex;
	
	/** 后台本地化 */
	private java.lang.String localeAdmin;
	
	/** 前台本地化 */
	private java.lang.String localeFront;
	
	/** 模板方案 */
	private java.lang.String tplSolution;
	
	/** 终审级别 */
	private java.lang.Byte finalStep;
	
	/** 审核后(1:不能修改删除;2:修改后退回;3:修改后不变) */
	private java.lang.Byte afterCheck;
	
	/** 是否使用相对路径 */
	private java.lang.Boolean relativePath;
	
	/** 是否开启回收站 */
	private java.lang.Boolean resycleOn;
	
	/** 域名别名 */
	private java.lang.String domainAlias;
	
	/** 域名重定向 */
	private java.lang.String domainRedirect;
	
	/** 是否主站 */
	private java.lang.Boolean master;

	// many to one
	/** 上传ftp */
	private com.jeecms.core.entity.Ftp uploadFtp;
	
	/** 配置ID(CmsConfig) */
	private com.jeecms.cms.entity.main.CmsConfig config;
	
	// one to one
	/** 公司信息 */
	private com.jeecms.cms.entity.main.CmsSiteCompany siteCompany;

	// collections
	private java.util.Map<java.lang.String, java.lang.String> attr;
	private java.util.Map<java.lang.String, java.lang.String> txt;
	private java.util.Map<java.lang.String, java.lang.String> cfg;
	private java.util.Set<CmsLog>logs;

	// constructors
	public BaseCmsSite () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseCmsSite (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BaseCmsSite (
		java.lang.Integer id,
		com.jeecms.cms.entity.main.CmsConfig config,
		java.lang.String domain,
		java.lang.String path,
		java.lang.String name,
		java.lang.String protocol,
		java.lang.String dynamicSuffix,
		java.lang.String staticSuffix,
		java.lang.Boolean indexToRoot,
		java.lang.Boolean staticIndex,
		java.lang.String localeAdmin,
		java.lang.String localeFront,
		java.lang.String tplSolution,
		java.lang.Byte finalStep,
		java.lang.Byte afterCheck,
		java.lang.Boolean relativePath,
		java.lang.Boolean resycleOn) {

		this.setId(id);
		this.setConfig(config);
		this.setDomain(domain);
		this.setPath(path);
		this.setName(name);
		this.setProtocol(protocol);
		this.setDynamicSuffix(dynamicSuffix);
		this.setStaticSuffix(staticSuffix);
		this.setIndexToRoot(indexToRoot);
		this.setStaticIndex(staticIndex);
		this.setLocaleAdmin(localeAdmin);
		this.setLocaleFront(localeFront);
		this.setTplSolution(tplSolution);
		this.setFinalStep(finalStep);
		this.setAfterCheck(afterCheck);
		this.setRelativePath(relativePath);
		this.setResycleOn(resycleOn);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;


	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="identity"
     *  column="site_id"
     */
	public java.lang.Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: domain
	 */
	public java.lang.String getDomain () {
		return domain;
	}

	/**
	 * Set the value related to the column: domain
	 * @param domain the domain value
	 */
	public void setDomain (java.lang.String domain) {
		this.domain = domain;
	}


	/**
	 * Return the value associated with the column: site_path
	 */
	public java.lang.String getPath () {
		return path;
	}

	/**
	 * Set the value related to the column: site_path
	 * @param path the site_path value
	 */
	public void setPath (java.lang.String path) {
		this.path = path;
	}


	/**
	 * Return the value associated with the column: site_name
	 */
	public java.lang.String getName () {
		return name;
	}

	/**
	 * Set the value related to the column: site_name
	 * @param name the site_name value
	 */
	public void setName (java.lang.String name) {
		this.name = name;
	}


	/**
	 * Return the value associated with the column: short_name
	 */
	public java.lang.String getShortName () {
		return shortName;
	}

	/**
	 * Set the value related to the column: short_name
	 * @param shortName the short_name value
	 */
	public void setShortName (java.lang.String shortName) {
		this.shortName = shortName;
	}


	/**
	 * Return the value associated with the column: protocol
	 */
	public java.lang.String getProtocol () {
		return protocol;
	}

	/**
	 * Set the value related to the column: protocol
	 * @param protocol the protocol value
	 */
	public void setProtocol (java.lang.String protocol) {
		this.protocol = protocol;
	}


	/**
	 * Return the value associated with the column: dynamic_suffix
	 */
	public java.lang.String getDynamicSuffix () {
		return dynamicSuffix;
	}

	/**
	 * Set the value related to the column: dynamic_suffix
	 * @param dynamicSuffix the dynamic_suffix value
	 */
	public void setDynamicSuffix (java.lang.String dynamicSuffix) {
		this.dynamicSuffix = dynamicSuffix;
	}


	/**
	 * Return the value associated with the column: static_suffix
	 */
	public java.lang.String getStaticSuffix () {
		return staticSuffix;
	}

	/**
	 * Set the value related to the column: static_suffix
	 * @param staticSuffix the static_suffix value
	 */
	public void setStaticSuffix (java.lang.String staticSuffix) {
		this.staticSuffix = staticSuffix;
	}


	/**
	 * Return the value associated with the column: static_dir
	 */
	public java.lang.String getStaticDir () {
		return staticDir;
	}

	/**
	 * Set the value related to the column: static_dir
	 * @param staticDir the static_dir value
	 */
	public void setStaticDir (java.lang.String staticDir) {
		this.staticDir = staticDir;
	}


	/**
	 * Return the value associated with the column: is_index_to_root
	 */
	public java.lang.Boolean getIndexToRoot () {
		return indexToRoot;
	}

	/**
	 * Set the value related to the column: is_index_to_root
	 * @param indexToRoot the is_index_to_root value
	 */
	public void setIndexToRoot (java.lang.Boolean indexToRoot) {
		this.indexToRoot = indexToRoot;
	}


	/**
	 * Return the value associated with the column: is_static_index
	 */
	public java.lang.Boolean getStaticIndex () {
		return staticIndex;
	}

	/**
	 * Set the value related to the column: is_static_index
	 * @param staticIndex the is_static_index value
	 */
	public void setStaticIndex (java.lang.Boolean staticIndex) {
		this.staticIndex = staticIndex;
	}


	/**
	 * Return the value associated with the column: locale_admin
	 */
	public java.lang.String getLocaleAdmin () {
		return localeAdmin;
	}

	/**
	 * Set the value related to the column: locale_admin
	 * @param localeAdmin the locale_admin value
	 */
	public void setLocaleAdmin (java.lang.String localeAdmin) {
		this.localeAdmin = localeAdmin;
	}


	/**
	 * Return the value associated with the column: locale_front
	 */
	public java.lang.String getLocaleFront () {
		return localeFront;
	}

	/**
	 * Set the value related to the column: locale_front
	 * @param localeFront the locale_front value
	 */
	public void setLocaleFront (java.lang.String localeFront) {
		this.localeFront = localeFront;
	}


	/**
	 * Return the value associated with the column: tpl_solution
	 */
	public java.lang.String getTplSolution () {
		return tplSolution;
	}

	/**
	 * Set the value related to the column: tpl_solution
	 * @param tplSolution the tpl_solution value
	 */
	public void setTplSolution (java.lang.String tplSolution) {
		this.tplSolution = tplSolution;
	}


	/**
	 * Return the value associated with the column: final_step
	 */
	public java.lang.Byte getFinalStep () {
		return finalStep;
	}

	/**
	 * Set the value related to the column: final_step
	 * @param finalStep the final_step value
	 */
	public void setFinalStep (java.lang.Byte finalStep) {
		this.finalStep = finalStep;
	}


	/**
	 * Return the value associated with the column: after_check
	 */
	public java.lang.Byte getAfterCheck () {
		return afterCheck;
	}

	/**
	 * Set the value related to the column: after_check
	 * @param afterCheck the after_check value
	 */
	public void setAfterCheck (java.lang.Byte afterCheck) {
		this.afterCheck = afterCheck;
	}


	/**
	 * Return the value associated with the column: is_relative_path
	 */
	public java.lang.Boolean getRelativePath () {
		return relativePath;
	}

	/**
	 * Set the value related to the column: is_relative_path
	 * @param relativePath the is_relative_path value
	 */
	public void setRelativePath (java.lang.Boolean relativePath) {
		this.relativePath = relativePath;
	}


	/**
	 * Return the value associated with the column: is_recycle_on
	 */
	public java.lang.Boolean getResycleOn () {
		return resycleOn;
	}

	/**
	 * Set the value related to the column: is_recycle_on
	 * @param resycleOn the is_recycle_on value
	 */
	public void setResycleOn (java.lang.Boolean resycleOn) {
		this.resycleOn = resycleOn;
	}


	/**
	 * Return the value associated with the column: domain_alias
	 */
	public java.lang.String getDomainAlias () {
		return domainAlias;
	}

	/**
	 * Set the value related to the column: domain_alias
	 * @param domainAlias the domain_alias value
	 */
	public void setDomainAlias (java.lang.String domainAlias) {
		this.domainAlias = domainAlias;
	}


	/**
	 * Return the value associated with the column: domain_redirect
	 */
	public java.lang.String getDomainRedirect () {
		return domainRedirect;
	}

	/**
	 * Set the value related to the column: domain_redirect
	 * @param domainRedirect the domain_redirect value
	 */
	public void setDomainRedirect (java.lang.String domainRedirect) {
		this.domainRedirect = domainRedirect;
	}
	
	public java.lang.Boolean getMaster() {
		return master;
	}

	public void setMaster(java.lang.Boolean master) {
		this.master = master;
	}

	/**
	 * Return the value associated with the column: ftp_upload_id
	 */
	public com.jeecms.core.entity.Ftp getUploadFtp () {
		return uploadFtp;
	}

	/**
	 * Set the value related to the column: ftp_upload_id
	 * @param uploadFtp the ftp_upload_id value
	 */
	public void setUploadFtp (com.jeecms.core.entity.Ftp uploadFtp) {
		this.uploadFtp = uploadFtp;
	}


	/**
	 * Return the value associated with the column: config_id
	 */
	public com.jeecms.cms.entity.main.CmsConfig getConfig () {
		return config;
	}

	/**
	 * Set the value related to the column: config_id
	 * @param config the config_id value
	 */
	public void setConfig (com.jeecms.cms.entity.main.CmsConfig config) {
		this.config = config;
	}
	
	public com.jeecms.cms.entity.main.CmsSiteCompany getSiteCompany() {
		return siteCompany;
	}

	public void setSiteCompany(com.jeecms.cms.entity.main.CmsSiteCompany siteCompany) {
		this.siteCompany = siteCompany;
	}

	/**
	 * Return the value associated with the column: attr
	 */
	public java.util.Map<java.lang.String, java.lang.String> getAttr () {
		return attr;
	}

	/**
	 * Set the value related to the column: attr
	 * @param attr the attr value
	 */
	public void setAttr (java.util.Map<java.lang.String, java.lang.String> attr) {
		this.attr = attr;
	}


	/**
	 * Return the value associated with the column: txt
	 */
	public java.util.Map<java.lang.String, java.lang.String> getTxt () {
		return txt;
	}

	/**
	 * Set the value related to the column: txt
	 * @param txt the txt value
	 */
	public void setTxt (java.util.Map<java.lang.String, java.lang.String> txt) {
		this.txt = txt;
	}


	/**
	 * Return the value associated with the column: cfg
	 */
	public java.util.Map<java.lang.String, java.lang.String> getCfg () {
		return cfg;
	}

	/**
	 * Set the value related to the column: cfg
	 * @param cfg the cfg value
	 */
	public void setCfg (java.util.Map<java.lang.String, java.lang.String> cfg) {
		this.cfg = cfg;
	}
	



	public java.util.Set<CmsLog> getLogs() {
		return logs;
	}

	public void setLogs(java.util.Set<CmsLog> logs) {
		this.logs = logs;
	}

	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.jeecms.cms.entity.main.CmsSite)) return false;
		else {
			com.jeecms.cms.entity.main.CmsSite cmsSite = (com.jeecms.cms.entity.main.CmsSite) obj;
			if (null == this.getId() || null == cmsSite.getId()) return false;
			else return (this.getId().equals(cmsSite.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}

	public void getToStringSTR(){  
        Field[] fs = this.getClass().getDeclaredFields();  
        for (int i = 0; i < fs.length; i++) {  
        }  
        List<String> fsnames = new ArrayList<String>();  
        for(int i = 0 ; i <fs.length ; i ++ ){  
            if(!fs[i].getName().endsWith("serialVersionUID")){  
                fsnames.add(fs[i].getName());  
            }  
        }  
        StringBuffer sb = new StringBuffer();  
        //属性个数为0  
        if(fs.length==0){  
            sb.append("return this.getClass().getName() +\"【");  
            sb.append("】\";");  
        }  
        //属性个数大于0  
        if(fs.length>0){  
            sb.append("return this.getClass().getName() +\"【");  
            //属性个数为1  
            if(fsnames.size()==1){  
                sb.append(""+fsnames.get(0)+"=\"+"+fsnames.get(0)+"");  
                sb.append("+\"】\";");  
            }  
            //属性个数大于1  
            if(fsnames.size()>1){  
                for (int j = 0; j < fs.length; j++) {  
                    if(j<fs.length-1){  
                        sb.append(""+fsnames.get(j)+"=\"+"+fsnames.get(j)+"+\",");  
                    }  
                    if(j==fsnames.size()-1){  
                        sb.append(""+fsnames.get(j)+"=\"+"+fsnames.get(j)+"");  
                        sb.append("+\"】\";");  
                    }  
                }  
            }  
        }  
        System.out.println("public String toString(){");  
        System.out.println("    "+sb);  
        System.out.println("}");  
    }  
	
	public String toString(){
	    return this.getClass().getName() +"【REF="+REF+",PROP_INDEX_TO_ROOT="+PROP_INDEX_TO_ROOT+",PROP_DOMAIN="+PROP_DOMAIN+",PROP_PROTOCOL="+PROP_PROTOCOL+",PROP_LOCALE_ADMIN="+PROP_LOCALE_ADMIN+",PROP_DOMAIN_REDIRECT="+PROP_DOMAIN_REDIRECT+",PROP_UPLOAD_FTP="+PROP_UPLOAD_FTP+",PROP_RESYCLE_ON="+PROP_RESYCLE_ON+",PROP_TPL_SOLUTION="+PROP_TPL_SOLUTION+",PROP_STATIC_SUFFIX="+PROP_STATIC_SUFFIX+",PROP_CONFIG="+PROP_CONFIG+",PROP_STATIC_INDEX="+PROP_STATIC_INDEX+",PROP_DYNAMIC_SUFFIX="+PROP_DYNAMIC_SUFFIX+",PROP_FINAL_STEP="+PROP_FINAL_STEP+",PROP_SHORT_NAME="+PROP_SHORT_NAME+",PROP_STATIC_DIR="+PROP_STATIC_DIR+",PROP_DOMAIN_ALIAS="+PROP_DOMAIN_ALIAS+",PROP_PATH="+PROP_PATH+",PROP_AFTER_CHECK="+PROP_AFTER_CHECK+",PROP_LOCALE_FRONT="+PROP_LOCALE_FRONT+",PROP_NAME="+PROP_NAME+",PROP_ID="+PROP_ID+",PROP_RELATIVE_PATH="+PROP_RELATIVE_PATH+",hashCode="+hashCode+",id="+id+",domain="+domain+",path="+path+",name="+name+",shortName="+shortName+",protocol="+protocol+",dynamicSuffix="+dynamicSuffix+",staticSuffix="+staticSuffix+",staticDir="+staticDir+",indexToRoot="+indexToRoot+",staticIndex="+staticIndex+",localeAdmin="+localeAdmin+",localeFront="+localeFront+",tplSolution="+tplSolution+",finalStep="+finalStep+",afterCheck="+afterCheck+",relativePath="+relativePath+",resycleOn="+resycleOn+",domainAlias="+domainAlias+",domainRedirect="+domainRedirect+",master="+master+",uploadFtp="+uploadFtp+",config="+config+",siteCompany="+siteCompany+",attr="+attr+",txt="+txt+",cfg="+cfg+",logs="+logs+"】";
	}





}