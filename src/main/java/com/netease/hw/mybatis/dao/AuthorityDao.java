package com.yscredit.pgp.mybatis.dao;


import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yscredit.pgp.mybatis.model.User;

/**
 * Created by YScredit on 2016/11/3.
 */
@Repository
public interface AuthorityDao {
    User isSA(String username);

    List<Map<String, String>> getFatherAuth();

    List<Map<String, String>> getSonAuth(String company);

    List<String> getFatherCompany();

    Integer existUser(String userName);

    Integer existCompanyFather(String companName);

    Integer existPhone(String phone);

    String findUserNameByFatherCompany(String company);

    List<Map<String, String>> findAuthByUserName(String userName);
}
