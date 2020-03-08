package Sorting;

import org.w3c.dom.ls.LSOutput;

public class HeapSort {
    private Comparable[] tempArray;
    private int N = 0;

    public void sort(Comparable[] a) {
       // Comparable test1 = "the";
        //Comparable test2 = "works";
        String testthus = (String) a[0];
        System.out.println(testthus.length());
        System.out.println( a[0] + " " + a[7]);
        System.out.println(compareArray(a[0],a[7]));
        this.tempArray = new Comparable[a.length+11];
        for (int i = 0; i<a.length; i++) {
            tempArray[++N] = a[i];
            swim(N);
            if(N >= 14 ) break;
            //System.out.println(a[i-1] + " " + tempArray[1]);
        }

        //for(int i = 0; i<14 ; i++) System.out.println(tempArray[i+1]);
        //System.out.println(N);


        int i = 0;
   /*     while (N > 0) {
            a[++i] = tempArray[1];
            tempArray[1] = tempArray[N--];
            sink(1);
        }*/
    }


    public void swim(int a) {
        //System.out.println(a);

        //if (a>1)System.out.println("Compare " + tempArray[a/2] + " " + tempArray[a] + " " +  compareArray(tempArray[a/2] , tempArray[a]  ));
        //if (a>1) System.out.println(compareArray(tempArray[a/2] , tempArray[a]  ));
        while(a>1 && compareArray(tempArray[a/2] , tempArray[a]  ) ){
            System.out.println( " Switching " + a + " " + a/2 + " "  + N + " " + tempArray[a/2] + " + " + tempArray[a]+ " " + tempArray[a/4]);
            switchPlaces(a/2 , a );
            a = a / 2;
            System.out.println(compareArray(tempArray[a/2] , tempArray[a]  ));
            System.out.println(tempArray[a/2] +" "+  tempArray[a]);
            //System.out.println("swimming");
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
