package empWage;

public class welcome {
	
	static double empwage(double a , double b , double c , double d , double e , double f) {
		while(d < f && e < c) {
					
					// generating random number
					double randomCheck = Math.floor(Math.random()*10) % 3;
					int random = (int)randomCheck;
		
					// Applying condition
					switch (random) {
						case 1: a = 8;
						break;
				
						case 2: a = 4;
						break;
				
						default: a = 0;
						}
				d = d + a;
				// Calculating salary
				b = d*a; 
				}
				
				// Calculating total salary
				System.out.println("Total Salary is: "+b);
				
				return b;
			}

	public static void main(String[] args) {
		
		
		// initializing variables
		int empHrs = 0, totalSalary = 0, workingdays=20, totalEmpHrs = 0, totalWorkingDays = 0, MaxHrsInMonth=100;
		
		//calling method
		empwage(0,0,20,0,0,100);
	}

}