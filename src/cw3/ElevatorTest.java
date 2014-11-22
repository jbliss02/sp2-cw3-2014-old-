package cw3;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ElevatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	//@Test
	public void test2() {
		fail("Not yet implemented");
	}
	
	//@Test
	public void test(){
		
		
		
		Customer c = new Customer(10, 2, 2);
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(c);
		
		Elevator elevator = new  Elevator(customers, 10, 2);
		
		
		elevator.pickUpCustomer();
		assertEquals("test", true, customers.get(0).isInElevator());
		
		elevator.dropOffCustomer();
		assertEquals("test 2", 0, customers.size());
		
		
	}
	

	
	
	

}
