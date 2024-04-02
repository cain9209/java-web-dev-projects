package org.launchcode;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstSen = "Alice was beginning to get very tired of sitting by her sister" +
                " on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";


        System.out.println("Please enter a term to search for within the text above.");
       String searchTerm = input.nextLine();

        if (firstSen.toLowerCase().contains(searchTerm.toLowerCase())){
            System.out.println("The search term was found");
        } else {
            System.out.println("The search term was not found");

        }
        Integer index = firstSen.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSen.replace(searchTerm,"");
        System.out.println(modifiedSentence);
        input.close();
    }
}
