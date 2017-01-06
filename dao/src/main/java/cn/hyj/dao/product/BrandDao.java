package cn.hyj.dao.product;

import cn.hyj.bean.product.Brand;
import cn.hyj.bean.product.BrandQuery;

import java.util.List;

/**
 * Created by huyongjin on 2017/1/6.
 */
public interface BrandDao {
    List<Brand> selectBrandListByQuery(BrandQuery brandQuery);
    Integer selectCount(BrandQuery brandQuery);
}
