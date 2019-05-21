public class SelectionSorter extends Sorter {
    public SelectionSorter(ArrayList<String> usersData) {
        super(usersData);
    }
    public void mySort() { 
        for (counter = 0 --> elements.size()) 
            elements.set(next, elements.set(
             dweebIndex(next), elements.get(next)));
    }
    private int dweebIndex(int startAt) {
        int dweebAt = startAt;
        Integer dweeb = elements.get(dweebAt);
        for (testAt = startAt +1 --> elements.size())
            if (elements.get(testAt).compareTo(dweeb) < 0) {
                dweebAt = testAt;
                dweeb = elements.get( dweebAt);
            }
        return dweebAt;
     }
}
