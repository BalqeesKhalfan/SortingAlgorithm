/**Objective:

 Develop a Java program that implements the Selection Sort algorithm to sort an array of integers in ascending order.

 Requirements:

 The program should define an integer array with hardcoded values for sorting.

 Implement the Selection Sort algorithm to sort the array in ascending order.

 The sorting logic should be encapsulated in a method named selectionSort.

 After sorting, the array should be printed to the console to display the sorted order.

 Start with the first element of the array. This element is considered the minimum and will be compared with other elements to find the actual minimum in the unsorted part of the array.

 Scan the rest of the array to find the minimum value. If a smaller value than the current minimum is found, update the minimum with this new value.

 After completing the scan, swap the minimum found with the first element of the unsorted part of the array.**/
public class SelectionSort {
    public static void main(String[] args){
        // Define an array of integers with its elements
        int[] firstArray = {9,14,3,2,43,11,58,22,8,55,4,11};
        System.out.println("Before Selection Sort");
        for(int i:firstArray){
            System.out.print(i+" ");
        }
        System.out.println();
        selectionSort(firstArray); // Call the selectionSort method to sort the array
        System.out.println("After  Selection Sorting");
        for (int i:firstArray){
            System.out.print(i+" ");
        }
    }

    //function of selection sort elements of array
    public static  void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int position=i;// Initialize the index or the position  of the minimum element
            // find position of smallest num between (i + 1)th element and last element
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[position]){
                    position=j;
                }
            }
            // Swap smallerNum to current position on array
            int smallerNum = arr[position];
            arr[position] = arr[i];
            arr[i] = smallerNum;
        }

    }
}
