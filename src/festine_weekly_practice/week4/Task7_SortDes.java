package festine_weekly_practice.week4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7_SortDes {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,1,-1,3,9,0));
        System.out.println(sortDes(list));
    }
    public static ArrayList<Integer> sortDes(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            int num = 0;
            for (int j = i+1; j < list.size() ; j++) {
                if (list.get(i)<list.get(j)){
                    num=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,num);
                }
            }
        }

        return list;
    }}
/*
28) ArrayList - sorting in descending order
Write a method that can sort the ArrayList in descending order without using the sort method
 */

