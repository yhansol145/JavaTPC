import java.util.Locale;

public class TPC34 {
    public static void main(String[] args) {

        String str = new String("APPLE");
        String v = str.toLowerCase(Locale.ROOT);
        System.out.println(v);
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.indexOf("PL"));

    }
}
