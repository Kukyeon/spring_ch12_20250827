package com.kkuk.exer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {


	@RequestMapping(value = "/hello")
	public String hello() {
		return "hello"; // return 값은 문자열 => 실제 실행되는 jsp 파일( .jsp 는 작성하지 않음 )
		// hello.jsp가 해야 할 작업 작성 
	}
	
}
