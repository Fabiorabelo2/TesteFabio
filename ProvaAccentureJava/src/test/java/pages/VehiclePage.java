package pages;

import maps.VehicleMap;

public class VehiclePage {
	private VehicleMap vehicleMap = new VehicleMap();
	
	public VehiclePage selectMake(String make) {
		vehicleMap.slcMake.visibilityOf();
		vehicleMap.slcMake.selectText(make);
		return this;
	}
	
	public VehiclePage selectModel(String model) {
		vehicleMap.slcModel.selectText(model);
		return this;
	}
	
	public VehiclePage setCylinder(String cylinder) {
		vehicleMap.inpCylinder.sendKeys(cylinder);
		return this;
	}
	
	public VehiclePage setEnginePerf(String enginePerf) {
		vehicleMap.inpEnginePerf.sendKeys(enginePerf);
		return this;
	}
	public VehiclePage setDateManufacture(String dateManufacture) {
		vehicleMap.inpDateManufacture.sendKeys(dateManufacture);
		return this;
	}
	
	public VehiclePage selectNumberSeats(String numberSeats) {
		vehicleMap.slcNumberSeats.sendKeys(numberSeats);
		return this;
	}
	
	public VehiclePage clickRightHand(String rightHand) {
		if (rightHand.toLowerCase().equals("yes")) {
			vehicleMap.radRightHandYes.click();
		}else {
			vehicleMap.radRightHandNo.click();
		}
		
		return this;
	}
	
	public VehiclePage selectNumberSeatsMoto(String numberSeats) {
		vehicleMap.slcNumberSeatsMoto.sendKeys(numberSeats);
		return this;
	}
	
	public VehiclePage selectFuel(String fuel) {
		vehicleMap.slcFuelType.sendKeys(fuel);
		return this;
	}
	
	public VehiclePage setPayload(String payload) {
		vehicleMap.inpPayload.sendKeys(payload);
		return this;
	}
	
	public VehiclePage setTotalWeight(String totalWeight) {
		vehicleMap.inpTotalWeight.sendKeys(totalWeight);
		return this;
	}
	
	public VehiclePage setListPrice(String listPrice) {
		vehicleMap.inpListprice.sendKeys(listPrice);
		return this;
	}
	
	public VehiclePage setLicensePlate(String licensePlate) {
		vehicleMap.inpLicenseplatenumber.sendKeys(licensePlate);
		return this;
	}
	
	public VehiclePage setAnnualMileage(String annualMileage) {
		vehicleMap.inpAnnualmileage.sendKeys(annualMileage);
		return this;
	}
	
	public void clickNext() {
		vehicleMap.btnNext.click();
	}
	
}
