package org.home.math.sorting.impl;

import org.home.math.sorting.AbstractSort;

/**
 * Created by Oscar J. Perez on 29/10/16.
 *
 * Insertion Sort speed depends on how ordered is array.
 * entries already sorted >>> faster >>> entries randomly ordered
 *
 * Uses ~N2/4 compares and ~N2/4 exchanges to sort a randomly ordered array
 * Worst case: ~N2/2 compares and ~N2/2 exchanges
 * Best case: N-1 compares and 0 exchanges
 *
 * For each i from 0 to N-1, exchange a[i] with the entries that are smaller in a[0] through
 *  a[i-1]. As the index i travels from left to right, the entries to its left are in sorted
 *   order in the array, so the array is fully sorted when i reaches the right end.
 *
 * According book: Algorithms 4th edition
 *
 */
public class InsertionSort extends AbstractSort {

    @Override
    public int[] sort(int[] inArray) {
        int n = inArray.length;
        for (int i=0; i<n; i++) {
            for (int j=i; j>0 && isSmallerThan(inArray[j], inArray[j-1]); j--) {
                swap(inArray, j, j-1);
            }
        }
        return inArray;
    }
}

