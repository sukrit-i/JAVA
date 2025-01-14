import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 70);
        examScores.put("Bio", 80);
        examScores.put("Hin", 60);
        examScores.put("Eng", 90);

        examScores.putIfAbsent("sci", 40);
        examScores.replace("Eng", 40);

        // examScores.clear();
        examScores.remove("Hin");

        System.out.println("Marks" + examScores); // saem as entryset // same as tostring
        System.out.println("Marks" + examScores.keySet());
        System.out.println("Math" + examScores.values());
        System.out.println("Math" + examScores.entrySet());
        System.out.println("Marks" + examScores.toString());
        System.out.println("Marks" + examScores.get("Math"));
        System.out.println("Marks " + examScores.getOrDefault("Mat", -1));

        // difference between keyset and tostring
    }

}
