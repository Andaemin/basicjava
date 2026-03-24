class Twice{
    void member() {
        System.out.println("I'm a Twice");
    }
}

class Nayeon extends Twice{
    void member() {
        System.out.println("I'm a Nayeon ");
    }
}

public class Overridding {
    public static void main(String[] args) {
        Twice n = new Nayeon();
        n.member();
        System.out.println();
    }
}
