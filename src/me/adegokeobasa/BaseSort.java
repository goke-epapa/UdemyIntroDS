package me.adegokeobasa;

/**
 * Created by epapa on 21/10/2015.
 */
public class BaseSort {
    public static void printArray(Object[] A)
    {
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if(i != A.length - 1){
                System.out.print(" ");
            }
        }
    }

    public static void printArray(int[] A)
    {
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if(i != A.length - 1){
                System.out.print(" ");
            }
        }
    }
}
