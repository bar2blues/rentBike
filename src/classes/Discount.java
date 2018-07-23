package classes;


public class Discount {

	public float family = 30/100;

	public float getFamily() {
		return family;
	}

	public void setFamily(float family) {
		this.family = family;
	}
	
	
	public static void addDiscount() {
		double total = 0;
		int contador = 0;
		int subTotal = 0;

		if (contador >=3 && contador <= 5) {
			total = subTotal - (subTotal* 0.3) ;
			System.out.println(total);
		}
	     
	     else {
	    	 System.out.println("No se puede aplicar descuento");
	     }
	}
	
}
