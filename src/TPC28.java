import kr.poly.A;

public class TPC28 {
    public static void main(String[] args) {

        Object a = new A(); // upCasting
        ((A)a).display(); // downCasting
        System.out.println(a.toString());
        System.out.println(a);

    }
}
