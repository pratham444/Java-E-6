import java.util.*;

public class xyz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 'f' for float division or 'd' for double division: ");
        char userSelected = sc.next().charAt(0);

        if (userSelected == 'f') {
            System.out.print("Enter two float numbers: ");
            float num1 = sc.nextFloat();
            float num2 = sc.nextFloat();

            if (num2 != 0) {
                float result = num1 / num2;
                System.out.println("Float Division Result: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }

        } else if (userSelected == 'd') {
            System.out.print("Enter two double numbers: ");
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            if (num2 != 0) {
                double result = num1 / num2;
                System.out.println("Double Division Result: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }

        } else {
            System.out.println("Invalid input. Please enter 'f' or 'd'.");
        }

        sc.close();
    }
}
