package com.simplemall.micro.serv.order.mapper;

import com.simplemall.micro.serv.common.bean.order.PurchaseInfo;
import com.simplemall.micro.serv.common.bean.order.PurchaseInfoExample;
import java.util.List;

public interface PurchaseInfoMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(PurchaseInfo record);

    int insertSelective(PurchaseInfo record);

    List<PurchaseInfo> selectByExample(PurchaseInfoExample example);

    PurchaseInfo selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(PurchaseInfo record);

    int updateByPrimaryKey(PurchaseInfo record);
}