package CollectionPrograms;

import java.util.*;

public class test implements Comparable<test> {
    private int empid;
    private String empname;
    private double empsal;

    test(int empid, String empname, double empsal) {
        this.empid = empid;
        this.empname = empname;
        this.empsal = empsal;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getEmpsal() {
        return empsal;
    }

    public void setEmpsal(double empsal) {
        this.empsal = empsal;
    }

    @Override
    public String toString() {
        return "test{" +
                "Empid=" + empid +
                ",Empname=" + empname +
                ", Empsal=" + empsal +
                "}";

    }


    @Override
    public int compareTo(test o) {
        return this.getEmpname().compareTo(o.empname);
    }
}

class test1 {
    public static void main(String args[]) {
        test ref = new test(10, "shubh", 39000);
        test ref1 = new test(11, "akash", 35000);
        test ref2 = new test(9, "deepak", 31000);
        List<test> obj = new ArrayList<>();
        obj.add(ref);
        obj.add(ref1);
        obj.add(ref2);

        Collections.sort(obj);
        System.out.println("print list:" + obj);
    }

}
