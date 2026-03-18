class Person3 {
    String name;
    int age;

    Person3(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class test {
    public static void main(String[] args){
        Person3 p1 = new Person3("test", 30);

        System.out.println(p1.name + " " + p1.age);
    }
}

