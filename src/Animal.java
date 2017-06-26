
public class Animal implements iAnimal {

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("animal goes to sleep");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("animal eats");
	}

	
	public void eat(String food) {
		// TODO Auto-generated method stub
		System.out.printf("The animal eats food");
	}
	
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "animal makes a sound";
	}

}
