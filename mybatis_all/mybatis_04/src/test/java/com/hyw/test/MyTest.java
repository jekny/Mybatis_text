package com.hyw.test;

import com.hyw.test01.entity.Student;
import com.hyw.test01.mapper.studentMapper;
import com.hyw.test01.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: MyTest
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/9 17:32
 * @Version 1.0
 */
public class MyTest {
    @Test
    public void test01(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("id","202301");
        List<Student> students = mapper.selectStudent(map);
        for (Student stu :
                students) {
            System.out.println(stu.toString());
        }
    }

    @Test
    public void test02(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        List<Student> students = mapper.selectAbout("202301");
        for (Student stu :
                students) {
            System.out.println(stu.toString());
        }
    }

    @Test
    public void test03(){
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        studentMapper mapper = sqlSession.getMapper(studentMapper.class);
        List<Student> students =mapper.selectFenBu("202301");
        for (Student stu :
                students) {
            System.out.println(stu.getSid()+" / "+stu.getClazz().getCname());//开启全局懒加载
        }
    }
}
