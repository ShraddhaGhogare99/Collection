package CollectionPrograms;

import java.util.*;

public class IntegerSorting  {

    public static void main(String[] args) {

        List ll=new ArrayList();

       // String i="10";
       // ll.add(String.valueOf(i));

        ll.add(Integer.parseInt("10"));

        ll.add(5);
        ll.add(20);
        ll.add(15);

        //System.out.println(ll);

        Collections.sort(ll);
        System.out.println(ll);

    }

}
