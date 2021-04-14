package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for (int x = 9; x > 0; x--) {
            for (int y = x; y > 0; y--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int x = 0; x < 9; x++) {
            for (int y = x; y > 0; y--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        int p = 0;
        for (int x = 9; x > 0; x--) {
            for (int y = x; y > 0; y--) {
                System.out.print("* ");
            }
            p++;
            for (int y = p; y > 0; y--) {
                System.out.print("- ");
            }
            System.out.println();
        }

        System.out.println();

        int i = 0;
        for (int x = 9; x > 0; x--) {
            for (int y = x; y > 0; y--) {
                System.out.print("  ");
            }
            i++;
            for (int y = i; y > 0; y--) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }
}
