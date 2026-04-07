package com.hyw.test01.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName: sqlSessionUtil
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/7 18:10
 * @Version 1.0
 */
public class sqlSessionUtil {
        private static SqlSessionFactory factory = null;
        static {
                SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
                try {
                        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
                        factory = builder.build(in);
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        public static SqlSession openSqlSession(){
                SqlSession sqlSession = factory.openSession();
                return sqlSession;
        }
}
