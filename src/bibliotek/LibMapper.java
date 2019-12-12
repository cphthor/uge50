/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotek;

import java.util.ArrayList;

/**
 * 2700,Brønshøj,Husum,Københavns Biblioteker,Frederikssundsvej 290,55.7113268,Folkebibliotek,710107,12.4747123,Husum Bibliotek
3000,Helsingør,Abildvængets Bibliotek,Helsingør Kommunes Biblioteker,Abildgårdsvej 2,56.030787,Folkebibliotek,721702,12.592127,Abildvængets Bibliotek
3100,Hornbæk,Hornbæk Bibliotek,Helsingør Kommunes Biblioteker,Vestre Stejlebakke 2 A,56.0905393,Folkebibliotek,721703,12.455753312.4557533,Hornbæk Bibliotek
* 6800,Varde,Varde Bibliotek,Varde Bibliotek,Rådhusstræde 2,55.619605,Folkebibliotek,757300,8.479888,Varde Bibliotek
 */
public class LibMapper {

	Validation validation;

	public LibMapper() {
		validation = new AddressValidationRule();
	}


	public ArrayList<Library> getAllLibsFromStorage() {
		ArrayList<Library> myLibs = new ArrayList<>();
		Library lib1 = new Library(710107, "Husum Bibliotek", "Folkebibliotek",55.7113268,12.4747123);
		Address tmpAddress = new Address("D2700", "Brønshøj", "Husum", "Frederikssundsvej 290");
		validation.Validate(tmpAddress);
		lib1.setAddress(tmpAddress);
		Library lib2 = new Library(721702, "Abildvængets Bibliotek", "Folkebibliotek",56.030787,12.592127);
		tmpAddress = new Address("3000", "Helsingør", "Helsingør", "Abildgårdsvej 2");
		lib1.setAddress(tmpAddress);
		Library lib3 = new Library(721703, "Hornbæk Bibliotek", "Folkebibliotek",56.0905393,12.4557533);
		tmpAddress = new Address("3100", "Hornbæk", "Hornbæk", "Vestre Stejlebakke 2 A");
		lib1.setAddress(tmpAddress);
		Library lib4 = new Library(757300, "Varde Bibliotek", "Folkebibliotek",55.619605,8.479888);
		tmpAddress = new Address("6800", "Varde", "Varde", "Rådhusstræde 2");
		lib1.setAddress(tmpAddress);
		myLibs.add(lib1);
		myLibs.add(lib2);
		myLibs.add(lib3);
		myLibs.add(lib4);
		
		return myLibs;
	}
}
