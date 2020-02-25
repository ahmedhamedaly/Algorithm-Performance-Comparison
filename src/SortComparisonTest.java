import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author Ahmed Hamed Aly
 *  @version HT 2020
 */
@RunWith(JUnit4.class)
public class SortComparisonTest
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor()
    {
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

    }

    @Test
    public void selectionSortTest() {

    }

    @Test
    public void quickSortTest() {

    }

    @Test
    public void mergeSortIterativeTest() {

    }

    @Test
    public void mergeSortRecursive() {

    }

    // ----------------------------------------------------------
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
    public static void main(String[] args)
    {
        //TODO: implement this method
    }

}
