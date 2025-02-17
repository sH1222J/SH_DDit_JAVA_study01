package kr.or.ddit.study06.sec02;

public class Filed01Main {
	public static void main(String[] args) {

        Field01 f1 = new Field01();
        f1.kor=90;
        f1.eng=80;
        f1.math=70;
        f1.sum=f1.kor+ f1.eng+f1.math;
        f1.avg=f1.sum/3.0;
        f1.rank=2;
        f1.name="장세진"
//        		[0]p0	= 10;
                
                Field01 f2 = new Field01();
                f1.kor=84;
                f1.eng=72;
                f1.math=65;
                f1.sum=f1.kor+ f1.eng+f1.math;
                f1.avg=f1.sum/3.0;
                f1.rank=4;
                f1.name="이선엽";
                
System.out.println(f1.name+name+"\t"+f1.kor);

    }
}