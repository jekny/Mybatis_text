package com.hyw.test01.mapper;

import com.hyw.test01.entity.Clazz;
import org.apache.ibatis.annotations.Param;

/**
 * ClassName: ClazzMapper
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/13 9:06
 * @Version 1.0
 */
public interface ClazzMapper {
    Clazz selectByCid(@Param("cid") String cid);
}
