
package kr.or.ddit.HomeWork01;

import java.util.Date;

public class HomeWork01 {
	public static void main(String[] args) {

		Date date = new Date();

		long time = date.getTime(); // 메서드는 표준시에 따라 지정된 날짜의 시간에 해당하는 숫자 값을 반환(단위 : 밀리초)

		// 밀리초 단위
//		System.out.println(time+"밀리초");

		// 밀리초 -> 초
		long second = time / 1000;
//		System.out.println(second+"초 지났다."); 

		// 초 -> 분
		long min = second / 60;
//		System.out.println(min+"분 "+second+"초 지났다.");

		// 남은 초 계산
		long a = second - min * 60;

		long hour = min / 60;
//		System.out.println(hour+"시간 지났다.");

		// 남은 분 계산
		long b = min - hour * 60;

		long day = hour / 24;
//		System.out.println(day+"일");

		// 남은 시간 계산
		long c = hour - day * 24;

		long Year = day / 365;
		// 남은 일자 계산
		long d = day - Year * 365;

		System.out.println(1970 + Year + "년 " + d + "일 " + c + "시 " + b + "분 " + a + "초 지났습니다.");

//		숙제 : 현재 날짜 시간 알려주는 프로그램 만들기 
//		결과값 : x년 x일 x시 x분 x초 지났습니다.
//		힌트 : 1000초를 분으로 16분 40초(나누기60)
//				10000초를 시간으론 2시간   // 60*60=3600=1시간
//		1년 = 365 * 24 = 8760 시간 * 60 = 525600 분 * 60 = 31536000초
//		60 * 60 = 3600(1분) 3600*60=216000(1시간) 216000*24=5184000(1일) 5184000*365=1892160000(365일)
//		***1000을 나누는 이유는 밀리초(milliseconds) 단위를 초(seconds) 단위로 변환하기 위해

//		System.out.println("년"+"일"+"시"+"분"+"초");

	}

}
