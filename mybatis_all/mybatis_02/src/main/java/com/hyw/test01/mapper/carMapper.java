package com.hyw.test01.mapper;

import com.hyw.test01.entity.car;

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
}
