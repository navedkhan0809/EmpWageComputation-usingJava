package empWage;

public class welcome {

	public static void main(String[] args) {

		// initializing variables
		int empRatePerHr = 20, isParttime = 1, isFulltime = 2, salary = 0, empHrs = 0;

		// generating random number
		double randomCheck = Math.floor(Math.random()*10) % 3;

		// Applying condition
		if (randomCheck == isParttime) {
			empHrs = 8;

		} else if (randomCheck == isFulltime) {
			empHrs = 4;

		} else {
			empHrs = 0;
		}

		// Calculating salary
		salary = empHrs * empRatePerHr;

		// Calculating total salary
		System.out.println("Total Salary is: "+salary);
	}

}