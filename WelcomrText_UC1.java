package OOP_Employee_Edge;

public class WelcomrText_UC1 {
	public final static int IS_PRESENT = 1;
	public final static int IS_PART_TIME = 2;
	public static double WAGE_PER_HOUR = 20;
	public static double FULL_DAY_HOUR = 8;
	public static double PART_TIME_HOUR = 4;
	
	public static int attendance() {
		int crrAttedance = (int) Math.floor(Math.random() * 10) % 3;
		if (crrAttedance == IS_PRESENT) {
			System.out.println("Emplyee is present.");
			System.out.println("Employee daily wage is "+(FULL_DAY_HOUR * WAGE_PER_HOUR));
			return IS_PRESENT;
		} else if (crrAttedance == IS_PART_TIME) {
			System.out.println("Emplyee is part time.");
			System.out.println("Employee daily wage is "+(PART_TIME_HOUR * WAGE_PER_HOUR));
			return IS_PART_TIME;
		} else {
			System.out.println("Employee is absenet.");
			System.out.println("Employee daily wage is 0");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		attendance();
	}

}
