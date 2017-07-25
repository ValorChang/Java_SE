package com.valor._05_random;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class RandomCodeDemo {
	public static void main(String[] args) {
		//����һ��5λ�������
		String random = UUID.randomUUID().toString().substring(0, 5);
		System.out.println(random);
		System.out.println("--------------------------------");
		System.out.println("����һ��5λ�������");
		String str = "QWERTYUIOPASDFGHJKLZXCVBNM";

		str += str.toLowerCase();
		str += "0123456789";
		//str += "!@#$%^&*()_+-=?><:{}";
		StringBuilder sb = new StringBuilder(5);
		for (int i = 0; i < 5; i++) {
		char ch = str.charAt(ThreadLocalRandom.current().nextInt(0, str.length()));
		sb.append(ch);
		}
		System.out.println(sb);
	}
}
