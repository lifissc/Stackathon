package com.simplemall.micro.serv.order.mapper;

import com.simplemall.micro.serv.common.bean.order.OrderInfo;
import com.simplemall.micro.serv.common.bean.order.OrderInfoExample;
import java.util.List;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    List<OrderInfo> selectByExample(OrderInfoExample example);

    OrderInfo selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
}