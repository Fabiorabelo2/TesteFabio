package pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Element;
import maps.InsurantDataMap;

public class InsurantDataPage {
	InsurantDataMap insuranteDatamap = new InsurantDataMap();
	
	public InsurantDataPage setFirstName(String firstName) {
		insuranteDatamap.inpFirstName.visibilityOf();
		insuranteDatamap.inpFirstName.sendKeys(firstName);
		return this;
	}
	
	public InsurantDataPage setLastName(String lastName) {
		insuranteDatamap.inpLastName.sendKeys(lastName);
		return this;
	}
	
	public InsurantDataPage setDateBirth(String dateBirth) {
		insuranteDatamap.inpDateBirth.sendKeys(dateBirth);
		return this;
	}
	
	public InsurantDataPage clickGender(String gender) {
		if (gender.toLowerCase().equals("male")) {
			insuranteDatamap.radGenderMale.click();
		}else {
			insuranteDatamap.radGenderFeMale.click();
		}
		return this;
	}
	
	public InsurantDataPage setStreetAddress(String streetAddress) {
		insuranteDatamap.inpStreetaddress.sendKeys(streetAddress);
		return this;
	}
	
	public InsurantDataPage selectCountry(String country) {
		insuranteDatamap.slcCountry.selectText(country);
		return this;
	}
	
	public InsurantDataPage setZipCode(String zipCode) {
		insuranteDatamap.inpZipcode.sendKeys(zipCode);
		return this;
	}
	
	public InsurantDataPage setCity(String city) {
		insuranteDatamap.inpCity.sendKeys(city);
		return this;
	}
	
	public InsurantDataPage selectOccupation(String occupation) {
		insuranteDatamap.slcOccupation.selectText(occupation);
		return this;
	}
	
	public InsurantDataPage clickHobbies(String hobbie) {
		hobbie = hobbie.replace(" ", "");
		WebElement radioHobbie = new Element("input[value='"+hobbie+"']").createElement();
		
		radioHobbie.findElement(By.xpath("..")).click();
				
		return this;
	}
	
	public InsurantDataPage setWebSite(String webSite) {
		insuranteDatamap.inpWebSite.sendKeys(webSite);
		return this;
	}
	
	public InsurantDataPage setPicture(String picture) throws Throwable {
		insuranteDatamap.inpPicture.click();
		
		Thread.sleep(1000); // wait for page load    
		String caminho = new File("imgs/modelo.png").getAbsolutePath();
		StringSelection ss = new StringSelection(caminho);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		return this;
	}
	
	public void clickNext() {
		insuranteDatamap.btnNext.click();
	}
	
	
	
	
}
