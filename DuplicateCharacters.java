//Q4:Write a Java Program to find the duplicate characters in a string.

import java.util.HashMap;

public class DuplicateCharacters {

    public static void findDuplicateCharacters(String str) {
        // Create a HashMap to store characters and their counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to character array
        char[] charArray = str.toCharArray();

        // Iterate through the character array and update character counts
        for (char c : charArray) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print duplicate characters and their counts
        System.out.println("Duplicate characters in the string:");
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1) {
                System.out.println(c + ": " + charCountMap.get(c));
            }
        }
    }

    public static void main(String[] args) {
        String input = "programming";
        findDuplicateCharacters(input);
    }
}
