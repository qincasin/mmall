package com.mmall.dao;

import com.mmall.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    /*后台商品列表动态分页功能*/
    List<Product> selectList();

    /*通过商品名称和Id搜索商品分页功能*/
    List<Product> selectByNameAndProductId(@Param("productName") String productName,@Param("productId")Integer productId);

    /*通过商品的名字以及多个产品的种类Id查询结果列表*/
    List<Product> selectByNameAndCategoryIds(@Param("productName") String productName,@Param("categoryIdList") List<Integer> categoryIdList);


}