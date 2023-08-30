package CollectionPrograms;

import java.util.*;

class CityComparator implements Comparator<StudentsInfo> {

    @Override
    public int compare(StudentsInfo o1, StudentsInfo o2) {
        return o1.getCity().compareTo(o2.getCity());
    }

}

class MarksComparator implements Comparator<StudentsInfo> {

    @Override
    public int compare(StudentsInfo o1, StudentsInfo o2) {
        if (o1.getMarks() > o2.getMarks()) {
            return 1;
        } else if (o1.getMarks() < o2.getMarks()) {
            return -1;
        }
        return 0;
    }

}

class SComparator implements Comparator<StudentsInfo> {

    @Override
    public int compare(StudentsInfo o1, StudentsInfo o2) {
        return o1.getS() - o2.getS();
    }

}

class StudentsInfo implements Comparable<StudentsInfo> {
    private int sr_no;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String city;
    private long marks;
    private char S;

    public StudentsInfo() {

    }

    public StudentsInfo(int sr_no, String firstName, String middleName, String lastName, String address, String city, long marks, char S) {
        this.sr_no = sr_no;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.marks = marks;
        this.S = S;
    }

    public int getSr_no() {
        return sr_no;
    }

    public void setSr_no(int sr_no) {
        this.sr_no = sr_no;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getMarks() {
        return marks;
    }

    public void setMarks(long marks) {
        this.marks = marks;
    }

    public char getS() {
        return S;
    }

    public void setS(char S) {
        this.S = S;
    }

    @Override
    public String toString() {
        return "StudentsInfo{" +
                "sr_no=" + sr_no +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", marks=" + marks + '\'' + S +
                '}';
    }

    @Override
    public int compareTo(StudentsInfo o)
    {
        return this.getFirstName().compareTo(o.getFirstName());
    }

}

public class ComparatorComparable {
    public static void main(String[] args) {

        StudentsInfo S1 = new StudentsInfo(1, "Abhishek", "Arvind", "Ghogare", "Talegaon", "Pune", 86, 'O');
        StudentsInfo S2 = new StudentsInfo(2, "Shweta", "Kishanrao", "Paikine", "Taroda Naka", "Sambhaji Nager", 85, 'E');
        StudentsInfo S3 = new StudentsInfo(3, "Arnika", "Yogesh", "Aaher", "Bavdhan", "Nanded", 84, 'D');
        StudentsInfo S4 = new StudentsInfo(4, "Atharv", "Omkar", "Godase", "Shivne", "Pusad", 83, 'C');
        StudentsInfo S5 = new StudentsInfo(5, "Vedashri", "Shailesh", "Karhale", "Kabra Nager", "Latur", 82, 'A');

        List<StudentsInfo> StInfo = new ArrayList<>();
        StInfo.add(S1);
        StInfo.add(S2);
        StInfo.add(S3);
        StInfo.add(S4);
        StInfo.add(S5);

        //System.out.println(StInfo);

        Collections.sort(StInfo);
        System.out.println("First Name Sorting using Comparable: " + StInfo);

        CityComparator cc = new CityComparator();
        Collections.sort(StInfo, cc);
        System.out.println("City Name Sorting using Comparator: " + StInfo);


        MarksComparator mm = new MarksComparator();
        Collections.sort(StInfo, mm);
        System.out.println("Marks Sorting using Comparator: " + StInfo);

        SComparator nn = new SComparator();
        Collections.sort(StInfo, nn);
        System.out.println("Char sorti" +
                "ng using Comparator: " + StInfo);

    }

}
