package for_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<=9; i++) {
			System.out.println(i + "단");
			
			for(int j=1; j<=9; j++) {
				System.out.println(i +  "x" + j + "=" + i*j);
			}
			System.out.println();
		}
	}
}
