package com.simplemall.micro.serv.prd.mapper;

import com.simplemall.micro.serv.common.bean.product.Category;
import com.simplemall.micro.serv.common.bean.product.CategoryExample;
import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(String categoryId);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(String categoryId);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}