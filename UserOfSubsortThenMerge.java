import java.util.ArrayList;
import java.util.Arrays;

public class UserOfSubsortThenMerge {

    public static void main(String[] args) {

        Merger list = new Merger(new ArrayList<String>(Arrays.asList(

            "Z", "A", "W", "B", "L", "Y"

        )));

        /*
        We receive a list of size n. We break it into two parts.
        So, we call mergeReceiver* with (0, n / 2 + 1, n) probably. What happens next?
        Depends. If n / 2 is equal to 1 (or less than), then we just return the
        list. No problemo, already sorted.
        If n / 2 is greater than 1, then we need two new calls to merge. The first is
        for the first half of the list, the second call is for the second half of the list


        * change name later
        */

        System.out.println(list.usersData); // unsorted

        list.mergeReceiver();

        System.out.println(list.usersData); // sorted
    }
}
