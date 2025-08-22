package lab2;

public class Car {
    // instance members
    private String c_brand;   // brand
    private String c_model;   // model
    private double c_price;   // price
    private double c_mileage;   // mileage
    private String c_owner;   // ownerName

   
    private static int total=0;          
    private static String showroomName = "D9 motorsport";  

  
  public Car(String b, String m, double p, double mil)  {
        this.c_brand = b; 
        this.c_model = m; 
        this.c_price = p; 
        this.c_mileage = mil;
        this.c_owner ="NOT ASSIGNED"; 
        total++;
    }
 
    public Car(String b, String m, double p, double mil,String o_name) {
    	this.c_brand = b;
    	this.c_model = m;
    	this.c_price = p;
    	this.c_mileage = mil;
        this.c_owner = o_name;
        total++;
    }

    
    public String getOwnerName() {
        return c_owner;
    }

    public void setOwnerName(String owner) {
        c_owner= owner;
    }
    
    public void displayDetails() {
        System.out.println("Brand: " +c_brand);
        System.out.println("Model: " +c_model);
        System.out.println("Price: " +c_price);
        System.out.println("Mileage: " +c_mileage);
        System.out.println("Owner: " +c_owner);
    }

    public void updatePrice(double newPrice) {
        c_price = newPrice;
    }

    
    public static void showTotalCars() {
        System.out.println("Total Cars: " + total);
    }

    public static void showShowroomName() {
        System.out.println("Showroom: " + showroomName);
    }
	   public static void main(String[] args) {
	        Car c1 = new Car("Toyota", "Corolla", 15000, 18.5);
	        Car c2 = new Car("Honda", "Civic", 20000, 16.0,"john");
	        Car c3 = new Car("Hyundai", "i20", 12000, 20.0);

	        c1.displayDetails();
	        c2.displayDetails();
	        c3.displayDetails();
	        
	        c1.setOwnerName("Alice");
	        c1.updatePrice(16000);

	        System.out.println("After Updates:");
	        c1.displayDetails();

	        Car.showShowroomName();
	        Car.showTotalCars();
	    }
}	

