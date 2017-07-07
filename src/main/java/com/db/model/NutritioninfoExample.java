package com.db.model;

import java.util.ArrayList;
import java.util.List;

public class NutritioninfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    public NutritioninfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNrvvalueIsNull() {
            addCriterion("nrvvalue is null");
            return (Criteria) this;
        }

        public Criteria andNrvvalueIsNotNull() {
            addCriterion("nrvvalue is not null");
            return (Criteria) this;
        }

        public Criteria andNrvvalueEqualTo(String value) {
            addCriterion("nrvvalue =", value, "nrvvalue");
            return (Criteria) this;
        }

        public Criteria andNrvvalueNotEqualTo(String value) {
            addCriterion("nrvvalue <>", value, "nrvvalue");
            return (Criteria) this;
        }

        public Criteria andNrvvalueGreaterThan(String value) {
            addCriterion("nrvvalue >", value, "nrvvalue");
            return (Criteria) this;
        }

        public Criteria andNrvvalueGreaterThanOrEqualTo(String value) {
            addCriterion("nrvvalue >=", value, "nrvvalue");
            return (Criteria) this;
        }

        public Criteria andNrvvalueLessThan(String value) {
            addCriterion("nrvvalue <", value, "nrvvalue");
            return (Criteria) this;
        }

        public Criteria andNrvvalueLessThanOrEqualTo(String value) {
            addCriterion("nrvvalue <=", value, "nrvvalue");
            return (Criteria) this;
        }

        public Criteria andNrvvalueLike(String value) {
            addCriterion("nrvvalue like", value, "nrvvalue");
            return (Criteria) this;
        }

        public Criteria andNrvvalueNotLike(String value) {
            addCriterion("nrvvalue not like", value, "nrvvalue");
            return (Criteria) this;
        }

        public Criteria andNrvvalueIn(List<String> values) {
            addCriterion("nrvvalue in", values, "nrvvalue");
            return (Criteria) this;
        }

        public Criteria andNrvvalueNotIn(List<String> values) {
            addCriterion("nrvvalue not in", values, "nrvvalue");
            return (Criteria) this;
        }

        public Criteria andNrvvalueBetween(String value1, String value2) {
            addCriterion("nrvvalue between", value1, value2, "nrvvalue");
            return (Criteria) this;
        }

        public Criteria andNrvvalueNotBetween(String value1, String value2) {
            addCriterion("nrvvalue not between", value1, value2, "nrvvalue");
            return (Criteria) this;
        }

        public Criteria andMeasurementIsNull() {
            addCriterion("measurement is null");
            return (Criteria) this;
        }

        public Criteria andMeasurementIsNotNull() {
            addCriterion("measurement is not null");
            return (Criteria) this;
        }

        public Criteria andMeasurementEqualTo(String value) {
            addCriterion("measurement =", value, "measurement");
            return (Criteria) this;
        }

        public Criteria andMeasurementNotEqualTo(String value) {
            addCriterion("measurement <>", value, "measurement");
            return (Criteria) this;
        }

        public Criteria andMeasurementGreaterThan(String value) {
            addCriterion("measurement >", value, "measurement");
            return (Criteria) this;
        }

        public Criteria andMeasurementGreaterThanOrEqualTo(String value) {
            addCriterion("measurement >=", value, "measurement");
            return (Criteria) this;
        }

        public Criteria andMeasurementLessThan(String value) {
            addCriterion("measurement <", value, "measurement");
            return (Criteria) this;
        }

        public Criteria andMeasurementLessThanOrEqualTo(String value) {
            addCriterion("measurement <=", value, "measurement");
            return (Criteria) this;
        }

        public Criteria andMeasurementLike(String value) {
            addCriterion("measurement like", value, "measurement");
            return (Criteria) this;
        }

        public Criteria andMeasurementNotLike(String value) {
            addCriterion("measurement not like", value, "measurement");
            return (Criteria) this;
        }

        public Criteria andMeasurementIn(List<String> values) {
            addCriterion("measurement in", values, "measurement");
            return (Criteria) this;
        }

        public Criteria andMeasurementNotIn(List<String> values) {
            addCriterion("measurement not in", values, "measurement");
            return (Criteria) this;
        }

        public Criteria andMeasurementBetween(String value1, String value2) {
            addCriterion("measurement between", value1, value2, "measurement");
            return (Criteria) this;
        }

        public Criteria andMeasurementNotBetween(String value1, String value2) {
            addCriterion("measurement not between", value1, value2, "measurement");
            return (Criteria) this;
        }

        public Criteria andRoundingIsNull() {
            addCriterion("rounding is null");
            return (Criteria) this;
        }

        public Criteria andRoundingIsNotNull() {
            addCriterion("rounding is not null");
            return (Criteria) this;
        }

        public Criteria andRoundingEqualTo(String value) {
            addCriterion("rounding =", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingNotEqualTo(String value) {
            addCriterion("rounding <>", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingGreaterThan(String value) {
            addCriterion("rounding >", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingGreaterThanOrEqualTo(String value) {
            addCriterion("rounding >=", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingLessThan(String value) {
            addCriterion("rounding <", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingLessThanOrEqualTo(String value) {
            addCriterion("rounding <=", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingLike(String value) {
            addCriterion("rounding like", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingNotLike(String value) {
            addCriterion("rounding not like", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingIn(List<String> values) {
            addCriterion("rounding in", values, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingNotIn(List<String> values) {
            addCriterion("rounding not in", values, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingBetween(String value1, String value2) {
            addCriterion("rounding between", value1, value2, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingNotBetween(String value1, String value2) {
            addCriterion("rounding not between", value1, value2, "rounding");
            return (Criteria) this;
        }

        public Criteria andContrastmarkIsNull() {
            addCriterion("contrastmark is null");
            return (Criteria) this;
        }

        public Criteria andContrastmarkIsNotNull() {
            addCriterion("contrastmark is not null");
            return (Criteria) this;
        }

        public Criteria andContrastmarkEqualTo(String value) {
            addCriterion("contrastmark =", value, "contrastmark");
            return (Criteria) this;
        }

        public Criteria andContrastmarkNotEqualTo(String value) {
            addCriterion("contrastmark <>", value, "contrastmark");
            return (Criteria) this;
        }

        public Criteria andContrastmarkGreaterThan(String value) {
            addCriterion("contrastmark >", value, "contrastmark");
            return (Criteria) this;
        }

        public Criteria andContrastmarkGreaterThanOrEqualTo(String value) {
            addCriterion("contrastmark >=", value, "contrastmark");
            return (Criteria) this;
        }

        public Criteria andContrastmarkLessThan(String value) {
            addCriterion("contrastmark <", value, "contrastmark");
            return (Criteria) this;
        }

        public Criteria andContrastmarkLessThanOrEqualTo(String value) {
            addCriterion("contrastmark <=", value, "contrastmark");
            return (Criteria) this;
        }

        public Criteria andContrastmarkLike(String value) {
            addCriterion("contrastmark like", value, "contrastmark");
            return (Criteria) this;
        }

        public Criteria andContrastmarkNotLike(String value) {
            addCriterion("contrastmark not like", value, "contrastmark");
            return (Criteria) this;
        }

        public Criteria andContrastmarkIn(List<String> values) {
            addCriterion("contrastmark in", values, "contrastmark");
            return (Criteria) this;
        }

        public Criteria andContrastmarkNotIn(List<String> values) {
            addCriterion("contrastmark not in", values, "contrastmark");
            return (Criteria) this;
        }

        public Criteria andContrastmarkBetween(String value1, String value2) {
            addCriterion("contrastmark between", value1, value2, "contrastmark");
            return (Criteria) this;
        }

        public Criteria andContrastmarkNotBetween(String value1, String value2) {
            addCriterion("contrastmark not between", value1, value2, "contrastmark");
            return (Criteria) this;
        }

        public Criteria andCriticalvalueIsNull() {
            addCriterion("criticalvalue is null");
            return (Criteria) this;
        }

        public Criteria andCriticalvalueIsNotNull() {
            addCriterion("criticalvalue is not null");
            return (Criteria) this;
        }

        public Criteria andCriticalvalueEqualTo(String value) {
            addCriterion("criticalvalue =", value, "criticalvalue");
            return (Criteria) this;
        }

        public Criteria andCriticalvalueNotEqualTo(String value) {
            addCriterion("criticalvalue <>", value, "criticalvalue");
            return (Criteria) this;
        }

        public Criteria andCriticalvalueGreaterThan(String value) {
            addCriterion("criticalvalue >", value, "criticalvalue");
            return (Criteria) this;
        }

        public Criteria andCriticalvalueGreaterThanOrEqualTo(String value) {
            addCriterion("criticalvalue >=", value, "criticalvalue");
            return (Criteria) this;
        }

        public Criteria andCriticalvalueLessThan(String value) {
            addCriterion("criticalvalue <", value, "criticalvalue");
            return (Criteria) this;
        }

        public Criteria andCriticalvalueLessThanOrEqualTo(String value) {
            addCriterion("criticalvalue <=", value, "criticalvalue");
            return (Criteria) this;
        }

        public Criteria andCriticalvalueLike(String value) {
            addCriterion("criticalvalue like", value, "criticalvalue");
            return (Criteria) this;
        }

        public Criteria andCriticalvalueNotLike(String value) {
            addCriterion("criticalvalue not like", value, "criticalvalue");
            return (Criteria) this;
        }

        public Criteria andCriticalvalueIn(List<String> values) {
            addCriterion("criticalvalue in", values, "criticalvalue");
            return (Criteria) this;
        }

        public Criteria andCriticalvalueNotIn(List<String> values) {
            addCriterion("criticalvalue not in", values, "criticalvalue");
            return (Criteria) this;
        }

        public Criteria andCriticalvalueBetween(String value1, String value2) {
            addCriterion("criticalvalue between", value1, value2, "criticalvalue");
            return (Criteria) this;
        }

        public Criteria andCriticalvalueNotBetween(String value1, String value2) {
            addCriterion("criticalvalue not between", value1, value2, "criticalvalue");
            return (Criteria) this;
        }

        public Criteria andEnergyrateIsNull() {
            addCriterion("energyrate is null");
            return (Criteria) this;
        }

        public Criteria andEnergyrateIsNotNull() {
            addCriterion("energyrate is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyrateEqualTo(String value) {
            addCriterion("energyrate =", value, "energyrate");
            return (Criteria) this;
        }

        public Criteria andEnergyrateNotEqualTo(String value) {
            addCriterion("energyrate <>", value, "energyrate");
            return (Criteria) this;
        }

        public Criteria andEnergyrateGreaterThan(String value) {
            addCriterion("energyrate >", value, "energyrate");
            return (Criteria) this;
        }

        public Criteria andEnergyrateGreaterThanOrEqualTo(String value) {
            addCriterion("energyrate >=", value, "energyrate");
            return (Criteria) this;
        }

        public Criteria andEnergyrateLessThan(String value) {
            addCriterion("energyrate <", value, "energyrate");
            return (Criteria) this;
        }

        public Criteria andEnergyrateLessThanOrEqualTo(String value) {
            addCriterion("energyrate <=", value, "energyrate");
            return (Criteria) this;
        }

        public Criteria andEnergyrateLike(String value) {
            addCriterion("energyrate like", value, "energyrate");
            return (Criteria) this;
        }

        public Criteria andEnergyrateNotLike(String value) {
            addCriterion("energyrate not like", value, "energyrate");
            return (Criteria) this;
        }

        public Criteria andEnergyrateIn(List<String> values) {
            addCriterion("energyrate in", values, "energyrate");
            return (Criteria) this;
        }

        public Criteria andEnergyrateNotIn(List<String> values) {
            addCriterion("energyrate not in", values, "energyrate");
            return (Criteria) this;
        }

        public Criteria andEnergyrateBetween(String value1, String value2) {
            addCriterion("energyrate between", value1, value2, "energyrate");
            return (Criteria) this;
        }

        public Criteria andEnergyrateNotBetween(String value1, String value2) {
            addCriterion("energyrate not between", value1, value2, "energyrate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nutritioninfo
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table nutritioninfo
     *
     * @mbggenerated
     */
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