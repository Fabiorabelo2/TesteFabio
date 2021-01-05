package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Element;

public class PriceOptionPage {

	public PriceOptionPage clickPrice(String price) {
		
		new Element("input[value='"+price+"']").visibilityOf();;
		WebElement radioPrice = new Element("input[value='"+price+"']").createElement();
		
		radioPrice.findElement(By.xpath("..")).click();
		return this;
	}
	
	public void clickNext() {
		Element btnNext = new Element("#nextsendquote");
		btnNext.visibilityOf();
		btnNext.click();
	}
}
