package cn.hyj.controller;

import cn.hyj.bean.TestTb;
import cn.hyj.service.TestTbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by huyongjin on 2016/12/30.
 */
@Controller
public class CenterController {
    @Autowired
    private TestTbService testTbService;
    @RequestMapping(value = "/test/index.do")
    public String index(Model model) {

        TestTb testTb = new TestTb();
        testTb.setName("idea dubbo");
        testTb.setBirthday(new Date());
        testTbService.addTestTb(testTb);
        return "index";
    }
}
