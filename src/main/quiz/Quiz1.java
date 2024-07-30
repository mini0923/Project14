package main.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		try {
			int num = 5/0;	
		} catch (Exception e) {
			System.out.println(e.getMessage());		// 에러메세지만 출력
			e.printStackTrace();	// 에러메시지와 에러의 위치를 함께 출력
		}
		System.out.println("프로그램이 정상 종료됩니다.");
	}
	
}
