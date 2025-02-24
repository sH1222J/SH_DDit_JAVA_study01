package kr.or.ddit.study07.animal;

import kr.or.ddit.util.ScanUtil;

public class AnimalMain {
	public static void main(String[] args) {
		
//		Animal ani = new Animal();
//		Cat cat = (Cat) ani; 
//		
//		Dog dog = new Dog();
//		Animal ani2 = dog;
		
		// 1. 고양이 
		// 2. 강아지 
		
		// 선택한 값에 따라 울음소리 출력하기
		
		System.out.println("1. 고양이");
		System.out.println("2. 강아지");
		int sel = ScanUtil.nextInt("선택 : ");		
		
		Animal ani = null;
		if(sel == 1) {
			ani = new Cat();
		}
		if(sel == 2) {
			ani = new Dog();
		}
		ani.cry();
		ani.move();
		
		
	}
			
}
