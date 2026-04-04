package com.hyw.mybatistest;

import com.hyw.sqlsessionutil.sessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * ClassName: testDelete
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/4 11:25
 * @Version 1.0
 */
public class testDelete {
    @Test
    public void test01(){
        SqlSession sqlSession = sessionUtil.getSqlSession();
        int count = sqlSession.delete("deletecar1",11);
        if (count == 1) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
