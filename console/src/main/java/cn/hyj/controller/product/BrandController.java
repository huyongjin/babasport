package cn.hyj.controller.product;

import cn.hyj.bean.product.Brand;
import cn.hyj.service.product.BrandService;
import cn.itcast.common.page.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by huyongjin on 2017/1/6.
 */
@Controller
@RequestMapping(value = "/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @RequestMapping(value = "/list.do")
    public String list(String name, Integer is_display, Integer pageNo, Model model) {
        Pagination pagination = brandService.selectPaginationByQuery(name,is_display,pageNo);
        model.addAttribute("name",name);
        model.addAttribute("pagination",pagination);
        if (null != is_display) {
            model.addAttribute("is_display",is_display);
        } else {
            model.addAttribute("is_display",1);
        }

        return "brand/list";
    }

    @RequestMapping(value = "/toEdit.do")
    public String toEdit(Long id, Model model) {

        Brand brand = brandService.selectBrandById(id);
        model.addAttribute("brand",brand);

        return "brand/edit";
    }
}
