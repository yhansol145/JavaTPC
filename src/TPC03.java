import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	
	public static void main(String[] args) {
		// 관계를 이해하라. PDT VS UDDT
		// 정수 1개를 저장하기 위한 변수를 선언하시오
		
		int a;
		a=10;
		
		// 책 1권을 저장하기 위한 변수를 선언
		Book b;
		
		b = new Book(); // 객체 생성
		b.title = "자바";
		b.price = 15000;
		b.company = "한빛미디어";
		b.page = 700;
		
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.println(b.page); 
		
		
		// 사람 1명을 저장하기 위한 변수 선언
		PersonVO p;
		
		p = new PersonVO();
		p.name = "유한솔";
		p.age = 29;
		p.weight = 60.1f;
		p.height = 170.2f;
		
		System.out.print(p.name+"\t");
		System.out.print(p.age+"\t");
		System.out.print(p.weight+"\t");
		System.out.println(p.height);
	}
}
