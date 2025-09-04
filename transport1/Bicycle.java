package transport1;

public class Bicycle extends Vehicle {
	public Bicycle(String id) {
		super(id);
		System.out.println("bicycle() constructor called");
	}
	@Override
	public void deliver(String item ,String place) {
		System.out.println("delivering "+ item +"to"+ place +"by bicycle");
	}

}
