// Maximum and Minimum Element in an Array

package com.dsa.solution;

public class MinMaxElementArray {
    static class MinMaxPair {
        int minimum;
        int maximum;
    }

    public static MinMaxPair findMinMaxEle(int[] arr) throws ArrayIndexOutOfBoundsException {
        MinMaxPair Pair = new MinMaxPair();

        int arrLength = arr.length;

        if (arrLength == 1) {
            Pair.minimum = arr[0];
            Pair.maximum = arr[0];
            return Pair;
        }

        int minEle, maxEle;

        if (arr[0] > arr[1]) {
            minEle = arr[1];
            maxEle = arr[0];
        } else {
            minEle = arr[0];
            maxEle = arr[1];
        }

        // looping from index 2 as index 0 and 1 is one of min or max element
        for (int i = 2; i < arrLength; i++) {
            if (arr[i] < minEle) {
                minEle = arr[i];
            } else if (arr[i] > maxEle) {
                maxEle = arr[i];
            }
        }

        Pair.minimum = minEle;
        Pair.maximum = maxEle;
        return Pair;
    }

    public static void main(String[] args) {
        // int[] arr = { 7, 15, 23, 587, 62, 4, 85, 62, 4, 95, 1, 5, 92, 25 };
        int[] arr = {};
        MinMaxPair MPair = findMinMaxEle(arr);
        System.out.println("Minimun Element :: " + MPair.minimum);
        System.out.println("Maximun Element :: " + MPair.maximum);
    }
}
