package com.org;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 integer values");

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter a value for place " + i + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered Array: "+Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted array: "+ Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}