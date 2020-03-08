package Sorting;


import java.awt.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] test = {"dd", "bb", "a's", "as","cc", "aa", "c", "test", "testing", "a", "aa", "ac", "ab"};
        //{"aa", "cc", "ff","bb", "ee"};

        //{"dd", "bb", "a", "cc", "aa", "c","test", "testing", "a"};

        String path = "shakespeare-complete-works.txt";
        String del = " ";


        String [] testa =Files. lines ( Paths.get( path ))
                . flatMap ( line -> Stream.of( line . split (del )))
                . filter ( word -> ! word . isEmpty ())
                
                .map( word -> word . toLowerCase ())
                . toArray ( String []:: new );

        for(int i = 0 ; i< testa.length;i++){
            testa[i]=testa[i].replaceAll("[^\\x00-\\x7F]", "");
            testa[i]=testa[i].replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", "");
            testa[i]=testa[i].replaceAll("\\p{C}", "");
        }

        for ( int i = 0 ; i<100;i++){
            System.out.println(testa[i] +" er size " +testa[i].length());
        }



    /*    try ( Stopwatch sw = new Stopwatch ()) {
            System .out . printf (" %5.6f\n", sw. step ());
            MergeTopDown testMerge = new MergeTopDown();
            testMerge.sort(testa);
            System .out . printf (" %5.6f\n", sw. step ());
        }
        System.out.println(testa[testa.length-1]);
*/

/*
        try ( Stopwatch sw = new Stopwatch ()) {
            System .out . printf (" %5.6f\n", sw. step ());
            SelectionSort testSelection = new SelectionSort();
            testSelection.sort(testa);
            System .out . printf (" %5.6f\n", sw. step ());
        }
*/

  /*     try ( Stopwatch sw = new Stopwatch ()) {
            System .out . printf (" %5.6f\n", sw. step ());
            HeapSort testSelection = new HeapSort();
            testSelection.sort(testa);*/

        }

        /*
        SelectionSort testing = new SelectionSort();

        testing.sort(test);


        for(int a = 0 ; a < test.length ; a++){
            System.out.println(test[a]);
        }
        */

        /*
        InsertionSort testing = new InsertionSort();
        testing.sort(test);

        for (int a = 0; a < test.length; a++) {
            System.out.println(test[a]);

        }
        */

        /*
        MergeTopDown testing = new MergeTopDown();
        testing.sort(testa);

        for (int a = 0; a < test.length; a++) {
            System.out.println(testa[a]);
        }
        */
  //      for (int a = 0; a < 100; a++) System.out.println(testa[a]);
    }


