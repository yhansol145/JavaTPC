import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC27 {
    public static void main(String[] args) {

        // RemoCon으로 TV 클래스를 구동하시오

        RemoCon r = new TV();

        for(int i=0 ; i<60 ; i++){
            r.chUp();
        }

        System.out.println("--------------------");

        for(int i=0 ; i<60 ; i++){
            r.chDown();
        }
    }
}
