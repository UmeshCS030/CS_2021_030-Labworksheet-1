import java.util.Scanner;

public class second {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your full name (first middle last): ");
        String fullName = scanner.nextLine();

        String[] nameParts = fullName.split(" ");


        String firstName = nameParts[0];
        String middleName = nameParts[1];
        String lastName = nameParts[2];


        char middleInitial = middleName.charAt(0);


        String formattedName = lastName + ", " + firstName + " " + middleInitial + ".";


        System.out.println("Formatted name: " + formattedName);


        scanner.close();
    }
}
