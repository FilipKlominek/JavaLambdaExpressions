package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int[] numbers = new int[split.length];
        for (int i = 0; i < numbers.length; i++) numbers[i] = Integer.parseInt(split[i]);

        System.out.println("Choose action");
        int mode = sc.nextInt();

        int[] out = {0};

        switch (mode) {
            case 1 -> out = Arrays.stream(numbers).filter(number -> number % 11 == 0).toArray();
            case 2 -> out = Arrays.stream(numbers).filter(number -> Integer.toString(number).endsWith("7")).toArray();
            case 3 -> out = Arrays.stream(numbers).map(number -> number * 2).toArray();
            case 4 -> out = Arrays.stream(numbers).map(number -> (int) Math.ceil(number / 50 * 40)).toArray();
            case 5 -> out[0] = Arrays.stream(numbers).reduce(1, (a, b) -> a * b);
            case 6 -> out[0] = Arrays.stream(numbers).reduce(0, Integer::sum);
        }
        assert out != null;
        for (int i : out) System.out.println(i);
    }
}
