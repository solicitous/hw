package com.yscredit.pgp.mybatis.dao.param;

import java.util.Date;
import java.util.List;

/**
 * Created by YScredit on 2016/12/9.
 */
public class StatisticInfoParam {
    private List<Integer> taskInfoIds;
    private Integer deptCode;
    private Date startTime;
    private Date endTime;

    public List<Integer> getTaskInfoIds() {
        return taskInfoIds;
    }

    public void setTaskInfoIds(List<Integer> taskInfoIds) {
        this.taskInfoIds = taskInfoIds;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(Integer deptCode) {
        this.deptCode = deptCode;
    }
}
