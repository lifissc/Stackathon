package com.simplemall.micro.serv.prd.mapper;

import com.simplemall.micro.serv.common.bean.product.ProductCart;
import com.simplemall.micro.serv.common.bean.product.ProductCartExample;
import com.simplemall.micro.serv.common.bean.product.ProductCartKey;
import java.util.List;

public interface ProductCartMapper {
    int deleteByPrimaryKey(ProductCartKey key);

    int insert(ProductCart record);

    int insertSelective(ProductCart record);

    List<ProductCart> selectByExample(ProductCartExample example);

    ProductCart selectByPrimaryKey(ProductCartKey key);

    int updateByPrimaryKeySelective(ProductCart record);

    int updateByPrimaryKey(ProductCart record);
}