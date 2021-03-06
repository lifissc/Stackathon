package com.simplemall.micro.serv.order.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplemall.micro.serv.common.bean.order.OrderInfo;
import com.simplemall.micro.serv.common.bean.order.OrderInfoExample;
import com.simplemall.micro.serv.order.mapper.OrderInfoMapper;
import com.simplemall.micro.serv.order.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {

	private Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Autowired
	OrderInfoMapper orderInfoMapper;

	@Override
	public boolean createOrder(String order_id, String item_id, String buyer_id, String seller_id, String item_name,
			String thumb, String transaction_id, int number_items, String account_id, int price, String create_by) {
		OrderInfoExample example = new OrderInfoExample();
		example.createCriteria().andOrderIdEqualTo(order_id);
		List<OrderInfo> list = orderInfoMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(list)) {
			logger.warn("{}-This order is alreday present!",order_id);
			return false;
		}
		
		OrderInfo orderInfo = new OrderInfo();
		orderInfo.setOrderId(order_id);
		orderInfo.setItemId(item_id);
		orderInfo.setBuyerId(buyer_id);
		orderInfo.setSellerId(seller_id);
		orderInfo.setItemName(item_name);
		orderInfo.setThumb(thumb);
		orderInfo.setTransactionId(transaction_id);
		orderInfo.setPrice(price);
		orderInfo.setNumberItems(number_items);
		orderInfo.setAccountId(account_id);
		orderInfo.setCreateBy(create_by);
		int result = orderInfoMapper.insertSelective(orderInfo);
		logger.info("{} add order success！",order_id);
		return result > 0 ? true : false;
	}

	@Override
	public List<OrderInfo> viewPurchaseHistory(String buyerId) {
		
		OrderInfoExample example = new OrderInfoExample();
		example.createCriteria().andBuyerIdEqualTo(buyerId);
		return orderInfoMapper.selectByExample(example);
	}

	@Override
	public List<OrderInfo> viewSellReport(String sellerId) {
		OrderInfoExample example = new OrderInfoExample();
		example.createCriteria().andBuyerIdEqualTo(sellerId);
		return orderInfoMapper.selectByExample(example);
	}

}
