package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogelSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver browserObject = new ChromeDriver();
		
		browserObject.get("https://www.google.com/");
		
		browserObject.findElement(By.name("q")).sendKeys("Selenium python");
		
		browserObject.findElement(By.name("btnK")).submit();
		
		//browserObject.close();
	}


}
