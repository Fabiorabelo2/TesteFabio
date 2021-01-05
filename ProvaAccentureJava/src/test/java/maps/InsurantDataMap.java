package maps;

import core.Element;

public class InsurantDataMap {

	public Element inpFirstName = new Element("#firstname");
	public Element inpLastName = new Element("#lastname");
	public Element inpDateBirth = new Element("#birthdate");
	public Element radGenderMale = new Element("div:nth-child(4) > p > label:nth-child(1)");
	public Element radGenderFeMale = new Element("div:nth-child(4) > p > label:nth-child(2)");
	public Element inpStreetaddress = new Element("#streetaddress");
	public Element slcCountry = new Element("#country");
	public Element inpZipcode = new Element("#zipcode");
	public Element inpCity = new Element("#city");
	public Element slcOccupation = new Element("#occupation");
	//public Element hobbies = new Element("section:nth-child(2) > div.idealforms-field-checkbox > p > label:nth-child(1)");
	public Element inpWebSite = new Element("#website");
	public Element inpPicture = new Element("#open");
	public Element btnNext = new Element("#nextenterproductdata");
	
}
