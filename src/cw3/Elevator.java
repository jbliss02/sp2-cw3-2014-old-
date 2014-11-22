/**
 * 
 */
package cw3;

import java.util.ArrayList;

/**
 * @author jbliss02 & rsalvi01
 *
 * Creates a single instance of an elevator that serves a building
 * The maximum number of floors 
 *
 */
public class Elevator {

	private final int NUMBERFLOORS;
	private ArrayList<Customer> customerList;
	private int currentFloor;
	
	/**]
	 * Constructor
	 * @param customerList 
	 * @param numberFloors
	 */
	public Elevator(ArrayList<Customer> customerList, int numberFloors)
	{
		this.customerList = customerList;
		this.NUMBERFLOORS = numberFloors;
	}
	

}
