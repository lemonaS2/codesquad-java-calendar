package jang.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner scan = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해 주세요:");
		s1 = scan.next();
		s2 = scan.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		System.out.printf("%d와 %d의 합은 %d입니다.",a,b,a+b);
		scan.close();
	}
	
}
