public class forloop {
    public static void main(String[] args) {

        // printing sum of numbers in the given array

        // int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // int sum = 0;

        // for (int index = 0; index < numbers.length; index++) {
        // sum += numbers[index];
        // System.out.println(numbers[index]);
        // }
        // System.out.println(sum);//55

        ///////////////////////////////////////////////////////////////////////////
        // printing table of given arrays using nested loop

        // int number = 5;

        // for (int mul = 1; mul < 10; mul++) {
        // System.out.printf("%d X %d = %d \n", number, mul, number * mul);

        // }

        // for (int num = 1; num < = 10; num++) {
        // for (int mul = 1; mul <= 10; mul++) {
        // System.out.printf("%d X %d = %d \n ", num, mul, num * mul);
        // }
        // }
        ////////////////////////////////////////////////////////////////////
        /// //print all odd num from 1 to 50

        // for (int num = 1; num <= 50; num++) {
        // if (num % 2 == 1) {
        // System.out.println(num);
        // }
        // }

        int numbers[] = { 1, 2, 3, 4, 5 };
        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
