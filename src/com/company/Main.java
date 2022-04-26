package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> integerList = new ArrayList<>();
        for (Integer i : intList) {
            if (i > 0 && i % 2 == 0) {
                integerList.add(i);
                Collections.sort(integerList);
            }
        }
        System.out.println(integerList);
    }
}





