/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotek;

import java.util.ArrayList;

/**
 *
 * @author thor
 */
public class LibraryHandler {

	private ArrayList<Library> mylibs;
	private LibMapper libMapper;

	public LibraryHandler() {
		mylibs = new ArrayList<>();
		libMapper = new LibMapper();
	}

	public ArrayList<Library> getAllLibsFromStorage() {
		mylibs = libMapper.getAllLibsFromStorage();
		return  mylibs;
	}
}
