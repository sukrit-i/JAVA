import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("enter the second number");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("what operation do u want to perform? ");
        String operation = scanner.nextLine();

        if (operation.equals("sum")) {
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        } else if (operation.equals("sub")) {
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        } else if (operation.equals("mul")) {
            System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
        } else if (operation.equals("div")) {
            if (number2 == 0) {
                System.out.println("cannot divide by 0 ");
            } else {
                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
            }
        } else {
            System.out.printf("%s is not a supported operation", operation);
        }

        scanner.close();
    }

}
