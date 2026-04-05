package com.hyw.mybatistest;

import com.hyw.entity.car;
import com.hyw.sqlsessionutil.sessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * ClassName: testSelect
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/5 10:22
 * @Version 1.0
 */
public class testSelect {
    @Test
    public void test01(){
        SqlSession sqlSession = sessionUtil.getSqlSession();
        car carcar = new car();
        carcar.setId(1);
        car car1 = (car)sqlSession.selectOne("selectcar1",carcar);
        System.out.println(car1.toString());
        sqlSession.close();
    }

    @Test
    public void test02(){
        SqlSession sqlSession = sessionUtil.getSqlSession();
        try{
            List<car> objects = sqlSession.selectList("selectcar2", "京A12345");
            System.out.println(objects);
            sqlSession.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
