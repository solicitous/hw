package com.yscredit.pgp.mybatis.dao.impl;



import com.yscredit.pgp.mybatis.dao.OriginalDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



/**
 * Created by YS on 2016/12/12.
 */
@Repository(value = "queryOriginal")
public class QueryOriginalDaoImpl implements OriginalDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;




    /**
     * 根据表格名称和该表的data_uuid返回来源表的Uuid
     * @param dataUuid
     * @param tableName
     * @return
     * @throws Exception
     */
    @Override
    public String  queryQriginalData(String dataUuid,String tableName) throws Exception {
         String sql="SELECT UUID FROM "+tableName+" WHERE DATA_UUID = ?";
        return jdbcTemplate.queryForObject(sql,String.class,dataUuid);
    }
}
