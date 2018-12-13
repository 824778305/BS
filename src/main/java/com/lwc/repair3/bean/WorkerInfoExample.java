package com.lwc.repair3.bean;

import java.util.ArrayList;
import java.util.List;

public class WorkerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkerInfoExample() {
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

        public Criteria andWorkerIdIsNull() {
            addCriterion("worker_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIsNotNull() {
            addCriterion("worker_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdEqualTo(String value) {
            addCriterion("worker_id =", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotEqualTo(String value) {
            addCriterion("worker_id <>", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThan(String value) {
            addCriterion("worker_id >", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThanOrEqualTo(String value) {
            addCriterion("worker_id >=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThan(String value) {
            addCriterion("worker_id <", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThanOrEqualTo(String value) {
            addCriterion("worker_id <=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLike(String value) {
            addCriterion("worker_id like", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotLike(String value) {
            addCriterion("worker_id not like", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIn(List<String> values) {
            addCriterion("worker_id in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotIn(List<String> values) {
            addCriterion("worker_id not in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdBetween(String value1, String value2) {
            addCriterion("worker_id between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotBetween(String value1, String value2) {
            addCriterion("worker_id not between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIsNull() {
            addCriterion("worker_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIsNotNull() {
            addCriterion("worker_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameEqualTo(String value) {
            addCriterion("worker_name =", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotEqualTo(String value) {
            addCriterion("worker_name <>", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThan(String value) {
            addCriterion("worker_name >", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThanOrEqualTo(String value) {
            addCriterion("worker_name >=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThan(String value) {
            addCriterion("worker_name <", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThanOrEqualTo(String value) {
            addCriterion("worker_name <=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLike(String value) {
            addCriterion("worker_name like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotLike(String value) {
            addCriterion("worker_name not like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIn(List<String> values) {
            addCriterion("worker_name in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotIn(List<String> values) {
            addCriterion("worker_name not in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameBetween(String value1, String value2) {
            addCriterion("worker_name between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotBetween(String value1, String value2) {
            addCriterion("worker_name not between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIsNull() {
            addCriterion("worker_sex is null");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIsNotNull() {
            addCriterion("worker_sex is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerSexEqualTo(Byte value) {
            addCriterion("worker_sex =", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotEqualTo(Byte value) {
            addCriterion("worker_sex <>", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexGreaterThan(Byte value) {
            addCriterion("worker_sex >", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("worker_sex >=", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexLessThan(Byte value) {
            addCriterion("worker_sex <", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexLessThanOrEqualTo(Byte value) {
            addCriterion("worker_sex <=", value, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexIn(List<Byte> values) {
            addCriterion("worker_sex in", values, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotIn(List<Byte> values) {
            addCriterion("worker_sex not in", values, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexBetween(Byte value1, Byte value2) {
            addCriterion("worker_sex between", value1, value2, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerSexNotBetween(Byte value1, Byte value2) {
            addCriterion("worker_sex not between", value1, value2, "workerSex");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusIsNull() {
            addCriterion("worker_status is null");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusIsNotNull() {
            addCriterion("worker_status is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusEqualTo(Byte value) {
            addCriterion("worker_status =", value, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusNotEqualTo(Byte value) {
            addCriterion("worker_status <>", value, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusGreaterThan(Byte value) {
            addCriterion("worker_status >", value, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("worker_status >=", value, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusLessThan(Byte value) {
            addCriterion("worker_status <", value, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusLessThanOrEqualTo(Byte value) {
            addCriterion("worker_status <=", value, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusIn(List<Byte> values) {
            addCriterion("worker_status in", values, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusNotIn(List<Byte> values) {
            addCriterion("worker_status not in", values, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusBetween(Byte value1, Byte value2) {
            addCriterion("worker_status between", value1, value2, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("worker_status not between", value1, value2, "workerStatus");
            return (Criteria) this;
        }

        public Criteria andWorkerLevelIsNull() {
            addCriterion("worker_level is null");
            return (Criteria) this;
        }

        public Criteria andWorkerLevelIsNotNull() {
            addCriterion("worker_level is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerLevelEqualTo(Byte value) {
            addCriterion("worker_level =", value, "workerLevel");
            return (Criteria) this;
        }

        public Criteria andWorkerLevelNotEqualTo(Byte value) {
            addCriterion("worker_level <>", value, "workerLevel");
            return (Criteria) this;
        }

        public Criteria andWorkerLevelGreaterThan(Byte value) {
            addCriterion("worker_level >", value, "workerLevel");
            return (Criteria) this;
        }

        public Criteria andWorkerLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("worker_level >=", value, "workerLevel");
            return (Criteria) this;
        }

        public Criteria andWorkerLevelLessThan(Byte value) {
            addCriterion("worker_level <", value, "workerLevel");
            return (Criteria) this;
        }

        public Criteria andWorkerLevelLessThanOrEqualTo(Byte value) {
            addCriterion("worker_level <=", value, "workerLevel");
            return (Criteria) this;
        }

        public Criteria andWorkerLevelIn(List<Byte> values) {
            addCriterion("worker_level in", values, "workerLevel");
            return (Criteria) this;
        }

        public Criteria andWorkerLevelNotIn(List<Byte> values) {
            addCriterion("worker_level not in", values, "workerLevel");
            return (Criteria) this;
        }

        public Criteria andWorkerLevelBetween(Byte value1, Byte value2) {
            addCriterion("worker_level between", value1, value2, "workerLevel");
            return (Criteria) this;
        }

        public Criteria andWorkerLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("worker_level not between", value1, value2, "workerLevel");
            return (Criteria) this;
        }

        public Criteria andWorkeAmountIsNull() {
            addCriterion("worke_amount is null");
            return (Criteria) this;
        }

        public Criteria andWorkeAmountIsNotNull() {
            addCriterion("worke_amount is not null");
            return (Criteria) this;
        }

        public Criteria andWorkeAmountEqualTo(Integer value) {
            addCriterion("worke_amount =", value, "workeAmount");
            return (Criteria) this;
        }

        public Criteria andWorkeAmountNotEqualTo(Integer value) {
            addCriterion("worke_amount <>", value, "workeAmount");
            return (Criteria) this;
        }

        public Criteria andWorkeAmountGreaterThan(Integer value) {
            addCriterion("worke_amount >", value, "workeAmount");
            return (Criteria) this;
        }

        public Criteria andWorkeAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("worke_amount >=", value, "workeAmount");
            return (Criteria) this;
        }

        public Criteria andWorkeAmountLessThan(Integer value) {
            addCriterion("worke_amount <", value, "workeAmount");
            return (Criteria) this;
        }

        public Criteria andWorkeAmountLessThanOrEqualTo(Integer value) {
            addCriterion("worke_amount <=", value, "workeAmount");
            return (Criteria) this;
        }

        public Criteria andWorkeAmountIn(List<Integer> values) {
            addCriterion("worke_amount in", values, "workeAmount");
            return (Criteria) this;
        }

        public Criteria andWorkeAmountNotIn(List<Integer> values) {
            addCriterion("worke_amount not in", values, "workeAmount");
            return (Criteria) this;
        }

        public Criteria andWorkeAmountBetween(Integer value1, Integer value2) {
            addCriterion("worke_amount between", value1, value2, "workeAmount");
            return (Criteria) this;
        }

        public Criteria andWorkeAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("worke_amount not between", value1, value2, "workeAmount");
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