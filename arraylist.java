import java.util.ArrayList;
import java.util.Comparator;

public class arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        // numbers.sort(Comparator.naturalOrder()); // import comparator
        // numbers.sort(Comparator.reverseOrder());

        // System.out.println(numbers.size());// size of array listt
        // System.out.println(numbers.contains(Integer.valueOf(2)));// check weather
        // value is present in the arraylist
        // System.out.println(numbers.isEmpty());
        // numbers.remove(3); // removing by index
        // numbers.remove(Integer.valueOf(2));// removing my value

        // numbers.clear(); // clears the entire arraylist

        // numbers.set(2, Integer.valueOf(20)); // at index 2 value 20 is set
        // System.out.println(numbers.toString());
        // System.out.println(numbers.get(0));

        System.out.println(numbers.toString());

        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);

            System.out.println(number * 2);
        });
        System.out.println(numbers.toString());
    }
}
