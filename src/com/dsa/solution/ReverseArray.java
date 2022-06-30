package com.dsa.solution;

public class ReverseArray {
    private static int[] getReversedArr(int[] arr) throws ArrayIndexOutOfBoundsException{
        int arrLength = arr.length;
        if (arrLength == 1) {
            return arr;
        }

        /* 
        loop from start to mid of array 
        first = arr[start]
        second = arr[arrLength-start]
        if required swap the values
         */
        
        int loopTillIndex = arrLength / 2;
        int right, temp;
        for (int left = 0; left < loopTillIndex; left++) {
            right = arrLength - (left + 1);
            if (arr[left] == arr[right]) {
                continue;
            }
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 9, 2, 0, 3 };
        arr = getReversedArr(arr);
        for (int n : arr){
            System.out.print(n+" ");
        }
    }
}
