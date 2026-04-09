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
 * @Create 2026/4/9 17:19
 * @Version 1.0
 */
public class SqlSession {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = sqlSessionFactoryBuilder.build(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public SqlSession openSqlSession(){
        SqlSession sqlSession = (SqlSession) sqlSessionFactory.openSession();
        return sqlSession;
    }
}
