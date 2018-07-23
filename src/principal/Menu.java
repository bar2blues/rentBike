package principal;

import java.util.ArrayList;
import java.util.List;

import classes.*;



public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int values[] = {2, 4, 20, 15, 5, 60, 60, 5, 60,5, 20};
		float subTotal = 0 ;
		int contador = 0;
		
		    for(int count = 0; count < values.length; count++){
		    	if (values[count] == 5 || values[count] == 20|| values[count] == 60) {
		    	 
		    	 contador ++;
		    	 subTotal += values[count];
		        }		    
		   }
		    
		    
		
		 System.out.println(subTotal);
		 System.out.println(contador);		 
	
	double total = 0;

	if (contador >=3 && contador <= 5) {
		total = subTotal - (subTotal* 0.3) ;
		System.out.println(total);
	}
     
     else {
    	 System.out.println("No se puede aplicar descuento");
     }
 }
}