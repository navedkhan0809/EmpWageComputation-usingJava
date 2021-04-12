package empWage;

public class welcome {

	public static void main(String[] args) {
		
		// initializing variables
		int empRatePerHr = 20, empHrs = 8, isPresent = 1, salary = 0;
		
		// generating random number
		double empCheck = Math.floor(Math.random()*10) % 2;
		
		if (empCheck == isPresent) {
			// Calculating salary
			salary = empHrs*empRatePerHr;
			System.out.println("Salary is: "+salary);
		
		} else {
			System.out.println("Salary is: "+salary);

		}

	}

}
