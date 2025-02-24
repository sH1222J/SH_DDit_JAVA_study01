package kr.or.ddit.study06.sec04;

import java.util.Date;

public class Recrucive {
    public static void main(String[] args) {
        Recrucive r = new Recrucive();
        r.process();

    }

    public void process() {
        int febo = febo(50);
        date d2 = new Date();

        long time = d2.getTime() -  d1.getTime();
        System.out.printf(time+"ms");
    }

    //    피보나치 수열

    long[] arr=new long[500]
    public void febo(int num) {
//        febo(4) -> 1+1+1
//        febo(3) -> 1+1
//        febo(2) -> 1
        if (num == 1 || num == 2) return 1;
        if(arr[num]!=0) return arr[num];
        else {
            long f1 = febo(num-1);
            long f2 = febo(num-2);
            arr[num]=f1+f2;
            return f1+f2;
        }
//        febo(num - 1) + febo(num - 2);

    }
//    1 1 2 3 5 8

    //    11 -> 8+2+1
    public void changeBit() {
//                   11
//                changeBit(5)
//                changeBit(2)
//                changeBit(1)
//                changeBit(0)
        if (num == 0) return;

        changeBit(num / 2);
        System.out.printf(num % 2);
    }


    //    10 -> 짝수 더하기
    public int evenAdd(int num) {
        if (num == 2) return 2;
        return evenAdd(num - 2);
    }


    //    gop(5) -> 1~5까지 곱
    public int gop(int num) {
//                   num -> 3
//                gop(3) -> 3*2*1
//                gop(2) -> 2*1
//                gop(1) -> 1
        if (num == 1) return 1;
        return gop(num - 1);
    }

    public int sum(int num) {
/*
        num -> 3
        sum(3) -> 3+2+1
        sum(2) -> 2+1
        sum(1) -> 1
        if(num==1) return 1;
*/
        if (num == 1) return 1;
        return num + sum(num - 1);
    }

}
