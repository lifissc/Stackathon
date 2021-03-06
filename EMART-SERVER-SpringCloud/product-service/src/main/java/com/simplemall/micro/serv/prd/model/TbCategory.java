package com.simplemall.micro.serv.prd.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_category database table.
 * 
 */
@Entity
@Table(name="tb_category")
@NamedQuery(name="TbCategory.findAll", query="SELECT t FROM TbCategory t")
public class TbCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="category_id")
	private String categoryId;

	@Column(name="brief_details")
	private String briefDetails;

	@Column(name="category_name")
	private String categoryName;

	public TbCategory() {
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getBriefDetails() {
		return this.briefDetails;
	}

	public void setBriefDetails(String briefDetails) {
		this.briefDetails = briefDetails;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}