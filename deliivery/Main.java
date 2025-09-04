package deliivery;
import transport1.Drone;
import transport1.Ebike;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Constructor Chaining Demo ##");        
        Ebike e = new Ebike("EB-101", 50);
        e.deliver("Sandwich", "Library");
        Drone d = new Drone("DR-1");
        d.deliver("Notes", "ExamCell");   
        double bill = d.cost(5); 
        System.out.println("Drone delivery cost: Rs." + bill);
    }
}