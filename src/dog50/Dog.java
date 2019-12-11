/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package dog50;

/**
 *
 * @author thor
 */
public class Dog {
	int id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public String getRace() {
		return race;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getLocation() {
		return location;
	}
	
	
}
