package org.home.math.sorting.impl;

import org.home.math.sorting.AbstractSort;

/**
 * According book: Algorithms Fourth Edition (Code comments too because those are nice)
 *
 * Most widely used. Major features: is in place (only a small auxiliary stack) and requires
 *  time proportional to NlogN on average sorting
 *
 *  Drawback: is fragile and needs some care in the implementation to be sure to avoid bad
 *  performance
 *
 *
 */
public class QuickSort extends AbstractSort {
    @Override
    public int[] sort(int[] inArray) {
        sort(inArray, 0, inArray.length - 1);
        return inArray;
    }

    private void sort(int[] inArray, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int partitionElement = partition(inArray, lo, hi);
        sort(inArray, lo, partitionElement - 1);
        sort(inArray, partitionElement + 1, hi);
    }

    private int partition(int[] inArray, int lo, int hi) {
        int i = lo; //left scan indice
        int j = hi + 1; //right scan indice
        int pivotElement = inArray[lo];

        while (true) {
            while (isSmallerThan(inArray[++i], pivotElement)) {
                if (i == hi) {
                    break;
                }
            }
            while (isSmallerThan(pivotElement, inArray[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(inArray, i, j);
        }
        swap(inArray, lo, j);
        return j;
    }
}
