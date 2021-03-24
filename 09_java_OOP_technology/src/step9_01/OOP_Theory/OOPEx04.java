package step9_01.OOP_Theory;

/*
 * 
 * 	# this : 자신의 객체
 *  # super : 부모클래스의 객체
 *  
 *  # this() : 자신의 생성자
 *  # super() : 부모클래스의 생성자
 *  
 *  # this.testMethod() : 자신의 메서드 호출
 *  # testMethod()		: 자신의 메서드 호출
 *  
 *  # super.testMethod() : 부모의 메서드 호출
 * 
 * */

//부모
class Parent{
	String name;
	int age;
	
	Parent(){  //생성자 : 클래스 이름과 똑같은 메서드
		this("무명", 0 ); //현재 클래스의 Parent(String name, int age)생성자 호출
		System.out.println("부모 클래스의 기본 생성자 실행");
	}
	Parent(String name, int age	){
		this.name  = name;
		this.age = age;
		System.out.println("부모클래스의 추가된 생성자 실행");
	}
	
	void testMethod() {
		System.out.println("부모 클래스의 테스트 메서드");
	}
}

//자식 : 부모상속
class Child extends Parent{
	Child (){
		super(); // 부모클래스의 기본 생성자를 실행 (기본적으로 생략되어 있습니다.)
		
		//super("앨런튜링", 70);  : 부모클래스의 Parent(String name, int age) 생성자를 실행
		System.out.println("자녀 클래스의 기본생성자 실행");
	}
	Child(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("자녀 클래스의 추가된 생성자 실행");
	}
	
	void testMethod() {
		System.out.println("자녀 클래스의 테스트 메서드");
	}
	void testMethod1() {
		super.testMethod();//부모의 testMethod 호출
	}
	
	void testMethod2() {
		this.testMethod(); //내꺼 -> this 생략가능
	}
	
	
}

public class OOPEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Parent();
		new Parent("제임스 고슬링",  70	);
		System.out.println();
		System.out.println("=========================================");
		System.out.println();
		new Child(); //부모클래스의 기본 생성자 부터 한번 갔다옴
		System.out.println();
		System.out.println("=========================================");
		System.out.println();
		new Child("제임스 고슬링 주니어" , 5);
		System.out.println();
		System.out.println("=========================================");
		System.out.println();
		Child child = new Child("제임스 고슬링 주니어" , 5);
		//객체가 생성된 시점에만 상속 부모님에게 왔다갔다온다.
		child.testMethod();
		//객체 생성된 후에 .메서드 호출시에는 부모안갔다오고 직빵으로 간다.
		System.out.println("****************************************************");
		child.testMethod1();
		System.out.println("****************************************************");
		child.testMethod2();
		System.out.println("****************************************************");
		
	}
}
