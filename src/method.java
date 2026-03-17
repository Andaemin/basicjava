public class method {
    public static void hello(){
        System.out.println("Pratice Java");
    }

    public static int test(int a){
        return a * 2;
    }

    public static void test2(){
        int result = test(3) + test(4);
        System.out.println(result);
    }
    public static void main(String[] args) {
        hello();
        test2();
    }

}

