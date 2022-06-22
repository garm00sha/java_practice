package festine_weekly_practice.week5;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(reverseString("omar"));
    }

    public static String reverseString(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }
    /*
    5.    String - Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */
}
