package com.simplemall.micro.serv.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.common.bean.order.OrderInfo;
import com.simplemall.micro.serv.common.constant.SystemConstants;
import com.simplemall.micro.serv.order.service.IOrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	IOrderService orderService;

	@RequestMapping(value = "createOrder", method = {RequestMethod.POST,RequestMethod.GET})
	public String createOrder(String order_id,String item_id,String buyer_id,String seller_id,String item_name,String thumb,String transaction_id,int number_items,String account_id,int price,String create_by) {
		boolean result = orderService.createOrder( order_id, item_id, buyer_id, seller_id, item_name, thumb, transaction_id, number_items, account_id, price, create_by);
		return result ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL;
	}

	@RequestMapping(value = "viewPurchaseHistory", method = RequestMethod.POST)
	public List<OrderInfo> viewPurchaseHistory(String buyerId) {
		return orderService.viewPurchaseHistory(buyerId);
	}

	@RequestMapping(value = "viewSellReport", method = RequestMethod.POST)
	public List<OrderInfo> viewSellReport(String sellerId) {
		return orderService.viewSellReport(sellerId);
	}
}
