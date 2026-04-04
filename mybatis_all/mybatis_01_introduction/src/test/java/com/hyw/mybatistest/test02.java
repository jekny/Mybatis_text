package com.hyw.mybatistest;

import com.hyw.entity.car;
import com.hyw.sqlsessionutil.sessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ClassName: test02
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/4 10:32
 * @Version 1.0
 */
public class test02 {
    @Test
    public void test(){
        SqlSession sqlSession = sessionUtil.getSqlSession();
        Map<String, Object> map = new HashMap<>();
        map.put("id",11);
        map.put("num","jing");
        map.put("brand","byd01");
        map.put("price",20);
        map.put("time","2024-05-05");
        map.put("type","rew");
        int count = sqlSession.insert("carinsert2", map);
        if (count==1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test03(){
        car car1 = new car();
        car1.setId(12);
        car1.setNum("桂222");
        car1.setBrand("宝马");
        car1.setPrice(29);
        car1.setTime("2025-05-23");
        car1.setType("燃油");
        SqlSession sqlSession = sessionUtil.getSqlSession();
        int count = sqlSession.insert("carinsert2", car1);
        if (count == 1) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
