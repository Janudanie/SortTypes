package Sorting;

public class MergeTopDown {

    private static Comparable[] temptheArray;


    public void sort(Comparable[] theArray) {
        temptheArray = new Comparable[theArray.length];
        sort(theArray, 0 , theArray.length - 1);
    }


    private static void sort(Comparable[] a, int lo, int hi) { // Sort a[lo..hi].
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }


    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++)
            temptheArray[k] = a[k];
        for (int k = lo; k <= hi; k++)
            if (i > mid) a[k] = temptheArray[j++];
            else if (j > hi) a[k] = temptheArray[i++];
            else if (compareArray(temptheArray[j], temptheArray[i])) a[k] = temptheArray[j++];
            else a[k] = temptheArray[i++];
    }

    public static boolean compareArray(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
}
