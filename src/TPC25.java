import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {
    public static void main(String[] args) {

        // eat() --> 재정의(overriding)
        // 추상메서드(부모의 역할로 사용 -> 명령을 내리는 쪽)
        Animal ani = new Dog(); // upCasting
        ani.eat(); // eat() 재정의를 하여 다형성 보장이 된다.
                    // 부모가 하위클래스 동작방식을 몰라도.. 동작됨
        ani.move();

        ani = new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night(); // downCasting

    }
}
