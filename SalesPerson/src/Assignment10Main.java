//Konrad Bryla
//Assignment 10
import java.io.*;
import java.util.Scanner;

public class Assignment10Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		SalesPerson[] employee = new SalesPerson[50];
		
	try {
		Scanner fileIn = new Scanner(new File("A10.txt"));
		int salesPeople = 0;
		
		while(fileIn.hasNext()) {
			String lastName = fileIn.next();
			String firstName = fileIn.nextLine().trim();
			double week1 = fileIn.nextDouble();
			double week2 = fileIn.nextDouble();
			double week3 = fileIn.nextDouble();
			double week4 = fileIn.nextDouble();
			
			employee[salesPeople] = new SalesPerson(lastName, firstName, week1, week2, week3, week4);
			salesPeople++;
		}
		
	System.out.printf("%-20s %-15s %-10s\n", "   Full Name", "Total Sales", "Salray");
	System.out.printf("%-20s %-15s %-10s\n", "   =========", "===========", "======");
		
	for (int i = 0;i < salesPeople; i++) {
		System.out.printf("%-10s %-10s %,10.2f %,10.2f\n", employee[i].getFirstName(),
			employee[i].getLastName(), employee[i].getTotalSales(), employee[i].getSalary());
	
			
		}
	System.out.print("============================================\n");
	double beforeAverage = 0;
	double average = beforeAverage / employee.length;
	for(int i =0; i < salesPeople;i++) {
		beforeAverage = beforeAverage + employee[i].getSalary();
	}
	System.out.printf("Average          %f\n\n", average);
	String richestFirst = null;
	String richestLast = null;
	double highestSalary = 0;
		for (int i = 0; i < salesPeople;i++) {
			if(employee[i].getSalary() > highestSalary) {
				highestSalary = employee[i].getSalary();
				richestFirst = employee[i].getFirstName();
				richestLast = employee[i].getLastName();
				}
		}
		
		
	System.out.printf("%s %s %s %,-10.2f\n", richestFirst, richestLast,"had the highest salary of $", highestSalary);
	System.out.print("============================================\n");
	
	
	//ask for input from user this will most likely not work 
	String inputFirstName = null;
	String inputLastName = null;

	System.out.print("Enter a first name: ");
	String firstName = kbd.nextLine();
	int positionOfEmployeeFirstName = 0;
	int positionVariable = 0;
	for(int i = 0; i < salesPeople; i++) {
		if(firstName.equalsIgnoreCase(employee[i].getFirstName())) {
			inputFirstName = employee[i].getFirstName();
			positionOfEmployeeFirstName = positionVariable;
		}else {
			positionOfEmployeeFirstName++;
		}
	}
	System.out.print("Enter a last name: ");
	String lastName = kbd.nextLine();
	
	int positionOfEmployeeLastName = 0;
	    positionVariable = 0;
	for(int i = 0; i < salesPeople; i++) {
		if(lastName.equalsIgnoreCase(employee[i].getLastName())) {
			inputLastName = employee[i].getLastName();
			positionOfEmployeeLastName = positionVariable;
		}else {
			positionOfEmployeeLastName++;
		}
		}
		if (positionOfEmployeeFirstName == positionOfEmployeeLastName) {
			System.out.print(employee[positionOfEmployeeFirstName].getFirstName() + " " 
					+ employee[positionOfEmployeeLastName].getLastName() + " has a salary of " + 
					employee[positionOfEmployeeLastName].getSalary());
		}else{
		System.out.print("Sorry, employee not found. Try again");
		}
	
	fileIn.close();
	}catch(Exception ex) {
		System.out.print("There has been an error" + ex.getMessage()); 
	}
	}

}
