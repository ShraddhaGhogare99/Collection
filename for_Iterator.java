package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class for_Iterator {

    int id;
    String firstname;
    String lastname;

    public for_Iterator(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "for_Iterator{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<for_Iterator> list = new ArrayList<>();

        list.add(new for_Iterator(101, "Shraddha", "Ghogare"));
        list.add(new for_Iterator(102, "Priya", "Bhujange"));
        list.add(new for_Iterator(103, "Ketki", "Kamthe"));
        list.add(new for_Iterator(104, "Neha", "Borker"));


        for (for_Iterator e : list) {
            System.out.println(e);
        }

        for(int i=0;i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }


}
