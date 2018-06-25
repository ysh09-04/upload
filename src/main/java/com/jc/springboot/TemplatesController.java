package com.jc.springboot;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplatesController {
	
	@RequestMapping("templates")
	public String templates(Map<String,Object> map){
		map.put("name", "白");
		return "first";
	}
}
