package festine_weekly_practice.week1;

public class Task2_divideWithoutOperator {
    /*
       2) Numbers - Divide without / operator
   Write a method that can divide two numbers without using division operator
        */
    public static void main(String[] args) {
        divideWithoutOperator(44,3);
    }
    public static int divideWithoutOperator(int a,int b) {
        int count = 0;

        if (a > b && b != 0) {

            while (a >= b) {
                a = a - b;
                count++;
            }
            return count;
        }
        return -1;
    }}
