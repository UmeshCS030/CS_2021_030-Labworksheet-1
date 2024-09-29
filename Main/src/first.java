import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd-length word: ");
        String word = scanner.nextLine();

        if (word.length() % 2 == 0) {
            System.out.println("Please enter an odd-length word.");
        } else {
            int middleIndex = word.length() / 2;
            char middleCharacter = word.charAt(middleIndex);
            System.out.println("The middle character is: " + middleCharacter);
        }

        scanner.close();
    }
}
