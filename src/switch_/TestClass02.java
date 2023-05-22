package switch_;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String msg;
		System.out.println("문자열입력: ");
		msg = sc.next();
		
		switch(msg) {
		case "안녕":
			System.out.println("안녕 입력");
			break;
		case"하세여":
			System.out.println(msg + "입력");
			break;
		}
		System.out.println("다음문장들 실행");
	}
}
