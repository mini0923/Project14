package main.quiz;

public class Quiz4 {
	
	public static void main(String[] args) {
		
		String str = "1.23";
		try {
			// parseInt(): 문자열 -> 숫자변환
			int num = Integer.parseInt(str);	// 실수형을 정수형으로 변환하려고해서 에러남
			
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
