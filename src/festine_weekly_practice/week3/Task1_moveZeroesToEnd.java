package festine_weekly_practice.week3;

public class Task1_moveZeroesToEnd {
    /* 15) Array - Move Zeros to the End
    Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0] */
    public static int [] moveZeroToEnd(int [] arr){
        int [] result = new int[arr.length];
        int index = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i] != 0){
                result[index]=arr[i];
                index++;
            }
        }
        return result;
    }
}
