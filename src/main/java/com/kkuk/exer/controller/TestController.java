package com.kkuk.exer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/record")
public class TestController {


	@RequestMapping(value = "/hello")
	public String hello() {
		return "hello"; // return 값은 문자열 => 실제 실행되는 jsp 파일( .jsp 는 작성하지 않음 )
		// hello.jsp가 해야 할 작업 작성 
	}
	
	
	@RequestMapping(value = "/kbo")
	public String kbo(Model model) {
		//kbo.jsp 가 받을 데이터를 model 이라는 객체로 전달
		String rank1 = "LG";
		String rank2 = "SAMSUNG";
		model.addAttribute("rank1", rank1);
		model.addAttribute("rank2", rank2);
		
		
		return "record/kbo"; // return 값은 문자열 => 실제 실행되는 jsp 파일( .jsp 는 작성하지 않음 )
		// .jsp가 해야 할 작업 작성 
	}
}
