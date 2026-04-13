package com.hyw.test01.mapper;

import com.hyw.test01.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: StudentMapper
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/13 8:37
 * @Version 1.0
 */
public interface StudentMapper {
    List<Student> selectBySid(@Param("sid") String sid);
    List<Student> selectBySidToCname(@Param("sid") String sid);
}
