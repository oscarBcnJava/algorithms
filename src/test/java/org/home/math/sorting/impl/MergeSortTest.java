package org.home.math.sorting.impl;

import org.home.math.print.Printer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Oscar J. Perez on 29/10/16.
 */
public class MergeSortTest {
    private Printer printer;
    private MergeSort sortImpl;
    private int[] unsorted;
    private int[] expectedOutput;

    @Before
    public void setUp() throws Exception {
        sortImpl = new MergeSort();
        unsorted = new int[] {6,4,2,1,5,3,7,9,8,0};
        expectedOutput = new int[] {0,1,2,3,4,5,6,7,8,9};
        printer = new Printer();
    }

    @Test
    public void arrayShouldBeSorted() {
        int[] resultOutput = sortImpl.sort(unsorted);
        Assert.assertEquals("both arrays should be equals", printer.creatOutputString(expectedOutput), printer.creatOutputString(resultOutput));
    }

    @After
    public void tearDown() throws Exception {
        sortImpl = null;
    }
}