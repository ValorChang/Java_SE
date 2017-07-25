package ≥£”√¿‡._02_system;

import java.math.BigDecimal;
import java.util.Arrays;

public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] srcArr = { 2, 3, 3, 4, 1, 30, 12 };
		int[] desArr = new int[20];

		System.arraycopy(srcArr, 2, desArr, 2, srcArr.length - 2);

		System.out.println(Arrays.toString(desArr));

		long time1 = System.currentTimeMillis();
		long time2 = System.currentTimeMillis();
		System.out.println(time2 + " " + time1);
	}

}
