/**
 * This is the Application object that will launch our application
 * 
 * @author Chase Hall
 * @version 3-13-23 Project 2 CS131
 */
public interface Priority {
	/**
	 * Used to let the user know the median priority
	 */
	public static final int MED_PRIORITY = 5;
	/**
	 * Used to let the user know the maximum priority
	 */
	public static final int MAX_PRIORITY = 1;
	/**
	 * Used to let the user know the minimum priority
	 */
	public static final int MIN_PRIORITY = 10;

	/**
	 * Allows you to set the priority
	 * @param priority used in calling method so you can set the priority
	 */
	public void setPriority(int priority);
	/**
	 * Outputs the priority
	 * @return the priority
	 */
	public int getPriority();

}//end interface
