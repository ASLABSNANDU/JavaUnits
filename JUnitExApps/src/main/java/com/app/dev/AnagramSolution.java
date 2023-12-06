package com.app.dev;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AnagramSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String res = isAnagram(a, b) ? "Anagram" : " Not Anagram";
        System.out.println(res);
    }

    public static boolean isAnagram(String a, String b) {
        String c = a.toLowerCase(Locale.ROOT);
        String d = b.toLowerCase(Locale.ROOT);
        System.out.println(c);
        System.out.println(d);
        char[] c1 = c.toCharArray();
        char[] c2 = d.toCharArray();
        System.out.println(c1);
        System.out.println(c2);
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(c1);
        System.out.println(c2);
        return Arrays.equals(c1, c2);
    }
}
