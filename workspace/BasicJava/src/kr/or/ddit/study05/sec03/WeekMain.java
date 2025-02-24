package kr.or.ddit.study05.sec03;

public class WeekMain {
	public static void main(String[] args) {
		WeekMain wm = new WeekMain();
		wm.process();
	}
	
	public void process() {
		week(Week.MON);
	}
	
	public void week(Week day) {
//		if(Week.SUN == day) System.out.println("일요일");
//		if(Week.MON == day) System.out.println("월요일");
//		if(Week.TUE == day) System.out.println("화요일");
//		if(Week.WED == day) System.out.println("수요일");
//		if(Week.THU == day) System.out.println("목요일");
//		if(Week.FRI == day) System.out.println("금요일");
//		if(Week.SAT == day) System.out.println("토요일");
		System.out.println(day.day);
	}
	

	/**
	 * @param day 1=> 일요일 
	 *            7=> 토요일
	 */
	public void week(int day) {
		if(day ==1) System.out.println("일요일");
		if(day ==2) System.out.println("월요일");
		if(day ==3) System.out.println("화요일");
		if(day ==4) System.out.println("수요일");
		if(day ==5) System.out.println("목요일");
		if(day ==6) System.out.println("금요일");
		if(day ==7) System.out.println("토요일");
	}
	
}
