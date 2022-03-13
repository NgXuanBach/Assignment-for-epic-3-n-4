package com.assignment2;

//2. Viết chương trình liệt kê các phần tử xuất hiện trong mảng đúng 1 lần. (Không cần theo OOP)
public class Bt2 {
	public static void main(String[] args) {
		double[] arrs = { 4, 5, 3, 2, 1.3, 6, 7, 5, 3, 1 };
		System.out.println("cac phan tu xuat hien 1 lan: ");
		for (int i = 0; i < arrs.length; i++) {
			int count = 0;
			for (int j = 0; j < arrs.length; j++) {
				if (arrs[i] == arrs[j] && i != j) {
					count++;
				}
			}

			if (count == 0) {
				System.out.print(arrs[i] + " ");
			}
		}
	}
}
