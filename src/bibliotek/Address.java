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
public class Address {
	String postalcode;
	String postalcity;
	String city;
	String street;

	public  Address(String postalcode, String postalcity,String city,  String street) {
		this.postalcity=postalcity;
		this.city=city;
		this.street = street;
		this.postalcode=postalcode;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public String getPostalcity() {
		return postalcity;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	public String  toString() {
		String  retVal="";
		retVal += street + ";";
		retVal += city + ";";
		retVal += postalcode + ";";
		retVal += postalcity + ";\n";
		return retVal;
	}
	
	
}
