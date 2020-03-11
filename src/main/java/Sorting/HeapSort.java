package Sorting;

import org.w3c.dom.ls.LSOutput;

public class HeapSort {
    private Comparable[] tempArray;
    private int N = 0;

    public void sort(Comparable[] a) {
        this.tempArray = new Comparable[a.length+1];
        for (int i = 0; i<a.length; i++) {
            tempArray[++N] = a[i];
            swim(N);
        }
        int i = 0;
        while (N > 0) {
            a[i++] = tempArray[1];
            tempArray[1] = tempArray[N--];
            sink(1);
        }
    }

    public void swim(int a) {
        while(a>1 && compareArray(tempArray[a/2] , tempArray[a]  ) ){
            switchPlaces(a/2 , a );
            a = a / 2;
        }
    }


    public void sink(int a) {
        while (2*a <= N) {
            int b = a * 2;
            if (compareArray(b, b+1)) b++;
            if (!compareArray(a,b)) break;
            switchPlaces(a,b);
            a=b;
        }
    }

    public void switchPlaces(int a, int b) {
        Comparable temp = tempArray[a];
        tempArray[a] = tempArray[b];
        tempArray[b] = temp;
    }

    public boolean compareArray(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
}
