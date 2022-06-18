package festine_weekly_practice.week2;

public class SumOfDigit {
    /*
    8) String - sum of digits in a string
Write a method that can return the sum of the digits in a string
     */
    public static void main(String[] args) {
        String str="8d7ff7d6s8 5";
        System.out.println(sumOfDigit(str));
    }
    public static int sumOfDigit(String str){
        int sum = 0;
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if(Character.isDigit(x)){
                sum+=Integer.parseInt(x +"");
            }
        } return sum;
    }
}
