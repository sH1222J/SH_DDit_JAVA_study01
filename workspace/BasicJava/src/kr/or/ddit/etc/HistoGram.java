package kr.or.ddit.etc;

import java.util.Random;

public class HistoGram {
	public static void main(String[] args) {
		HistoGram hg = new HistoGram();
		hg.process();
	}
	
	public void process() {
		// 히스토그램 그리기.
		// 주사위 2개의 눈금 합을 히스토 그램으로 나타내시오.
		/*   1000 -> 2 : 10 ■   
		/*   1000 -> 3 : 43 ■ ■ ■ ■   
		 *     2: ■■
		 *     3: ■■
		 *     4: ■■■■
		 *     .
		 *     .
		 *     11: ■■■■
		 *     10: ■■■
		 *     12: ■■
		 * 
		 * 
		 * 
		 */
		int n = 100000;
		int[] roll = roll(n);
		printHistoGram(roll, n);
		
	}
	
	public int oneDice() {
		return new Random().nextInt(6)+1;
	}
	
	public int twoDice() {
		return oneDice()+oneDice();
	}
	
	public int[] roll(int n) {
		int[] result = new int[13];
		for(int i=0; i<n; i++) {
			int dice = twoDice();
			result[dice]++;
		}
		return result;
	}
	
	public void printHistoGram(int[] roll, int n) {
		System.out.println("총 시행횟수 : "+n);
		for(int i=2; i<=12; i++) {
			System.out.print(i+"("+roll[i]+"):\t");
			for(int j=0; j<100*roll[i]/n; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
}
