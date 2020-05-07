package com.simplemall.micro.serv.common.bean.product;

import java.util.ArrayList;
import java.util.List;

public class SubcategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubcategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSubcategoryIdIsNull() {
            addCriterion("subcategory_id is null");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIdIsNotNull() {
            addCriterion("subcategory_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIdEqualTo(String value) {
            addCriterion("subcategory_id =", value, "subcategoryId");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIdNotEqualTo(String value) {
            addCriterion("subcategory_id <>", value, "subcategoryId");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIdGreaterThan(String value) {
            addCriterion("subcategory_id >", value, "subcategoryId");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("subcategory_id >=", value, "subcategoryId");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIdLessThan(String value) {
            addCriterion("subcategory_id <", value, "subcategoryId");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIdLessThanOrEqualTo(String value) {
            addCriterion("subcategory_id <=", value, "subcategoryId");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIdLike(String value) {
            addCriterion("subcategory_id like", value, "subcategoryId");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIdNotLike(String value) {
            addCriterion("subcategory_id not like", value, "subcategoryId");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIdIn(List<String> values) {
            addCriterion("subcategory_id in", values, "subcategoryId");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIdNotIn(List<String> values) {
            addCriterion("subcategory_id not in", values, "subcategoryId");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIdBetween(String value1, String value2) {
            addCriterion("subcategory_id between", value1, value2, "subcategoryId");
            return (Criteria) this;
        }

        public Criteria andSubcategoryIdNotBetween(String value1, String value2) {
            addCriterion("subcategory_id not between", value1, value2, "subcategoryId");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNameIsNull() {
            addCriterion("subcategory_name is null");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNameIsNotNull() {
            addCriterion("subcategory_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNameEqualTo(String value) {
            addCriterion("subcategory_name =", value, "subcategoryName");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNameNotEqualTo(String value) {
            addCriterion("subcategory_name <>", value, "subcategoryName");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNameGreaterThan(String value) {
            addCriterion("subcategory_name >", value, "subcategoryName");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("subcategory_name >=", value, "subcategoryName");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNameLessThan(String value) {
            addCriterion("subcategory_name <", value, "subcategoryName");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNameLessThanOrEqualTo(String value) {
            addCriterion("subcategory_name <=", value, "subcategoryName");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNameLike(String value) {
            addCriterion("subcategory_name like", value, "subcategoryName");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNameNotLike(String value) {
            addCriterion("subcategory_name not like", value, "subcategoryName");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNameIn(List<String> values) {
            addCriterion("subcategory_name in", values, "subcategoryName");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNameNotIn(List<String> values) {
            addCriterion("subcategory_name not in", values, "subcategoryName");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNameBetween(String value1, String value2) {
            addCriterion("subcategory_name between", value1, value2, "subcategoryName");
            return (Criteria) this;
        }

        public Criteria andSubcategoryNameNotBetween(String value1, String value2) {
            addCriterion("subcategory_name not between", value1, value2, "subcategoryName");
            return (Criteria) this;
        }

        public Criteria andBriefDetailsIsNull() {
            addCriterion("brief_details is null");
            return (Criteria) this;
        }

        public Criteria andBriefDetailsIsNotNull() {
            addCriterion("brief_details is not null");
            return (Criteria) this;
        }

        public Criteria andBriefDetailsEqualTo(String value) {
            addCriterion("brief_details =", value, "briefDetails");
            return (Criteria) this;
        }

        public Criteria andBriefDetailsNotEqualTo(String value) {
            addCriterion("brief_details <>", value, "briefDetails");
            return (Criteria) this;
        }

        public Criteria andBriefDetailsGreaterThan(String value) {
            addCriterion("brief_details >", value, "briefDetails");
            return (Criteria) this;
        }

        public Criteria andBriefDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("brief_details >=", value, "briefDetails");
            return (Criteria) this;
        }

        public Criteria andBriefDetailsLessThan(String value) {
            addCriterion("brief_details <", value, "briefDetails");
            return (Criteria) this;
        }

        public Criteria andBriefDetailsLessThanOrEqualTo(String value) {
            addCriterion("brief_details <=", value, "briefDetails");
            return (Criteria) this;
        }

        public Criteria andBriefDetailsLike(String value) {
            addCriterion("brief_details like", value, "briefDetails");
            return (Criteria) this;
        }

        public Criteria andBriefDetailsNotLike(String value) {
            addCriterion("brief_details not like", value, "briefDetails");
            return (Criteria) this;
        }

        public Criteria andBriefDetailsIn(List<String> values) {
            addCriterion("brief_details in", values, "briefDetails");
            return (Criteria) this;
        }

        public Criteria andBriefDetailsNotIn(List<String> values) {
            addCriterion("brief_details not in", values, "briefDetails");
            return (Criteria) this;
        }

        public Criteria andBriefDetailsBetween(String value1, String value2) {
            addCriterion("brief_details between", value1, value2, "briefDetails");
            return (Criteria) this;
        }

        public Criteria andBriefDetailsNotBetween(String value1, String value2) {
            addCriterion("brief_details not between", value1, value2, "briefDetails");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(String value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(String value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(String value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(String value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLike(String value) {
            addCriterion("category_id like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotLike(String value) {
            addCriterion("category_id not like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<String> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<String> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(String value1, String value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(String value1, String value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}