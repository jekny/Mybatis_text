package com.hyw.mybatistest;

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
}
