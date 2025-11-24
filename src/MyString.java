import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, Integer> frequencyMap = new TreeMap<>();

        System.out.println("Enter a string:");
        String inputString = sc.nextLine();

        String[] words = inputString.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            boolean wordIsContained = frequencyMap.containsKey(words[i]);
            if (wordIsContained) {
                frequencyMap.computeIfPresent(words[i], (k, v) -> v + 1);
            } else {
                frequencyMap.put(words[i], 1);
            }
        }

        for(Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
