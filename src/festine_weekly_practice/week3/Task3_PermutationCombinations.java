package festine_weekly_practice.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task3_PermutationCombinations {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('a','b','c','d'));
        permitate3Chars(list);
    }
    /* 14) Array - permutation combinations
Given an array of 3 characters print all permutation combinations from the given characters */
    public static void permitate3Chars(ArrayList<Character> list){
        int numberOfComb = 1;
        for (int i = 1; i <= list.size(); i++) {
            numberOfComb *= i;

        }
        String str ="";
        for (int i = 0; i <numberOfComb ;) {
            Collections.shuffle(list);
            if(!str.contains(String.valueOf(list))){
                str+=list + "\n";
                i++;
            }

        }
        System.out.println(str);
    }

}
