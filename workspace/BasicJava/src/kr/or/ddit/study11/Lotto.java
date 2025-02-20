package kr.or.ddit.study11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Lotto obj = new Lotto();
		obj.process();
	}

	public void process() {
		// 메서드를 호출하여 로또 번호 묶음을 생성 후 출력
		int[][][] bundle = lottoBundle(14000);
		bundlePrint(bundle);
		
	}
	
	// 3차원 배열 bundle을 입력받아 로또 번호를 출력
	public void bundlePrint(int[][][] bundle) {
		for(int[][] paper : bundle) {
			System.out.println("=================================");
			for(int[] lotto : paper) {
				System.out.println(Arrays.toString(lotto));
			}
			System.out.println("=================================");
		}
	}
	
	// 입력한 금액(money)에 따라 로또 번호 묶음을 생성
	// 로또 한 장은 5,000원이며, 1,000원 단위로 추가 구매 가능
	// papers는 로또 묶음 수, 5는 한 묶음당 로또 줄 수, 6은 로또 번호 개수
	// 금액이 5,000원으로 나누어 떨어지지 않으면, 남은 금액에 해당하는 로또 줄을 추가로 생성
	public int[][][] lottoBundle(int money) {
		int papers = money/5000;
		
		if(money%5000 != 0) papers++;
		
		int[][][] bundle = new int[papers][5][6];
		for(int i=0; i<bundle.length; i++) {
			bundle[i] = lottoPaper();
		}
		if(money%5000 != 0) {
			int line = (money%5000)/1000;
			bundle[papers-1] = lottoPaper(line); // 라인에 따라 로또 번호를 생성
		}
		
		return bundle;
	}
	
	public int[][] lottoPaper(int line) {
		int[][] paper = new int[line][6];
		for(int i=0; i<paper.length; i++) {
			paper[i] = generateLotto();
		}
		return paper;
	}
	
	
	public int[][] lottoPaper() {
		return lottoPaper(5);
	}
	
	// 로또 번호 생성 (6개 번호)
	public int[] generateLotto() {
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			int ran = new Random().nextInt(45)+1;
			lotto[i] = ran;
			for(int j = 0; j<i; j++) {
				if(lotto[j] == ran) {
					i--;
					break;
				}
			}
		}
		// 오름차순 정렬
		Arrays.sort(lotto);
		return lotto; 
	}
	
	
	
	public String array2String(int[] array) {
//		[5, 14, 20, 37, 40, 41]
		String str = "(";
		
		for(int i=0; i<array.length; i++) {
			str+=array[i];
			if(i == array.length-1) {
				str+=")";
			}else {
				str+=", ";
			}
		}
		return str;
	}
	
	
}
