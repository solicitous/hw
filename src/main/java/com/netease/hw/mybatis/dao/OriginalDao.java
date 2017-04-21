package com.yscredit.pgp.mybatis.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by YS on 2016/12/12.
 */

public interface OriginalDao {



    /**
     * 根据表格名称和该表的data_uuid返回来源表的Uuid
     * @param dataUuid
     * @param tableName
     * @return
     * @throws Exception
     */
    String queryQriginalData(String dataUuid,String tableName) throws Exception;

}
