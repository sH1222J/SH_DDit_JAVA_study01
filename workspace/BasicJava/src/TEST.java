import  java.util.*;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("\\D ", "");
        System.out.printf(my_string);


        int[] answer = new int[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.charAt(i) - '0';
        }

        Arrays.sort(answer);


        return answer;
    }
}