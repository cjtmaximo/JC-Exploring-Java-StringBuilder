package org.example;

public class Main {
    public static void main(String[] args) {
        // Exercise 1 - Appending Content
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", Cadets!");
        System.out.println(sb);
        sb.append(" Welcome to ").append("2025").append(".");
        System.out.println(sb);
    }
}