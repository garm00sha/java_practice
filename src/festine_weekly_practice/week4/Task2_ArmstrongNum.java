package festine_weekly_practice.week4;

public class Task2_ArmstrongNum {
    public static void main(String[] args) {
        System.out.println( isArmstrongNum(368));
    }


    public static boolean isArmstrongNum(int num){
        int  originalNumber, remainder, result = 0;

        originalNumber = num;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == num) {
            return true;
        }else{
            return false;
        }
    }
}
/*
23) Numbers - Armstrong numbers
Write a method that can check if a number is Armstrong  number
 */

