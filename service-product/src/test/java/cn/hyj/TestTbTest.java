package cn.hyj;

import cn.hyj.bean.TestTb;
import cn.hyj.service.TestTbService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by huyongjin on 2016/12/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestTbTest {
    @Autowired
//    private TestTbDao testTbDao;
    private TestTbService testTbService;


    @Test
    public void testInsert() {
        TestTb testTb = new TestTb();
        testTb.setName("idea2");
        testTb.setBirthday(new Date());
//        testTbDao.insertTestTb(testTb);
        testTbService.addTestTb(testTb);
    }

}
