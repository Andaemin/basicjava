class Person{
    String name;
    int age;
}

public class classed {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "kim";
        p2.name = "Yim";
        p1.age = 23;
        p2.age = 23;

        System.out.println(p1.name + "의 나이는 : " + p1.age );
    }
}
