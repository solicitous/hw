package com.yscredit.pgp.mybatis.model;

import java.util.Date;

public class DataQualityDetail {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * data_quality_detail.ID
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * data_quality_detail.DEPT_CODE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    private Integer deptCode;

    private String dataInfoCode;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * data_quality_detail.CREATE_DATE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * data_quality_detail.EXACT
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    private Integer exact;//准确性

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * data_quality_detail.FULL
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    private Integer full;//完整性

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * data_quality_detail.STANDARD
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    private Integer standard;//规范性

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * data_quality_detail.UNIQUENESS
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    private Integer uniqueness;//唯一性

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * data_quality_detail.RELEVANCE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    private Integer relevance;//关联性

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column
     * data_quality_detail.GLOBAL
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    private Integer global;//全局质量分析

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column data_quality_detail.ID
     *
     * @return the value of data_quality_detail.ID
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database
     * column data_quality_detail.ID
     *
     * @param id the value for data_quality_detail.ID
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column data_quality_detail.DEPT_CODE
     *
     * @return the value of data_quality_detail.DEPT_CODE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public Integer getDeptCode() {
        return deptCode;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database
     * column data_quality_detail.DEPT_CODE
     *
     * @param deptCode the value for data_quality_detail.DEPT_CODE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public void setDeptCode(Integer deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column data_quality_detail.CREATE_DATE
     *
     * @return the value of data_quality_detail.CREATE_DATE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database
     * column data_quality_detail.CREATE_DATE
     *
     * @param createDate the value for data_quality_detail.CREATE_DATE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column data_quality_detail.EXACT
     *
     * @return the value of data_quality_detail.EXACT
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public Integer getExact() {
        return exact;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database
     * column data_quality_detail.EXACT
     *
     * @param exact the value for data_quality_detail.EXACT
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public void setExact(Integer exact) {
        this.exact = exact;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column data_quality_detail.FULL
     *
     * @return the value of data_quality_detail.FULL
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public Integer getFull() {
        return full;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database
     * column data_quality_detail.FULL
     *
     * @param full the value for data_quality_detail.FULL
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public void setFull(Integer full) {
        this.full = full;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column data_quality_detail.STANDARD
     *
     * @return the value of data_quality_detail.STANDARD
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public Integer getStandard() {
        return standard;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database
     * column data_quality_detail.STANDARD
     *
     * @param standard the value for data_quality_detail.STANDARD
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column data_quality_detail.UNIQUENESS
     *
     * @return the value of data_quality_detail.UNIQUENESS
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public Integer getUniqueness() {
        return uniqueness;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database
     * column data_quality_detail.UNIQUENESS
     *
     * @param uniqueness the value for data_quality_detail.UNIQUENESS
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public void setUniqueness(Integer uniqueness) {
        this.uniqueness = uniqueness;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column data_quality_detail.RELEVANCE
     *
     * @return the value of data_quality_detail.RELEVANCE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public Integer getRelevance() {
        return relevance;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database
     * column data_quality_detail.RELEVANCE
     *
     * @param relevance the value for data_quality_detail.RELEVANCE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public void setRelevance(Integer relevance) {
        this.relevance = relevance;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column data_quality_detail.GLOBAL
     *
     * @return the value of data_quality_detail.GLOBAL
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public Integer getGlobal() {
        return global;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database
     * column data_quality_detail.GLOBAL
     *
     * @param global the value for data_quality_detail.GLOBAL
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public void setGlobal(Integer global) {
        this.global = global;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database
     * column data_quality_detail.RELEVANCE
     *
     * @return the value of data_quality_detail.DATA_INFO_CODE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public String getDataInfoCode() {
        return dataInfoCode;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database
     * column data_quality_detail.GLOBAL
     *
     * @param dataInfoCode the value for data_quality_detail.GLOBAL
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public void setDataInfoCode(String dataInfoCode) {
        this.dataInfoCode = dataInfoCode;
    }


}