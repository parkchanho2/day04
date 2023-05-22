package switch_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String home = null, work = null;
		
		while(true) {
			
	
		System.out.println("1.우리집 등록");
		System.out.println("2.회사 등록");
		System.out.println("3.등록 보기");
		
		i = sc.nextInt();
		
		switch(i) {
		case 1:
			System.out.print("집 등록: ");
			home = sc.next();
			break;
		case 2:
			System.out.print("회사 등록: ");
			work = sc.next();
		case 3:
			System.out.printf("집: %s\n회사:%s \n",home,work);
		}
	  }
	}
}
