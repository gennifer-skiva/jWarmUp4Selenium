package SkivaPack;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class SkivaTest {
	WebDriver driver;
	
	@BeforeClass
	public void initBrowser(){
		driver = new FirefoxDriver();
		driver.get("http://www.skiva.com.au/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void selectAfterMouseOver() {
		
		//To identify web element 'Training' on skiva home page using xpath (use firepath to find xpath)
		// and assign it to mou WebElement
		WebElement mou = driver.findElement(By.xpath(".//*[@id='menu']/li[4]/a/span"));
		
		//WebElement mou = driver.findElement(By.className("home_link"));
		//Use Actions Class to perform mouse over action
		//Supply 'driver' object created in initBrowser to the new instance of Actions class and save in builder
		 
		Actions builder = new Actions(driver);
		//To put mouseOver on 'Training' on skiva.com.au
		//builder will not give you moveToElement method which is used for mouseOver
		//pass 'mou' WebElement to moveToElement element and invoke perform as follows for mouseover effect
		builder.moveToElement(mou).perform();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Identify web element 'Cloud Training' inside Training using xpath and store it in 'trang'
		WebElement trang = driver.findElement(By.xpath(".//*[@id='menu-item-4769']/a/span"));
		//Perform click operation by passing WebElement 'trang' and invoking perform as follows: 
		builder.click(trang).build().perform();
		
	}
	
	@AfterClass
	public void closeBroswer() {
		driver.close();
	}
}
