package ch_6_1;

public class Car {
	
	int speed;//필드값으은 초기화 하지 않으면 기본값 0오로 초기화 -> 필드, 멤버변수, 속성
	
	public void printSpeed() {
		int speed; //이 변수는 필드가 아니다 -> 메서드 또는 생성자 내에서는 필드를 선언할 수 없다
		this.speed = 10;
		System.out.println(this.speed);
	}

}
