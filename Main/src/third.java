import java.util.Scanner;

public class third {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the length in centimeters: ");
        double centimeters = scanner.nextDouble();

        double totalInches = centimeters / 2.54;

        int feet = (int) totalInches / 12;
        double inches = totalInches % 12;

        System.out.printf("The length is %d feet and %.2f inches.\n", feet, inches);

        scanner.close();
    }
}
