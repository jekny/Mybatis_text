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
 * @Create 2026/4/5 17:53
 * @Version 1.0
 */
public class sqlSessionUtil {
        private static SqlSessionFactory factory = null;
        static {
                try {
                        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
                        factory =  new SqlSessionFactoryBuilder().build(in);
                } catch (IOException e) {
                        throw new RuntimeException(e);
                }
        }

        public static SqlSession getSqlSession(){
                SqlSession sqlSession = factory.openSession();
                return sqlSession;
        }
}
