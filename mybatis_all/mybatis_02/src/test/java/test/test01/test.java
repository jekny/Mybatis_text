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
}
