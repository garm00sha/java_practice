package festine_weekly_practice.week5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(sortLettersAndNumbers("DC501GCCCA098911"));
    }


    public static String sortLettersAndNumbers(String str) {
        String result="";
        for(int i=0;i<str.length()-1;i++) {
            if (Character.isLetter(str.charAt(i))) {
                result+= str.charAt(i);
            }
            if (Character.isDigit(str.charAt(i))) {
                result += str.charAt(i);
            }
            if(Character.isDigit(str.charAt(i))&&Character.isAlphabetic(str.charAt(i+1))){
                result+=" ";
            }
            if(Character.isLetter(str.charAt(i))&&Character.isDigit(str.charAt(i+1))){
                result+=" ";
            }
        }
        result+=str.charAt(str.length()-1);
        String[] aa = result.split(" ");
        String last="";
        for(String each: aa) {
            char[] chars=each.toCharArray();
            Arrays.sort(chars);
            for(char eachChar: chars){
                last +=""+eachChar;
            }
        }
return last;
    }}
    /*
    6. String - Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
 sort the individual string and append them back together.
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
     */

