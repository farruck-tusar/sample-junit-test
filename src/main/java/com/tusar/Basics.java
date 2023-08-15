package com.tusar;

public class Basics {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 < n2) return -1;
        return 0;
    }

    public void sortArrayAscending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}