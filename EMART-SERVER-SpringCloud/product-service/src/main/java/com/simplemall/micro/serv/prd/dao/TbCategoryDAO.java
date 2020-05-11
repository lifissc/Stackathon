package com.simplemall.micro.serv.prd.dao;

import com.simplemall.micro.serv.prd.model.TbCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TbCategoryDAO extends JpaRepository<TbCategory,Long>{
	

}
