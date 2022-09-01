package OOP_Employee_Edge;

public class WelcomrText_UC1 {
	int IS_FULL_TIME = 1;
	
	public void getAttendance() {

		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
		   System.out.println("Employee is present");
		else
		   System.out.println("Employee is absent");
		}


	public static void main(String[] args) {
		WelcomrText_UC1 emp = new WelcomrText_UC1();
		emp.getAttendance();

	}

}
