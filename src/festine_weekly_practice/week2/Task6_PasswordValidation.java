package festine_weekly_practice.week2;

public class Task6_PasswordValidation {
    /* 7) String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
 1. Password MUST be at least 6 characters and should not contain space
2. Password should at least contain one upper case letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
6. if all requirements above are met, the method returns true, otherwise returns false */
    public static void main(String[] args) {
        System.out.println(PasswordValidation("Abcdef12$"));
    }
    public static boolean PasswordValidation(String password){
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countSpecChar = 0;
        int countDigits = 0;

        if(password.length()>= 6 && !password.contains(" ")){
            for (int i = 0; i <password.length() ; i++) {
                char x = password.charAt(i) ;
                if(Character.isUpperCase(x)){
                    countUpperCase++;
                } else if (Character.isLowerCase(x)) {
                    countLowerCase++;
                } else if (Character.isDigit(x)) {
                    countDigits++;
                } else if (x == '!' || x == '@' || x== '#' || x== '$' || x== '%' || x=='^' || x=='&' || x=='*' || x=='(' || x==')') {
                    countSpecChar++;
                }

            }
            if(countDigits>=1 && countLowerCase>=1 && countUpperCase>=1 && countSpecChar>=1){
                return true;
            }

        }
        return false;
    }
}
