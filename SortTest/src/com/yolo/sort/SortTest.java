package com.yolo.sort;

class SortTest {

    SortFactory sortFactory = new SortFactory();

    @org.junit.jupiter.api.Test
    void sort() {
        int[] arr = new int[]{9, 5, 6, 1, 3, 4, 5, 2, 6, 8, 7, 5, 4, 1, 4, 6, 8};
        arr = sortFactory.selectSort(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}