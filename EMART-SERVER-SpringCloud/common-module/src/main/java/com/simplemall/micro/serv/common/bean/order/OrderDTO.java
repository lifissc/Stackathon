package com.simplemall.micro.serv.common.bean.order;

import java.util.List;

import lombok.Data;

@Data
public class OrderDTO {

	public OrderInfo getBaseInfo() {
		return baseInfo;
	}

	public void setBaseInfo(OrderInfo baseInfo) {
		this.baseInfo = baseInfo;
	}

	public List<OrderProduct> getProducts() {
		return products;
	}

	public void setProducts(List<OrderProduct> products) {
		this.products = products;
	}

	public List<OrderState> getStateChanges() {
		return stateChanges;
	}

	public void setStateChanges(List<OrderState> stateChanges) {
		this.stateChanges = stateChanges;
	}

	OrderInfo baseInfo;
	
	List<OrderProduct> products;
	
	List<OrderState> stateChanges;
}
