package kr.or.ddit.util;

public class SingleTon {
    private static SingleTon instance = new SingleTon instance;

    private SingleTon() {

    }

    public static SingleTon getInstance() {
        if(instance == null) {
            instance = new SingleTon();

        }
        return instance;


    }
	
}


