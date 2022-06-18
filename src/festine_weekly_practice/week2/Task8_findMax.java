package festine_weekly_practice.week2;

public class Task8_findMax {
    /*
    9) Array - Find Maximum
Write a method that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int arr []={1,6,9,8,4,0};
        System.out.println(findMax(arr));
    }
    public static int findMax(int arr []){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> max){
                max=arr[i];
            }

        }
        return max;
    }
}
