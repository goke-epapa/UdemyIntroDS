package me.adegokeobasa.assignments;

import java.util.Arrays;

/**
 * Created by epapa on 24/10/2015.
 */
public class InsertionSorterWithGenerics<T> {

    public void sort(Comparable<T>[] data) {
        for (int i = 0; i < data.length; i++) {
            Comparable<T> current = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].compareTo((T) current) > 0) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {new Employee(22), new Employee(8), new Employee(2)};
        System.out.println(Arrays.toString(employees));
        new InsertionSorterWithGenerics<Employee>().sort(employees);
        System.out.println(Arrays.toString(employees));
    }
}
