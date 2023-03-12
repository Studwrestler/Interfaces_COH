/**
 * This is the Application object that will launch our application
 * 
 * @author Chase Hall
 * @version 3-13-23 Project 2 CS131
 */
public class Task implements Priority, Comparable<Task> {
	/**
	 * This enumerated value is for status of a task
	 * 
	 * @author Chase
	 *
	 */
	enum Status {
		/**
		 * Deems the task not started
		 */
		NOT_STARTED,
		/**
		 * Deems the task in progress
		 */
		IN_PROCESS,
		/**
		 * Deems the task as complete
		 */
		COMPlETE
	}// end Status

	private final String name;// used to name Task
	private int priority;// used to deem a priority of the task
	private Status AStatus;// used to set a status of the task

	/**
	 * Allows you to create a Task
	 * 
	 * @param name used to name task through calling method
	 */
	public Task(String name) {
		this.name = name;
		this.priority = 5;
	}// end Task

	/**
	 * Outputs the name of the task
	 * 
	 * @return the name of the task
	 */

	public String getName() {
		return name;
	}// end getName

	/**
	 * Outputs the status of the task
	 * 
	 * @return the status of the task
	 */

	public Status getStatus() {
		return AStatus;
	}// end getStatus

	/**
	 * Allows you to set the status of the class
	 * 
	 * @param AStatus used in calling method so the status can be set
	 */
	public void setStatus(Status AStatus) {
		this.AStatus = AStatus;
	}// end setStatus

	/**
	 * Used to set the Priority of the task
	 * 
	 * @param priority is used to set the priority of the task
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}// end setPriority

	/**
	 * outputs the priority of the task
	 * 
	 * @return the priority of the task
	 */

	public int getPriority() {
		return priority;
	}// end getPriority

	/**
	 * compares the priority of two tasks
	 */

	public int compareTo(Task t) {
		double f1 = (double) getPriority();
		double f2 = (double) t.getPriority();

		if (f1 - f2 == 0) {
			return 0;
		} else if (f1 - f2 < 0) {
			return (-1);
		} else {
			return 1;
		}
	}// end compareTo

	/**
	 * outputs the important data of the task in a string
	 */

	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + ", AStatus=" + AStatus + "]";
	}// end toString

}// end class
