package festine_weekly_practice.week3;

import java.util.Arrays;

public class Task2_sumToZero {
    /*13) Array - N unique integers that sum up to 0
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
 The function can return any such array.
 For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
 The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumToZero(3)));
    }
    public static int [] sumToZero(int n){
        int arr []= new int [n];
        for (int i = 0; i <= n-1 ; i++){
            arr[i]= 2*i - n + 1;


        }
        return arr;


    }
}
