package CollectionPrograms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class Products {

    private String name;
    private double rating;
    private int rate;

    Products(String name, double rating, int rate) {
        this.name = name;
        this.rating = rating;
        this.rate = rate;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;

    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Products{" + "name= " + name + '\''
                + " ,rating= " + rating + '\''
                + " ,rate= " + rate + '}';

    }

}
class Comparing{

    public static void main(String[] args) {

        Products p1=new Products("Mobile",6.5,85000);
        Products p2=new Products("Laptop",3.5,100000);
        Products p3=new Products("Tv",5,55000);
        Products p4=new Products("Tv",5.6,55000);

        List<Products> pro=new ArrayList<>();
        pro.add(p1);
        pro.add(p2);
        pro.add(p3);
        pro.add(p4);

//        Comparator<Products> rateComparator=Comparator.comparing(Products::getRate);
//        Comparator<Products> ratingComparator=Comparator.comparing(Products::getRating);
//
//        Collections.sort(pro,rateComparator);
//        pro.forEach(System.out::println);
//
//        Collections.sort(pro,ratingComparator);
//        pro.forEach(System.out::println);
//
//
//        System.out.println("------------------------------------");
////
//       List<Products> sortedProducts=
//        pro.stream().sorted(rateComparator.thenComparing(ratingComparator)).collect(Collectors.toList());
//       sortedProducts.forEach(System.out::println);


Comparator<Products> sorting=Comparator.comparing(Products::getRate).thenComparing(Products::getRating);
Collections.sort(pro,sorting);
pro.forEach(System.out::println);
    }
}
