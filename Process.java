/**
 * This is the Application object that will launch our application
 * 
 * @author Chase Hall
 * @version 3-13-23 Project 2 CS131
 */
public class Process implements Priority, Comparable<Process> {
	final private String processID;// used to set the Id of the process
	private int priority;// used to set the priority

	/**
	 * Used to create a Process
	 * 
	 * @param processID allows you to input the ID of the process in calling method
	 */

	public Process(String processID) {
		this.processID = processID;
		this.priority = 5;
	}//end constructor
	
	/**
	 * Compares the Priority of two Processes
	 */

	public int compareTo(Process p) {
		double f1 = (double) getPriority();
		double f2 = (double) p.getPriority();

		if (f1 - f2 == 0) {
			return 0;
		} else if (f1 - f2 < 0) {
			return (-1);
		} else {
			return 1;
		}
	}//end compareTo
	/**
	 * Allows you to set the Priority
	 */

	public void setPriority(int priority) {
		this.priority = priority;

	}//end setPriority
	/**
	 * Outputs the priority
	 */

	public int getPriority() {
		return priority;
	}//end getPriority
	
	/**
	 * Outputs the process ID
	 * @return the process ID
	 */

	public String getProcessID() {
		return processID;
	}//end getProcessID
	
	/**
	 * Outputs the important information of the Process
	 */

	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString

}//end class
