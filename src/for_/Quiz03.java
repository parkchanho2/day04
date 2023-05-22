package for_;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 =0;
		int s=0, max=0, min=0;
		
		System.out.print("첫번째 수 입력: ");
		num1 = sc.nextInt();
		System.out.print("두번째 수 입력: ");
		num2 = sc.nextInt();
		
		
		if(num1>num2) {max=num1; min=num2;}
		else if(num1<num2) {max=num2; min=num1;}
		else {System.out.println("잘못입력하셨습니다.");}
		
		for(int i = min; i<=max; i++) {
			s+=i;
		}
		System.out.printf("%d 에서 %d 까지의 합: %d", min,max,s);
	}
}
