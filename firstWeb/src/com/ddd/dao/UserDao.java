package com.ddd.dao;

/**
 * Created by BL06238 on 2016/6/16.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ddd.dao.BaseDao.BaseDaoImpl;
import com.ddd.domain.User;

@Repository
public class UserDao extends BaseDaoImpl{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public UserDao() {
        System.out.println("UserDao");
    }

    public int getMatchCount(String userName, String password) {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        return (Integer) selectOne("getCountByName",user);
    }

    public User findUserByUserName(final String userName) {
        return (User) selectOne("getUserByName",userName);
    }

    public void updateLoginInfo(User user) {
        super.update(user);
    }
}
