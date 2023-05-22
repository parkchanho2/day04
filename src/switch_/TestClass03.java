package switch_;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		while (true) {
			System.out.println("이름입력");
			System.out.print(">>>: ");
			name = sc.next();
			System.out.println("당신 이름: " + name);
			break;
		}
	}
}
