package org.example;

public class Main {
    public static void main(String[] args) {
        // Exercise 1 - Appending Content
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", Cadets!");
        System.out.println(sb);
        sb.append(" Welcome to ").append("2025").append(".");
        System.out.println(sb);

        // Exercise 2 - Inserting Content at a Position
        StringBuilder sb2 = new StringBuilder("Java is great!");
        sb2.insert(8, "really ");
        System.out.println(sb2);

        // Exercise 3 - Deleting Content
        StringBuilder sb3 = new StringBuilder("This is a test sentence.");
        // Deletes " a test"
        sb3.delete(8, 15);
        System.out.println("After delete(8, 15): " + sb3);

        // Deletes the character at index 4 (the ' ')
        sb3.deleteCharAt(4);
        System.out.println("After deleteAtChar(4): " + sb3);

        // Exercise 4 - Replacing a Section
        StringBuilder sb4 = new StringBuilder("I like programming in Python.");
        sb4.replace(22, 28, "Java");
        System.out.println(sb4);

        // Exercise 5 - Method Chaining
        StringBuilder sb5 = new StringBuilder("Start");
        sb5.append("...").insert(0, "Ready, Set, ").delete(14, 17);
        System.out.println(sb5);

        // Exercise 6 - subString(), indexOf(), and Non-Existing Words
        StringBuilder sb6 = new StringBuilder("The quick brown fox jumps over the lazy dog");

        // Substring returns a String, it does not modify the StringBuilder
        String sub = sb6.substring(16,19);
        System.out.println("Substring: " + sub);

        // indexOf works just like in String
        int indexOfFox = sb6.indexOf("fox");
        System.out.println("Index of 'fox': " + indexOfFox);

        // Searching for a word that doesn't exist
        int indexOfCat = sb6.indexOf("cat");
        System.out.println("Index of 'cat': " + indexOfCat);

        // Exercise 7 - Converting back to a String
        StringBuilder sb7 = new StringBuilder("Status: ");
        sb7.append("Pending");

        String finalStatus = sb7.toString();

        sb7.append(" - Approved");

        System.out.println("StringBuilder: " + sb7);
        System.out.println("Final String: " + finalStatus);
    }
}