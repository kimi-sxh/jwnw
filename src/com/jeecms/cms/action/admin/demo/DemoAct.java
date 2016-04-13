package com.jeecms.cms.action.admin.demo;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeecms.cms.entity.main.CmsUser;
import com.jeecms.cms.web.CmsUtils;

@Controller
public class DemoAct {
	private static final Logger log = LoggerFactory.getLogger(DemoAct.class);
	
	@RequestMapping("/demo/v_demo.do")
	public String profileEdit(HttpServletRequest request, ModelMap model) {
		CmsUser user = CmsUtils.getUser(request);
		model.addAttribute("user", user);
		return "demo/right";
	}
}
