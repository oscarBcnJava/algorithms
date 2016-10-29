package org.home.math.sorting;

/**
 * Created by Oscar J. Perez on 29/10/16.
 *
 * provides common funcionality for Sorting classes
 */
public abstract class AbstractSort implements Sorteable {

    public void swap(int[] inArray, int posA, int posB) {
        int temp = inArray[posA];
        inArray[posA] = inArray[posB];
        inArray[posB] = temp;
    }

    public boolean isSmallerThan(int posA, int posB) {
        return posA < posB;
    }
}
