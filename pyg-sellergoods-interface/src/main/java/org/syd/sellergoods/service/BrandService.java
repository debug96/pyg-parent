package org.syd.sellergoods.service;

import org.syd.pojo.TbBrand;

import java.util.List;

public interface BrandService {

    /**
     * 返回所有商品品牌
     * @return
     */
    public List<TbBrand> findAll();
}
