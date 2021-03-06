package com.simplemall.micro.serv.prd.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simplemall.micro.serv.common.bean.product.CategoryExample;
import com.simplemall.micro.serv.common.bean.product.ProductCart;
import com.simplemall.micro.serv.common.bean.product.ProductCartExample;
import com.simplemall.micro.serv.common.bean.product.ProductCartKey;
import com.simplemall.micro.serv.common.bean.product.ProductDiscount;
import com.simplemall.micro.serv.common.bean.product.ProductDiscountExample;
import com.simplemall.micro.serv.common.bean.product.ProductItem;
import com.simplemall.micro.serv.common.bean.product.ProductItemExample;
import com.simplemall.micro.serv.common.bean.product.Subcategory;
import com.simplemall.micro.serv.common.bean.product.SubcategoryExample;
import com.simplemall.micro.serv.prd.dao.TbCategoryDAO;
import com.simplemall.micro.serv.prd.mapper.CategoryMapper;
import com.simplemall.micro.serv.prd.mapper.ProductCartMapper;
import com.simplemall.micro.serv.prd.mapper.ProductDiscountMapper;
import com.simplemall.micro.serv.prd.mapper.ProductItemMapper;
import com.simplemall.micro.serv.prd.mapper.SubcategoryMapper;
import com.simplemall.micro.serv.prd.model.TbCategory;
import com.simplemall.micro.serv.prd.service.IPrdService;

@Service
public class PrdServiceImpl implements IPrdService {
	private Logger logger = LoggerFactory.getLogger(PrdServiceImpl.class);
	

	@Autowired
	ProductItemMapper prdInfoMapper;
	//@Autowired
	//CategoryMapper categoryMapper;
	@Autowired
	SubcategoryMapper subcategoryMapper;
	@Autowired
	ProductCartMapper productCartMapper;
	@Autowired
	ProductDiscountMapper productDiscountMapper;
	
	@Autowired
    private TbCategoryDAO tbCategoryDAO;
	

	@Override
	public ProductItem getProductById(String itemId) {
		ProductItem info = prdInfoMapper.selectByPrimaryKey(itemId);
		logger.info("get puoduct info{}success!",itemId);
		return info;
	}

	@Override
	public List<ProductItem> queryPrdList() {
		return prdInfoMapper.selectByExample(new ProductItemExample());
	}

	@Override
	@Transactional(value = "transactionManager")
	public List<TbCategory> getCatagoryList() {
		//return categoryMapper.selectByExample(new CategoryExample());
		return tbCategoryDAO.findAll();
	}

	@Override
	public List<Subcategory> getSubCatagoryList(String categoryId) {
		SubcategoryExample criteria = new SubcategoryExample();
		criteria.createCriteria().andCategoryIdEqualTo(categoryId);
		return subcategoryMapper.selectByExample(criteria);
	}

	@Override
	public boolean addProductById(String itemId, String category_id, String subcategory_id, String item_name,String description, String thumb, int price, int stock_number, String update_by, String remarks) {
		
		ProductItemExample example = new ProductItemExample();
		example.createCriteria().andItemIdEqualTo(itemId);
		List<ProductItem> list = prdInfoMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(list)) {
			logger.warn("{}-This product is alreday present!",itemId);
			return false;
		}
		
		ProductItem productItem = new ProductItem();
		productItem.setItemId(itemId);
		productItem.setCategoryId(category_id);
		productItem.setSubcategoryId(subcategory_id);
		productItem.setItemName(item_name);
		productItem.setDescription(description);
		productItem.setThumb(thumb);
		productItem.setPrice(price);
		productItem.setStockNumber(stock_number);
		productItem.setUpdateBy(update_by);
		productItem.setRemarks(remarks);
		int result = prdInfoMapper.insertSelective(productItem);
		logger.info("{} add product success！",itemId);
		return result > 0 ? true : false;
	}

	@Override
	public boolean updateProductById(String itemId, String category_id, String subcategory_id, String item_name,String description, String thumb, int price, int stock_number, String update_by, String remarks) {
		
		ProductItemExample example = new ProductItemExample();
		example.createCriteria().andItemIdEqualTo(itemId);
		List<ProductItem> list = prdInfoMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(list)) {
			logger.warn("{}-This product is not present!",itemId);
			return false;
		}
		
		ProductItem productItem = new ProductItem();
		productItem.setItemId(itemId);
		productItem.setCategoryId(category_id);
		productItem.setSubcategoryId(subcategory_id);
		productItem.setItemName(item_name);
		productItem.setDescription(description);
		productItem.setThumb(thumb);
		productItem.setPrice(price);
		productItem.setStockNumber(stock_number);
		productItem.setUpdateBy(update_by);
		productItem.setRemarks(remarks);
		int result = prdInfoMapper.updateByPrimaryKeySelective(productItem);
		logger.info("{} add product success！",itemId);
		return result > 0 ? true : false;
	}

	@Override
	public boolean addCartById(String user_id, String item_id, String item_name, String thumb, int price,int account,String update_by, String remarks) {
		
		ProductCartExample example = new ProductCartExample();
		example.createCriteria().andItemIdEqualTo(item_id).andUserIdEqualTo(user_id);
		List<ProductCart> list = productCartMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(list)) {
			logger.warn("{}-This product is alreday present!",user_id);
			return false;
		}
		
		ProductCart productCart = new ProductCart();
		productCart.setUserId(user_id);
		productCart.setItemId(item_id);
		productCart.setItemName(item_name);
		productCart.setThumb(thumb);
		productCart.setPrice(price);
		productCart.setAccount(account);
		productCart.setUpdateBy(update_by);
		productCart.setRemarks(remarks);
		int result = productCartMapper.insertSelective(productCart);
		logger.info("{} add cart success！",item_id);
		return result > 0 ? true : false;
	}

	@Override
	public boolean updateCartById(String user_id, String item_id, String item_name, String thumb, int price,int account,String update_by, String remarks) {
		
		ProductCartExample example = new ProductCartExample();
		example.createCriteria().andItemIdEqualTo(item_id).andUserIdEqualTo(user_id);
		List<ProductCart> list = productCartMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(list)) {
			logger.warn("{}-This product is not present!",item_id);
			return false;
		}
		
		ProductCart productCart = new ProductCart();
		productCart.setUserId(user_id);
		productCart.setItemId(item_id);
		productCart.setItemName(item_name);
		productCart.setThumb(thumb);
		productCart.setPrice(price);
		productCart.setAccount(account);
		productCart.setUpdateBy(update_by);
		productCart.setRemarks(remarks);
		int result = productCartMapper.updateByPrimaryKeySelective(productCart);
		logger.info("{} add cart success！",item_id);
		return result > 0 ? true : false;
	}

	@Override
	public boolean deleteCartById(String user_id, String item_id) {
		
		ProductCartExample example = new ProductCartExample();
		example.createCriteria().andItemIdEqualTo(item_id).andUserIdEqualTo(user_id);
		List<ProductCart> list = productCartMapper.selectByExample(example);
		if (CollectionUtils.isEmpty(list)) {
			logger.warn("{}-This product is not present!",item_id);
			return false;
		}
		
		ProductCartKey productCartKey = new ProductCartKey();
		productCartKey.setUserId(user_id);
		productCartKey.setItemId(item_id);
		int result = productCartMapper.deleteByPrimaryKey(productCartKey);
		return result > 0 ? true : false;
	}

	@Override
	public List<ProductDiscount> getDiscountPrdList() {
		return productDiscountMapper.selectByExample(new ProductDiscountExample());
	}

	@Override
	public ProductDiscount getDiscountInfoById(String itemId) {
		ProductDiscount info = productDiscountMapper.selectByPrimaryKey(itemId);
		logger.info("get discount puoduct info{}success!",itemId);
		return info;
	}

	@Override
	public boolean addDiscount(String item_id, String item_name, String thumb, String discount_code, String start_date,
			String end_date, String description, String percentage, String update_by, String remarks) {
		
		ProductDiscountExample example = new ProductDiscountExample();
		example.createCriteria().andItemIdEqualTo(item_id);
		List<ProductDiscount> list = productDiscountMapper.selectByExample(example);
		if (CollectionUtils.isNotEmpty(list)) {
			logger.warn("{}-This product is alreday present!",item_id);
			return false;
		}
		
		ProductDiscount productInfo = new ProductDiscount();
		productInfo.setItemId(item_id);
		productInfo.setItemName(item_name);
		productInfo.setThumb(thumb);
		productInfo.setDiscountCode(discount_code);
		productInfo.setStartDate(start_date);
		productInfo.setEndDate(end_date);
		productInfo.setDescription(description);
		productInfo.setPercentage(percentage);
		productInfo.setUpdateBy(update_by);
		productInfo.setRemarks(remarks);
		int result = productDiscountMapper.insertSelective(productInfo);
		logger.info("{} add discount info success！",item_id);
		return result > 0 ? true : false;
	}

}
