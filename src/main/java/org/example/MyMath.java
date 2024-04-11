package org.example;

public class MyMath {
    public Integer calculateSum(int[] array) {
        int sum = 0;
        for (int item: array) {
            sum += item;
        }
        return sum;
    }
}
