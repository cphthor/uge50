package dog50;

import java.util.ArrayList;

/**
 *
 * @author thor
 */
public class DogMockStorage implements DogStorage{
	private ArrayList<Dog> dogs;
	
	public DogMockStorage() {
		this.dogs = new ArrayList<>();
	}
	
	@Override
	public ArrayList<Dog> loadDogsFromStorage() {
		Dog mydog1 = new Dog("Blenheim","Spaniel","SAMO","Male","HILLIER");
		Dog mydog2 = new Dog("Black","German Shepherd Dog","DOMINO","Desexed Female","MACDONALD PARK");
		Dog mydog3 = new Dog("Blenheim","Spaniel","CORKY","Female","HILLIER");
		Dog mydog4 = new Dog("Red","Dobermann","AMY","Desexed Female","WATERLOO CORNER");
		Dog mydog5 = new Dog("Blenheim","Spaniel","ANDY","Male","HILLIER");
		dogs.add(mydog1);
		dogs.add(mydog2);
		dogs.add(mydog3);
		dogs.add(mydog4);
		dogs.add(mydog5);
		return dogs;
	}
	
}
