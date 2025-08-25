package lab2;



public class Showroom {
    public static void main(String[] args) {
        Cars c1 = new Cars("Toyota", "Corolla AE 86", 15000, 18.5);
        Cars c2 = new Cars("Honda", "Civic type-R", 20000, 16.0);
        Cars c3 = new Cars("Hyundai", "IQ", 12000, 20.0);

        c1.displayDetails();
        c2.displayDetails();
        c3.displayDetails();
        
        
        c1.displayDetails(); 
		System.out.println();
		
		c2.displayDetails();
		System.out.println();

		c3.displayDetails();
		System.out.println();
		
		// Setting Owners name and updating price for all  objects
		c1.setOwnerName("harshal bhai");
		c1.updatePrice(30);
		
		c2.setOwnerName("Dhanush");
		c2.updatePrice(50);
		
		c3.setOwnerName("KShithij");
		c3.updatePrice(70);
		
		// After updates
		System.out.println("After Updates:");
		System.out.println("==============");
		
		//Displaying the details after Updating
        c1.displayDetails();
		System.out.println();

		c2.displayDetails();
		System.out.println();

		c3.displayDetails();
		

        
        System.out.println("After Updates:");
        c1.displayDetails();
        Cars.showShowroomName();
        Cars.showTotalCars();
        
        
          
    }
}