class Person2{
    String name;
    int age;

    Person2 (String name, int age){
        this.name = name;
        this.age = age;
    }

    void print(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class thisis {
    public static void main(String[] args) {
        Person2 p1 = new Person2("kim",23);
        p1.print();

    }
}
