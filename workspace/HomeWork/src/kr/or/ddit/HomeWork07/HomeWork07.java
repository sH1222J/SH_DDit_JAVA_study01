package kr.or.ddit.HomeWork07;

import java.util.Scanner;

public class HomeWork07 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork07 obj = new HomeWork07();
		obj.process();
	}

	public void process() {
		// 문자 맞추기 게임
		String[] words = { "airplane", "apple", "bicycle", "cloud", "fruits" };

		int wordSel = (int) (Math.random() * words.length);

		String word = words[wordSel]; // 랜덤 선택
//		System.out.println(word);

		// 문자열 -> 문자 배열
		// toCharArray
		char[] wordChars = word.toCharArray(); // 문자열 -> 문자배열

//		for(int i=0; i<wordChars.length; i++) {
//			System.out.println(wordChars[i]);
//		}

		for (int i = 0; i < 10000; i++) {
			int ran = (int) (Math.random() * wordChars.length); // 첫 번째 문자와 랜덤하게 선택된 위치의 문자를 교환
			//// temp 변수 생성
			// f
			char temp = wordChars[0];
			// f u
			wordChars[0] = wordChars[ran];
			// u f
			wordChars[ran] = temp;
		}

		// 사용자가 정답을 맞추기까지 시도한 횟수를 저장할 변수
		int cnt = 0;
		while (true) {
			// 섞인 문자열을 출력 하고
			// 정답을 맞추세요
			// 정답이 틀린경우 계속 진행
			// 정답을 맞춘경우 반복문 종료 후 몇번 시행 했는지 출력
			//
			System.out.println("섞인 문자열 입력해주세요.");
			String str = sc.nextLine();
			cnt++;

			// 정답 일치시 반복문 스탑
			boolean answer;
			if (answer = word.equals(str))			break;

		}
		System.out.println(cnt + " 번 만에 맞추셨습니다.");

	}
}
