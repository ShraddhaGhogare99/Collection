package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    int Id;
    String FirstName;
    String LastName;


    // toString method is used to return a string representation of an object.
    public String toString() {
        return "[" + FirstName + " " + LastName + " " + Id + "]";
    }

    //create a parameterised constructor
    Employee(int Id, String FirstName, String LastName) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }


    @Override
    public int compareTo(Employee o)
    {
        return this.LastName.compareTo(o.LastName);
    }


    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Shraddha", "Ghogare"));
        list.add(new Employee(102, "Priya", "Bhujange"));
        list.add(new Employee(103, "Ketki", "Kamthe"));
        list.add(new Employee(104, "Neha", "Borker"));


        Collections.sort(list);
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}


