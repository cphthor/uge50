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
	}
}
