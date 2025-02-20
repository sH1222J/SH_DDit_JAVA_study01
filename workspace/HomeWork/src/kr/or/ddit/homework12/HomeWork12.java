package kr.or.ddit.homework12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork12 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HomeWork12 obj = new HomeWork12();
        obj.process();
    }

    public void process() {
        int money = 100000;  // 초기 보유 금액

        // ***당첨 번호 한줄 생성 할 것.
        int[] winningLotto = generateLotto();

        Random random = new Random();

        while (money > 0) {
            System.out.println("보유 금액 : " + money);
            System.out.print("구매할 로또 금액 : ");
            int pay = sc.nextInt();

            // 보유 금액보다 적은지 확인
            if (pay > money) {
                System.out.println("보유 금액보다 많은 금액을 입력하셨습니다. 다시 시도해 주세요.");
                continue; // 잘못된 금액 입력 시 다시 시도하도록 합니다.
            }

            // 로또 번호 묶음 생성
            int[][] lottoBundle = lottoBundle(pay);
            money -= pay; // 구매 금액 차감

            System.out.println("구매한 로또 번호 : ");
            for (int[] lotto : lottoBundle) {
                System.out.println(Arrays.toString(lotto));
            }

            // ***로또 번들에서 당첨 번호랑 같은 값이 있다면
            int prize = checkPrize(lottoBundle, winningLotto);

            // ***상금 3만원
            if (prize > 0) {
                System.out.println(prize + "원 당첨되었습니다.");
                money += prize; // 상금 지급
            } else {
                System.out.println("꽝");
            }
        }
    }

    // 로또 번호 생성 (6개 번호)
    public int[] generateLotto() {
        int[] lotto = new int[6];
        Random random = new Random();

        // 6개의 번호 생성
        for (int i = 0; i < lotto.length; i++) {
            int ran = random.nextInt(45) + 1;
            lotto[i] = ran;

            // 중복 검사
            for (int j = 0; j < i; j++) {
                if (lotto[j] == ran) {
                    i--; // 중복된 경우 다시 번호 생성
                    break;
                }
            }
        }

        // 번호를 오름차순으로 정렬
        Arrays.sort(lotto);
        return lotto;
    }

    // 금액에 따라 로또 번호 묶음을 생성하는 메서드
    public int[][] lottoBundle(int money) {
        // 구매 금액에 맞는 로또 묶음 생성
        int lineCount = money / 1000; // 1000원 당 하나의 로또 줄
        int[][] bundle = new int[lineCount][6];
        for (int i = 0; i < lineCount; i++) {
            bundle[i] = generateLotto(); // 각 줄마다 로또 번호 생성
        }
        return bundle;
    }

    // 로또 번들에서 당첨 번호와 일치하는 번호가 있는지 확인하는 메서드
    public int checkPrize(int[][] lottoBundle, int[] winningLotto) {
        int prize = 0;
        for (int[] lotto : lottoBundle) {
            // 로또 번호와 당첨 번호 비교
            if (Arrays.equals(lotto, winningLotto)) {
                prize += 30000; // 전부 일치하면 3만원 지급
            }
        }
        return prize;
    }
}
