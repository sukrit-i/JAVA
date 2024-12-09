public class dowhileloop {
    public static void main(String[] args) {
        int num = 5;
        int mul = 1;

        do {
            System.out.printf(" %d X %d = %d \n", num, mul, mul * num);
            mul++;

        } while (mul <= 10);
    }

}
