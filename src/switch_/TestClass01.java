package switch_;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		  switch(값){
		  case식1: 종속문장. break;
		  case식2: 종속문장. break;
		  default: 종속문장
		  }
		 */
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("수 입력: ");
		num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("1입력");
			//break;
		case 2:
			System.out.println("2입력");
			//break;
		default:
			System.out.println("그외의 값");
		}
		System.out.println("다음 문장들 실행");
	}
}
