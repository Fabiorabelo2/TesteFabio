package maps;

import core.Element;

public class VehicleMap {
	public Element slcMake = new Element("#make");
	public Element slcModel = new Element("#model");
	public Element inpCylinder = new Element("#cylindercapacity");
	public Element inpEnginePerf = new Element("#engineperformance");
	public Element inpDateManufacture = new Element("#dateofmanufacture");
	public Element slcNumberSeats = new Element("#numberofseats");
	public Element radRightHandYes = new Element("div:nth-child(7) > p > label:nth-child(1) > span");
	public Element radRightHandNo = new Element("div:nth-child(7) > p > label:nth-child(2) > span");
	public Element slcNumberSeatsMoto = new Element("#numberofseatsmotorcycle");
	public Element slcFuelType = new Element("#fuel");
	public Element inpPayload = new Element("#payload");
	public Element inpTotalWeight = new Element("#totalweight");
	public Element inpListprice = new Element("#listprice");
	public Element inpLicenseplatenumber = new Element("#licenseplatenumber");
	public Element inpAnnualmileage = new Element("#annualmileage");
	public Element btnNext = new Element("#nextenterinsurantdata");
	
}
