package com.atcs.user;

import java.util.Scanner;
import java.util.Random;

public class CountLettersInArray {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        char[] chars = createArray();

        System.out.println("The lowercase letters are:");

        displayArray(chars);

        int[] CountLettersInArray = countLetters(chars);

        System.out.println();

        System.out.println("The occurrences of each letter are:");

        displayCounts(CountLettersInArray);

    }

    public static char[] createArray() {

        char[] chars = new char[20];

        Random generator = new Random();

        String S = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < chars.length; i++)

            chars[i] = (char) S.charAt(generator.nextInt(26));

        return chars;

    }

    public static void displayArray(char[] chars) {

        for (int i = 0; i < chars.length; i++) {

            if ((i + 1) % 20 == 0)

                System.out.println(chars[i] + " ");

            else

                System.out.print(chars[i] + " ");

        }

    }

    public static int[] countLetters(char[] chars) {

        int[] counts = new int[26];

        for (int i = 0; i < chars.length; i++)

            counts[chars[i] - 'a']++;

        return counts;

    }

    public static void displayCounts(int[] counts) {

        for (int i = 0; i < counts.length; i++) {

            if ((i + 1) % 10 == 0)

                System.out.println(counts[i] + " " + (char) (i + 'a') + "\n");

            else

                System.out.print(counts[i] + " " + (char) (i + 'a') + " ");

        }

    }

}
