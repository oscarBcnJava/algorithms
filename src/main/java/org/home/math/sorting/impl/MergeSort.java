package org.home.math.sorting.impl;

import org.home.math.sorting.Sorteable;

/**
 * Merge Sort
 *
 * Time: O(NLogN)
 * Space: O(N)
 *
 */
public class MergeSort implements Sorteable {

    private int[] inArray;
    private int[] forMergeArray;

    public int[] sort(int[] inArray) {
        forMergeArray = new int[inArray.length];
        this.inArray = inArray;
        sort(0, inArray.length - 1);

        return inArray;
    }

    private void sort(int startPos, int endPos) {
        if (startPos < endPos) {
            int middle = startPos + (endPos - startPos) / 2;
            sort(startPos, middle);
            sort(middle+1, endPos);
            mergeParts(startPos, middle, endPos);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i=lowerIndex; i<= higherIndex; i ++) {
            forMergeArray[i] = inArray[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i<=middle && j<= higherIndex) {
            if (forMergeArray[i] <= forMergeArray[j]) {
                inArray[k] = forMergeArray[i];
                i++;
            } else {
                inArray[k] = forMergeArray[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            inArray[k] = forMergeArray[i];
            k++;
            i++;
        }
    }
}
