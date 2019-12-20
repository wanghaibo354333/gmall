package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsSkuInfo;

import java.util.List;

/**
 * @author wanghaibo
 * @create 2019-12-20 11:18
 */
public interface SkuService {
    void saveSkuInfo(PmsSkuInfo pmsSkuInfo);

    PmsSkuInfo getSkuById(String skuId,String ip);

    List<PmsSkuInfo> getSkuSaleAttrValueListBySpu(String productId);

}
