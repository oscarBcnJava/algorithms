package org.home.math.sorting.impl;

import org.home.math.sorting.AbstractSort;

/**
 * According book: Algorithms Fourth Edition
 *
 * Selection sort uses ~N2/2 compares and N exchanges
 *
 */
public class SelectionSort extends AbstractSort {

    public int[] sort(int[] inArray) {
        int n = inArray.length;
        for (int i=0; i<n; i++) {
            int min = i;
            for (int j = i+1; j<n; j++) {
                if (inArray[j] < inArray[min]) {
                    swap(inArray, j, min);
                    min = j;
                }
            }
        }
        return inArray;
    }
}




















