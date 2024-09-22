package com.generation;

public class SalesRep extends Employee {

	private double salesMade;
	
	//1. Constructor
	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, double salesMade){
		
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade=salesMade;
	}//Constructor
	
	   public String calculateComission(){
   		System.out.println("----Tus ventas " + getFirstName() + " han sido de---");
   		System.out.println("$" + salesMade);
		   double comission = 0.1*salesMade;
		   return "Tu comisión será de: " + comission;
		   }//calculateComission

	   
	   
		public void setSalesMade(double salesMade) {
			this.salesMade = salesMade;
		}//setSalesMade

	   
	   
	   //2.Getters & Setters
	public double getSalesMade() {
		return salesMade;
	}//getSalesMade
	
	//.3 toString
	
	@Override
	public String toString() {
		return "SalesRep [calculateComission()=" + calculateComission() + ", getSalesMade()=" + getSalesMade() + "]";
	}//toString
 

}//class SalesRep
