package com.simplemall.account.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.simplemall.account.AccountServApplication;
import com.simplemall.account.dal.AccountMapper;
import com.simplemall.micro.serv.common.bean.account.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = AccountServApplication.class)
public class AccountControllerTest {

	@Autowired
	AccountMapper accountMapper;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	@Rollback
	public void test() {
		String userid = "100010";
		String password = "123456";
		Account account = new Account();
		account.setUserId(userid);
		account.setPassword(password);
		int apiResult = accountMapper.insertSelective(account);
		Assert.assertTrue(apiResult>0);
	}
}
