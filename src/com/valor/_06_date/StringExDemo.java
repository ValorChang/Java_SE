package com.valor._06_date;

//�ַ����Ĳ�����ϰ
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

	
	//�ж��ַ����ǿ�
	private static void test3() {
		String str1 = "";
		String str2 = " ";
		String str3 = null;

		String str = " ";
		//�ж��ַ�����Ϊ��
		if (str != null && !"".equals(str.trim())) {
			System.out.println("�ǿ�");
		} else
			System.out.println("��");
	}

	//��ȡ��hello��ͷ���ļ����ĺ�׺��
	private static void test1() {
		String fileName = "abc.java;hello.txt;hello.java;hello.class";

		//�ֺŷָ��ַ���
		String[] names = fileName.split(";");
		for (String name : names) {
			if (name.startsWith("hello")) {
				System.out.println(name);
				name = name.substring(name.lastIndexOf(".") + 1);
				System.out.println(name);
			}
		}
	}

	//��������ĸ��д
	private static void test2() {
		String str = "valorCafafsdfs";
		//1.��ȡ��һ����ĸ
		String str2 = str.substring(0, 1).toUpperCase();
		str = str.substring(1);
		System.out.println(str2 + str);
	}
}
