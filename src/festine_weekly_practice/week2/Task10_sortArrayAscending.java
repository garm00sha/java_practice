package festine_weekly_practice.week2;

import java.util.Arrays;

public class Task10_sortArrayAscending {
    /*
    11) Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
     */
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(sortArrayAscending(arr)));
    }
    public static int [] sortArrayAscending(int arr []) {
        int[] sortArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            for (int j = i; j < arr.length; ) {
                if (arr[j] > max) {
                    sortArr[sortArr.length - i - 1] = arr[j];
                    j++;
                } else {
                    sortArr[sortArr.length - i - 1] = arr[i];
                    j++;
                }
            }
        }
        return sortArr;

    }}

