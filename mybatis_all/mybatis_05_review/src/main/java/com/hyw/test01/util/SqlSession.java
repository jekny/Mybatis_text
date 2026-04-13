package com.hyw.test01.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName: SqlSession
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/13 8:43
 * @Version 1.0
 */
public class SqlSession {
    private static SqlSessionFactoryBuilder sqlSessionFactoryBuilder = null;
    private static SqlSessionFactory sqlSessionFactory = null;
    static {
        sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = sqlSessionFactoryBuilder.build(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static org.apache.ibatis.session.SqlSession openSqlSession(){
        org.apache.ibatis.session.SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

}
