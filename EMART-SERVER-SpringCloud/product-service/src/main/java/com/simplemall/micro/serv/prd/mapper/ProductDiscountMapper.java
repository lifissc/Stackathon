package com.simplemall.micro.serv.prd.mapper;

import com.simplemall.micro.serv.common.bean.product.ProductDiscount;
import com.simplemall.micro.serv.common.bean.product.ProductDiscountExample;
import java.util.List;

public interface ProductDiscountMapper {
    int deleteByPrimaryKey(String itemId);

    int insert(ProductDiscount record);

    int insertSelective(ProductDiscount record);

    List<ProductDiscount> selectByExample(ProductDiscountExample example);

    ProductDiscount selectByPrimaryKey(String itemId);

    int updateByPrimaryKeySelective(ProductDiscount record);

    int updateByPrimaryKey(ProductDiscount record);
}