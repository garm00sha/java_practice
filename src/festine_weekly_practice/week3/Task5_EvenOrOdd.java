package festine_weekly_practice.week3;

public class Task5_EvenOrOdd {
    /* 17) Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even" */
    public static void main(String[] args) {
        System.out.println(evenOrOdd(17));
    }
    public static String evenOrOdd(int num){

        return (num % 2==0) ? "even" : "odd";
    }
}
