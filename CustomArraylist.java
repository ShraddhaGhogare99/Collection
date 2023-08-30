package CollectionPrograms;

class Students {

    Object[] arr;
    int Size;
    int Capacity;

    Students() {
        Size = 0;
        Capacity = 10;
        arr = new Object[Capacity];

    }

}

class CustomArraylist extends Students {

    //int n = 2;

    void add(Object item) {
        arr[Size++] = item;

    }

    Object get(int index)
    {
        return arr[index];
    }

    int size()
    {
        return Size;
    }

//    Object remove(int index){
//        return Size;
//    }



    public static void main(String[] args) {

        CustomArraylist cc = new CustomArraylist();
        cc.add(1);
        cc.add(2);
        cc.add(3);

        for(int i=0; i<cc.size(); i++){
            System.out.println("Get method: "+cc.get(i));

        }

        System.out.println("Size method: "+cc.size());
       // System.out.println("Remove method: "+cc.remove(0));


    }


}
