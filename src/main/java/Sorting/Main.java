package Sorting;


import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static Sorting.SortStrings.printInSortedOrder;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = "shakespeare-complete-works.txt";
        String del = "[^a-zA-Z]";

        String[] testa = Files.lines(Paths.get(path))
                .flatMap(line -> Stream.of(line.split(del)))
                .filter(word -> !word.isEmpty())
                .map(word -> word.toLowerCase())
                .toArray(String[]::new);

        //remove all ascii code
        for (int i = 0; i < testa.length; i++) {
            testa[i] = testa[i].replaceAll("[^\\x00-\\x7F]", "");
            testa[i] = testa[i].replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", "");
            testa[i] = testa[i].replaceAll("\\p{C}", "");
        }



/*
        // Use the Trie sort
        try ( Stopwatch sw = new Stopwatch ()) {
               System .out . printf (" %5.6f\n", sw. step ());
               testa = printInSortedOrder(testa);
        }
*/


/*
        // Use the merge sort
            try ( Stopwatch sw = new Stopwatch ()) {
            System .out . printf (" %5.6f\n", sw. step ());
            MergeTopDown testMerge = new MergeTopDown();
            testMerge.sort(testa);
        }
*/

/*
        // Use the SelectionSort (takes about 6200 seconds so have patience)
        try ( Stopwatch sw = new Stopwatch ()) {
            System .out . printf (" %5.6f\n", sw. step ());
            SelectionSort testSelection = new SelectionSort();
            testSelection.sort(testa);
        }
*/

/*
        // Use the Heapsort
        try (Stopwatch sw = new Stopwatch()) {
            System.out.printf(" %5.6f\n", sw.step());
            HeapSort testHeap = new HeapSort();
            testHeap.sort(testa);
 */

/*
        // Use the InsertionSort
        try (Stopwatch sw = new Stopwatch()) {
            System.out.printf(" %5.6f\n", sw.step());
            InsertionSort testing = new InsertionSort();
            testing.sort(testa);

*/
    }
}


