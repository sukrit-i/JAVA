import java.util.Scanner;

public class inout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name ? ");

        // asking for name using nextline method
        String name = scanner.nextLine();
        System.out.printf("hello %s. how old are you? ", name);

        // asking for age using nextint method
        int age = scanner.nextInt();
        // cleans the input buffer
        scanner.nextLine();
        System.out.printf("%d is excebllent . what lang do u prefer ", age);

        String lang = scanner.nextLine();
        System.out.printf("%s is a good lang", lang);

        scanner.close();
    }

}
