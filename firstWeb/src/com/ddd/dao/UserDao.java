package com.ddd.dao;

import com.ddd.dao.BaseDao.BaseDao;
import com.ddd.domain.User;

/**
 * Created by BL06238 on 2016/6/22.
 */
public interface UserDao extends BaseDao{
     int getMatchCount(String userName, String password);

     User findUserByUserName(final String userName);

     void updateLoginInfo(User user);
}
