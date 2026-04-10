package com.hyw.test01.mapper;

import com.hyw.test01.entity.Class;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: clazzMapper
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/9 21:55
 * @Version 1.0
 */
public interface clazzMapper {
    Class selectBycid(@Param("cid") String cid);
}
