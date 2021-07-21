import kr.tpc.Inflearn;

public class TPC31 {

	public static void main(String[] args) {
		
		//Inflearn inf = new Inflearn(); // private 이라서 접근 불가능
		
		//inf.tpc();
		Inflearn.tpc();
		
		//inf.java();
		Inflearn.java(); // static은 new를 이용하지 않고 클래스이름. 으로 접근 가능하다.
		
		
		// Java API 생성자 private
		//System sys = new System(); -> private 이라 접근 불가능
		System.out.println("출력");
		
		//Math m = new Math(); -> private 이라 접근 불가능
		int v = Math.max(10, 20);
		System.out.println(v);
		
	}

}
