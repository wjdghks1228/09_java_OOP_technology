package step9_01.OOP_Theory;

/*
 * 
 *  # 인터페이스 (interface)
 *  
 *  - 인터페이스는 추상클래스보다 더 추상화된 클래스
 *  - 실제 구현된 것이 전혀 없는 기본 설계도
 *  - 미리 정해진 규칙에 맞게 구현하도록 '표준'을 제시하는데 사용한다.
 *  - 클래스는 인터페이스를 상속받을 수 없다.
 *  - 인터페이스는 클래스를 상속받을 수 없다.
 *  - 클래스는 클래스끼리 , 인터페이스는 인터페이스끼리 상속시킬 수 있다.
 *  - 클래스는 다중 상속을 허용하지않지만 인터페이스는 다중구현을 허용한다.
 *  
 * */


abstract class AA {
	//abstract void + 함수이름 + () + ;
	abstract void test1(); //추상 메서드
	//void 함수이름 + () + {}
	void test2() {}		   //일반 메서드
}

interface BB{
	abstract void test3(); //추상 메서드
	abstract void test4();
	//interface 는 일반 메서드 사용 불가
	//void test5();
}

interface CC{
	
	//일반적인 method 
	//void 함수이름 + () + {}
	//추상 method
	//abstract void + 함수이름 + () + ;
	
	//단, interface 에서는 메서드 앞의 abstract 는 생략이 가능하다.
	void test5();
	void test6();
}
//상속의 한계점 : 여러개 상속이 안됨
//인터페이스 : 여러개 구현이 가능
//인터페이스는 상속이 아니라 "구현한다 " 고 표현한다.
class DD implements BB,CC{
	//BB interface implements
	public void test3() {}
	public void test4() {}
	//CC interface implements
	public void test5() {}
	public void test6() {}
	// -> interface 는 다중구현이 가능하다.
}
public class OOPEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
