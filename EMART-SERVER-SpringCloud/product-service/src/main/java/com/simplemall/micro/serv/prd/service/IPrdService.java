package com.simplemall.micro.serv.prd.service;

import java.util.List;

import com.simplemall.micro.serv.common.bean.product.ProductDiscount;
import com.simplemall.micro.serv.common.bean.product.ProductItem;
import com.simplemall.micro.serv.common.bean.product.Subcategory;
import com.simplemall.micro.serv.prd.model.TbCategory;

public interface IPrdService {

	ProductItem getProductById(String prdId);

	List<ProductItem> queryPrdList();

	List<TbCategory> getCatagoryList();

	List<Subcategory> getSubCatagoryList(String categoryId);

	boolean addProductById(String itemId, String category_id,String subcategory_id,String item_name,String description, String thumb, int price, int stock_number, String update_by, String remarks);

	boolean updateProductById(String itemId, String category_id, String subcategory_id, String item_name,String description, String thumb, int price, int stock_number, String update_by, String remarks);

	boolean addCartById(String user_id, String item_id, String item_name, String thumb, int price, int account, String update_by,String remarks);

	boolean updateCartById(String user_id, String item_id, String item_name, String thumb, int price,int account, String update_by, String remarks);

	boolean deleteCartById(String user_id, String item_id);

	List<ProductDiscount> getDiscountPrdList();

	ProductDiscount getDiscountInfoById(String itemId);

	boolean addDiscount(String item_id, String item_name, String thumb, String discount_code, String start_date,String end_date, String description, String percentage, String update_by, String remarks);
}
