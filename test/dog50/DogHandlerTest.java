/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog50;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class DogHandlerTest {
	DogHandler dogHandler;
	
	public DogHandlerTest() {
	}
	
	@Before
	public void setUp() {
	}

	@Test
	public void testloadDogsFromStorage() {
		dogHandler = new DogHandler();
		ArrayList<Dog> dogs = dogHandler.loadDogsFromStorage();
		int actual = dogs.size();
		int expected = 4;
		assertEquals(expected, actual);
	}
	
}
