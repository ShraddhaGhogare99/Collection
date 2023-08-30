package CollectionPrograms;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

public class IteratorProgram {

    public static void main(String[] args) {

        //create arraylist
        ArrayList<Integer> ref = new ArrayList<>();
        ref.add(123);
        ref.add(456);
        ref.add(789);
        ref.add(101112);
        ref.add(131415);

        for (Integer i : ref) {

            //ref.add(4785);
            try {
               // ref.add(4785); //concurrentModificationException //fail fast
            } catch (ConcurrentModificationException e) {

            }

        }

        ListIterator<Integer> iterator = ref.listIterator();
        while (iterator.hasNext()) {
            if(iterator.hasPrevious()){

                System.out.println("It has previous element: "+iterator.next());
            }

            iterator.add(487); //no exception occur  //fail safe
            System.out.println("It has next element: " + iterator.next());

       }
        //System.out.println(ref);

        }
    }

