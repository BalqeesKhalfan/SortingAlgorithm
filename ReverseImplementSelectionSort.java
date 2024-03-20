/**
 * Objective:
 *
 * Develop a Java program that reverse implements the Selection Sort algorithm to sort an array of integers in ascending order.
 *
 * Requirements:
 *
 * The program should define an integer array with hardcoded values for sorting.
 *
 * Implement the Selection Sort algorithm to sort the array in descending order.
 *
 * The sorting logic should be encapsulated in a method named selectionSort.
 *
 * After sorting, the array should be printed to the console to display the sorted order.
 */
public class ReverseImplementSelectionSort {

        public static  void main(String[]args) {
            // Define an array of integers with its elements
            int[] firstArray = {9,14,3,2,43,11,58,22,8,55,4,11};
            System.out.println("Before Selection Sort");
            prinArrayElement(firstArray);
            System.out.println();
            selectionSort(firstArray); // Call the selectionSort method to sort the array
            System.out.println("After  Selection Sorting Acending Order ");
            prinArrayElement(firstArray);
            System.out.println();
            selectionReversSort(firstArray); // Call the selectionReversSort method to sort the array revers mode or(decending order )
            System.out.println("After  Selection Reverse Sorting ");
            prinArrayElement(firstArray);
        }
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
            //function of selection sort elements of array
         public static  void selectionReversSort(int[] arr){
                int n = arr.length;
                for (int i = 0; i < n - 1; i++) {
                    // Find the maximum element in the unsorted array
                    int max_idx = i;
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] > arr[max_idx]) {
                            max_idx = j;
                        }
                    }
                    int temp = arr[max_idx];
                    arr[max_idx] = arr[i];
                    arr[i] = temp;
                }
         }
         public  static void prinArrayElement(int[] arr){
             for(int i:arr){
                 System.out.print(i+" ");
             }
         }
}




