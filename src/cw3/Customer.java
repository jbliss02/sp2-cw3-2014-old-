package cw3;

public class Customer {

	private int currentFloor;
	private int destinationFloor;
	private static int id;
	private boolean inElevator;
	private boolean finished;
	
	public int getId() {
		return id;
	}
	
	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public int getDestinationFloor() {
		return destinationFloor;
	}

	public void setDestinationFloor(int destinationFloor) {
		this.destinationFloor = destinationFloor;
	}

	public boolean isInElevator() {
		return inElevator;
	}

	public void setInElevator(boolean inElevator) {
		this.inElevator = inElevator;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	
	
	/**
	 * @author jbliss02 & rsalvi01
	 * Creates ONE customer and sets the starting and destination floors 
	 * @param noOfFloors
	 */
	
	public Customer()
	{
		
	}
	
	public Customer(int noOfFloors)
	{
		id++;
		setCurrentFloor(randInt(0,noOfFloors));
		setDestinationFloor(randInt(0,noOfFloors));
		finished = false;
	}

	/**
	* Returns a pseudo-random number between min and max, inclusive.
	* 13 cannot be assigned as a starting or destination floor
	*
	* @param min Minimum value
	* @param max Maximum value. Must be greater than min.
	* @return Integer between min and max, inclusive.
	*/
	private int randInt(int min, int max)
	{
		int value = 13;
		
		while (value == 13)
		{
			value = min + (int)(Math.random() * ((max - min) + 1));
		}
		
		return value;
	}
}