package me.adegokeobasa;

import java.util.Arrays;

/**
 * Created by epapa on 24/10/2015.
 */
public class InsertionSorter {

    public void sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int current = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > current) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] data = {10, 5, 8, 2, 18, 3};
        new InsertionSorter().sort(data);
        System.out.println(Arrays.toString(data));
    }
}
