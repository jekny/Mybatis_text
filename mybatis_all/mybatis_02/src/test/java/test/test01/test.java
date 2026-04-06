package test.test01;

import com.hyw.test01.entity.car;
import com.hyw.test01.mapper.carMapper;
import com.hyw.test01.util.sqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * ClassName: test
 * Description:
 *
 * @Author jekny
 * @Create 2026/4/5 18:22
 * @Version 1.0
 */
public class test {
    @Test
    public void test(){
        carMapper mapper = sqlSessionUtil.getSqlSession().getMapper(carMapper.class);
        List<car> car1 = mapper.selectAll("t_car");
        for (car car:car1){
            System.out.println(car.toString());
        }

    }

    @Test
    public void test02(){
        carMapper mapper = sqlSessionUtil.getSqlSession().getMapper(carMapper.class);
        List<car> brand = mapper.selectLike("by");
        for (car car1 :
                brand) {
            System.out.println(car1.toString());
        }
    }

    @Test
    public void test03(){
        SqlSession sqlSession = sqlSessionUtil.getSqlSession();
        carMapper mapper = sqlSession.getMapper(carMapper.class);
        car car1 = new car();
        car1.setId(23);
        car1.setNum("桂455667");
        car1.setBrand("byd");
        car1.setPrice(34.0);
        car1.setTime("2023-02-12");
        car1.setType("电");
        mapper.insertCar(car1);
        sqlSession.commit();

        System.out.println(car1.getId());

        sqlSession.close();
    }

    @Test
    public void test04(){
        carMapper mapper = sqlSessionUtil.getSqlSession().getMapper(carMapper.class);
        List<car> cars = mapper.selectByTwo(12, "桂222");
        for (car car1 :
                cars) {
            System.out.println(car1.toString());
        }
    }
}
