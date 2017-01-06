package cn.hyj;

import cn.hyj.bean.product.BrandQuery;
import cn.hyj.dao.product.BrandDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by huyongjin on 2016/12/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestBrand {
    @Autowired
    private BrandDao brandDao;

    @Test
    public void test() {
        BrandQuery brandQuery = new BrandQuery();
        brandQuery.setName("k");
        System.out.println(brandDao.selectCount(brandQuery));
    }

}
