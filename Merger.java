/**
  Represent a merge operation for sorted lists,
  as described in README.md
 */
import java.util.ArrayList;

public class Merger {

    ArrayList<String> usersData, localCopy;

    /**
      Construct an instance from a list of data
      part of which is to be merged. See README
     */
    public Merger( ArrayList<String> list) {
        usersData = list;
    }


    /**
      Merge the sorted sub-lists.
     */

    public void mergeReceiver() {
        mergeReceiverWData(0, usersData.size());
        merge(0, usersData.size() / 2, usersData.size());
    }


    public void mergeReceiverWData(int start, int end) {
        int mid = (start + end) / 2;
        if (end - start <= 1) return;
        else {
            merge(start, (start + mid) / 2, mid);
            mergeReceiverWData(start, mid);

            merge(mid, (mid + end) / 2, end);
            mergeReceiverWData(mid, end);
        }
    }


    public void merge(
      // indexes of sub-list boundaries; see README
        int start0  // index of first item in list0
      , int start1  // index of first item in list1
                    // = just past end of list0
      , int end1  // number of items in the merged list
                    // = just past end of list1
      ) {
          System.out.println("start: " + start0 + " end: " + end1);
          localCopy = new ArrayList<String>();
          for( int iUserData = 0; iUserData < end1; iUserData++)
              localCopy.add( usersData.get( iUserData));
          mergeSort(
          start0, // where we will place el's in usersData
          start0,
          start1,
          end1,
          start1);// this start1 does not change, represents end of list 0
    }

    // store var to see if we have to check if lists are empty?
    public void mergeSort(int target, int start0, int start1, int end1, int end0) {
        /*
        System.out.println("start0: " + start0);
        System.out.println("start0: " + start0);
        System.out.println("start1: " + start1);
        System.out.println("end1  : " + end1  );
        System.out.println("start1: " + start1);
        */
        if (start0 == end0) addRest(target, start1, end1);
        else if (start1 == end1) addRest(target, start0, end0);

        else if (localCopy.get(start0).compareTo(localCopy.get(start1)) <= 0) {
            usersData.set(target, localCopy.get(start0));
            mergeSort(target + 1, start0 + 1, start1, end1, end0);
        }
        else if (localCopy.get(start0).compareTo(localCopy.get(start1)) > 0) { // potentially could be else, not sure
            usersData.set(target, localCopy.get(start1));
            mergeSort(target + 1, start0, start1 + 1, end1, end0);
        }
    }

    public void addRest(int target, int start, int end) {
        for (int counter = start; counter < end; counter++, target++) {
            usersData.set(target, localCopy.get(counter));
        }
    }

    /**
      @return a string representation of the user's data
     */
    public String toString() {
        return "" + usersData;
    }


    /**
      @return the boolean value of the statement
         "the data in the range are in ascending order"
     */
    public boolean isSorted( int startAt, int endBefore) {
        for( int i = startAt
           ; i < endBefore -1 // stop early, because comparing to next
           ; i++
           )
            if( usersData.get(i).compareTo( usersData.get(i+1)) > 0) return false;
        return true;
    }
}
