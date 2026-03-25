import java.util.ArrayList;

class Person4{
    String name;
    Person4(String name){
        this.name=name;
    }
}

public class collectionarray {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        ArrayList<Person4> list2 =new ArrayList<>();
        list.add(10);
        for(int i=1; i <= 10;i++){
            list.add(i + 10);
        }
        list2.add(new Person4("nayeon"));

        System.out.println(list);
        System.out.println(list2.get(0).name);

        for(int s : list) {
            System.out.print(s + " ");
        }

    }

}
