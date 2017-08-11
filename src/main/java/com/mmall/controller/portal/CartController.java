package com.mmall.controller.portal;

import com.mmall.common.Const;
import com.mmall.common.ResponseCode;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * 类说明：
 *
 * @author: Casin
 * @Create: 2017-07-05 15:53
 * @HOME: https://qincasin.github.io/
 */
@Controller
@RequestMapping("/cart/")
public class CartController {



    public ServerResponse add(HttpSession session,Integer count,Integer productId){
        User user =(User)session.getAttribute(Const.CURREANT_USER);
        //处理是否登录
        if(user==null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());
        }
        return null;
    }
}
