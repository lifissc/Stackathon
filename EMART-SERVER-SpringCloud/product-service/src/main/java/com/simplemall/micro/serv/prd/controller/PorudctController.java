package com.simplemall.micro.serv.prd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.simplemall.micro.serv.common.bean.product.ProductDiscount;
import com.simplemall.micro.serv.common.bean.product.ProductItem;
import com.simplemall.micro.serv.common.bean.product.Subcategory;
import com.simplemall.micro.serv.common.constant.SystemConstants;
import com.simplemall.micro.serv.prd.model.TbCategory;
import com.simplemall.micro.serv.prd.service.IPrdService;

@RestController
@RequestMapping("/prd")
public class PorudctController {

	@Autowired
	IPrdService prdService;

	@RequestMapping(value = "productInfo", method = RequestMethod.POST)
	public ProductItem getPorudctById(String itemId) {
		return prdService.getProductById(itemId);
	}

	@RequestMapping(value = "productList", method = RequestMethod.POST)
	public List<ProductItem> getproductList() {
		return prdService.queryPrdList();
	}
	
	@RequestMapping(value = "catagory", method = RequestMethod.POST)
	public List<TbCategory> getCatagoryList() {
		return prdService.getCatagoryList();
	}
	
	@RequestMapping(value = "subcatagory", method = RequestMethod.POST)
	public List<Subcategory> getSubCatagoryList(String categoryId) {
		return prdService.getSubCatagoryList(categoryId);
	}
	
	@RequestMapping(value = "addProduct", method = RequestMethod.POST)
	public String addProductById(String itemId,String category_id,String subcategory_id,String item_name,String description,String thumb,int price,int stock_number,String update_by,String remarks) {
		boolean result =  prdService.addProductById(itemId,category_id, subcategory_id, item_name, description, thumb, price, stock_number, update_by, remarks);
		return result ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL;
	}
	
	@RequestMapping(value = "updateProduct", method = RequestMethod.POST)
	public String updateProductById(String itemId,String category_id,String subcategory_id,String item_name,String description,String thumb,int price,int stock_number,String update_by,String remarks) {
		boolean result = prdService.updateProductById(itemId,category_id, subcategory_id, item_name, description, thumb, price, stock_number, update_by, remarks);
		return result ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL;
	}
	
	@RequestMapping(value = "addCart", method = RequestMethod.POST)
	public String addCartById(String user_id,String item_id,String item_name,String thumb,int price, int account,String update_by,String remarks) {
		boolean result = prdService.addCartById(user_id,item_id,item_name,thumb,price,account,update_by,remarks);
		return result ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL;
	}
	
	@RequestMapping(value = "updateCart", method = RequestMethod.POST)
	public String updateCartById(String user_id,String item_id,String item_name,String thumb,int price,int account,String update_by,String remarks) {
		boolean result = prdService.updateCartById(user_id,item_id,item_name,thumb,price,account,update_by,remarks);
		return result ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL;
	}
	
	@RequestMapping(value = "deleteCart", method = RequestMethod.POST)
	public String deleteCartById(String user_id,String item_id) {
		boolean result = prdService.deleteCartById(user_id,item_id);
		return result ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL;
	}
	
	@RequestMapping(value = "addDiscount", method = RequestMethod.POST)
	public String addDiscount(String item_id,String item_name,String thumb,String discount_code, String start_date,String end_date,String description,String percentage,String update_by,String remarks) {
		boolean result = prdService.addDiscount( item_id, item_name, thumb, discount_code,  start_date, end_date, description, percentage, update_by, remarks);
		return result ? SystemConstants.Code.SUCCESS : SystemConstants.Code.FAIL;
	}
	
	@RequestMapping(value = "discounts", method = RequestMethod.POST)
	public List<ProductDiscount> getDiscountPrdList() {
		return prdService.getDiscountPrdList();
	}
	
	@RequestMapping(value = "discountInfo", method = RequestMethod.POST)
	public ProductDiscount getDiscountInfoById(String itemId) {
		return prdService.getDiscountInfoById(itemId);
	}

}
