package festine_weekly_practice.week3;

import java.util.ArrayList;

public class Task4_ConcatTwoArrays {
    /* 16) Array - Concat two arrays
Write a return method that can concate two arrays */
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5, 6, 7,8,9};
        int[] y = {11, 12, 13, 14,15};
        System.out.println(concatTwoArrays(x,y));
    }
    public static ArrayList<Integer> concatTwoArrays(int[] a, int[] b) {

        ArrayList<Integer> aList = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            aList.add(a[i]);
        }
        ArrayList<Integer> bList = new ArrayList<Integer>();
        for (int i = 0; i < b.length; i++) {
            bList.add(b[i]);
        }
        aList.addAll(bList);
        return aList;
    }
}
