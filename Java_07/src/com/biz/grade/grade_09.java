package com.biz.grade;

import java.util.Random;

public class grade_09 {
	public static void main(String[] args) {

		//int[] intKorScore = new int[100];
		//Random rnd = new Random();

		int num_1 = 0;
		int num_2 = 0;
		for (int i = 1; i < 2; i++) {
			/*
			 * for가 반복 되면서 사용도히는 변수 i를 다른 변수에 부착하여 아래와 같이 사용하면 
			 * num_1=90 이라는 코드로 바꾸어 사용할수 있을
			 * 것 같은데 문법상 이 코드는 num_i라는 변수를 찾는 코드로 변환되어
			 * 
			 * 
			 */
			// num_i=90;
		}

		//정수값을 저장할 배열100개를 생성하라
		int[] intKorScore = new int[100];
		
		//배열 100개에 임의의 점수 51!10까지 값을 채워 넣기
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			intKorScore[i] = rnd.nextInt(50) + 51;
		}
		
		//배열 100개에 담겨있는 값을 intSum변수에 더하여 총점구하기
		int intSum = 0;
		for (int i = 0; i < 100; i++) {
			intSum += intKorScore[i];
		}
		
		//배열 100개에 담겨있는 값을 리스트로 보여주기
		for (int i = 0; i < 100; i++) {
			System.out.println(i+"번째 점수"+intKorScore[i]);
		}
		//계산된 총점과 평균을 콘솔에 보여주기
		System.out.println("총점"+intSum);
		System.out.println("평균"+intSum/100);
		

	}
}