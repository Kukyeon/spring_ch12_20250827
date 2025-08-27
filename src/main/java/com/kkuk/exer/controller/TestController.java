package com.kkuk.exer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
		model.addAttribute("rank1", rank1); //(view(jsp) 에서 사용하는 데이터 이름 문자열/ object 타입 ->  실제 보내주는 데이터)
		model.addAttribute("rank2", rank2);
		
		
		return "record/kbo"; // return 값은 문자열 => 실제 실행되는 jsp 파일( .jsp 는 작성하지 않음 )
		// .jsp가 해야 할 작업 작성 
	}  // 위와 아래가 같은 방법이지만 표기를 다르게 하는식
		// model 로 하거나, modelandview로 하거나
	  
	@RequestMapping(value = "/mlb")
	public ModelAndView mlb() {
		
		String rank1 = "LA";
		String rank2 = "SF";
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("rank1" , rank1); // model 객체에 데이터 전달하기
		mv.addObject("rank2" , rank2);
		mv.setViewName("record/mlb"); // view의 이름설정
		
		return mv; // 
	}
	
}
