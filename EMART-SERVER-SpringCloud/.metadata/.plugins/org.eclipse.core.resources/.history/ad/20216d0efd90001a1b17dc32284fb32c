package com.simplemall.pay.dal;

import com.simplemall.pay.bean.Transactions;
import com.simplemall.pay.bean.TransactionsExample;
import java.util.List;

public interface TransactionsMapper {
    int deleteByPrimaryKey(String payId);

    int insert(Transactions record);

    int insertSelective(Transactions record);

    List<Transactions> selectByExample(TransactionsExample example);

    Transactions selectByPrimaryKey(String payId);

    int updateByPrimaryKeySelective(Transactions record);

    int updateByPrimaryKey(Transactions record);
}