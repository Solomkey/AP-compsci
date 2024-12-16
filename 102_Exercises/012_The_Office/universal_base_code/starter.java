/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		
		Employee jim =new Employee(2474, "Jim", "Halpert", 4416.66);
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		
		Employee kevin = new Employee(3421, "Kevin", "Malone", 4416.66);
		
		dwight.raiseSalary(500);
		jim.raiseSalary(30);
		pam.raiseSalary(10);
		kevin.raiseSalary(8000);
		
		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		kevin.employeeToString();
		
		
		
		
		
	}
}
