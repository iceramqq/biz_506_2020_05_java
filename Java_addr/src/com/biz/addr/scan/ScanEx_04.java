package com.biz.addr.scan;

import java.util.Scanner;

public class ScanEx_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열을 입력 >> ");
		String strInput = scan.nextLine();
		System.out.println("입력된 문자열 : "+strInput);
		
		System.out.println("숫자1 >> ");
		int num1 = scan.nextInt();
		
		System.out.println("숫자2 >> ");
		int num2 = scan.nextInt();
		System.out.printf("%d + %d = %d ",num1 , num2, num1 + num2);
		
		scan.close();
	}
}
