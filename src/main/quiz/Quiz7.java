package main.quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class Quiz7 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		Iterator<Integer> iterator = set.iterator();
		try {
			
			int num1 = iterator.next();
			int num2 = iterator.next();
			int num3 = iterator.next();
			int num4 = iterator.next();		// Set에 더이상꺼낼 요소가 없어 에러발생
					
		} catch (NoSuchElementException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
	}
	
}
