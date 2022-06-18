package festine_weekly_practice.week2;

import java.util.Arrays;

public class Task11_sortArrayDescending {
    /*
    12) Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex:  int[] arr = {10,20,7, 8, 90};
                 arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};
     */
    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(sortArrayDescending(arr)));
    }
    public static int [] sortArrayDescending(int arr []) {
        int temp;

        for (int a = 0; a <= arr.length - 1; a++) {
            for (int b = 0; b <= arr.length - 2; b++) {
                if (arr[b] < arr[b + 1]) {
                    temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                }
            }
        }
        return arr;
    }
}
