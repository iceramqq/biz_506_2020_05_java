package com.biz.hello;

public class varString_04 {

	public static void main(String[] args) {
		
		//문자,
		char chart1='a';
		System.out.println(chart1);
		
		int num1=0;// 정수형 변수선언 클리어
		float num2=0.0f;// 실수형 변수선언 클리어
		
		num1=10;
		num2=10.0f;
		System.out.println(num1);
		System.out.println(num2);
		
		//정수형변수 num1에 저장된 값과
		//실수형변수 num2에 저장된 값을 더하여 console에 보여라
		System.out.println(num1+num2);
		/*
		 * 정수형 num1에 담긴 값과
		 * 실수형 num2에 담긴 값을 사칙연산 하면
		 * 먼저num1에 담긴 정수형을 실수형태로 변경하고 사칙연산 수행
		 */
		
		//실수형변수에 정수 30과 40을 덧셈하여 보관
		num2=30+40;
		
		//정수형변수에 정수 30.0과 40.0을 덧셈하여 보관
		num1=(int)(30.0+40.0);
		
		/*
		 * 실수값을 정수행변수에 보관하라는 명령을 내리면
		 * 자바커마파일러는 개발자가 실수한 것이라고 판단
		 * 
		 * 그 이유는 실수값을 정수형변수에 보관하게 되면 소수값을 잘라버림
		 * 따라서 오차가 발생하거나 결과에 문제가 된다고 판단
		 * 
		 * 
		 * 
		 * 
		 */
		
		/*
		 * 숫자를 문자열형변수에 저장 오류
		 * 숫자+문자열, 문자열+숫자 연산을 수행 후 저장을 하면 정상적으로 작동
		 * 숫자3-0을 문자열형으로 변환 문자열 a와 연결하고
		 * str1에 저장
		 * 이때 컴파일에 의해 30이 문자열 "30"으로 변환되는 것으 ㄹ
		 * 형변환이라고 한다 
		 */
		String str1=30+"a";
		
		// 정수 30을 실수형 num3에 저장
		// 정수 30을 실수 30.0으로 변환 후 저장
		// 컴파일러에 의해
		double num3=30;
		
		
		/*
		 * 실수 30.0에 저요수형변수에 저장하라
		 * 이때 컴파일러는 절대 30.0을 정수로 변환하지 않음
		 * 오류발생(type mismatch cannot convert)
		 */
		int num4=(int)30.0f;
		/*
		 * 실수값을 정수형변수에 저장하라는 명령을 만나면
		 * 컴파일러는 ㅏ절대 책임질수 없는 상항이 되어 거부한다
		 * 한지만 개발자가 이경우는 반드시 정수형 값이 필요한 경우
		 * 개발자가 책임진다는 
		 * 
		 * 이러한 코드를 강제변환형이라고 한다
		 * 
		 * 이와 달리 컴파일러가 오류 없이 형변환하는 것을
		 * 자동(묵시적) 형변환이라고 한다
		 * 
		 * 
		 * 변수1=변수2 이런 명령을 만났을때
		 * 오류가 발생활수있는데
		 * 대표적인 오류가 형변환이다
		 */
		
		
		
		
		
	}

}
