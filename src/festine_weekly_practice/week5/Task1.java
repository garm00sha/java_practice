package festine_weekly_practice.week5;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("aabbbcccdddeef"));
    }


    public static Map<Character, Integer> frequencyOfCharacters(String str){
        Map<Character,Integer> frequencies = new HashMap<>();

        for (char ch : str.toCharArray()){
            frequencies.put(ch, frequencies.getOrDefault(ch, 0) + 1);}
        return frequencies;

    }

    /*
    1.    String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
}
