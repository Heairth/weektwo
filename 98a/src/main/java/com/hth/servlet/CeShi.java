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
			System.out.println("�ֻ�����ȷ");
		}else {
			System.out.println("�ֻ��Ų���ȷ");
		}
		if(Create.isEmail(email)) {
			System.out.println("�����ʽ��ȷ");
		}else {
			System.out.println("�����ʽ����ȷ");
		}
		if(Create.isNull(str)) {
			return 0;
		}
		return 1;
	}
}
