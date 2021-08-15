package com.company.entities;

public class MyCompareBtS implements MyCompare {
    @Override
    public boolean compare(int a, int b) {
        return b > a;
    }
}
