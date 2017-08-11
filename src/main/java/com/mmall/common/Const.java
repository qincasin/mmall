package com.mmall.common;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * 类说明：常量类
 *
 * @author: Casin
 * @Create: 2017-07-04 10:51
 * @HOME: https://qincasin.github.io/
 */

public class Const {

    public static final String CURREANT_USER="currentUser";

    public static final String EMAIL ="email";

    public static final String USERNAME="username";
    //按照价格来排序接口
    public interface ProductListOrderBy{
        Set<String> PRICE_ASC_DESC= Sets.newHashSet("price_desc","price_asc");
    }

    public interface Cart{
        int CHECKED=1;//即购物车选中状态
        int UN_CHECKED=0;//购物车未选中状态
        String LIMIT_NUM_FAIL="LIMIT_NUM_FAIL"; //限制失败
        String LIMIT_NUM_SUCCESS="LIMIT_NUM_SUCCESS";//限制失败
    }

    public interface Role{
        int ROLE_CUSTOMER=0; //普通用户
        int ROLE_ADMIN=1; //管理员
    }

    //产品前台是否上下架的枚举
    public enum ProductStatusEnum{
        ON_SALE(1,"在线");
        private String value;
        private int code;
        ProductStatusEnum(int code,String value){
            this.code=code;
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        public int getCode() {
            return code;
        }
    }
}
