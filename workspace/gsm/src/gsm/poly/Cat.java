package gsm.poly;
public class Cat extends Animal{

	//부모의 eat를 자식이 재정의(override)
	public void eat() {
		System.out.println("고양이가 먹음 ");
	}
	public void move() {
		System.out.println("고양이가 무리를 지어 이동한다");
	}	
	 public void night() {
		 System.out.println("밤에보면 반짝임");
	 }

}
