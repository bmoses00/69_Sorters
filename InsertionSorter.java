/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {

    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(ArrayList< String> usersData) {
        super(usersData);
    }
    /*
    PRECONDITION: Input is an ArrayList of strings
    POSTCONDITION: ArrayList of Strings sorted in ascending order

    For elements 1 to n - 1, insert el in the correct position
    in the sorted region

    */
    public void mySort() { // insertionSort
        for (int numInserted = 1; numInserted < elements.size(); numInserted++) {
            insert(elements, numInserted);
            // System.out.println(elements);
        }
    }
    public String insert(ArrayList<String> list, int numInserted) {
        String nextToSort = list.get(numInserted);
        for (int indexToCompare = numInserted - 1; ; indexToCompare -= 1) {
             if (indexToCompare ==  -1 || nextToSort.compareTo( list.get(indexToCompare) ) > 0)
                 return list.set(indexToCompare + 1, nextToSort);
             else list.set(indexToCompare + 1, list.get(indexToCompare));
         }
     }

}
