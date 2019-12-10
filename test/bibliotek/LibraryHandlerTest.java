/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotek;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class LibraryHandlerTest {
	LibraryHandler libraryHandler;
	ArrayList<Library> mylist;
	
	public LibraryHandlerTest() {
	}
	
	@Before
	public void setUp() {
		mylist=new ArrayList<>();

	}

	@Test
	public void testSomeMethod() {
		libraryHandler = new LibraryHandler();
		mylist = libraryHandler.getAllLibsFromStorage();
		int expected = 4;
		int actual = mylist.size();
		assertEquals(expected, actual);
	}
	
}
