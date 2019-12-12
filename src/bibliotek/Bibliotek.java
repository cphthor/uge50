/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotek;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author thor
 */
public class Bibliotek {

	public static void main(String[] args) {
		ArrayList<Address> ads = new ArrayList<>();

		Address ta = new Address("D2700", "Brønshøj", "Husum", "Frederikssundsvej 290");
		Address tb = new Address("2700", "Brønshøj", "Husum", "Frederikssundsvej 290");
		Address tc = new Address("3100", "Brønshøj", "Husum", "Frederikssundsvej 290");
		Validation val = new AddressValidationRule();
		try {
			
		val.Validate(ta);
		System.out.println(ta);
		} catch (Exception e) {
			System.out.println("Error: "+ e);
		}
		try {
			
		val.Validate(tb);
		System.out.println(tb);
		} catch (Exception e) {
			System.out.println("Error: "+ e);
		}
		try {
		val.Validate(tc);
		System.out.println(tc);
		} catch (Exception e) {
			System.out.println("Error: "+ e);
		}
		/*
		LibraryHandler libraryHandler = new LibraryHandler();
		ArrayList<Library> librarys = new ArrayList<>();
		librarys = libraryHandler.getAllLibsFromStorage();
		System.out.println(" --- NOSORT ----");
		for (Library library : librarys) {
			System.out.println(library.toString());
		}
		Collections.sort(librarys);
		System.out.println(" --- SORTING ----");
		for (Library library : librarys) {
			System.out.println(library.toString());
		}
*/
	}
}
