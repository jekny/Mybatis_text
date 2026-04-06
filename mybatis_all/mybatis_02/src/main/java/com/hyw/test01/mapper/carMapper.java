package com.hyw.test01.mapper;

import com.hyw.test01.entity.car;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName: carMapper
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/5 18:14
 * @Version 1.0
 */
public interface carMapper {
    List<car> selectAll(String name);
    List<car> selectLike(String name);//模糊查询

    void insertCar(car car);//返回声明周期内的主键值

    List<car> selectByTwo(@Param(value = "id") int id,@Param(value = "num") String num);//看看两个参数的情况mybatis是如何进行处理的（第一种方式是用map的形式，在mybatis01项目的查询有）
}
