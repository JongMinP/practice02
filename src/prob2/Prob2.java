package prob2;

import java.util.Arrays;
import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		System.out.println( "5개의 숫자를 입력하세요." );
		int [] number = new int[5];
		
		for(int i=0; i< 5; i++) {
			number[i] = scanner.nextInt();
		}
		
		System.out.println("평균은 " + Arrays.stream(number).average().orElse(0.0) + "입니다.");
		
		
		scanner.close();
		
	
	}
}
