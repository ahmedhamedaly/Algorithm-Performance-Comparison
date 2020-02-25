import java.util.Arrays;

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author Ahmed Hamed Aly
 *  @version HT 2020
 */

class SortComparison {

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    static double[] insertionSort (double[] a){
        for (int i = 1; i < a.length; ++i) {
            double key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
        return a;
    }

    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] selectionSort (double[] a){
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[min])
                    min = j;

            double temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        return a;
    }

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] quickSort (double[] a){
        quickSort(a, 0, a.length - 1);
        return a;
    }

    static void quickSort (double[] a, int lo, int hi){
        if(lo < hi){
            int pivotPos = partition(a, lo, hi);
            quickSort(a, lo, pivotPos-1);
            quickSort(a, pivotPos + 1, hi);
        }

    }

    // ADDITION TO QUICK SORT
    static int partition (double[] a, int lo, int hi){
        double tmp;
        int i = lo - 1;
        double pivot = a[hi];

        for(int j = lo; j < hi; j++){
            if(a[j] < pivot){
                i++;
                tmp = a[i];
                a[i]= a[j];
                a[j] = tmp;
            }
        }
        tmp = a[i + 1];
        a[i + 1] = a[hi];
        a[hi] = tmp;

        return i + 1;
    }

    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */

    static double[] mergeSortIterative (double[] a) {
        double[] aux = Arrays.copyOf(a, a.length);
        mergeSortIterative(a, aux,0, a.length - 1);
        return a;
    }

    // NEEDED FOR MERGE SORT
    static void mergeSortIterative (double[] a, double[] aux, int lo, int hi) {
        for(int s = 1; s <= hi - lo; s = s*2) {
            for(int z = lo; z < hi; z += s*2) {
                int mi = Integer.min(z + s - 1, hi);
                int hi2 = Integer.min(hi, (z + s*2 - 1));
                iterativeMerge(a, aux, z, mi, hi2);
            }
        }
    }

    // NEEDED FOR MERGE SORT
    static void iterativeMerge(double[] a, double[] aux, int lo, int mi, int hi) {
        int k = lo;
        int i = lo;
        int j = mi + 1;

        while(i <= mi && j <= hi) {
            if(a[i] < a[j])
                aux[k++] = a[i++];
            else
                aux[k++] = a[j++];
        }

        while(i <= mi)
            aux[k++] = a[i++];

        for(k = lo; k <= hi; k++) {
            a[k] = aux[k];
        }
    }


    /**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    static double[] mergeSortRecursive (double[] a) {

        return a;
    }
}