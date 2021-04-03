public class Main {

	public static void main(String[] args) {
		
		Motorcycle Suzuki = new Motorcycle();
		Suzuki.brand = "Suzuki"; 
		Suzuki.engine = "1340cc"; 
		Suzuki.colour = "Silver";
		Suzuki.type = "Hyperbike"; 
		
		Motorcycle Kawasaki = new Motorcycle(); 
		Kawasaki.brand = "Kawasaki";
		Kawasaki.type = "Superbike";
		Kawasaki.engine = "998cc"; 
		Kawasaki.colour = "Black"; 
		 
		
		System.out.println("Brand 1: " + Suzuki.brand); 
		System.out.println("Type:" + Suzuki.type);
		System.out.println("Engine:" + Suzuki.engine);
		System.out.println("Colour:" + Suzuki.colour);
		System.out.println();
		
		System.out.println("Brand 1: " + Kawasaki.brand); 
		System.out.println("Type:" + Kawasaki.type);
		System.out.println("Engine:" + Kawasaki.engine);
		System.out.println("Colour:" + Kawasaki.colour);
		System.out.println();
		System.out.println();
		
		
		Suzuki.behavior();

		
		
		
		
		
		

	}

}