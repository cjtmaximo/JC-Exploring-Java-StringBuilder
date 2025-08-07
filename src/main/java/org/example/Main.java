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
    }
}