package com.simplemall.micro.serv.prd.mapper;

import com.simplemall.micro.serv.common.bean.product.Subcategory;
import com.simplemall.micro.serv.common.bean.product.SubcategoryExample;
import java.util.List;

public interface SubcategoryMapper {
    int deleteByPrimaryKey(String subcategoryId);

    int insert(Subcategory record);

    int insertSelective(Subcategory record);

    List<Subcategory> selectByExample(SubcategoryExample example);

    Subcategory selectByPrimaryKey(String subcategoryId);

    int updateByPrimaryKeySelective(Subcategory record);

    int updateByPrimaryKey(Subcategory record);
}