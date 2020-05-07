package com.simplemall.account.service;

import com.simplemall.micro.serv.common.bean.account.Account;

public interface IAccountService {

	Account login(String user_id, String password);
	
	boolean signup(String user_id, String user_name, String email, String password, String role_type, String mobile_number, String company_name, String company_description, String postal_address, String website);
}
