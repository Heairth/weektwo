package com.hth.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CeShi {
	
	@RequestMapping("ceshi.do")
	@ResponseBody
	public int cs(String context,String str,String email,String phone) {
		
		if(Create.isPhone(phone)) {
			System.out.println("手机号正确");
		}else {
			System.out.println("手机号不正确");
		}
		if(Create.isEmail(email)) {
			System.out.println("邮箱格式正确");
		}else {
			System.out.println("邮箱格式不正确");
		}
		if(Create.isNull(str)) {
			return 0;
		}
		return 1;
	}
}
