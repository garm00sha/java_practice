package festine_weekly_practice.week5;

import java.util.HashSet;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(onlyUnique("abababwes"));
    }


    public static String onlyUnique(String str){
          String unique ="";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
        for (int j = 0; j < str.length(); j++){
            // checking if two characters are equal
                if (str.charAt(i) == str.charAt(j) && i != j){
                    count = 1;
                    break;
                }
            }
            if (count == 0)
                unique+=str.charAt(i);
        }
        return unique;
}}
    /*
    4.    String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF";
     */

