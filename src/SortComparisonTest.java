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
 *
 * RUNNING TIME PER DATA SAMPLE AND ALGORITHM (in nano seconds)
 *
 * |                    |  INSERT  | SELECTION |  QUICK  | MERGE (I) | MERGE (R) |
 * |--------------------|----------|-----------|---------|-----------|-----------|
 * | 10 RANDOM          | 1190330  | 13559     | 26022   | 111741    | 36088     |
 * | 100 RANDOM         | 197208   | 336987    | 406614  | 96061     | 105156    |
 * | 1000 RANDOM        | 13935228 | 10778625  | 10885717| 1545218   | 1367870   |
 * | 1000 FEW UNIQUE    | 488883   | 2813942   | 1570501 | 464324    | 338007    |
 * | 1000 NEARLY ORDERED| 78165    | 2815423   | 10860034| 238831    | 326655    |
 * | 1000 REVERSE ORDER | 952969   | 2812003   | 3284062 | 297403    | 197902    |
 * | 1000 SORTED        | 9716     | 2800932   | 1755763 | 246510    | 152136    |
 * |-----------------------------------------------------------------------------|
 *
 * QUESTIONS:
 * a.  Which of the sorting algorithms does the order of input have an impact on? Why?
 * ANSWER: Insertion Sort because the best case is Theta(n) and the worse case is Theta(n^2)
 *
 * b.  Which algorithm has the biggest difference between the best and worst performance, based on the type of input, for the input of size 1000? Why?
 * ANSWER: Insertion Sort has the biggest difference (from Theta(n) to Theta(n^2)
 *
 * c.  Which algorithm has the best/worst scalability, i.e.  , the difference in performance time based on the input size? Please consider only input files with random order for this answer.
 * ANSWER: Merge Sort Recursive as it has the best scalability and remains the same with its 0(n log(n)) runtime and wont be affected by input size
 *
 * d.  Did you observe any difference between iterative and recursive implementations of merge sort?
 * ANSWER: One is called over and over again recursively and one is iteratively. From my results the recursive merge sort ran faster.
 *
 * e.  Which algorithm is the fastest for each of the 7 input files?
 * ANSWER: 10 random: Selection Sort
 *         100 random: Merge Sort Iteration
 *         1000 random: Merge Sort Recursive
 *         1000 few unique: Merge Sort Recursive
 *         1000 nearly ordered: Insertion Sort
 *         1000 reverse order: Merge Sort Recursive
 *         1000 sorted: Insertion
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
            ArrayList<String> doublesList = new ArrayList<>();
            long start, end, time;
            String dataTitle;

            while (inputScanner.hasNextLine())
                doublesList.add(inputScanner.nextLine());

            double[] a = new double[doublesList.size()];
            for (int i = 0; i < doublesList.size(); i++) {
                a[i] = Double.parseDouble(doublesList.get(i));
            }

            dataTitle = file.replaceAll("testFiles/", "").replaceAll(".txt", "");

            System.out.println("---- " + dataTitle + " ----");
            start = System.nanoTime();
            SortComparison.insertionSort(a);
            end = System.nanoTime();
            time = end - start;
            System.out.println("Insertion Sort completed with a time of " + time);

            start = System.nanoTime();
            SortComparison.selectionSort(a);
            end = System.nanoTime();
            time = end - start;
            System.out.println("Selection Sort completed with a time of " + time);

            start = System.nanoTime();
            SortComparison.quickSort(a);
            end = System.nanoTime();
            time = end - start;
            System.out.println("Quick Sort completed with a time of " + time);

            start = System.nanoTime();
            SortComparison.mergeSortIterative(a);
            end = System.nanoTime();
            time = end - start;
            System.out.println("Merge Sort Iterative completed with a time of " + time);

            start = System.nanoTime();
            SortComparison.mergeSortRecursive(a);
            end = System.nanoTime();
            time = end - start;
            System.out.println("Merge Sort Recursive completed with a time of " + time + "\n");

        }
    }
}
