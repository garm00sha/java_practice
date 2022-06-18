package festine_weekly_practice.week3;

public class Task6_DivideWithoutOperator {
    /* 18) Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator */
    public static void main(String[] args) {
        System.out.println(divideWithoutOperator(80,8));
    }
    public static int divideWithoutOperator(int a, int b) {

        int count = 0;
        if (a > b) {
            while (a - b >= 0) {
                a -= b;
                count++;
            }
        }

        return count;
    }
}
