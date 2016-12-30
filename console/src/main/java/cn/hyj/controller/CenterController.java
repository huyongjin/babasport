package cn.hyj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by huyongjin on 2016/12/30.
 */
@Controller
public class CenterController {
    @RequestMapping(value = "/test/index.do")
    public String index(Model model) {
        return "index";
    }
}
