package main.quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		
		try {
			// abc를 입력하세요!
			int num = scanner.nextInt();		// nextInt는 정수값을 입력받는데, 문자열을 입력하여 에러발생			
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램이 정상 종료되었습니다");
		
		
	}
	
}
