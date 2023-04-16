
import java.util.Random;
import java.util.*;

public class Password_gen {
   
    static char[] generatePassword(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for(int i = 4; i< length ; i++) {
            if (password[i-1] == password[i-2]) {
                if (Character.isDigit(password[i-1])) {
                    password[i] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
                } else {
                    password[i] = numbers.charAt(random.nextInt(numbers.length()));
                }
            } else {
                password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
            }
        }
        return password;
    }
    public static void main(String[] args) {
        int length = 10;
        System.out.println("Your 10 Digit Password is Here Please Copy Paste And Use it and Mind or Note this Password =");
        System.out.println(generatePassword(length));
    }

    
}
    
