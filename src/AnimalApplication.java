
public class AnimalApplication {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.eat();
		a.eat("bananas");
		a.sleep();
		System.out.println(a.sound());
		
		Cat c = new Cat();
		c.eat();
		c.eat("tuna fish");
		c.sleep();
		System.out.println(c.sound());
	
		Bird b = new Bird();
		b.eat();
		b.eat("sunflower seeds");
		b.sleep();
		b.fly();
	}
}
