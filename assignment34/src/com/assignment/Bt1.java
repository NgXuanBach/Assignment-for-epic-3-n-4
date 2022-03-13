package com.assignment;

//1. Viêìt chıõng triÌnh chuyêÒn ğôÒi sôì thâòp phân sang nhiò phân. (Không câÌn theo OOP)
public class Bt1 {
	public static void main(String[] args) {
		int soNhiPhan = 10;
		int surplus;
		int ketqa = 0;
		int i = 0;
		while (soNhiPhan != 0) {
			surplus = soNhiPhan % 2;
			ketqa = (int) ((int) ketqa + surplus * Math.pow(10, i));
			soNhiPhan /= 2;
			i++;
		}
		System.out.println(ketqa);

	}

}
