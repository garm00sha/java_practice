package festine_weekly_practice.week2;

public class Task9_findMin {
    /*
    10) Array - Find Minimum
Write a method that can find the maximum number from an int Array
     */
    public static void main(String[] args) {
        int arr []={9,2,1,5,7,8};
        System.out.println(findMin(arr));
    }
    public static int findMin(int arr []){
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< min){
                min=arr[i];
            }

        }
        return min;
    }
}
