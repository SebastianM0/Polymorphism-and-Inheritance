package com.generation;

import com.generation.Employee;

public class Main {
	public static void main(String[] args) {
		
		Employee Sebastian = new Employee("Sebastian", "Moran", 1123, 23, 500, 4, 450, 4);
		
		//Funciones empleado
		System.out.println(Sebastian);
		System.out.println(Sebastian.timeToRetirement());
		System.out.println(Sebastian.vacationTimeLeft());
		System.out.println(Sebastian.calculateBonus());
		
		//Funciones SalesRep
		SalesRep Emma = new SalesRep("Emmanuel", "Aguilera", 0712, 30, 2000, 20, 750, 10, 18000);
		SalesRep Silvy = new SalesRep("Silvy", "Saint", 0510, 33, 2500, 25, 750, 12, 17530);
		System.out.println(Emma.calculateComission());
		System.out.println(Silvy.calculateComission());
		
		//Funciones SalesManager
		SalesManager Frank = new SalesManager("Frank", "Sinatra", 0070, 45, 5000, 50, 1200, 25, 0);
		System.out.println("Frank ahora es el Manager");
		System.out.println(Frank);

		//Agregar personas al equipo
		Frank.addToTeam(Emma);
		Frank.addToTeam(Silvy);
		
		//Comision del manager
		System.out.println(Frank.calculateComission());

		
		
	}//main
}//class Main
