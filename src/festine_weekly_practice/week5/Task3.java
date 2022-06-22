package festine_weekly_practice.week5;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(removeDublicate("aabdhgyytt"));
    }

    public static String removeDublicate(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(String.valueOf(str.charAt(i)))) { //valueOf(char c) − Returns the string representation
                                                                  // of the char argument.
                result += String.valueOf(str.charAt(i));

            }
        }
        return result;


    }
}
    /*
    3.    String - Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC
     */

