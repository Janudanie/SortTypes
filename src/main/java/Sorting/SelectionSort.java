package Sorting;

public class SelectionSort {

    public void sort(Comparable[] theArray) {
        int theArrayLength = theArray.length;
        for (int i = 0 ; i < theArrayLength ; i ++)
        {
            int minimal = i;
            switchPlaces(theArray, i , minimal);
            for ( int j = i; j < theArrayLength; j++){
                if (compareArray(theArray[j],theArray[minimal]) ) {
                    minimal = j;
                }
            }
            switchPlaces(theArray, i , minimal);
        }
    }

    public void switchPlaces (Comparable[] theArray, int i , int minimal) {
        Comparable temp = theArray[i];
        theArray[i] = theArray[minimal];
        theArray[minimal] = temp;
    }

    public boolean compareArray (Comparable a , Comparable b) {
        return a.compareTo(b)<0;
    }
}
