/**
 * 
 */
package cw3;

/**
 * @author jbliss02 & rsalvi01
 * 
 * Customer class which holds the information related to a single customer
 * defines a unique id for this customer and randomly picks a starting and destination floor
 * defines whether the customer is in the elevator or not
 */
public class Customer {

	private int currentFloor;
	private int destinationFloor;
	private static int id;
	private boolean inElevator;

	public int GetCurrentFloor() {
		return this.currentFloor;
	}
	
	public void SetCurrentFloor(int input) {
		this.currentFloor = input;
	}
	
	public int GetDestinationFloor() {
		return this.destinationFloor;
	}
	
	public void SetDestinationFloor(int input) {
		this.destinationFloor = input;
	}


	public boolean isInElevator() {
		return inElevator;
	}

	public void setInElevator(boolean inElevator) {
		this.inElevator = inElevator;
	}


	public Customer()
	{
		this.setId(id++);
		SetRandomFloors();
	}
	
	private void SetRandomFloors()
	{
		
	}

	public static void setId(int id) {
		Customer.id = id;
	}

	
	
	
	
}
