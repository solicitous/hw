package com.yscredit.pgp.mybatis.model;

/**
 * Created by YS on 2016/12/9.
 */
public class DataGlobalQualityDetail {
    private int deptCode;
    private float  avgGlobal;

    public DataGlobalQualityDetail(int deptCode, float avgGlobal) {
        this.deptCode = deptCode;
        this.avgGlobal = avgGlobal;
    }

    public DataGlobalQualityDetail() {
    }

    public int getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(int deptCode) {
        this.deptCode = deptCode;
    }

    public float getAvgGlobal() {
        return avgGlobal;
    }

    public void setAvgGlobal(float avgGlobal) {
        this.avgGlobal = avgGlobal;
    }
}
