package festine_weekly_practice.week4;

public class Task3_ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(ReverseNegativeNumber(-12345794));
    }

    public static int ReverseNegativeNumber(int num) {

        int positiveNum = num * (-1);
        String positiveNumStr = positiveNum + "";
        String reverseNum = "";
        String[] positiveNumArr = positiveNumStr.split("");
        if (num < 0) {
            for (int i = positiveNumArr.length - 1; i >= 0; i--) {
                reverseNum += Integer.parseInt(positiveNumArr[i]);
            }



        }

        int reverseNumInt = Integer.parseInt(reverseNum);

        return reverseNumInt * (-1);
    }
}
/*
24) Number - Reverse negative number
Write a return method that can reverse negative number and return it as int
 */

