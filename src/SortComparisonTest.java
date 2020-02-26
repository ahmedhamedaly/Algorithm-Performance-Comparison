import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author Ahmed Hamed Aly
 *  @version HT 2020
 */
@RunWith(JUnit4.class)
public class SortComparisonTest {
    //~ Constructor ........................................................
    @Test
    public void testConstructor() {
        new SortComparison();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmpty() {
        double[] empty = new double[0];

        assertEquals(empty, SortComparison.insertionSort(empty));
        assertEquals(empty, SortComparison.selectionSort(empty));
        assertEquals(empty, SortComparison.quickSort(empty));
        assertEquals(empty, SortComparison.mergeSortIterative(empty));
        assertEquals(empty, SortComparison.mergeSortRecursive(empty));
    }


    // TODO: add more tests here. Each line of code and ech decision in SortComparison.java should
    // be executed at least once from at least one test.

    @Test
    public void insertionSortTest() {
        double[] a = {
                3431.21, 7283.93, 2846.63, 4639.46, 8446.73, 9142, 7832.26, 6482.50, 5392.01, 9201.64
        };

        double[] result = {
                2846.63, 3431.21, 4639.46, 5392.01, 6482.5, 7283.93, 7832.26, 8446.73, 9142.0, 9201.64
        };

        assertEquals(Arrays.toString(result), Arrays.toString(SortComparison.insertionSort(a)));
    }

    @Test
    public void selectionSortTest() {
        double[] a = {
                3431.21, 7283.93, 2846.63, 4639.46, 8446.73, 9142, 7832.26, 6482.50, 5392.01, 9201.64
        };

        double[] result = {
                2846.63, 3431.21, 4639.46, 5392.01, 6482.5, 7283.93, 7832.26, 8446.73, 9142.0, 9201.64
        };

        assertEquals(Arrays.toString(result), Arrays.toString(SortComparison.selectionSort(a)));
    }

    @Test
    public void quickSortTest() {
        double[] a = {
                3431.21, 7283.93, 2846.63, 4639.46, 8446.73, 9142, 7832.26, 6482.50, 5392.01, 9201.64
        };

        double[] result = {
                2846.63, 3431.21, 4639.46, 5392.01, 6482.5, 7283.93, 7832.26, 8446.73, 9142.0, 9201.64
        };

        assertEquals(Arrays.toString(result), Arrays.toString(SortComparison.quickSort(a)));
    }

    @Test
    public void mergeSortIterativeTest() {
        double[] a = {
                3431.21, 7283.93, 2846.63, 4639.46, 8446.73, 9142, 7832.26, 6482.50, 5392.01, 9201.64
        };

        double[] result = {
                2846.63, 3431.21, 4639.46, 5392.01, 6482.5, 7283.93, 7832.26, 8446.73, 9142.0, 9201.64
        };

        assertEquals(Arrays.toString(result), Arrays.toString(SortComparison.mergeSortIterative(a)));
    }

    @Test
    public void mergeSortRecursive() {
        double[] a = {
                3431.21, 7283.93, 2846.63, 4639.46, 8446.73, 9142, 7832.26, 6482.50, 5392.01, 9201.64
        };

        double[] result = {
                2846.63, 3431.21, 4639.46, 5392.01, 6482.5, 7283.93, 7832.26, 8446.73, 9142.0, 9201.64
        };

        assertEquals(Arrays.toString(result), Arrays.toString(SortComparison.mergeSortRecursive(a)));
    }

    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        String[] testFiles = {
                "testFiles/numbers10.txt",
                "testFiles/numbers100.txt",
                "testFiles/numbers1000.txt",
                "testFiles/numbers1000Duplicates.txt",
                "testFiles/numbersNearlyOrdered1000.txt",
                "testFiles/numbersReverse1000.txt",
                "testFiles/numbersSorted1000.txt"
        };

        Scanner inputScanner;

        for (String file : testFiles) {
            
            File file1 = new File(file);
            inputScanner = new Scanner(file1);
            ArrayList<String> doubles = new ArrayList<>();

            while (inputScanner.hasNextLine())
                doubles.add(inputScanner.nextLine());

            System.out.println(doubles.toString());
        }
    }
}
