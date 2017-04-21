package com.yscredit.pgp.mybatis.model;

public class ListInvalidTopEntity {

    private String deptName;
    private String tableName;
    private String invalidTypeName;
    private int invalidRate;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getInvalidTypeName() {
        return invalidTypeName;
    }

    public void setInvalidTypeName(String invalidTypeName) {
        this.invalidTypeName = invalidTypeName;
    }

    public int getInvalidRate() {
        return invalidRate;
    }

    public void setInvalidRate(int invalidRate) {
        this.invalidRate = invalidRate;
    }


}
