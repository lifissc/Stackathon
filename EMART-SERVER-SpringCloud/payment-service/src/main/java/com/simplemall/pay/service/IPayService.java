package com.simplemall.pay.service;

public interface IPayService {

	boolean pay(String pay_id, String user_id, String seller_id, String transaction_type, String remark);
}
