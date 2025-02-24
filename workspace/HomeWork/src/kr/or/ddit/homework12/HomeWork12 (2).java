package kr.or.ddit.homework12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class HomeWork12 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork12 obj = new HomeWork12();
		obj.process();
	}

	public void process() {
		int money = 100000; 
		Lotto l = new Lotto();
		while(money>0) {
			System.out.println("보유 금액 : "+ money);
			System.out.print("구매할 로또 금액 : ");
			int pay = sc.nextInt();
			
			// 구매 금액 보다 크게 입력 x 
			if(money<pay) {
				System.out.println("보유금액 보다 크게 입력 하셨습니다.");
				System.out.println("보유금액 : "+money);
			}
			// 0 입력시 종료
			if(pay == 0) break;
			// 당첨 번호 한줄 생성 할것 .
			int[] win = l.generateLotto();
			// 로또 번들 에서  당첨 번호랑 같은 값이 있다면
			int[][][] bundle = l.lottoBundle(pay);
			for(int[][] paper : bundle) {
				for(int[] lotto : paper) {
					// 상금 3만원
					if(Arrays.toString(win).equals(Arrays.toString(lotto))) {
						money+=30000;
					}
				}
			}
			
			
		}
	}
	
}
class Lotto {
	Scanner sc = new Scanner(System.in);
	public void bundlePrint(int[][][] bundle) {
		for(int[][] paper : bundle) {
			System.out.println("=================================");
			for(int[] lotto : paper) {
				System.out.println(Arrays.toString(lotto));
			}
			System.out.println("=================================");
		}
	}
	
	
	public int[][][] lottoBundle(int money) {
		int papers = money/5000;
		
		if(money%5000 != 0) papers++;
		
		int[][][] bundle = new int[papers][5][6];
		for(int i=0; i<bundle.length; i++) {
			bundle[i] = lottoPaper();
		}
		if(money%5000 != 0) {
			int line = (money%5000)/1000;
			bundle[papers-1] = lottoPaper(line);
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
	
	public int[] generateLotto() {
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			int ran = new Random().nextInt(8)+1;
			lotto[i] = ran;
			for(int j = 0; j<i; j++) {
				if(lotto[j] == ran) {
					i--;
					break;
				}
			}
		}
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




