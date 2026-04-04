package com.hyw.mybatistest01;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * ClassName: test01
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/4 8:10
 * @Version 1.0
 */
public class test01 {
    public static void main(String[] args) {
        //1-建造器对象SqlSessionFactoryBuilder,用来创建SqlSessionFactory对象
        //2-工厂对象SqlSessionFactory可以生产SqlSession对象
        //3-SqlSession对象相当与是和数据库的一次会话,用它来执行sql语句

        //1.创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();//创建完一次SqlSessionFactory就没用了

        //2.创建输入流,该流指向mybatis-config.xml配置文件
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("mybatis-config.xml");

        //3.通过SqlSessionFactoryBuilder对象的build方法创建SqlSessionFactory对象
        SqlSessionFactory factory = builder.build(in);

        //4.通过SqlSessionFactory对象获取SqlSession对象
        SqlSession sqlSession = factory.openSession();

        //5.执行sql语句
        int count = sqlSession.insert("carinsert");

        if (count==1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        //看配置文件中,mybatis使用的是JDBC事务管理机制
        //其中jdbc管理机制中默认con.setAutoCommit(false);
        //所以用mybatis是需要手动提交(xx.commit)
        sqlSession.commit();
        sqlSession.close();

    }
}
