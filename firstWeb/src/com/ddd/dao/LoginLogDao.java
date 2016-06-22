package com.ddd.dao;

import com.ddd.dao.BaseDao.BaseDao;
import com.ddd.domain.LoginLog;

/**
 * Created by BL06238 on 2016/6/22.
 */
public interface LoginLogDao extends BaseDao {
    void insertLoginLog(LoginLog loginLog);
}
