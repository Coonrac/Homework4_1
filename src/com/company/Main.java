package com.company;

import java.util.Arrays;

public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        new Main().toLeft();
    }

    public void toLeft() {
        System.out.println(ANSI_GREEN + "Задание №1, ДЗ №4_1" + ANSI_RESET);
        int[][] matrixA;
        matrixA = new int[2][10];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                    matrixA[i][j] = (j + 2) % 11;
                }
            }
        for (int[] anArr : matrixA) {
            for (int anAnArr : anArr) {
                System.out.print(ANSI_GREEN + anAnArr +ANSI_RESET + " ");
            }
            System.out.println();
        }
    }
}
