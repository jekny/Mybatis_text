package mytest;

import com.hyw.test01.entity.Student;
import com.hyw.test01.mapper.StudentMapper;
import com.hyw.test01.util.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * ClassName: test01
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/13 8:54
 * @Version 1.0
 */
public class test01 {
    @Test
    public void test01(){
        org.apache.ibatis.session.SqlSession sqlSession = SqlSession.openSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.selectBySidToCname("202301");
        for (Student stu : students) {
            System.out.println(stu.getClazz().getcname());
        }
    }
}
