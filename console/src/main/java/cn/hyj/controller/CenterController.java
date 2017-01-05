package cn.hyj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by huyongjin on 2016/12/30.
 */
@Controller
@RequestMapping(value = "control")
public class CenterController {

    @RequestMapping(value = "/index.do")
    public String index(Model model) {

        return "index";
    }

    @RequestMapping(value = "/top.do")
    public String top(Model model) {

        return "top";
    }

    @RequestMapping(value = "/main.do")
    public String main(Model model) {

        return "main";
    }

    @RequestMapping(value = "/left.do")
    public String left(Model model) {

        return "left";
    }

    @RequestMapping(value = "/right.do")
    public String right(Model model) {

        return "right";
    }

    @RequestMapping(value = "/frame/product_main.do")
    public String product_main(Model model) {

        return "frame/product_main";
    }

    @RequestMapping(value = "/frame/product_left.do")
    public String product_left(Model model) {

        return "frame/product_left";
    }
}
