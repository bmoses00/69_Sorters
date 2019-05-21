public class SubSortThenMerge_Sorter extends Sorter {
    public SubSortThenMerge_Sorter(  ArrayList< String> usersData) {
        super( usersData);
    }
    public void mySort() {
        sortRange( 0, elements.size());
    }
    private void sortRange(int startAt, int stopBefore) {
        if (splitBefore < stopBefore) {
            sortRange(startAt, splitBefore);
            sortRange(         splitBefore, stopBefore);
            new Merger(elements).merge(startAt
                                     , splitBefore
                                     , stopBefore);
        }
        else
    }
}
