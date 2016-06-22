package com.ddd;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ddd.dao.UserDaoImpl;
import com.ddd.domain.User;
import com.ddd.service.UserService;

/**
 * Created by BL06238 on 2016/6/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class TestUserService {
    @Autowired
    private UserService userService;

    @Autowired
    private UserDaoImpl userDaoImpl;

    @Test
    public void test_hasMatchUser (){
        boolean b1 = userService.hasMatchUser("admin","123456");
        boolean b2 = userService.hasMatchUser("admin","1111");
        Assert.assertTrue(b1);
        Assert.assertFalse(b2);
    }

    @Test
    public void test_addLoginLog (){
        User user  = userService.findUserByUserName("admin");
        user.setUserName("admin");
        user.setLastIp("192.168.1.1");
        user.setLastVisit(new Date());
        userService.loginSuccess(user);
    }

    @Test
    public void test_update (){
        User user = userService.findUserByUserName("superman");
        user.setLastVisit(new Date());
        user.setLastIp("192.168.1.1");
        userDaoImpl.update(user);
    }


}
