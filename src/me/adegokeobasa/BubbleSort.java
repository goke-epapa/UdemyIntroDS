package me.adegokeobasa;

import java.util.Arrays;

/**
 * Created by epapa on 21/10/2015.
 */
public class BubbleSort extends BaseSort {

    public static void sort(int[] A) {
        for (int i = 0; i <= A.length - 2; i++) {
            // i from 0 to  A.length - 2
            for (int j = 0; j <= A.length - 2 - i; j++) {
                // j from 0 to  A.length - 2 - i
                if (A[j] > A[j + 1]) {
                    int tmp = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {12, 8, 3, 5, 10};

        sort(A);
        printArray(A);
    }
}
