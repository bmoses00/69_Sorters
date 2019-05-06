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


    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() { // insertionSort
        for (int numInserted = 1; numInserted < elements.size(); numInserted++)
            insert(elements, numInserted);
    }

    public int insert(ArrayList<String> list, int numInserted) {
        String nextToSort = list.get(numInserted);
        for (int indexToCompare = numInserted - 1; ; indexToCompare -= 1) {
             if (indexToCompare ==  -1 || nextToSort > list.get(indexToCompare)) // compareTo()
                 return list.set(indexToCompare + 1, nextToSort);
             else list.set(indexToCompare + 1, list.get(indexToCompare));
         }
     }

}
