package for_;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 -사용조건
		 -규칙적으로 연산이 이루어지는 경우
		 -동일 코드가 반복되면
		 */
		int i=0,j=0;
		
		for(i = 1; i <= 10; i++) {
			j += i;
		}
		System.out.println(j);
	}
}	
