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
	int id;
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
	}

	@Test
	public void testgetDogId() {
		mydog = new Dog(color,race,name,gender,location);
		int actual = mydog.getDogId();
		long expected = 276098101089283L ;
		assertEquals(expected, actual);
	}
	
}
