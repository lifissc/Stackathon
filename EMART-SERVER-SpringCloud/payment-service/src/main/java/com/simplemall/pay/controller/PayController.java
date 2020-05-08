package com.simplemall.pay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.common.constant.SystemConstants;
import com.simplemall.pay.service.IPayService;

@RestController
@RequestMapping("/payment")
public class PayController {

	@Autowired
	IPayService payService;

	@RequestMapping(value = "pay", method = RequestMethod.POST)
	public String pay(String pay_id,String user_id,String seller_id,String transaction_type,String remark) {
		boolean result = payService.pay(pay_id, user_id, seller_id, transaction_type, remark);
		return result ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL;
	}
}
