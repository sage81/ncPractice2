package com.yava;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        sort(args);
        print(args);

    }

    public static void print(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
    }

    public static void sort(String[] args) {

        for (int i = 0; i < args.length - 1; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (args[i].compareTo(args[j]) > 0) {
                    swap(args, i, j);
                }
            }
        }
    }

    private static void swap(String[] inp, int position1, int position2) {

        String first = inp[position1];

        inp[position1] = inp[position2];
        inp[position2] = first;

    }

}
