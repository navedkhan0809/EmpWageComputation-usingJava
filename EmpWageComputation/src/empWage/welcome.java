package empWage;

public class welcome {

	public static void main(String[] args) {

		// initializing variables
		int empRatePerHr = 20, salary = 0, empHrs = 0, totalSalary = 0, workingdays=20;

		for(int i=1; i<=workingdays; i++) {
			
			// generating random number
			double randomCheck = Math.floor(Math.random()*10) % 3;
			int random = (int)randomCheck;

			// Applying condition
			switch (random) {
				case 1: empHrs = 8;
				break;
		
				case 2: empHrs = 4;
				break;
		
				default: empHrs = 0;
				}

		// Calculating salary
		salary = empHrs * empRatePerHr;
		totalSalary = totalSalary + salary; 
		}
		
		// Calculating total salary
		System.out.println("Total Salary is: "+totalSalary);
	}

}