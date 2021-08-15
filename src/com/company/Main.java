package com.company;

import com.company.entities.MyArray;
import com.company.entities.MyCompareBtS;
import com.company.entities.MyCompareOtE;
import com.company.entities.MyCompareStB;

public class Main {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(10);
        myArray.bubbleSort(new MyCompareOtE());
        myArray.print();
    }
}
