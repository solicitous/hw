package com.yscredit.pgp.mybatis.model;

public class TaskInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_info.ID
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_info.TASK_NAME
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    private String taskName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_info.DEPT_CODE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    private Integer deptCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task_info.TASK_TYPE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    private String taskType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_info.ID
     *
     * @return the value of task_info.ID
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_info.ID
     *
     * @param id the value for task_info.ID
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_info.TASK_NAME
     *
     * @return the value of task_info.TASK_NAME
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_info.TASK_NAME
     *
     * @param taskName the value for task_info.TASK_NAME
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_info.DEPT_CODE
     *
     * @return the value of task_info.DEPT_CODE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public Integer getDeptCode() {
        return deptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_info.DEPT_CODE
     *
     * @param deptCode the value for task_info.DEPT_CODE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public void setDeptCode(Integer deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task_info.TASK_TYPE
     *
     * @return the value of task_info.TASK_TYPE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task_info.TASK_TYPE
     *
     * @param taskType the value for task_info.TASK_TYPE
     *
     * @mbggenerated Tue Dec 06 16:15:27 CST 2016
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }
}