/**
  Implement a selection sort, in the Sorters structure
 */
import java.util.ArrayList;

public class SelectionSorter extends Sorter {

    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter(  ArrayList< String> usersData) {
        super(usersData);
    }

    public void mySort() { // selection sort
        for (int counter = 0; counter < elements.size(); counter++) {
            int index = champIndex(elements, counter);
            String lowest = elements.get(index);
            elements.set(index, elements.get(counter));
            elements.set(counter, lowest);
            // System.out.println(elements);
        }
    }

    private int champIndex(ArrayList<String> challengers, int startLocation) {
         String dweeb = "ZZZZZZZZZZZZ"; // not a perfect solution, strings might be bigger
         int dweebLocation = 0;
         for (int index = startLocation; index < challengers.size(); index++)
             if (challengers.get(index) != null && challengers.get(index).compareTo(dweeb) < 0) {
                 dweeb = challengers.get(index);
                 dweebLocation = index;
             }
         return dweebLocation;
     }
}
