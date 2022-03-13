package com.assignment3;

//Viết chương trình đếm số từ trong một chuỗi. Mỗi từ cách nhau bởi một khoảng trắng (tab, space, ...)
public class Bt3 {
	public static void main(String[] args) {
		String chuoi = "nguyen xuan bach dep trai";
		int count = 1;
		for (int i = 0; i < chuoi.length(); i++) {
			if (Character.isSpace(chuoi.charAt(i))) {
				count++;
			}
		}
		System.out.println("so tu trong chuoi la: " + count);
	}

}
