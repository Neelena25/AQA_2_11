import Practice_Project_13.PhoneBook;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        // Task 1

        String[] words = {
                "яблоко", "банан", "апельсин", "яблоко", "груша",
                "банан", "персик", "апельсин", "вишня", "груша",
                "вишня", "банан", "персик", "груша", "яблоко"
        };

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word) + " раз(а)");
        }

        // Task 2

        System.out.println();

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123456");
        phoneBook.add("Петров", "654321");
        phoneBook.add("Сидоров", "987654");
        phoneBook.add("Иванов", "111222");

        System.out.println("Телефоны для Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны для Петров: " + phoneBook.get("Петров"));
        System.out.println("Телефоны для Сидоров: " + phoneBook.get("Сидоров"));
        System.out.println("Телефоны для Николаев: " + phoneBook.get("Николаев"));
    }

}
