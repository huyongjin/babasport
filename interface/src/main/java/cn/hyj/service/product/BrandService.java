package cn.hyj.service.product;

import cn.hyj.bean.product.Brand;
import cn.itcast.common.page.Pagination;

/**
 * Created by huyongjin on 2017/1/6.
 */
public interface BrandService {
    Pagination selectPaginationByQuery(String name, Integer is_display, Integer pageNo);
    Brand selectBrandById(Long id);
}
