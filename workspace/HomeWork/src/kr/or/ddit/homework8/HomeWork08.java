package kr.or.ddit.homework8;

import java.util.Scanner;

public class HomeWork08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork08 obj = new HomeWork08();
		obj.process();
	}

	public void process() {
		// 국 영 수 총점 평균 등수
		int[][] scores = 
			{ {90, 80, 70, 0, 0, 1}, 
			  {84, 72, 65, 0, 0, 1},	
			  {87, 99, 42, 0, 0, 1},	
			  {77, 61, 81, 0, 0, 1},	
			  {80, 77, 92, 0, 0, 1}};
		
		// 총점 /평균 구하기.

		
		// 등수 구하기
		
		
		System.out.println("국\t영\t수\t총점\t평균\t등수");
		System.out.println("==========================================");
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("==========================================");
		
		// 등수 별로 정렬하기.
		
		
		
		System.out.println("국\t영\t수\t총점\t평균\t등수");
		System.out.println("==========================================");
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("==========================================");
		
		
		
		
		
	}
}
