package Sorting;

public class InsertionSort  {



    public void sort (Comparable[] theArray) {
        int theArrayLength = theArray.length;
        for (int i = 0 ; i < theArrayLength ; i ++){
            for(int j = i ; j > 0 && compareArray(theArray[j],theArray[j-1]) ; j--){
                switchPlaces(theArray, j,j-1);
            }
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



