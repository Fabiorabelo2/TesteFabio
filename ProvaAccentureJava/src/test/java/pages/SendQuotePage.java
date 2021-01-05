package pages;

import maps.SendQuoteMap;

public class SendQuotePage {
	public SendQuoteMap sendQuoteMap = new SendQuoteMap();
	
	public SendQuotePage setEmail(String email) {
		sendQuoteMap.inpEmail.visibilityOf();
		sendQuoteMap.inpEmail.sendKeys(email);
		return this;
	}
	
	public SendQuotePage setPhone(String phone) {
		sendQuoteMap.inpPhone.sendKeys(phone);
		return this;
	}
	
	public SendQuotePage setUserName(String userName) {
		sendQuoteMap.inpUsername.sendKeys(userName);
		return this;
	}
	
	public SendQuotePage setPassword(String password) {
		sendQuoteMap.inpPassword.sendKeys(password);
		return this;
	}

	public SendQuotePage setConfirmPassword(String confirmPassword) {
		sendQuoteMap.inpConfirmpassword.sendKeys(confirmPassword);
		return this;
	}
	
	public SendQuotePage setComents(String coments) {
		sendQuoteMap.txtAComments.sendKeys(coments);
		return this;
	}
	
	public void clickSend() {
		sendQuoteMap.btnSend.click();
	}
	
	public String getMensagemOk() {
		sendQuoteMap.msg.visibilityOf();
		return sendQuoteMap.msg.getText();
	}
	
	public void clickBtnOK() {
		sendQuoteMap.btnOK.click();
	}
}
