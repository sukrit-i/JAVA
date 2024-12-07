public class basics {

  static int age;

  public static void main(String[] args) {
    int number1 = 5;
    double number2 = number1;

    System.out.println(number2); // implicit typecasting
    System.out.println((int) number2); // implicit typecasting
    System.out.println(number1); // implicit typecasting

    double number3 = 5.5;
    int number4 = (int) number3;// tell the compiler that we want to convert

    System.out.println(number3);
    System.out.println(number4); // not possible , lousy conversion
    // operators + - / % *

    int num = 12;
    num -= 5;
    System.out.println(num);

    String name = new String("sukriti");
    System.out.println(name);

  }
}