package com.simplemall.account.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplemall.account.dal.AccountMapper;
import com.simplemall.account.service.IAccountService;
import com.simplemall.micro.serv.common.bean.account.Account;
import com.simplemall.micro.serv.common.bean.account.AccountCriteria;

@Service
public class AccountServiceImpl implements IAccountService {
	
	private Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

	@Autowired
	AccountMapper accountMapper;

	@Override
	public Account login(String user_id, String password) {
		AccountCriteria criteria = new AccountCriteria();
		criteria.createCriteria().andUserIdEqualTo(user_id).andPasswordEqualTo(password);
		List<Account> list = accountMapper.selectByExample(criteria);
		logger.info("{}Login Success!",user_id);
		return CollectionUtils.isNotEmpty(list)?list.get(0):new Account();
	}

	@Override
	public boolean signup(String user_id, String user_name, String email, String password, String role_type, String mobile_number, String company_name, String company_description, String postal_address, String website) {
		Account account = new Account();
		account.setUserId(user_id);
		account.setUserName(user_name);
		account.setPassword(password);
		account.setEmail(email);
		account.setRoleType(role_type);
		account.setCompanyName(company_name);
		account.setCompanyDescription(company_description);
		account.setMobileNumber(mobile_number);
		account.setPostalAddress(postal_address);
		account.setWebsite(website);
		AccountCriteria example = new AccountCriteria();
		example.createCriteria().andUserIdEqualTo(user_id);
		List<Account> list = accountMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(list)) {
			logger.warn("{}-This User is alreday present!",user_id);
			return false;
		}
		int result = accountMapper.insertSelective(account);
		logger.info("{} Signup Success！",user_id);
		return result > 0 ? true : false;
	}

}
