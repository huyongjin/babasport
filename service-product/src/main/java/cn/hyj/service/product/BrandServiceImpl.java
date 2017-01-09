package cn.hyj.service.product;

import cn.hyj.bean.product.Brand;
import cn.hyj.bean.product.BrandQuery;
import cn.hyj.dao.product.BrandDao;
import cn.itcast.common.page.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by huyongjin on 2017/1/6.
 */
@Service("brandService")
@Transactional
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandDao brandDao;

    @Override
    public Pagination selectPaginationByQuery(String name, Integer is_display, Integer pageNo) {
        BrandQuery brandQuery = new BrandQuery();

        brandQuery.setPageNo(Pagination.cpn(pageNo));

        brandQuery.setPageSize(3);

        StringBuilder params = new StringBuilder();

        if (null != name) {
            brandQuery.setName(name);
            params.append("name=").append(name);
        }
        if (null != is_display) {
            brandQuery.setIs_display(is_display);
            params.append("&is_display=").append(is_display);
        } else {
            brandQuery.setIs_display(1);
            params.append("&is_display=").append(1);
        }

        Pagination pagination = new Pagination(
            brandQuery.getPageNo(),
            brandQuery.getPageSize(),
            brandDao.selectCount(brandQuery)
        );

        pagination.setList(brandDao.selectBrandListByQuery(brandQuery));

        String url = "/brand/list.do";

        pagination.pageView(url, params.toString());

        return pagination;
    }

    @Override
    public Brand selectBrandById(Long id) {
        return brandDao.selectBrandById(id);
    }
}
