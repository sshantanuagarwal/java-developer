package ArrayList.src;

import java.util.Random;

public class Assignment {

    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[ i ] + " ");
        }
        System.out.println();
    }
    public static void question1(int[] arr) {
        System.out.println("\n========Question 1==========\n");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        print(arr);
    }
    public static void question2(int[] arr) {
        System.out.println("\n========Question 2==========\n");
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
    }


    public static void question3(int[] arr) {
        System.out.println("\n========Question 3==========\n");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }


    public static void question4(int[] arr) {
        System.out.println("\n========Question 4==========\n");
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Average = " + sum/arr.length);
    }


    public static void question5(int[] arr) {
        System.out.println("\n========Question 4==========\n");
        int k = 10;
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == k) {
                found = true;
                break;
            }
        }
        System.out.println("Element " + k + "is " +
                (found ? "found" : "not found") + "in array"  );
    }


    public static void question6(int[] arr) {
        System.out.println("\n========Question 6==========\n");
        int k = 10;
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == k) {
                found = true;
                break;
            }
        }
        System.out.println("Element " + k + "is " +
                (found ? "found" : "not found") + "in array"  );
    }

    public static void question7(int[] arr) {
        System.out.println("\n========Question 6==========\n");
        int k = arr[5];
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == k) {
                System.out.println("Element " + k + "is in array at index " + i  );
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[]  arr = new int[10];
        Random randNum = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = randNum.nextInt() % 10;
        }
        print(arr);
        question1(arr);
        question2(arr);
        question3(arr);
        question4(arr);
        question5(arr);
        question6(arr);
        question7(arr);
        //question8(arr);
        //question9(arr);
    }
}
