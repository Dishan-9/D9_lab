package transport1;

public class Ebike extends Bicycle {
	private int v_battery;
	public Ebike(String id,int battery) {
		super(id);
		this.v_battery=battery;
		System.out.println("Ebike() constructor called");
	}
	@Override
	public void deliver(String item,String place) {
		System.out.println("checking battery "+ v_battery +"%");
		super.deliver(item, place);
	}
}
