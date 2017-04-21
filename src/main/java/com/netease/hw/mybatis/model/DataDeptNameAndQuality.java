package com.yscredit.pgp.mybatis.model;

/**
 * Created by YS on 2016/12/10.
 */
public class DataDeptNameAndQuality {
    private String deptName;
    private float avgGlobal;

    public DataDeptNameAndQuality(String deptName, float avgGlobal) {

        this.deptName = deptName;
        this.avgGlobal = avgGlobal;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public float getAvgGlobal() {
        return avgGlobal;
    }

    public void setAvgGlobal(float avgGlobal) {
        this.avgGlobal = avgGlobal;
    }

    public DataDeptNameAndQuality() {
    }
}
