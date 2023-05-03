package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	private By btnAbrirConta = By.cssSelector(
			"body > app-root > app-cookies-layout > app-default-layout > div > app-new-home > main > app-new-hero > section > div > app-new-hero-text > div > div.new-hero-text__button > a");
	private By btnPopup = By.cssSelector(
			"body > app-root > app-cookies-layout > app-cookie-manager > section > div > div.container__links > button");
	private By campoCpf = By.id("document");
	private By campoNome = By.id("name");
	private By campoCelular = By.id("phone");
	private By campoData = By.id("birthdate");
	private By campoEmail = By.id("email");
	private By btnTermodeuso = By.cssSelector("#has-accepted-terms > div > input");
	private By btnProximo = By.cssSelector(
			"#register > aside > div > main > div > app-register-form > form.signup.ng-dirty.ng-touched.ng-valid > div.signup__button-holder > button");

	private By textoEstamosQuasela = By.cssSelector("#register > aside > div > main > div > h3.signup__title");

	public By getBtnPopup() {
		return btnPopup;
	}

	public By getBtnTermodeuso() {
		return btnTermodeuso;
	}

	public By getBtnAbrirConta() {
		return btnAbrirConta;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoCelular() {
		return campoCelular;
	}

	public By getCampoData() {
		return campoData;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getBtntermodeuso() {
		return btnTermodeuso;
	}

	public By getBtnProximo() {
		return btnProximo;
	}

	public By getTextoEstamosQuasela() {
		return textoEstamosQuasela;
	}

}
