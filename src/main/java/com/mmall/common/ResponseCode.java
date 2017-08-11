package com.mmall.common;

/**
 * 类说明：
 *
 * @author: Casin
 * @Create: 2017-07-04 10:03
 * @HOME: https://qincasin.github.io/
 */

public enum  ResponseCode {
    SUCCESS(0,"SECCESS"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;

    ResponseCode(int code,String desc){
        this.code=code;
        this.desc=desc;
    }
    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }
}
