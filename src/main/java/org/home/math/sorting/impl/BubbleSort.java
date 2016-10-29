package org.home.math.sorting.impl;

import org.home.math.sorting.Sorteable;

/**
 * Created by Oscar J. Perez on 28/10/16.
 */
public class BubbleSort implements Sorteable {

    public int[] sort(int[] unsortedArray) {
        int length = unsortedArray.length;
        for (int i=0; i<length; i ++) {
            boolean changed = false;
            for (int j=0; j<length; j++) {
                if (unsortedArray[i]<unsortedArray[j]) {
                    int temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[j];
                    unsortedArray[j] = temp;
                    changed = true;
                }
            }
            if (!changed)
                return unsortedArray;
        }
        return unsortedArray;
    }

}
