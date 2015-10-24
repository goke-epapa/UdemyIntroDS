package me.adegokeobasa;

import java.util.ArrayList;

/**
 * Created by epapa on 21/10/2015.
 */
public class SelectionSort extends BaseSort {
    public static void sort(int[] A) {
        for(int i = 0; i <= A.length - 2; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= A.length - 1; j++){
                if(A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = A[minIndex];
            A[minIndex] = A[i];
            A[i] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] A = {12, 8, 3, 5, 10};

        sort(A);
        printArray(A);
    }
}
