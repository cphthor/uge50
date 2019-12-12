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
public class AddressTest {
	Validation validation;
	
	@Before
	public void setUp() {
		validation = new AddressValidationRule();
	}

	@Test
	public void testValidation() {
		System.out.println("Validation");
		Address instance = new Address("2700", "Brønshøj", "Husum", "Frederikssundsvej 290");
		validation.Validate(instance);
		instance = new Address("D2700", "Brønshøj", "Husum", "Frederikssundsvej 290");
		validation.Validate(instance);
		String expResult = "";
		String result = instance.toString();
		assertEquals(expResult, result);
	}
	
}
