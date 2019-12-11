package dog50;

/**
 *
 * @author thor
 */
public class Dog {
	long id;
	String color;
	String race;
	String name;
	String gender;
	String location;

	public Dog(String color, String race, String name, String gender, String location) {
		this.color = color;
		this.race = race;
		this.name = name;
		this.gender = gender;
		this.location = location;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
