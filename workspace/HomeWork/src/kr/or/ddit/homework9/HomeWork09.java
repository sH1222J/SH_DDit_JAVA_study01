package kr.or.ddit.homework9;

import java.util.Scanner;

public class HomeWork09 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
		obj.process();

	}

	public void process() {
		// 8번 과제를 클래스로 변경해서 수행할것.
		Student[] stuList = new Student[5]; // 학생의 배열 생성

		Student s1 = new Student();
		s1.name = "학생1";
		s1.kor = 90;
		s1.eng = 80;
		s1.math = 70;
		s1.sum = 0;
		s1.avg = 0;
		s1.rank = 1;

		Student s2 = new Student();
		s1.name = "학생2";
		s1.kor = 84;
		s1.eng = 72;
		s1.math = 70;
		s1.sum = 0;
		s1.avg = 0;
		s1.rank = 1;

		Student s3 = new Student();
		s1.name = "학생3";
		s1.kor = 87;
		s1.eng = 99;
		s1.math = 42;
		s1.sum = 0;
		s1.avg = 0;
		s1.rank = 1;

		Student s4 = new Student();
		s1.name = "학생4";
		s1.kor = 87;
		s1.eng = 99;
		s1.math = 81;
		s1.sum = 0;
		s1.avg = 0;
		s1.rank = 1;

		Student s5 = new Student();
		s1.name = "학생5";
		s1.kor = 80;
		s1.eng = 77;
		s1.math = 92;
		s1.sum = 0;
		s1.avg = 0;
		s1.rank = 1;

		stuList[0] = s1;
		stuList[1] = s2;
		stuList[2] = s3;
		stuList[3] = s4;
		stuList[4] = s5;

		// 합계 및 평균
		for (int i = 0; i < stuList.length; i++) {
			stuList[i].sum = stuList[i].kor + stuList[i].eng + stuList[i].math;
			stuList[i].avg = stuList[i].sum / 3.0;

		}
		// 등수
		for (int i = 0; i < stuList.length; i++) {
			for (int j = 0; j < stuList.length; j++) {
				if (stuList[i].sum < stuList[j].sum)
					stuList[j].rank++;
			}

		}
		// 정렬
		for (int i = 0; i < stuList.length - 1; i++) {
			for (int j = 0; j < stuList.length - 1; j++) {
				if (stuList[j].rank > stuList[j + 1].rank) {
					student temp = new student[j];
					temp[0] = stuList[j + 1];
					stuList[j + 1] = stuList[j];
					stuList[1] = temp[0];

				}
			}

		}

		// 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("======================================");
		for (int i = 0; i < stuList.length; i++) {
			System.out.println(stuList[i]);
		}

	}

	Class student
// 국 영 수 총점 평균 등수 이름
	{
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		int rank;

	}

	@Override
	public String toString() {
		return "HomeWork09 [sc=" + sc + ", Student=" + Student + "]";
	}
}
