package com.simplemall.micro.serv.order.service;

import java.util.List;

import com.simplemall.micro.serv.common.bean.order.OrderInfo;

public interface IOrderService {

	boolean createOrder(String order_id, String item_id, String buyer_id, String seller_id, String item_name,String thumb, String transaction_id, int number_items, String account_id, int price, String create_by);

	List<OrderInfo> viewPurchaseHistory(String buyerId);

	List<OrderInfo> viewSellReport(String sellerId);
}
