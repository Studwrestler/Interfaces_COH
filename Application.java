/**
 * This is the Application object that will launch our application
 * 
 * @author Chase Hall
 * @version 3-13-23 Project 2 CS131
 */
public class Application {
	/**
	 * Default
	 */
	Application() {

	}

	/**
	 * Main loop of application
	 * 
	 * @param args arguments of main method
	 */

	

	public static void main(String[] args) {
		RationalNumber r1 = new RationalNumber(1,2);
		RationalNumber r2 = new RationalNumber(1,4);
		RationalNumber r3 = new RationalNumber(1,2);
		
		System.out.println("Rational Number Class");
		System.out.println("Rational Number 1 compared to Rational Number 2: "+r1.compareTo(r2));
		System.out.println("Rational Number 2 compared to Rational Number 1: "+r2.compareTo(r1));
		System.out.println("Rational Number 3 compared to Rational Number 1: "+r3.compareTo(r1));
		System.out.println("      ");
		
		Task t1 = new Task("Eat Food");
		Task t2 = new Task("Drink Water");
		Task t3 = new Task("Sleep");
		
		System.out.println("Task Class");
		System.out.println("Name for Task 1: "+t1.getName());
		t1.setStatus(Task.Status.NOT_STARTED);
		System.out.println("Status for Task 1 :"+t1.getStatus() );
		t1.setStatus(Task.Status.IN_PROCESS);
		System.out.println("New Status for Task 1: "+t1.getStatus());
		System.out.println("Priority for Task 1: "+t1.getPriority());
		t1.setPriority(10);
		System.out.println("New Priority for Task 1: "+t1.getPriority());
		System.out.println("Priority for Task 2: "+t2.getPriority());
		System.out.println("Priority for Task 3: "+ t3.getPriority());
		System.out.println("Task 1 Priority compared to Task 2 Priority: "+t1.compareTo(t2));
		System.out.println("Task 2 Priority compared to Task 1 Priority: "+t2.compareTo(t1));
		System.out.println("Task 3 Priority compared to Task 2 Priority: "+t3.compareTo(t2));
		System.out.println("Task 1 String "+ t1.toString());
		System.out.println(" ");
		
		Process p1 = new Process("Eat");
		Process p2 = new Process("Drink");
		Process p3 = new Process("Sleep");
				
		System.out.println("Process Class");
		System.out.println("Process ID for Process 1: "+ p1.getProcessID());
		System.out.println("Priority for Process 1: "+p1.getPriority());
		p1.setPriority(10);
		System.out.println("New Priority for Process 1: "+p1.getPriority());
		System.out.println("Process 1 compared to Process 2 Priority: "+ p1.compareTo(p2));
		System.out.println("Process 2 compared to Process 1 Priority: "+ p2.compareTo(p1));
		System.out.println("Process 3 compared to Process 2 Priority: "+ p3.compareTo(p2));
		System.out.println("Process 1 String: "+p1.toString());
		
	

	}// end main

}// end class
