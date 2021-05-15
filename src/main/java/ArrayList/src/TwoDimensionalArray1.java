package ArrayList.src;

import java.util.Random;

public class TwoDimensionalArray1 {

	public static final int N = 3;
	public static final int M = 3;


	public static void print(int[][] arr) {
		for(int i =0; i < arr.length; i ++ ) {
			// arr[i] <- i th row

			System.out.print( (i+1) + "th ROW elements:\t" );
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print( arr[i][j] + "\t" );
			}
			System.out.println();
		}
		System.out.println("\n");
	}

	public static int[][] insert( int[][] arr) {
		Random rand = new Random();
		for( int i =0 ; i < arr.length; i ++ ) {
			for(int j = 0; j < arr[i].length; j++ ){
				arr[i][j] = Math.abs(rand.nextInt()) % 10;
			}
		}
		return arr;
	}

	public static int [][] add (int[][] arr1, int[][] arr2){
		int[][] resultArray = new int[N][M];
		for( int i =0 ; i < N; i ++ ) {
			for(int j = 0; j < M; j++ ){
				resultArray[i][j] =arr1[i][j] + arr2[i][j];
			}
		}

		return resultArray;


	}

	public static void multiply (int[][] arr1, int[][] arr2){
		int[][] resultArray = new int[N][M];
		for( int i =0 ; i < N; i ++ ) {
			for(int j = 0; j < M; j++ ){
				resultArray[i][j]= 0;
				for(int k = 0; k < M; k++ ){
					resultArray[i][j]+= arr1[i][k] * arr2[k][j];

				}
			}
		}

		print(resultArray);


	}

	public static void transpose (int[][] arr){
		int[][] resultArray = new int[M][N];
		for( int i =0 ; i < N; i ++ ) {
			for(int j = 0; j < M; j++ ){
				resultArray[j][i]= arr[i][j];

			}
		}

		print(resultArray);


	}

	public static void main(String[] args) {

		int[][] arr = new int[N][M];

		int[][] arr1 = new int[N][M];
		int[][] resultArray = new int[N][M];
		//int[][] MultiresultArray = new int[N][N];

		arr = insert(arr);
		print(arr);
		arr1 = insert(arr1);
		//print(arr1);
		resultArray = add(arr,arr1);
		//print(resultArray);
		//multiply(arr,arr1);
		transpose(arr);




	}
}
