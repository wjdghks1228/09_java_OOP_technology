package step9_01.OOP_Theory;

//공통된 특징을 딴 큰틀을 제작 

/*
 * Method Overriding
 * 메서드 오버라이딩
 * 
 * -부모 클래스로부터 상속 받은 메서드를 재정의 하여 사용한다.
 * -메서드 오버로딩과 혼용되기 쉽다.
 * 
 * 
 * */

//메서드 오버라이딩과 메서드 오버로딩의 차이점은 무엇입니까?
//==> 메서드 재정의와 메서드 중복정의의 차이점은 무엇입니까?
//
//(다시만드는것과 중복해서 만드는것의 차이점이 무엇인지 ?)
//
//재정의 (overLoading)
//class Calc{
//	void adder(int a){}
//	void adder(int a, int b){}
//	void adder(double a, double b){}
//}
////파라미터의 차이에 따라 달라진다.
//
//
//중복정의 (OverRiding)
//class p{
//	 void abc(){}
//}
//
//class C extend P {
//	void abc(){
//	
//	}
//}
////부모자식간 부모 메서드를 다시만들어서 튜닝해서 쓰는것.


class Warrior2 extends Character{
	//Method OverRiding : 메서드 오버라이딩
	void levelUp() { //부모의 메서드랑 이름은 같지만 내가만든거만 사용함.
		this.level++;
		this.power += 1000;
		this.dex += 500;
		this.life += 1000;
		this.mana += 100;
		System.out.println("[레벨업] LEVEL : " + this.level);
	}
	
	void dash() {
		System.out.println("# dash!");
	}
}

class Wizzard2 extends Character{
	void levelUp() { //부모의 메서드랑 이름은 같지만 내가만든거만 사용함.
		this.level++;
		this.power += 10;
		this.dex += 50;
		this.life += 10;
		this.mana += 1000;
		System.out.println("[레벨업] LEVEL : " + this.level);
	}
	
	void methor() {
		System.out.println("# methor!");
	}
}


//상속받고 한줄도 안써도 character(부모)의 기능을 쓸수있다.
//상속받은 것을 바꿔쓴다 : Override

public class OOPEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warrior2 war2 = new Warrior2();
		war2.dash();
		war2.dash();
		war2.dash();
		war2.showStatus(); 
		war2.levelUp();
		war2.showStatus(); 
		System.out.println("======================");
		Wizzard2 wiz2 = new Wizzard2();
		wiz2.methor();
		wiz2.methor();
		wiz2.methor();
		wiz2.showStatus();
		wiz2.levelUp();
		wiz2.levelUp();
		wiz2.levelUp();
		wiz2.showStatus();
	}
}
