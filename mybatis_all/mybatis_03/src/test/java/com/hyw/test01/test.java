package com.hyw.test01;

import com.hyw.test01.entity.car;
import com.hyw.test01.mapper.carMapper;
import com.hyw.test01.util.sqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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

    @Test
    public void test02(){
        carMapper mapper =  sqlSessionUtil.openSqlSession().getMapper(carMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("brand","by");
        List<car> cars = mapper.selectDongTaiSql2(map);
        for (car car :
                cars) {
            System.out.println(car);
        }
    }

    @Test
    public void test03(){
        SqlSession sqlsession =  sqlSessionUtil.openSqlSession();
        carMapper mapper = sqlsession.getMapper(carMapper.class);

        Map<String,Object> map = new HashMap<>();
        map.put("brand","byd666");
        map.put("id",4);
        List<car> cars = mapper.selectDongTaiSql3(map);
        sqlsession.commit();
        for (car car :
                cars) {
            System.out.println(car);
        }
        sqlsession.close();

    }

    @Test
    public void test04(){
        SqlSession sqlsession = sqlSessionUtil.openSqlSession();
        carMapper mapper = sqlsession.getMapper(carMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("brand","by");
        map.put("type","油");
        map.put("num","桂");
        List<car> cars = mapper.selectDongTaiSql4(map);
        sqlsession.close();
        for (car car :
                cars) {
            System.out.println(car);
        }
    }

    @Test
    public void test05(){
        SqlSession sqlsession = sqlSessionUtil.openSqlSession();
        carMapper mapper = sqlsession.getMapper(carMapper.class);
        int arr[] = {1,2};
        int count = mapper.deleteSome(arr);
        System.out.println(count);
        sqlsession.commit();
        sqlsession.close();
    }

    @Test
    public void test06(){
        SqlSession sqlsession = sqlSessionUtil.openSqlSession();
        carMapper mapper = sqlsession.getMapper(carMapper.class);
        List<car> cars = new ArrayList<>();
        cars.add(new car(8,"桂a111","byd",12,"2025-09-09","燃油"));
        cars.add(new car(9,"桂a111","byd",12,"2025-09-09","燃油"));
        cars.add(new car(10,"桂a111","byd",12,"2025-09-09","燃油"));
        int count = mapper.insertSome(cars);
        sqlsession.commit();
        sqlsession.close();
        System.out.println(count);
    }
}
