package com.mmall.test;

/**
 * 类说明：
 *
 * @author: Casin
 * @Create: 2017-07-24 12:22
 * @HOME: https://qincasin.github.io/
 */

class C{
    public Object x;
}


public class test {
    public static void main(String[] args) {
        C obj1 =new C();
        C obj2 = new C();
        obj1.x=obj2;
        obj2.x=obj1;
        System.out.println(obj1+"  "+obj2);

    }

}
