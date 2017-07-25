package com.valor._07_regex;

public class RegexDemo {
	public static void main(String[] args) {
		String input = "111232311111";
		
		System.out.println(input.matches("\\d*"));
	}


}
