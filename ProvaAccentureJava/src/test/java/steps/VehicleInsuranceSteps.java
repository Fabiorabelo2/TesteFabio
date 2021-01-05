package steps;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.Quando;
import pages.InsurantDataPage;
import pages.PriceOptionPage;
import pages.ProductDataPage;
import pages.SendQuotePage;
import pages.VehiclePage;

public class VehicleInsuranceSteps {

	VehiclePage vehiclePage = new VehiclePage();
	InsurantDataPage insurantDataPage = new InsurantDataPage();
	ProductDataPage productDataPage = new ProductDataPage();
	PriceOptionPage priceOptionPage = new PriceOptionPage();
	SendQuotePage sendQuotePage = new SendQuotePage();

	@Quando("os campos da aba vehicle sao preenchidos com valores validos")
	public void osCamposDaAbaVehicleSaoPreenchidosComValoresValidos() {
		vehiclePage.selectMake("BMW")
			.selectModel("Scooter")
			.setCylinder("70")
			.setEnginePerf("1000")
			.setDateManufacture("10/20/2015")
			.selectNumberSeats("2")
			.clickRightHand("yes")
			.selectNumberSeatsMoto("2")
			.selectFuel("Petrol")
			.setPayload("800")
			.setTotalWeight("1500")
			.setListPrice("100000")
			.setLicensePlate("548712")
			.setAnnualMileage("1000")
			.clickNext();

	}

	@Quando("os campos da aba insurant data sao preenchidos com valores validos")
	public void osCamposDaAbaInsurantDataSaoPreenchidoComValoresValidos() throws Throwable {
		insurantDataPage.setFirstName("Fabio")
		.setLastName("Rabelo")
		.setDateBirth("02/14/1985")
		.clickGender("Male")
		.setStreetAddress("Rua Simão Alves de Almeida")
		.selectCountry("Brazil")
		.setZipCode("05867490")
		.setCity("São Paulo")
		.selectOccupation("Employee")
		.clickHobbies("Bungee Jumping")
		.setWebSite("www.fabiohenrique.com.br")
		.setPicture("imagem.png")
		.clickNext();
	}
	
	
	@Quando("os campos da aba product data sao preenchidos com valores validos")
	public void osCamposDaAbaProductDataSaoPreenchidoComValoresValidos() {
	    productDataPage.setStartDate("10/10/2021")
	    .selectInsuranceSum("3.000.000,00")
	    .selectMeritRating("Super Bonus")
	    .selectDamageInsurance("Full Coverage")
	    .clickOptionalProduct("Euro Protection")
	    .selectCourtesyCar("Yes")
	    .clickNext();
	}
	

	@Quando("os campos da aba price options sao preenchidos com valores validos")
	public void osCamposDaAbaPriceOptionsSaoPreenchidoComValoresValidos() {
	    priceOptionPage.clickPrice("Platinum")
	    .clickNext();
	}
		
	
	@Quando("os campos da aba send quote sao preenchidos com valores validos")
	public void osCamposDaAbaSendQuoteSaoPreenchidosComValoresValidos() {
	    sendQuotePage.setEmail("fabiorabelo2@gmail.com")
	    .setPhone("11953786898")
	    .setUserName("Fabio")
	    .setPassword("Fabio123")
	    .setConfirmPassword("Fabio123")
	    .setComents("cadastro finalizado")
	    .clickSend();
	    
	    String mensagem = sendQuotePage.getMensagemOk();
	    assertEquals("Sending e-mail success!", mensagem);
	    sendQuotePage.clickBtnOK();
	}










}
