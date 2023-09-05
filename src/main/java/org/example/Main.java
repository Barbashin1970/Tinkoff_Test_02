package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(); // вводится строка s

        int maxWords = getMaxWords(s);
        System.out.println(maxWords);
    }

    private static int getMaxWords(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int maxWords = Integer.MAX_VALUE;
        maxWords = Math.min(maxWords, charCount.getOrDefault('s', 0) ); // количество слов "sheriff" ограничено количеством букв 's' в строке
        maxWords = Math.min(maxWords, charCount.getOrDefault('h', 0) ); // количество слов "sheriff" ограничено количеством букв 'h' в строке
        maxWords = Math.min(maxWords, charCount.getOrDefault('e', 0) ); // количество слов "sheriff" ограничено количеством букв 'e' в строке
        maxWords = Math.min(maxWords, charCount.getOrDefault('r', 0) ); // количество слов "sheriff" ограничено количеством букв 'r' в строке
        maxWords = Math.min(maxWords, charCount.getOrDefault('i', 0) ); // количество слов "sheriff" ограничено количеством букв 'i' в строке
        maxWords = Math.min(maxWords, charCount.getOrDefault('f', 0) / 2); // количество слов "sheriff" ограничено количеством букв 'f' в строке

        return maxWords;
    }
}

