package com.ddd;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.ddd.domain.User;

/**
 * Created by BL06238 on 2016/6/21.
 */
public class MybatisTest {


    @Test
    public void test_mybatis (){
        String resource = "conf.xml";
        InputStream is = MybatisTest.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sqlSessionFactory.openSession();

        String statement = "getUserById";
        User user = (User) session.selectOne(statement,2);
        System.out.println(user);
    }

}
