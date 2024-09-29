import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class fiveth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the outer circle radius (ro): ");
        double outerRadius = scanner.nextDouble();

        System.out.print("Enter the inner circle radius (ri): ");
        double innerRadius = scanner.nextDouble();

        Circle outerCircle = new Circle(outerRadius);
        Circle innerCircle = new Circle(innerRadius);

        double outerCircleArea = outerCircle.computeArea();
        double innerCircleArea = innerCircle.computeArea();

        double regionArea = outerCircleArea - innerCircleArea;

        System.out.printf("The area of the circular region is: %.2f%n", regionArea);
    }
}
