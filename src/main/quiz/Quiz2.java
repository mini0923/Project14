package main.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		
		String s = null;		
		
		try {
			
			System.out.println(s.length());	// 빈 객체를 참조하여 에러남
			
		} catch (NullPointerException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("프로그램이 정상 종료됩니다.");
		
		
		
		
	}
	
}
