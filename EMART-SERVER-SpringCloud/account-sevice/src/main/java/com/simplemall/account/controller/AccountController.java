package com.simplemall.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.account.service.IAccountService;
import com.simplemall.micro.serv.common.bean.account.Account;
import com.simplemall.micro.serv.common.constant.SystemConstants;

@RestController
@RequestMapping("/acc")
public class AccountController {

	@Autowired
	IAccountService accountService;

	@RequestMapping(value = "login", method = {RequestMethod.GET,RequestMethod.POST})
	public Account login(@RequestParam("user_id") String user_id, @RequestParam("password") String password) {
		Account result = accountService.login(user_id, password);
		return result;
	}

	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public String signup(String user_id, String user_name, String email, String password, String role_type, String mobile_number, String company_name, String company_description, String postal_address, String website) {
		boolean result = accountService.signup(user_id, user_name, email, password, role_type, mobile_number, company_name, company_description, postal_address, website);
		return result ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL;
	}
}
