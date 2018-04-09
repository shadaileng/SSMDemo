package com.qpf.action;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.qpf.model.User;

@Controller
public class HelloContriller {
	
	@RequestMapping("/redirect")
	public String redirect() {
		System.out.println("Success");
		return "success";
	}
	
	@RequestMapping("/json3")
	public void json3(HttpServletResponse response) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("001", 1);
		map.put("002", "2");
		
		String json = JSON.toJSONString(map);
		
		response.getWriter().write(json);
		
		response.getWriter().close();
	}

	@RequestMapping("/json2")
	@ResponseBody
	public String json2() throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("001", 1);
		map.put("002", "2");
		map.put("003", new String[]{"3", "4", "5"});
		
		String json = JSON.toJSONString(map);
		
		return json;
	}

	@RequestMapping("/json1")
	@ResponseBody
	public Object json1() throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("001", 1);
		map.put("002", "2");
		map.put("003", new String[]{"3", "4", "5"});
		map.put("004", Arrays.asList(new User[]{new User(1, "a", 21, 1), new User(1, "b", 22, 0)}));
		
		return map;
	}
	
}
