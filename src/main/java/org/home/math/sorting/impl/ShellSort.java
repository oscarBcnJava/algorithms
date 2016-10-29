package org.home.math.sorting.impl;

import org.home.math.sorting.AbstractSort;

/**
 * According book: Algorithms Fourth Edition (Code comments too because those are nice)
 *
 * because {@link InsertionSort} is slow with large unordered arrays, ShellSort first tries to
 *  do a little order (h-sort) in the array (an array is said to be h-sorted when such array is an array with h sorted
 *  independent sequences, interleaved together)
 *
 */
public class ShellSort extends AbstractSort {


    public int[] sort(int[] inArray) {
        int n = inArray.length;
        int h = 1;
        while (h < n/3) {
            h = 3*h + 1;
            // 1 - 4 - 13 - 40 - 121 - 364 - 1093......
        }
        while (h >= 1) {
            //h-sort the array
            for (int i = h; i < n; i++) {
                //insert a[i] among a[i-h], a[i-2*h], a[i-3*h]
                for (int j=i; j>=h && isSmallerThan(inArray[j], inArray[j-h]); j -= h) {
                    swap(inArray, j, j-h);
                }
            }

            h = h / 3;
        }

        return inArray;
    }
}
