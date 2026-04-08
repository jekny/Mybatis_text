package com.hyw.test01.mapper;

import com.hyw.test01.entity.car;

import java.util.List;
import java.util.Map;

/**
 * ClassName: carMapper
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/7 18:09
 * @Version 1.0
 */
public interface carMapper {
    List<car> selectDongTaiSql(Map<String, Object>  params);
    List<car> selectDongTaiSql2(Map<String, Object>  params);
    List<car> selectDongTaiSql3(Map<String, Object>  params);
    List<car> selectDongTaiSql4(Map<String, Object>  params);
}
