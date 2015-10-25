package me.adegokeobasa;

/**
 * Created by epapa on 24/10/2015.
 */
public class BinarySearcher {

    public int search(int[] data, int item) {
        int index = -1;

        int start = 0;
        int midIndex = 0;

        do {
            midIndex = (data.length + start) / 2;
            if(data[midIndex] == item) {
                index = midIndex;
                break;
            }
            start = midIndex;

        } while (midIndex != 0);

        return index;
    }

    public static void main(String[] args) {
        int[] items = {1,2,4,5,6,7,8,23,24,25,68,69};
        System.out.println(new BinarySearcher().search(items, 68));
    }
}
