package com.xzy.mybatis.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CatroutehistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CatroutehistoryExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdcatroutehistoryIsNull() {
            addCriterion("idcatRouteHistory is null");
            return (Criteria) this;
        }

        public Criteria andIdcatroutehistoryIsNotNull() {
            addCriterion("idcatRouteHistory is not null");
            return (Criteria) this;
        }

        public Criteria andIdcatroutehistoryEqualTo(Integer value) {
            addCriterion("idcatRouteHistory =", value, "idcatroutehistory");
            return (Criteria) this;
        }

        public Criteria andIdcatroutehistoryNotEqualTo(Integer value) {
            addCriterion("idcatRouteHistory <>", value, "idcatroutehistory");
            return (Criteria) this;
        }

        public Criteria andIdcatroutehistoryGreaterThan(Integer value) {
            addCriterion("idcatRouteHistory >", value, "idcatroutehistory");
            return (Criteria) this;
        }

        public Criteria andIdcatroutehistoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("idcatRouteHistory >=", value, "idcatroutehistory");
            return (Criteria) this;
        }

        public Criteria andIdcatroutehistoryLessThan(Integer value) {
            addCriterion("idcatRouteHistory <", value, "idcatroutehistory");
            return (Criteria) this;
        }

        public Criteria andIdcatroutehistoryLessThanOrEqualTo(Integer value) {
            addCriterion("idcatRouteHistory <=", value, "idcatroutehistory");
            return (Criteria) this;
        }

        public Criteria andIdcatroutehistoryIn(List<Integer> values) {
            addCriterion("idcatRouteHistory in", values, "idcatroutehistory");
            return (Criteria) this;
        }

        public Criteria andIdcatroutehistoryNotIn(List<Integer> values) {
            addCriterion("idcatRouteHistory not in", values, "idcatroutehistory");
            return (Criteria) this;
        }

        public Criteria andIdcatroutehistoryBetween(Integer value1, Integer value2) {
            addCriterion("idcatRouteHistory between", value1, value2, "idcatroutehistory");
            return (Criteria) this;
        }

        public Criteria andIdcatroutehistoryNotBetween(Integer value1, Integer value2) {
            addCriterion("idcatRouteHistory not between", value1, value2, "idcatroutehistory");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andJsonhistoryIsNull() {
            addCriterion("jsonHistory is null");
            return (Criteria) this;
        }

        public Criteria andJsonhistoryIsNotNull() {
            addCriterion("jsonHistory is not null");
            return (Criteria) this;
        }

        public Criteria andJsonhistoryEqualTo(String value) {
            addCriterion("jsonHistory =", value, "jsonhistory");
            return (Criteria) this;
        }

        public Criteria andJsonhistoryNotEqualTo(String value) {
            addCriterion("jsonHistory <>", value, "jsonhistory");
            return (Criteria) this;
        }

        public Criteria andJsonhistoryGreaterThan(String value) {
            addCriterion("jsonHistory >", value, "jsonhistory");
            return (Criteria) this;
        }

        public Criteria andJsonhistoryGreaterThanOrEqualTo(String value) {
            addCriterion("jsonHistory >=", value, "jsonhistory");
            return (Criteria) this;
        }

        public Criteria andJsonhistoryLessThan(String value) {
            addCriterion("jsonHistory <", value, "jsonhistory");
            return (Criteria) this;
        }

        public Criteria andJsonhistoryLessThanOrEqualTo(String value) {
            addCriterion("jsonHistory <=", value, "jsonhistory");
            return (Criteria) this;
        }

        public Criteria andJsonhistoryLike(String value) {
            addCriterion("jsonHistory like", value, "jsonhistory");
            return (Criteria) this;
        }

        public Criteria andJsonhistoryNotLike(String value) {
            addCriterion("jsonHistory not like", value, "jsonhistory");
            return (Criteria) this;
        }

        public Criteria andJsonhistoryIn(List<String> values) {
            addCriterion("jsonHistory in", values, "jsonhistory");
            return (Criteria) this;
        }

        public Criteria andJsonhistoryNotIn(List<String> values) {
            addCriterion("jsonHistory not in", values, "jsonhistory");
            return (Criteria) this;
        }

        public Criteria andJsonhistoryBetween(String value1, String value2) {
            addCriterion("jsonHistory between", value1, value2, "jsonhistory");
            return (Criteria) this;
        }

        public Criteria andJsonhistoryNotBetween(String value1, String value2) {
            addCriterion("jsonHistory not between", value1, value2, "jsonhistory");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCDate("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCDate("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCDate("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andJsonrouteIsNull() {
            addCriterion("jsonRoute is null");
            return (Criteria) this;
        }

        public Criteria andJsonrouteIsNotNull() {
            addCriterion("jsonRoute is not null");
            return (Criteria) this;
        }

        public Criteria andJsonrouteEqualTo(String value) {
            addCriterion("jsonRoute =", value, "jsonroute");
            return (Criteria) this;
        }

        public Criteria andJsonrouteNotEqualTo(String value) {
            addCriterion("jsonRoute <>", value, "jsonroute");
            return (Criteria) this;
        }

        public Criteria andJsonrouteGreaterThan(String value) {
            addCriterion("jsonRoute >", value, "jsonroute");
            return (Criteria) this;
        }

        public Criteria andJsonrouteGreaterThanOrEqualTo(String value) {
            addCriterion("jsonRoute >=", value, "jsonroute");
            return (Criteria) this;
        }

        public Criteria andJsonrouteLessThan(String value) {
            addCriterion("jsonRoute <", value, "jsonroute");
            return (Criteria) this;
        }

        public Criteria andJsonrouteLessThanOrEqualTo(String value) {
            addCriterion("jsonRoute <=", value, "jsonroute");
            return (Criteria) this;
        }

        public Criteria andJsonrouteLike(String value) {
            addCriterion("jsonRoute like", value, "jsonroute");
            return (Criteria) this;
        }

        public Criteria andJsonrouteNotLike(String value) {
            addCriterion("jsonRoute not like", value, "jsonroute");
            return (Criteria) this;
        }

        public Criteria andJsonrouteIn(List<String> values) {
            addCriterion("jsonRoute in", values, "jsonroute");
            return (Criteria) this;
        }

        public Criteria andJsonrouteNotIn(List<String> values) {
            addCriterion("jsonRoute not in", values, "jsonroute");
            return (Criteria) this;
        }

        public Criteria andJsonrouteBetween(String value1, String value2) {
            addCriterion("jsonRoute between", value1, value2, "jsonroute");
            return (Criteria) this;
        }

        public Criteria andJsonrouteNotBetween(String value1, String value2) {
            addCriterion("jsonRoute not between", value1, value2, "jsonroute");
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