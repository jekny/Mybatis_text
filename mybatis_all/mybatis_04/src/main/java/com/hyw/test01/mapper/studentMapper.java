package com.hyw.test01.mapper;

import com.hyw.test01.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * ClassName: studentMapper
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/9 17:26
 * @Version 1.0
 */
public interface studentMapper {
    List<Student> selectStudent(Map<String,Object> map);
    List<Student> selectAbout(@Param("id") String id);
}
