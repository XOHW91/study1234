package super_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * super.super 가 안되는 이유
		 * - 부모 클래스에서 확장된 클래스가(자식클래스) 부모의 부모 클래스를 접근함으로써
		 *   캡슐화 위반을 막기위함
		 * - 따라서, 부모클래스의 메서드를 우회하여 부모의 부모클래스의
		 *   메서드나, 멤버변수에 접근할 수 없다!  
		 * */
	}
}

class Unit {
	// 현재 유닛의 위치
	int x;
	int y;
	public void move(int x, int y) {
		// 전달받은 x, y 좌표로 이동
		this.x = x;
		this.y = y;
	}
}

// 공중유닉
class AirUnit extends Unit {
	// 공중유닛은 날아다니기 때문에 장애물과 상관없이
	// 클릭한 위치로 이동가능
	// 따라서, 재정의(Override) 하지 않음
}

// 지상유닛
class GroundUnit extends Unit {
	
	// 지상유닛은 장매물이 있으면 우회해서 목적지에 도달하거나
	// 클릭한 위치가 장애물이면 목적지에 최대한 가깝게 이동함
	// => 따라서 물려받은 move 기능을 재정의(Override) 해야함
	@Override
	public void move(int x, int y) {
//		if(클릭한 위치가 장애물이면) {
//			~~~
//		} else if(경로상 장애물이 있으면) {
//			~~~
//		}
	}
}

class Tank extends GroundUnit {

	@Override
	public void move(int x, int y) {
		// super.super 가 가능했다면?
		// 지상유닛이지만 장애물과 상관없이 이동 가능해져버린다.
		// 자바에서는 이러한 캡슐화위반을 방지하기 위하여
		// usper.super와 같이 접근하는 방법을 문법적으로 차단함!
//		super.super.move(x, y);
	}
	
}































