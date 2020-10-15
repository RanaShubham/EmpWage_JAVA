package EmpWage_JAVA;

public class EmpWage {
	
	static final int WAGE_PER_HOUR = 20;
	static final int FULL_DAY_HRS=8;
	static final int PART_TIME_HRS=4;
	public static void main(String[] args) {
		
		System.out.println("Welcome to Emp Wage computation");
		int empAttendance = (int)Math.floor(Math.random()*10)%3;
		
		switch (empAttendance) 
		{
			case  1:
				System.out.println("Daily wage for today as full time emp is: "+WAGE_PER_HOUR*FULL_DAY_HRS);
				break;
			case  2:
				System.out.println("Daily wage for today as part time emp is: "+WAGE_PER_HOUR*PART_TIME_HRS);
				break;
			default :
				System.out.println("Daily wage for today is 0");
		}
	}

}
