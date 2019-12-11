/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog50;

import java.math.BigInteger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Red,Dobermann,AMY,Desexed Female,WATERLOO CORNER
 * Farve,Race,Navn,Gender,location
 */
public class DogTest {
	long id;
	String color;
	String race;
	String name;
	String gender;
	String location;
	Dog mydog;

	
	public DogTest() {
	}
	
	@Before
	public void setUp() {
		color = "Red";
		race = "Dobermann";
		name = "Amy";
		gender = "Desexed Female";
		location = "Waterloo Corner";
		id = 276098101089283L;

	}

	@Test
	public void testgetDogId() {
		mydog = new Dog(color,race,name,gender,location);
		mydog.setId(id);
		long actual = mydog.getId();
		long expected = 276098101089283L;
		assertEquals(expected, actual);
	}
	
}
