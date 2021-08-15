package com.company.entities;

public class MyCompareStB implements MyCompare {
    @Override
    public boolean compare(int a, int b) {
        return b < a;
    }
}
