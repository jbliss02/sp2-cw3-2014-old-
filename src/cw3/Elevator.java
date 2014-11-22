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
	private int startingFloor;
	private int movingDirection; //1 is up, 0 is not set, -1 is down
	private int numberMoves;
	
	/**]
	 * Constructor
	 * @param customerList 
	 * @param numberFloors
	 */
	public Elevator(ArrayList<Customer> customerList, int numberFloors, int startingFloor)
	{
		this.customerList = customerList;
		this.NUMBERFLOORS = numberFloors;
		this.currentFloor = startingFloor;
		movingDirection = 0;
		numberMoves = 0;
	}
	
	public void go()
	{
		while(customerList.size() > 0)
		{
			pickUpCustomer();
			dropOffCustomer();
			if(customerList.size() > 0) {basicMove();}
		}
		
		System.out.println("finished in " + numberMoves);
	}
	
	private void basicMove()
	{
		
		//set the initial moving direction, if it is not set
		if(movingDirection == 0)
		{
			movingDirection = currentFloor < NUMBERFLOORS ? 1 : -1;
		}
		
		if(movingDirection == 1 && currentFloor == NUMBERFLOORS)
		{
			movingDirection = -1;
		}
		else if(movingDirection == -1 && currentFloor == 0)
		{
			movingDirection = 1;
		}
		
		currentFloor += movingDirection;
		numberMoves++;

	}//basicMove()
	

	public void pickUpCustomer()
	{
		for(int i = 0; i < customerList.size(); i++)
		{
			if(customerList.get(i).getStartingFloor() == this.currentFloor)
			{
				customerList.get(i).setInElevator(true);
			}
		}
		
	}//pickUpCustomer()
	
	public void dropOffCustomer()
	{
		for(int i = customerList.size() - 1; i >= 0; i--)
		{
			if(customerList.get(i).getDestinationFloor() == this.currentFloor)
			{
				customerList.remove(i);
			}
		}
	}
	
	
	
}
