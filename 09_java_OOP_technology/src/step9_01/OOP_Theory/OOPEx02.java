package step9_01.OOP_Theory;
/*
 * 
 *  # 상속
 * 
 *  - 클래스간의 부모자식관계를 설정해서 클래스를 광범위하게 사용이 가능하다.
 *  
 *  - 단일 상속만 가능하다. ( 다중상속 불가 )
 *    Ex) Class A extends B,C,D,E  (불가능)
 *
 *  - 모든 클래스는 Object클래스를 상속받은 상태에서 시작한다.
 *    
 *  - [ 호칭 ]  
 *  
 *  	> 부모 , 상위 , 슈퍼 , 기반 클래스  
 *  	> 자식 , 하위 , 서브 , 파생 클래스
 *
 *  - [ 형식 ]
 * 
 *   	class 자식클래스 이름 extends 부모클래스이름 {
 *   
 *   	}
 * 
 * */

//공통된 특징을 딴 큰틀을 제작 
class Character{
	int level = 1;
	int power = 10;
	int dex = 10;
	int life = 10;
	int mana = 10;
	
	void levelUp() {
		this.level++;
		this.power += 10;
		this.dex += 10;
		this.life += 10;
		this.mana += 10;
		
		System.out.println();
		System.out.println("[레벨업] LEVEL : " + this.level);
		System.out.println();
	}
	
	void showStatus() {
		System.out.println();
		System.out.println("****************************");
		System.out.println("#LEVEL : " + this.level);
		System.out.println("#POWER : " + this.power);
		System.out.println("#D E X : " + this.dex);
		System.out.println("#LI FE : " + this.life);
		System.out.println("#MA NA : " + this.mana);
		System.out.println("****************************");
		System.out.println();
	}
}

//상속 extends
//한부모 - > 여러자녀  (O)
//여러자녀 - > 한부모  (X)
class Warrior extends Character{}
//부모 : Character
//자식 : Warrior
class Wizzard extends Character{}
//부모 : Character
//자식 : Wizzard

//상속받고 한줄도 안써도 character(부모)의 기능을 쓸수있다.
//상속받은 것을 바꿔쓴다 : Override

public class OOPEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warrior war1 = new Warrior();
		war1.showStatus(); 
		war1.levelUp();
		war1.showStatus(); 
		System.out.println("======================");
		Wizzard wiz1 = new Wizzard();
		wiz1.showStatus();
		wiz1.levelUp();
		wiz1.levelUp();
		wiz1.levelUp();
		wiz1.showStatus();
	}
}
