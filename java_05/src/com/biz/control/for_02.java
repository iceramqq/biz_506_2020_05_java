package com.biz.control;

public class for_02 {
	
	public static void main(String[] args) {
		
		int num1=0;
		
		/*
		 * for(;;) 명령문
		 * {} 사이의 같은 코드를 반복적으로 수행하고자 할때
		 * 사용하는 명령문
		 * 
		 * for(;;) 명령문은 세미콜론을 2개 포함하고 있다
		 * 따라서 최소 2가지의 명령문을 포함하도록 되어 있다
		 * 하지만 ()에 명령문을 포함하지 않으면 
		 * for()명령문은 명령을 무한반복
		 */
		for(;;) {
			
			num1++;
			System.out.println(num1);
			
			
		}
		
	}

}