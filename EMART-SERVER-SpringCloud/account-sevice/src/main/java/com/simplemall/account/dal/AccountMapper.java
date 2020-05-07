package com.simplemall.account.dal;

import java.util.List;

import com.simplemall.micro.serv.common.bean.account.Account;
import com.simplemall.micro.serv.common.bean.account.AccountCriteria;

public interface AccountMapper {
    int deleteByPrimaryKey(String userId);

    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExample(AccountCriteria example);

    Account selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);
}