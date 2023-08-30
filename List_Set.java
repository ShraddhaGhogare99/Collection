package CollectionPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List_Set {
    public static void main(String[] args) {

        List ll = new ArrayList();
        ll.add(20);
        ll.add("Shraddha");
        ll.add(null);
        ll.add(null);
        ll.add(9000);
        ll.add(9000);

        System.out.println(ll);

        Set ss=new HashSet();
        ss.add(79);
        ss.add("Arnika");
        ss.add(null);
        ss.add(null);
        ss.add(545);
        ss.add(545);
        System.out.println(ss);

    }
}
