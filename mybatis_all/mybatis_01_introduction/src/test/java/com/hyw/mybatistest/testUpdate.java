package com.hyw.mybatistest;

import com.hyw.entity.car;
import com.hyw.sqlsessionutil.sessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * ClassName: testUpdate
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/4 11:33
 * @Version 1.0
 */
public class testUpdate {
    @Test
    public void test01(){
        car car = new car();
        car.setId(12);
        car.setBrand("改后brand");
        car.setPrice(666);

        SqlSession sqlSession = sessionUtil.getSqlSession();
        int count = sqlSession.update("updatecar1",car);
        if (count==1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
