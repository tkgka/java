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
		//�������ε�(override) vs �������ε�(overloading)
		d.eat();
		d.move();
	}
}