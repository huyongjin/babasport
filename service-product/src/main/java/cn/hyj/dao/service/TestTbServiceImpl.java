package cn.hyj.dao.service;

import cn.hyj.bean.TestTb;
import cn.hyj.dao.TestTbDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.TestTbService;

/**
 * Created by huyongjin on 2016/12/30.
 */
@Service
@Transactional
public class TestTbServiceImpl implements TestTbService{
    @Autowired
    private TestTbDao testTbDao;
    @Override
    public void addTestTb(TestTb testTb) {
        testTbDao.insertTestTb(testTb);
//        throw new RuntimeException();
    }
}
