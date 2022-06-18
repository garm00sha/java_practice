package festine_weekly_practice.week2;

public class Task7_sumDigitInString {
    /*
    8) String - sum of digits in a string
Write a method that can return the sum of the digits in a string
     */
    public static void main(String[] args) {
        System.out.println(sumDigitInString("hd6s5abhj"));
    }
    public static int sumDigitInString(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if(Character.isDigit(x)){
                sum+=Integer.parseInt(x + "");
            }
        }
        return sum;
    }
}
