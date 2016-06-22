package com.ddd.dao.BaseDao;

/**
 * Created by BL06238 on 2016/6/21.
 */
public interface BaseDao {

    void create(Object object);

//
//    void delete(int id);

    <E> E selectOne(String statementId, Object obj);

    void update(Object obj);

}
