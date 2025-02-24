package kr.or.ddit.study05.sec03;

public class MonthMain {
	public static void main(String[] args) {
		MonthMain mm = new MonthMain();
		mm.process();
	}
	
	public void process() {
		month(Month.FEB);
	}
	
	public void month(Month m) {
		if(m == Month.FEB ) System.out.println("2월");
	}
}
