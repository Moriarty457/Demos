package com.ddd.dao;

import org.springframework.stereotype.Repository;

import com.ddd.dao.BaseDao.BaseDaoImpl;
import com.ddd.domain.LoginLog;

/**
 * Created by BL06238 on 2016/6/16.
 */
@Repository
public class LoginLogDaoImpl extends BaseDaoImpl implements LoginLogDao{

    public void insertLoginLog(LoginLog loginLog) {
        create(loginLog);
    }
}
