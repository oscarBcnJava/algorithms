package org.home.math.print;

/**
 * Created by Oscar J. Perez on 28/10/16.
 */
public class Printer {
    public void printOut(int[] inArray) {
        for (int i=0; i<inArray.length; i++) {
            System.out.print(" " + inArray[i]);
        }
    }

    public String creatOutputString(int[] inArray) {
        String output = "";
        for (int i=0; i<inArray.length; i++) {
            output += inArray[i];
        }
        return output;
    }
}
