package CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ItreratorDemo {

    public static void main(String[] args) {
        List ll=new ArrayList<>();
        ll.add("Java");
        ll.add("Program");
        ll.add(100);
        ll.add(50);

//        Iterator itr=ll.iterator();
//
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        ListIterator itr1=ll.listIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());

        }
    }
}
