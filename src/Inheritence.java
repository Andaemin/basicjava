class test1{
    protected void testSound(){
        System.out.println("test code");
    }
}
class test2 extends test1{
}


public class Inheritence {
    public static void main(String[] args){
        test2 tester = new test2();
        tester.testSound();
    }
}
