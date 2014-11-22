/**
 * 
 */
package cw3;

import java.util.ArrayList;

/**
 * @author jbliss02 & rsalvi01
 *
 *The main driving program that takes an input from the user
 *creates a list of customers, creates the building class 
 *
 */
public class Program {

	/**
	 * @param args
	 */
	
	private static ArrayList<Customer> customerList;
	private static Building building;
	
	public static void main(String[] args) {
		createCustomerList(1,1);
		createBuilding(customerList,1);
	}
	
	private static void createCustomerList(int numberCustomers, int numberFloors) 
	{
		for(int i = 0; i < numberCustomers; i++)
		{
			Customer c = new Customer(numberFloors);
			customerList.add(c);
		}
	}
	
	private static void createBuilding(ArrayList<Customer> customerList, int numberFloors)
	{
		building = new Building(customerList, numberFloors);
	}
	
	
	
	
	
	

}
