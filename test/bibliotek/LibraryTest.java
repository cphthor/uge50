/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotek;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class LibraryTest {
	
	public LibraryTest() {
	}
	
	@Before
	public void setUp() {
	}

	@Test
	public void testSetAddress() {
		System.out.println("setAddress");
		Address address = null;
		Library instance = null;
		instance.setAddress(address);
		fail("The test case is a prototype.");
	}

	@Test
	public void testGetId() {
		System.out.println("getId");
		Library instance = null;
		int expResult = 0;
		int result = instance.getId();
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}

	@Test
	public void testGetLongName() {
		System.out.println("getLongName");
		Library instance = null;
		String expResult = "";
		String result = instance.getLongName();
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}

	@Test
	public void testGetAddresse() {
		System.out.println("getAddresse");
		Library instance = null;
		Address expResult = null;
		Address result = instance.getAddresse();
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}

	@Test
	public void testGetTypeOfLibrary() {
		System.out.println("getTypeOfLibrary");
		Library instance = null;
		String expResult = "";
		String result = instance.getTypeOfLibrary();
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}

	@Test
	public void testGetLatitude() {
		System.out.println("getLatitude");
		Library instance = null;
		Double expResult = null;
		Double result = instance.getLatitude();
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}

	@Test
	public void testGetLongitude() {
		System.out.println("getLongitude");
		Library instance = null;
		Double expResult = null;
		Double result = instance.getLongitude();
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}

	@Test
	public void testCompareTo() {
		System.out.println("compareTo");
		Object o = null;
		Library instance = null;
		int expResult = 0;
		int result = instance.compareTo(o);
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}

	@Test
	public void testToString() {
		System.out.println("toString");
		Library instance = null;
		String expResult = "";
		String result = instance.toString();
		assertEquals(expResult, result);
		fail("The test case is a prototype.");
	}
	
}
