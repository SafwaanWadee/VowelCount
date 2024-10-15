/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;
import java.util.Scanner;
/**
 *
 * @author Safwaan
 */
public class VowelCounter {
    
    // Function to count the number of vowels in a string
    public static int countVowels(String sentence) {
        // Convert the sentence to lowercase to make it case-insensitive
        sentence = sentence.toLowerCase();
        
        int vowelCount = 0;
        // Iterate through each character in the string
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i); // Get the character at index i
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++; // Increment the count for each vowel
            }
        }
        return vowelCount; // Return the total count of vowels
    }

    public static void main(String[] args) {
        // Prompt the user to enter a sentence
        try ( // Create a Scanner object for user input
                Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter a sentence
            System.out.print("Enter a sentence: ");
            String userInput = scanner.nextLine();
            // Call the countVowels function and get the result
            int totalVowels = countVowels(userInput);
            // Display the result
            System.out.println("Number of vowels in the entered sentence: " + totalVowels);
            // Close the scanner
        }
    }
}
