package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class generic {
	
	public WebDriver openBrowser(String Navegador, String URL) {
		WebDriver driver = null;
		try {
			
			switch(Navegador) {
				case "Chrome":
					System.setProperty("webdriver.chrome.driver", "C:\\ambiente\\selenium_drivers\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					driver.get(URL);
					break;
				case "Firefox":
					System.setProperty("webdriver.gecko.driver", "C:\\ambiente\\selenium_drivers\\geckodriver.exe");
					driver = new FirefoxDriver();
					driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					driver.get(URL);
					break;
			}
			driver.manage().window().maximize();
			return driver;
		}catch(Exception e){
			System.out.println("Mensaje: "+e.getMessage());
			
		}
		return driver;
	}
	
	public void clic_btn(WebDriver driver, String findby, String Elemento){
		switch(findby) {
			case "id":
				driver.findElement(By.id(Elemento)).click();
				break;
			case "name":
				driver.findElement(By.name(Elemento)).click();
				break;
			case "xpath":
				driver.findElement(By.xpath(Elemento)).click();
				break;
		}
		
	}
	
	public void ingresar_texto(WebDriver driver, String findby, String Elemento, String Texto){
		switch(findby) {
		case "id":
			driver.findElement(By.id(Elemento)).clear();
			driver.findElement(By.id(Elemento)).sendKeys(Texto);
			driver.findElement(By.id(Elemento)).submit();
			break;
		case "name":
			driver.findElement(By.name(Elemento)).clear();
			driver.findElement(By.name(Elemento)).sendKeys(Texto);
			driver.findElement(By.name(Elemento)).submit();
			break;
		case "xpath":
			driver.findElement(By.xpath(Elemento)).clear();
			driver.findElement(By.xpath(Elemento)).sendKeys(Texto);
			driver.findElement(By.xpath(Elemento)).submit();
			break;
		}
	}
	
	public void cerrar_driver(WebDriver driver){
		driver.close();
		//driver.quit();
	}

}
