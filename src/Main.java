import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> evenNums = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                evenNums.add(num);
            }
        }
        System.out.println(evenNums);
    }

    private static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 6, 3, 4, 4, 5, 5, 2, 7));
        List<Integer> evenNums = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                evenNums.add(num);
            }
        }
        Set<Integer> evenNumsSet = new HashSet<>(evenNums);
        System.out.println(evenNumsSet);

    }

    private static void task3() {
        List<String> words = new ArrayList<>(List.of("tree", "winter", "ball", "winter", " juice", "tree", "song"));
        Set<String> wordsSet = new HashSet<>(words);
        System.out.println(wordsSet);
    }

    private static void task4() {
        List<String> words = new ArrayList<>(List.of("tree", "winter", "ball", "winter", " juice", "tree", "song", "winter"));
        Set<String> duplicateWords = new HashSet<>();
        int countWordsDuplicate = 1;
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (duplicateWords.contains(word.toLowerCase())) {
                continue;
            }
            for (int j = i + 1; j < words.size(); j++) {
                if (word.equalsIgnoreCase(words.get(j))) {
                    countWordsDuplicate++;
                    duplicateWords.add(words.get(i).toLowerCase());
                }
            }
            if (countWordsDuplicate > 1) {
                System.out.println(countWordsDuplicate);
                countWordsDuplicate = 1;

            }
        }
    }
}