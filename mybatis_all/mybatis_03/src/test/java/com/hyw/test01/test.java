package com.hyw.test01;

import com.hyw.test01.entity.car;
import com.hyw.test01.mapper.carMapper;
import com.hyw.test01.util.sqlSessionUtil;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName: test
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/7 18:34
 * @Version 1.0
 */
public class test {
    @Test
    public void test01(){
        carMapper mapper =  sqlSessionUtil.openSqlSession().getMapper(carMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("brand","by");
        List<car> cars = mapper.selectDongTaiSql(map);
        for (car car :
                cars) {
            System.out.println(car);
        }
    }
}
