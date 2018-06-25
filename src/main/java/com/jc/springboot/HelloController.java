package com.jc.springboot;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jc.dao.UserDao;

//@EnableAutoConfiguration//Spring应用程序上下文的自动配置，把你要的环境准备好
@SpringBootApplication
@RestController//标识该接口返回的全部是json格式的数据
public class HelloController {
	@Resource
	private UserDao UserDao;
    @RequestMapping("index")
    public  String index(){
        return  "success";
    }
    @RequestMapping("getMap")
    public Map<String,Object> getMap(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("name","白");
        map.put("sex","安娜");
        return map;
    }
    
}