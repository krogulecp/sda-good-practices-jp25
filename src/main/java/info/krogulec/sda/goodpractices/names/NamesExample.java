package info.krogulec.sda.goodpractices.names;

import java.util.ArrayList;
import java.util.List;

public class NamesExample {

    List<int[]> theList;

    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<>();
        for (int [] x : theList) {
            if (x[0] == 4) {
                list1.add(x);
            }
        }
        return list1;
    }
}
