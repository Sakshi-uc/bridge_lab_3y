package string_practice_level_2;

import java.util.Scanner;

public class ShortestLongestWord {
    static int getLength(String str) {
        int count = 0;
        try {
            while (true) str.charAt(count++);
        } catch (Exception e) {}
        return count;
    }
    static String[] splitWords(String text) {
        int n = getLength(text), spaces = 0;
        for (int i = 0; i < n; i++) if (text.charAt(i) == ' ') spaces++;
        String[] words = new String[spaces + 1];
        int start = 0, index = 0;
        for (int i = 0; i <= n; i++) {
            if (i == n || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }
    static String[] shortestLongest(String[] words) {
        String
