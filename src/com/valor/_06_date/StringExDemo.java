package com.valor._06_date;

//字符串的操作练习
public class StringExDemo {
	public static void main(String[] args) {

		//test1();
		//test2();
		//test3();
		System.out.println(StringUtil.isBlank(null));
		System.out.println(StringUtil.isBlank(""));
		System.out.println(StringUtil.isBlank("  "));
		System.out.println(StringUtil.isBlank("   A  "));
	
	}

	
	//判读字符串非空
	private static void test3() {
		String str1 = "";
		String str2 = " ";
		String str3 = null;

		String str = " ";
		//判断字符串不为空
		if (str != null && !"".equals(str.trim())) {
			System.out.println("非空");
		} else
			System.out.println("空");
	}

	//获取已hello开头的文件名的后缀名
	private static void test1() {
		String fileName = "abc.java;hello.txt;hello.java;hello.class";

		//分号分割字符串
		String[] names = fileName.split(";");
		for (String name : names) {
			if (name.startsWith("hello")) {
				System.out.println(name);
				name = name.substring(name.lastIndexOf(".") + 1);
				System.out.println(name);
			}
		}
	}

	//单词首字母大写
	private static void test2() {
		String str = "valorCafafsdfs";
		//1.获取第一个字母
		String str2 = str.substring(0, 1).toUpperCase();
		str = str.substring(1);
		System.out.println(str2 + str);
	}
}
