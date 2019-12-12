/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package bibliotek;

/**
 *
 * @author thor
 */
public class AddressValidationRule implements Validation {
	
	@Override
	public void Validate(Address address) {
		
		if (address.getPostalcode().matches(".*[a-zA-Z].*")) {
			throw new IllegalArgumentException("Must not contain letters");
		}
	}
	
}
