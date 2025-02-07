package kr.or.ddit.HomeWork04;

import java.util.Scanner;

public class HomeWork4 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork4 obj = new HomeWork4();
		obj.process();

	}

	public void process() {
//		가위(0) 바위(1) 보(2)
//		컴퓨터(랜덤한 0~2)
//		출력
//		나 : 가위 , 컴퓨터 : 보
//		결과 : 이겼다.
//		if문 이용
		/*
		 * 경우의수 : 
		 */
		
		System.out.println("가위바위보 시작! 가위[0] 바위[1] 보[2] 중 원하는 숫자를 입력해주세요. :");
		int user = sc.nextInt();
		int bot = (int) (Math.random() * 3);
		
//		플레이어 안내메시지
		if(user==0) {
			System.out.println("가위를 선택하셨군요.");
		}
		else if(user==1) {
			System.out.println("바위를 선택하셨군요.");
		}
		else if(user==2) {
			System.out.println("보를 선택하셨군요.");
		}
//		봇이 낸 가위바위보
		if(bot==0) {
			System.out.println("봇 : 가위");
		}
		else if(bot==1) {
			System.out.println("봇 : 바위");
		}
		else if(bot==2) {
			System.out.println("봇 : 보");
		}
//		결과로직
		if(user>bot && !(user==2 && bot ==0)) {
			System.out.println( "승리하셨습니다.");
		}
		else if(user<bot) {
			System.out.println( "패배하셨습니다.");
		}
		else if(user==bot) {
			System.out.println( "비겼습니다.");
		}
		else if(user==2 && bot==0) {
			System.out.println( "패배하셨습니다.");
		}
		else if(user==0 && bot==2) {
			System.out.println( "승리하셨습니다.");
		}

	}
}
