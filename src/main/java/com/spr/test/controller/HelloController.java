package com.spr.test.controller;

import com.spr.test.bean.response.CommonResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ------------------------------------------------
 * Class HelloController
 *
 * @author Glan <glanlv@can-dao.com>
 * @description 描述内容
 * @date 2022-03-28
 * ------------------------------------------------
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    
    private Boolean param = true;
    
    private static String STATIC_PARAM = "static_param";
    
    @GetMapping("/world")
    public CommonResponse world(){
        param = false;
        return new CommonResponse();
    }
    
    
}
