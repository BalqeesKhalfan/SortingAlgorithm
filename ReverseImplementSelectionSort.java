import java.util.ArrayList;
import java.util.List;

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
            List<Integer> numList = new ArrayList<>();
            numList.addAll(List.of(9,14,3,2,43,11,58,22,8,55,4,11));

            System.out.println("Before Selection Sort");
            prinArrayElement(numList);
            System.out.println();
            selectionSort(numList); // Call the selectionSort method to sort the array
            System.out.println("After  Selection Sorting Acending Order ");
            prinArrayElement(numList);
            System.out.println();
            selectionReversSort(numList); // Call the selectionReversSort method to sort the array revers mode or(decending order )
            System.out.println("After  Selection Reverse Sorting ");
            prinArrayElement(numList);
        }
        public static  void selectionSort(List<Integer> list){
            for(int i=0;i<list.size()-1;i++){
                int position=i;// Initialize the index or the position  of the minimum element
                // find position of smallest num between (i + 1)th element and last element
                for(int j=i+1;j<list.size();j++){
                    if(list.get(j)<list.get(position)){
                        position=j;
                    }
                }
                // Swap smallerNum to current position on array list
                Integer smallerNum = list.get(position);
                list.set(position, list.get(i));
                list.set(i, smallerNum);


            }

        }
            //function of selection sort elements of array
         public static  void selectionReversSort(List<Integer> list){
             int n = list.size();
             for (int i = 0; i < n - 1; i++) {
                 int maxIndex = i;
                 for (int j = i + 1; j < n; j++) {
                     if (list.get(j) > list.get(maxIndex)) {
                         maxIndex = j;
                     }
                 }
                 // Swap elements manually without using
                 Integer maxNum= list.get(maxIndex);
                 list.set(maxIndex, list.get(i));
                 list.set(i, maxNum);
             }
         }
         public  static void prinArrayElement(List<Integer> list){
             for(int i:list){
                 System.out.print(i+" ");
             }
         }
}




