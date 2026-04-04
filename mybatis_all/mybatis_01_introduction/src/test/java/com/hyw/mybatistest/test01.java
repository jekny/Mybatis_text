package com.hyw.mybatistest;

import com.hyw.sqlsessionutil.sessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.support.Resource;

import java.io.InputStream;

/**
 * ClassName: test01
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/4 9:07
 * @Version 1.0
 */
public class test01 {
    @Test
    public void test01(){
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        try {
            InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory factory = builder.build(in);
            SqlSession sqlSession = factory.openSession();
            int count = sqlSession.insert("carinsert");
            if (count==1){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }
            sqlSession.commit();
            sqlSession.close();
        }catch (Exception e){
            e.getMessage();
        }
    }

    @Test
    public void test02(){
        SqlSession session = sessionUtil.getSqlSession();
        int count = session.insert("carinsert");
        if (count==1){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
        session.commit();
        session.close();
    }
}
