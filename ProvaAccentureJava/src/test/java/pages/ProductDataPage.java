package pages;

import maps.ProductDataMap;

public class ProductDataPage {

	private ProductDataMap productDataMap = new ProductDataMap();
	
	public ProductDataPage setStartDate(String startDate) {
		productDataMap.inpStartDate.visibilityOf();
		productDataMap.inpStartDate.sendKeys(startDate);
		return this;
	}
	
	public ProductDataPage selectInsuranceSum(String insuranceSum) {
		productDataMap.slcInsuranceSum.selectText(insuranceSum);
		return this;
	}
	
	public ProductDataPage selectMeritRating(String meritRating) {
		productDataMap.slcMeritRating.selectText(meritRating);
		return this;
	}
	
	public ProductDataPage selectDamageInsurance(String damageInsurance) {
		productDataMap.slcDamageInsurance.selectText(damageInsurance);
		return this;
	}
	
	public ProductDataPage clickOptionalProduct(String product) {
		if (product.toLowerCase().equals("Euro Protection")) {
			productDataMap.radEuroProtection.click();
		}else {
			productDataMap.radLegalDefenseInsurance.click();
		}
		return this;
	}
	
	public ProductDataPage selectCourtesyCar(String courtesyCar) {
		productDataMap.slcCourtesyCar.selectText(courtesyCar);
		return this;
	}
	
	public void clickNext() {
		productDataMap.btnNext.click();
		
	}
}
