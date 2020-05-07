package com.simplemall.micro.serv.prd.mapper;

import com.simplemall.micro.serv.common.bean.product.ProductItem;
import com.simplemall.micro.serv.common.bean.product.ProductItemExample;
import java.util.List;

public interface ProductItemMapper {
    int deleteByPrimaryKey(String itemId);

    int insert(ProductItem record);

    int insertSelective(ProductItem record);

    List<ProductItem> selectByExample(ProductItemExample example);

    ProductItem selectByPrimaryKey(String itemId);

    int updateByPrimaryKeySelective(ProductItem record);

    int updateByPrimaryKey(ProductItem record);
}