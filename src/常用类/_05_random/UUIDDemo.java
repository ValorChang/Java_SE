package ������._05_random;

import java.util.UUID;

public class UUIDDemo {
	public static void main(String[] args) {
		//������ʾһ��������ַ���
		System.out.println(UUID.randomUUID().toString());
		
		System.out.println(UUID.fromString(UUID.randomUUID().toString()));
	}
}
