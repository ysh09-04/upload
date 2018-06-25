package com.jc.springboot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//全局异常捕获
@ControllerAdvice
public class GlobeExpectionController {
    @ExceptionHandler(RuntimeException.class)//指定异常类型
    @ResponseBody
    public Map<String,Object> error(){
        Map<String,Object> error = new HashMap<String, Object>();
        error.put("Code","500");
        error.put("msg","您的页面走丢了");
        return error;
    }
}