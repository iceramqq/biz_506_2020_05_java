package com.biz.hello;

import java.util.Random;

public class var_01 {
	public static void main(String[] args) {
		Random rnd=new Random();
		int num=rnd.nextInt(100)+1;
		if(num%3==0) {
			System.out.println(num+"는 3의 배수");
		}
		if(num%5==0) {
			System.out.println(num+"는 5의 배수");
		}
		
			
	}

}
