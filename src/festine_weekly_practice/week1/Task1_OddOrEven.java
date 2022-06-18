package festine_weekly_practice.week1;

public class Task1_OddOrEven {
    /*
        1) Numbers - odd & even
    Write  a method which can identifies given number is even or odd
    EX:
    identify(5) ->  "Odd"
    identify(6) ->  "Even"
         */
    public static void main(String[] args) {
        OddOrEven(55);

    }

    public static void OddOrEven (int num){
        if (num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }}
