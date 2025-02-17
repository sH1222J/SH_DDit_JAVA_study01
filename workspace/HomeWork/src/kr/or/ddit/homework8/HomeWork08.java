package kr.or.ddit.homework8;

import java.util.Scanner;

public class HomeWork08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork08 obj = new HomeWork08();
		obj.process();
	}

	/*
	 * 배열 이용 length() : 문자열의 길이를 알려 할 때
	 * 
	 */

	public void process() {
		// 국 영 수 총점 평균 등수
		int[][] scores = 
			{ {90, 80, 70, 0, 0, 1}, 
			  {84, 72, 65, 0, 0, 1},	
			  {87, 99, 42, 0, 0, 1},	
			  {77, 61, 81, 0, 0, 1},	
			  {80, 77, 92, 0, 0, 1}};
		
		// *** 총점 /평균 구하기. *** // 
		for (int i = 0; i < scores.length; i++) {
			scores[i][3] = scores[i][0] + scores[i][1] + scores[i][2];
			scores[i][4] = scores[i][3] / 3;

		}
		
		
		
//		for(int i=0; i<scores.length;i++) {
//			int avg=0;
//			for(int j=0 ; j<3 ; j++) {
//				avg += scores[i][j];
//			}
//			scores[i][3]=avg;
//			scores[i][4]=avg/3;
//			
//		}

		
		// *** 등수 구하기 *** //
		for(int i=0; i<scores.length;i++) {
			for(int j=0; j<scores.length;j++) {
				if(scores[i][3]<scores[j][3]) {
					scores[i][5]++;
				}
			
			
		
		
		
		
		
		
//		for (int i = 0; i < scores.length; i++) {
//			for (int j = 0; j < scores.length; j++) {
//				if (scores[i][3] > scores[j][3]) {
//					scores[j][5]++;
//
//				}
//			}
		}
		
		System.out.println("국\t영\t수\t총점\t평균\t등수");
		System.out.println("==========================================");
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("==========================================");
		
		// 등수 별로 정렬하기. //
		for(int i=0;i<scores.length-1;i++) {
			for(int j=0;j<scores.length-1;j++) {
				if(scores[j][5]<scores[j+1][5])
					int[] temp=scores[j];
				
					scores[j+1]=temp;
			}
			
		}
		
		
		

//		for (int i = 0; i < scores.length - 1; i++) {
//			for (int j = i + 1; j < scores.length; j++) {
//				if (scores[i][5] > scores[j][5]) { // 등수 비교 (숫자가 작을수록 높은 등수)
//					// temp 배열을 사용해 전체 행 교환
//					int[] temp = scores[i];
//					scores[i] = scores[j];
//					scores[j] = temp;
//				}
//			}
//		}
		
		
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
