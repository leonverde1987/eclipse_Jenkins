package ramas;

import org.openqa.selenium.WebDriver;

import generic.generic;

public class TestOne extends generic {
	public WebDriver driver = null;
	
	public void abrir_Google() {
		driver = this.openBrowser("Firefox", "https://www.google.com.mx");
	}
	
	public void buscar_GFA() {
		this.ingresar_texto(driver, "xpath", "/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input", "GFA");
	}
	
	public void cerrar_Navegador() {
		this.cerrar_driver(driver);
	}
}
