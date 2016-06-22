package com.ddd.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ddd.dao.BaseDao.BaseDaoImpl;
import com.ddd.domain.LoginLog;

/**
 * Created by BL06238 on 2016/6/16.
 */
@Repository
public class LoginLogDao extends BaseDaoImpl {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog loginLog) {
        create(loginLog);
    }
}
