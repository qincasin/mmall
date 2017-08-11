package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;
import com.mmall.vo.ProductDetailVo;

/**
 * 类说明：
 *
 * @author: Casin
 * @Create: 2017-07-05 9:06
 * @HOME: https://qincasin.github.io/
 */

public interface IProductService{
    /*新增Or更新产品*/
    ServerResponse saveOrUpdateProduct(Product product);
    /*产品上下架状态*/
    ServerResponse<String> setSaleStatus(Integer productId,Integer status);
    /*获取产品详情*/
    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);
    /*后台商品列表动态分页功能*/
    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);
    /*后台商品搜索功能开发*/
    ServerResponse<PageInfo> searchProduct(String productName,Integer productId,int pageNum,int pageSize);
    /*前台获取产品详情*/
    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);
    /*前台索索以及动态排序的实现*/
    ServerResponse<PageInfo> getProductByKeywordCategory(String keyword,Integer categoryId,int pageNum,int pageSize,String orderBy);
}
