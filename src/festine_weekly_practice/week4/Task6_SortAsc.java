package festine_weekly_practice.week4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6_SortAsc {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,6,4,2,8,11,-4,3));
        System.out.println(sortAsc(list));
    }

    public static ArrayList<Integer> sortAsc(ArrayList<Integer> list) {

        int num = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i)> list.get(j)){
                    num = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,num);
                }
            }
        }

        return list;
    }
}
/*
27) ArrayList - sorting in ascending
Write a method that can sort the ArrayList in Ascending order without using the sort method
 */


