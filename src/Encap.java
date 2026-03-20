
class capsule1{
    private String name;
    private int age;

    public void setCapsule(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getCapsule(){
        return name + " " + age;

    }
}

public class Encap {
    public static void main(String[] args) {
        capsule1 c1 = new capsule1();

        c1.setCapsule("kim", 30);

        System.out.println(c1.getCapsule());

    }
}
