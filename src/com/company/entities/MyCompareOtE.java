package com.company.entities;

public class MyCompareOtE implements MyCompare {

    @Override
    public boolean compare(int a, int b) {
        return b % 2 == 0 && a % 2 != 0;
    }
}
