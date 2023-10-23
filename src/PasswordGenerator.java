import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new SecureRandom();

        String setOfCharacters = "abcdefghijklmnopqrstuvwxyz" +
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "1234567890" +
                "!@#$%&*-_";


        // каква е максималната дължина за парола?

        System.out.println("Welcome to the Password Generator!");
        System.out.println("Help me so I can help you generating a new password.");

        System.out.println();

        // колко цифрена парола ?
        System.out.println("How many symbols are needed for the password?");
        String input = scanner.nextLine();
        int passwordLength = Integer.parseInt(input);

        //минимално 6 знака за гарантиране на паролата
        if (passwordLength < 6) {
            passwordLength = 6;
        }

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < passwordLength; i++) {
            int randomInt = new Random().nextInt(setOfCharacters.length());
            char randomChar = setOfCharacters.charAt(randomInt);
            password.append(randomChar);
        }

        // output:
        System.out.println("The generated password is:");
        System.out.println(password);


    }
}
