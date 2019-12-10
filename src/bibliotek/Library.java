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
public class Library implements Comparable<Object>{
//	1420,København K,Christianshavn,Københavns Biblioteker,Dronningensgade 53,55.6723406,Folkebibliotek,710106,12.5921292,Christianshavns Bibliotek
	int id;
	String longName;
	String typeOfLibrary;
	Address address;
	Double latitude;
	Double longitude;

	public Library(int id, String longName, String typeOfLibrary, Double latitude, Double longitude) {
		this.id = id;
		this.longName = longName;
		this.typeOfLibrary = typeOfLibrary;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getLongName() {
		return longName;
	}

	public Address getAddresse() {
		return address;
	}

	public String getTypeOfLibrary() {
		return typeOfLibrary;
	}

	public Double getLatitude() {
		return latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	@Override
	public int compareTo(Object o) {
		// postalcode
		Library tmpO = (Library) o;
		return this.getLatitude().compareTo(tmpO.getLatitude());
	}
	public String toString() {
		String msg = "";
		msg += longName + "; ";
		msg += latitude + "; ";
		msg += longitude + "; ";
		return msg;
	}

	
}
