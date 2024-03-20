/**Implement the Selection Sort algorithm in a Java method called selectionSortStrings to sort an array of strings in alphabetical order. This task requires an approach to compare and arrange strings, taking into account their alphabetical sequence while considering case sensitivity. The goal is to enhance your understanding of sorting algorithms, specifically Selection Sort, and their application to sorting arrays of non-numeric data.

 Requirements:

 Input: An array of strings, potentially containing both uppercase and lowercase letters.

 Output: The same array where the strings have been sorted in alphabetical order, respecting case sensitivity.

 Implement the Selection Sort algorithm manually; do not use Java's built-in sorting methods.

 Test your method with an array containing a mix of uppercase and lowercase letters to verify that your sorting algorithm considers case sensitivity correctly.**/

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSortingStrings {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        //ask user to enter length of array
        System.out.print("Enter the Length of your array : ");
        Integer n=scanner.nextInt();
        scanner.nextLine();
        String[] arr=new String[n];
        System.out.println("Enter Strings :");
        for (Integer i = 0; i < n; i++) {
            String userInput = scanner.nextLine();
            while (!isString(userInput)) { // Check if input is a string
                System.out.println("Invalid input! Please enter a string:");
                System.out.print("String " + (i + 1) + ": ");
                userInput= scanner.nextLine();
            }
            arr[i] = userInput;
        }
        System.out.print("Array Element before sorting :"+ Arrays.toString(arr));
        scanner.close();
        selectionSortString(arr);
        System.out.println();
        System.out.println(" Array Elements After Reverse Sorting:");

        System.out.println(Arrays.toString(arr));


    }
    // Method to check if a given input is a string or not
    public static boolean isString(String userInput){
        return userInput != null && !userInput.trim().isEmpty() && userInput.matches("[a-zA-Z]+");
    }
    public static void selectionSortString(String[] arr){
        // Iterate through the array length - 1
        for ( int j=0; j < arr.length-1; j++ )
        {
            // Find min: the index of the string reference that should go into cell j.
            // Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
            int min = j;// Initialize the index or the position  of the minimum element
            for ( int k=j+1; k < arr.length; k++ )
                if ( arr[k].compareTo( arr[min] ) >0 )
                { min = k;}

            // Swap the reference at j with the reference at min
            String temp = arr[j];
            arr[j] = arr[min];
            arr[min] = temp;
        }

    }


}
