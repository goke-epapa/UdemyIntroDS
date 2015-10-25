package me.adegokeobasa.assignments;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by epapa on 25/10/2015.
 */
public class StringMethods {

    public boolean hasDuplicateChars(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char currChar = chars[i];
            for (int j = 0; j < chars.length - 1; j++) {
                if (j == i) {
                    continue;
                }

                if (currChar == chars[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasDuplicateChars2(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            Character c = chars[i];
            Integer d = map.get('A');
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new StringMethods().hasDuplicateChars2("adegoke"));
    }
}
