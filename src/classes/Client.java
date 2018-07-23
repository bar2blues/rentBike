package classes;

import java.util.ArrayList;
import java.util.List;



public class Client {
	
	private String firstName;
	private String lastName;
	private String adress;
	private int phone;
	private int DNI;
	private int age;
   private float discount;
	
    
    
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	public Client(String firstName, String lastName, String adress, int phone, int DNI, int age)
    {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.adress = adress;
    	this.phone = phone;
    	this.DNI = DNI;
    	this.age = age;
    	this.discount = 0;
    }

}
