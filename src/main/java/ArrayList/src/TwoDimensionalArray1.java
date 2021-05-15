package ArrayList.src;

import java.util.Random;

public class TwoDimensionalArray1 {

    public static void print(int[][] arr) {
        for(int i =0; i < arr.length; i ++ ) {
            // arr[i] <- i th row

            System.out.print( (i+1) + "th ROW elements:\t" );
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print( arr[i][j] + "\t" );
            }
            System.out.println();
        }
    }

    public static int[][] insert( int[][] arr) {
        Random rand = new Random();
        for( int i =0 ; i < arr.length; i ++ ) {
            for(int j = 0; j < arr.length; j++ ){
                arr[i][j] = Math.abs(rand.nextInt()) % 20;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[][] arr = new int[3][3];

        arr = insert(arr);
        print(arr);


    }
}
