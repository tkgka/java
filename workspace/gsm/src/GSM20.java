import java.awt.DisplayMode;

import gsm.poly.Animal;
import gsm.poly.Cat;
import gsm.poly.Dog;

public class GSM20 {
	public static void main(String[] args) {
		Animal[] a = new Animal[2];
        a[0] = new Cat();
        a[1] = new Dog();
        display(a);
        
	}

	private static void display(Animal[] a) {
		 for(int i=0;i<2;i++) {
	        	a[i].eat();
	            a[i].move();	
	            if(a[i] instanceof Cat) {
	            	((Cat) a[0]).night();            	
	            }
	        }
	}
}
