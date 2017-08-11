package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * Created by jiaxing on 2017/7/4.
 */
public interface ICategoryService {
    /*添加品类  即添加节点*/
    ServerResponse addCategory(String categoryName, Integer parentId);

    /*修改品类名字*/
    ServerResponse updateCategoryName(Integer categoryId,String categoryName);

    /*获取品类子节点（平级）*/
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    /*递归查询本节点的id及孩子节点的id*/
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
