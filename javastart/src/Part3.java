import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {

        // SIMPLE AREA CALCULATION

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a width: ");
        width = scanner.nextDouble();

        System.out.print("Enter a height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("Your area is "+ area + "cm2");

        scanner.close();

    }
}
