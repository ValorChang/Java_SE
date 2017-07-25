package com.valor._05_random;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random r1 = new Random();
		/*System.out.println(r1.nextBoolean());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextLong());*/
		System.out.println(r1.nextInt(197 - 34) + 34);
	}
}
