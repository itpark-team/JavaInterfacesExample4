package com.company.entities;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class MyArray {
    int[] array;

    public MyArray(int size) {
        array = new int[size];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void print() {
        System.out.println(Arrays.toString(array));
    }

    public void bubbleSort(MyCompare myCompare) {
        boolean sort;
        int temp;
        int offset = 0;

        do {
            sort = true;

            for (int i = 0; i < array.length - 1 - offset; i++) {
                if (myCompare.compare(array[i], array[i + 1]) == true) {

                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;

                    sort = false;
                }
            }

            offset++;
        } while (sort == false);
    }
}
