package gsm.util;

import gsm.poly.Animal;
import gsm.poly.Cat;
import gsm.poly.Dog;
public class GSM18 {
	public static void main(String[] args) {
		Animal c = new Cat();
		c.eat();
		c.move();
		((Cat)c).night();
		Animal d = new Dog();
		//동적바인딩(override) vs 정적바인딩(overloading)
		d.eat();
		d.move();
	}
}