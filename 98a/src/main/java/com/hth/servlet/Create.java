package com.hth.servlet;

public class Create {
	@SuppressWarnings("null")
	public static boolean isNull(String str) {
		if(str!=null || "null".equals(str) || "".equals(str.trim())) {
			return true;
		}
		return false;
	}
	public static String replace(String context){
		
		if(!isNull(context)){
			context = context.replaceAll("\\\\r\\\\n", "<p></p>");
			context = context.replaceAll("\\\\n", "<br/>");
			return context;
		}
		return "";
	} 
	public static boolean isPhone(String phone) {
		return phone.matches("^1[²»3|5|7|8]\\d{9}$");
	}
	public static boolean isEmail(String email) {
		return email.matches("^\\w+@\\w+(.com|.cn)$");
	}
}
