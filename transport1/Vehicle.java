package transport1;

public abstract class Vehicle {
	protected String v_id;
	
	public Vehicle(String id) {
        this.v_id = id;
        System.out.println("Vehicle() constructor called");
    }
    public abstract void deliver( String item, String place);

}