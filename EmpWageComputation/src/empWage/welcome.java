package empWage;

public class welcome {

	public static void main(String[] args) {

		// initializing variables
		int empHrs = 0, totalSalary = 0, workingdays=20, totalEmpHrs = 0, totalWorkingDays = 0, MaxHrsInMonth=100;

		while(totalEmpHrs < MaxHrsInMonth && totalWorkingDays < workingdays) {
			
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
		totalEmpHrs = totalEmpHrs + empHrs;
		// Calculating salary
		totalSalary = totalEmpHrs*empHrs; 
		}
		
		// Calculating total salary
		System.out.println("Total Salary is: "+totalSalary);
	}

}