/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog50;

import java.util.ArrayList;

/**
 *
 * @author thor
 */
public class DogHandler {

	private ArrayList<Dog> dogs;

	public ArrayList<Dog> loadDogsFromStorage() {
		dogs = new ArrayList<>();
		/*
		("Red","Dobermann","AMY","Desexed Female","WATERLOO CORNER") 
("Black","German Shepherd Dog","DOMINO","Desexed Female","MACDONALD PARK")
("Blenheim","Spaniel","SAMO","Male","HILLIER")
("Blenheim","Spaniel","ANDY","Male","HILLIER")
("Blenheim","Spaniel","CORKY","Female","HILLIER")
		*/
		Dog mydog1 = new Dog("Red","Dobermann","AMY","Desexed Female","WATERLOO CORNER");
		Dog mydog2 = new Dog("Black","German Shepherd Dog","DOMINO","Desexed Female","MACDONALD PARK");
		Dog mydog3 = new Dog("Blenheim","Spaniel","SAMO","Male","HILLIER");
		Dog mydog4 = new Dog("Blenheim","Spaniel","ANDY","Male","HILLIER");
		Dog mydog5 = new Dog("Blenheim","Spaniel","CORKY","Female","HILLIER");
		dogs.add(mydog1);
		dogs.add(mydog2);
		dogs.add(mydog3);
		dogs.add(mydog4);
		dogs.add(mydog5);
		return dogs;
	}
	
}
