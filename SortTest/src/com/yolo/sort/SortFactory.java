package com.yolo.sort;

public class SortFactory {
    // Select sort
    public int[] selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        for (int i  = 0; i < arr.length; i++) {
            int minValue = arr[i];
            int swapIndex = i;
            for (int j = i; j < arr.length; j++) {
                if(minValue > arr[j]) {
                    swapIndex = j;
                    minValue = arr[j];
                }
            }
            if (swapIndex != i) {
                swap(arr, i, swapIndex);
            }
        }
        return arr;
    }

    private void swap(int[] swapArr, int a, int b) {
        swapArr[a] = swapArr[a] ^ swapArr[b];
        swapArr[b] = swapArr[a] ^ swapArr[b];
        swapArr[a] = swapArr[a] ^ swapArr[b];
    }
}
