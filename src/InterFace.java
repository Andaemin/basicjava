
interface interface1{
    void test();

}

class first implements interface1{
    public void test(){
        System.out.println("I'm a First ");
    }
}

class second implements interface1{
    public void test(){
        System.out.println("I'm a Second ");
    }
}

public class InterFace {
    public static void main(String[] args) {
        interface1 f = new first();
        interface1 s = new second();

        f.test();
        s.test();
    }
}
