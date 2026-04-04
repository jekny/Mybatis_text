package com.hyw.sqlsessionutil;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * ClassName: sessionUtil
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/4 9:37
 * @Version 1.0
 */
//sqlSession工具类
public class sessionUtil {
    private static SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    private static SqlSessionFactory factory = null;
    static {
        try(InputStream in = Resources.getResourceAsStream("mybatis-config.xml")){
            factory = builder.build(in);
        }catch (Exception e){
            e.getMessage();
        }
    }
    public static SqlSession getSqlSession(){
        return factory.openSession();
    }
}
