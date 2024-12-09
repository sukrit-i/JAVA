public class whileloop {
    public static void main(String[] args) {
        int number = 5;
        int mul = 1;

        while (mul <= 10) {
            System.out.printf("%d X %d = %d \n", number, mul, number * mul);

            mul++;
        }
    }

}
