package com.biz.hello;

public class var_14 {
	
	
	public static void main(String[] args) {
		
		/*
		 *  실수형 변수
		 *  소수점이하 7자리까지 표현
		 */
		float num1 = 10.0f;
		float num2 = 3.0f;
		System.out.println( num1 / num2 );
		
		/*
		 *실수형 변수
		 *소수점이하 17짜리 표현
		 */
	    double num3 = 10.0;
	    double num4 = 3.0;
	    System.out.println(num3 / num4);
	    
	    /*
	     * 정수형 변수
	     * 2워 31승 +- 범위의 정수 취급
	     * (32bi,4byte)t
	     */
	    int num5=1000_000_000;
	    int num6=300;
	    System.out.println(num5*num6);
	    
	    /*
	     *정수형 변수
	     *64bit 크기의 값 취급
	     *2의 63승 +- 범위의 정수 
	     */
	    long num7=1000_000_000_000_000L;
	    long num8=3000L;
	    System.out.println(num7*num8);

	    
	}

}