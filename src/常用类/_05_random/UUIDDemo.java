package 常用类._05_random;

import java.util.UUID;

public class UUIDDemo {
	public static void main(String[] args) {
		//用来表示一个随机的字符串
		System.out.println(UUID.randomUUID().toString());
		
		System.out.println(UUID.fromString(UUID.randomUUID().toString()));
	}
}
