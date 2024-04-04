//Q3:Write a Java Program to count the number of words in a string using HashMap.

import java.util.HashMap;

public class WordCount {

    public static HashMap<String, Integer> countWords(String input) {
        // Split the input string into words
        String[] words = input.split("\\s+");

        // Create a HashMap to store word frequencies
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Iterate through the words and update the word count
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        String input = "winsoft is a software company for develope run test the software programe";
        
        // Count the words in the input string
        HashMap<String, Integer> wordCountMap = countWords(input);
        
        // Print the word count
        System.out.println("Word count:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
