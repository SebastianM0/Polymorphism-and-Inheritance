package com.generation;

import java.util.HashMap;

public class SalesManager extends SalesRep{
	private HashMap<Integer, SalesRep> salesTeam;
	
	//1. Constructor
	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked, int 	vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
		
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, 		salesMade);
		salesTeam = new HashMap<>();
		}//constructor 

    // Agregar a los SalesRep dentro del HashMap del salesTeam
    public void addToTeam(SalesRep salesRep) {
        salesTeam.put(salesRep.getRegistration(), salesRep); //llave (registration) y la info del salesRep
        System.out.println("Se ha agregado a :" + salesRep.getFirstName() + " " + salesRep.getLastName() + " al salesTeam ");
    }

    // Calcular comisión total
    public String calculateComission() {
        double totalSales = 0;
        System.out.println("----Calculando la comisión del salesTeam----");
        for (SalesRep salesRep : salesTeam.values()) { //foreach fake sacando los valores del salesTeam
            totalSales += salesRep.getSalesMade();
        }
        return "El total de la comisión del manager es de : " + (0.03 * totalSales);
    }

	@Override
	public String toString() {
		return "SalesManager [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getRegistration()=" + getRegistration() + "]";
	}

    
    //3.toString
    	



    
    
    
    
    
}//class SalesManager

