package com.home;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Input number");
        number = scanner.nextInt();
        int [][] array = new int [number+1][];
        int count = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = new int[i];
            for (int j = 0 ; j < array[i].length; j++){
                count++;
                array[i][j] = count;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
