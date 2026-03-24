class Cast {
    int castNumber;
    void Cast1() {
        System.out.println("I'm a Cast ");
    }

    public void setCast(int castNumber) {
        this.castNumber = castNumber;
    }

    public String getCast() {
        return castNumber + ": DownCasting";

    }
}

class Downcast extends Cast {
    void Cast1() {
        System.out.println("I'm a Downcast ");
    }
}

public class Casting {
    public static void main(String[] args) {
        Cast c = new Downcast(); // 업캐스팅
        Downcast d = (Downcast)c; // 다운캐스팅

        d.setCast(5);
        d.Cast1();
        System.out.println(d.getCast());

    }
}
