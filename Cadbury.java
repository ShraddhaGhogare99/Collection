package CollectionPrograms;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Cadbury {

    public static void main(String[] args) {

        ArrayList obj=new ArrayList();

        obj.add(7378543510l);  //0
        obj.add("Shraddha");   //1
        obj.add(789);          //2
        obj.add("Developer");  //3
        obj.add("Shraddha");     //4


        ArrayList obj1=new ArrayList();

        obj1.add(7378543510l);
        obj1.add("Shraddha");
        obj1.add(789);
        obj1.add("Developer");
        //obj1.add(789);


        System.out.println("clone "+obj.clone());

        System.out.println(".equals method: "+obj.equals(obj1));
        System.out.println(obj);
        System.out.println(".get method: "+obj.get(2));
        System.out.println("Contains method: "+obj.contains("Shraddha"));
        System.out.println(".equals method: "+obj.equals(7378543510l));
        System.out.println("index of: "+obj.indexOf(789));
        System.out.println("remove method: "+obj.remove(1));
        System.out.println("after removing elememt: "+obj);
        obj.add(1,"Shraddha");
        System.out.println("after adding removable element: " +obj);
//        obj.clear();
//        System.out.println("clear all elements: "+obj);
//

        obj.addAll(obj1);
        System.out.println("Add all elements using addall method: "+obj);

       // obj.iterator();

        System.out.println(obj.subList(1,3));
        System.out.println(obj.lastIndexOf("Shraddha"));

        System.out.println("size method: "+obj.size());
        System.out.println(obj.isEmpty());

        System.out.println("Contains all: "+obj.containsAll(obj));
        System.out.println();

        System.out.println("clone method: "+obj.clone());
        //clone method is Arraylist method

        System.out.println("to array: "+obj.toArray());



    }

}
