package com.dms.myssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dms.myssm.beans.ResultBean;
import com.dms.myssm.entity.UserInfo;
import com.dms.myssm.service.UserInfoService;

/**
 * 
 * @ClassName UserInfoController
 * @Description 用户管理
 * @author xqls.dms
 * @Date 2018年1月8日 上午9:36:45
 * @version 1.0.0
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
	@Autowired
	private UserInfoService service;
	
	@RequestMapping("/getUser")
	@ResponseBody
	public ResultBean<UserInfo> getUser() {
		ResultBean<UserInfo> result = new ResultBean<>();
		result.setData(service.selectByPrimaryKey(1));
		return result;
	}
}
