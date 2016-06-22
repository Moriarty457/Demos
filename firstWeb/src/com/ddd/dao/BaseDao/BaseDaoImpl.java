package com.ddd.dao.BaseDao;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseDaoImpl implements BaseDao {
    String resource = "conf.xml";
    InputStream is = BaseDaoImpl.class.getClassLoader().getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);


    public Object selectOne(String statementId, Object obj) {
        SqlSession session = sqlSessionFactory.openSession();
        Object reObj =  session.selectOne(statementId, obj);
        session.close();
        return reObj;
    }

    public void update(Object obj) {
        SqlSession session = sqlSessionFactory.openSession();
        session.update("update",obj);
        session.commit();
        session.close();
    }

    public void create(Object obj) {
        SqlSession session = sqlSessionFactory.openSession();
        session.insert("insert",obj);
        session.commit();
        session.close();
    }


}