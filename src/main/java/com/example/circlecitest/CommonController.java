package com.example.circlecitest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

	@GetMapping("/")
	public Map<String,String> list(){
		Map<String, String> map = new HashMap<String,String>();
		
		Random rnd = new Random();
		for(int i= 0; i < 100; i++) {
			String randomStr = String.valueOf((char) ((int) (rnd.nextInt(26)) + 65));
			map.put((i+1)+"", randomStr);
		}
		return map;
	}
}