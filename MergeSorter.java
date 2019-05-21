public class Merger {
    ArrayList<String> usersData, localCopy;
    public Merger( ArrayList<String> list) {
        usersData = list;
    }
    public void merge(int start0, int start1, int end1) {
        localCopy = new ArrayList<String>( end1 - start0);
        for(int iUserData = start0; iUserData < end1; iUserData++)
            localCopy.add(usersData.get(iUserData));
        mergeRange(start0, 0, start1 - start0, start1 - start0, end1 - start0);
    }
    private void mergeRange (target, 
        localStart0, localEnd0, localStart1, localEnd1) {
        while(localStart0 < localEnd0 && localStart1 < localEnd1 )
            if(localCopy.get(localStart0).compareTo(
                localCopy.get(localStart1)) < 0)
                usersData.set( target++, localCopy.get(localStart0++));
            else
                usersData.set( target++, localCopy.get(localStart1++));
        while( localStart0 < localEnd0)
            usersData.set( target++, localCopy.get( localStart0++));
        while( localStart1 < localEnd1)
            usersData.set( target++, localCopy.get( localStart1++));
      }
