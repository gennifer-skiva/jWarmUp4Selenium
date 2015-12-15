package SkivaPack;


import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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
	public void selectAfterMouseOverAboutUs() {
		
		//To identify web element 'Training' on skiva home page using xpath (use firepath to find xpath)
		// and assign it to mou WebElement
		WebElement mou = driver.findElement(By.xpath(".//*[@id='menu']/li[3]/a/span"));
		
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
	}
	
	@Test 
	public void selectAfterMouseOverTraining() {
		
		//Set the training web element
		String [] trainElem = {".//*[@id='menu']/li[4]/a/span",				//'Training menu'
								".//*[@id='menu-item-4098']/a/span",		//'Software Testing Career Package'
								".//*[@id='menu-item-4099']/a/span",		//'Software Testing Training'
								".//*[@id='menu-item-4104']/a/span",		//'Agile Testing Training'
								".//*[@id='menu-item-3497']/a/span",		//'User Acceptance Testing'
								".//*[@id='menu-item-3498']/a/span",		//'ISTQB Foundation Testing'
								".//*[@id='menu-item-3493']/a/span",		//'QTP Training'
								".//*[@id='menu-item-3494']/a/span",		//'Selenium Training'
								".//*[@id='menu-item-3499']/a/span",		//'JMeter Training'
								".//*[@id='menu-item-4103']/a/span",		//'LoadRunner Training'
								".//*[@id='menu-item-3504']/a/span",		//'Microsoft .Net – Hands On'
								".//*[@id='menu-item-3503']/a/span",		//'Microsoft .Net – Advanced'
								".//*[@id='menu-item-4105']/a/span",		//'Core Java Training
								".//*[@id='menu-item-4769']/a/span",		//'Cloud Training'
								".//*[@id='menu-item-4111']/a/span",		//'VB Scripting'
								".//*[@id='menu-item-4109']/a/span",		//'Ruby Scripting'
								".//*[@id='menu-item-3507']/a/span",		//'SQL for Testers Training'
								".//*[@id='menu-item-3505']/a/span",		//'Oracle Training'
								".//*[@id='menu-item-4139']/a/span"			//'SQL Training'		
								};
		String [] expectTitle = {"Training and Internships - Skiva",
								"Software Testing Training Career Package - Skiva",
								"Software Testing Training - Skiva",
								"Agile Testing Training - Skiva",
								"User Acceptance Testing - Skiva",
								"ISTQB Certification Training - Skiva",
								"QTP Test Automation Training - Skiva",
								"Selenium Training - Skiva",
								"JMeter Training - Skiva",
								"LoadRunner Training - Skiva",
								".Net Developer Training - Skiva",
								".Net Developer Advanced Training - Skiva",
								"Core Java Training - Skiva",
								"Cloud Training - AWS (Amazon Web Services) - Skiva",
								"VB Scripting Training - Skiva", 
								"Ruby Scripting Training - Skiva",
								"SQL for Testers Training - Skiva",
								"Oracle Training - Skiva",
								"SQL Training - Skiva"
								};
		String [] expectText = {"At Skiva, we have subject matter experts who work",
								"What is Test Automation and why is it needed",
								"Understanding Software Development Methodologies",
								"Explain the role of testing in an Agile environment",
								"Understand challenges involved in doing UAT",
								"Aspiring Software Testers who are willing to get certified",
								"Why learning QTP and what are the other Test Automation Tools",
								"Selenium Flavors",
								"JMETER BASICS",
								"Learn How to do Load and Stress Testing with LoadRunner",
								"Develop and deploy website from scratch using .Net Platform",
								"To get familiar with the advanced level concepts and uses of .Net Framework",
								"You will learn how to download, install, and configure the Java environment on a Windows system",
								"Understand Cloud Ecosystem and its overall impact",
								"VBScript is a subset of Visual Basic 4.0 language.",
								"Introduction to Ruby",
								"Aspiring Software Testers who are willing to enhance skills in SQL",
								"Learn ORACLE like a Pro",
								"Learn How to Create Scripts with SQL like a Pro"
								};
		WebElement training;
		for (int i = 0; i < trainElem.length; i++ ){
			System.out.println("Counter: " + i);
			//Use Actions Class to perform mouse over action
			//Supply 'driver' object created in initBrowser to the new instance of Actions class and save in builder
			Actions builder = new Actions(driver);
			
			if (i > 0){
				//To identify web element 'Training' on skiva home page using xpath (use firepath to find xpath)
				// and assign it to mou WebElement
				WebElement mou = driver.findElement(By.xpath(trainElem[0]));
						 
				//To put mouseOver on 'Training' on skiva.com.au
				//builder will not give you moveToElement method which is used for mouseOver
				//pass 'mou' WebElement to moveToElement element and invoke perform as follows for mouseover effect
				builder.moveToElement(mou).perform();
			}
			/*try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		
			// Perform Mouse Over operation
			training = driver.findElement(By.xpath(trainElem[i]));
			builder.moveToElement(training).perform();
			
			//Perform click operation by passing WebElement 'training' and invoking perform as follows: 
			builder.click(training).build().perform();
			
			String title = driver.getTitle();
			
			System.out.println("TITLE:" + title);
			System.out.println("Expect:" + expectTitle[i]);
			
			assertTrue(expectTitle[i].equals(driver.getTitle()));
			
			System.out.println("TEXT: " + expectText[i]);
			
			assertTrue(driver.getPageSource().contains(expectText[i]));
				
		}
	}
	
	@Test (dependsOnMethods = "selectAfterMouseOverTraining")
	public void selectAfterMouseOverServices() {
		
		//Set the Services web element
		String [] servicesElem = {".//*[@id='menu']/li[5]/a/span",			//'Services menu'
								".//*[@id='menu-item-3705']/a/span",		//'.Net Development'
								".//*[@id='menu-item-4113']/a/span",		//'WordPress Php Development'
								".//*[@id='menu-item-3513']/a/span",		//'Java Development'
								".//*[@id='menu-item-3512']/a/span",		//'iPhone App Development'
								".//*[@id='menu-item-4114']/a/span",		//'Android App Development'
								".//*[@id='menu-item-4112']/a/span",		//'Windows App Development'
								
								".//*[@id='menu-item-4118']/a/span",		//'Software Testing Services'
								".//*[@id='menu-item-3709']/a/span",		//'Test Management'
								".//*[@id='menu-item-3519']/a/span",		//Test Plan and Strategy'
								".//*[@id='menu-item-3516']/a/span",		//'Performance Testing'
								".//*[@id='menu-item-3524']/a/span",		//'Functional Testing'
								".//*[@id='menu-item-3522']/a/span",		//'User Acceptance Testing'
								".//*[@id='menu-item-3517']/a/span",		//'Security Testing'
								".//*[@id='menu-item-3525']/a/span",		//'Mobile App Testing'
								".//*[@id='menu-item-3714']/a/span",		//'Automation Testing'
								".//*[@id='menu-item-3520']/a/span",		//'Test Process Consulting'							
								".//*[@id='menu-item-3712']/a/span",		//'Test Tool Acquisition'
								
								".//*[@id='menu-item-3527']/a/span",		//'Mentoring Services'
								".//*[@id='menu-item-3528']/a/span",		//'Staff Augmentation'
								".//*[@id='menu-item-3529']/a/span",		//'Resource Augmentation'
								".//*[@id='menu-item-3526']/a/span",		//'In-House Training'
								".//*[@id='menu-item-3530']/a/span",		//'Skiva Centre Training'
								".//*[@id='menu-item-3722']/a/span",		//'Online Training'
								".//*[@id='menu-item-3723']/a/span",		//'Weekend Training'								
								};
		
		//To identify web element 'Training' on skiva home page using xpath (use firepath to find xpath)
		// and assign it to mou WebElement
		WebElement mou = driver.findElement(By.xpath(servicesElem[0]));
		
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
		
		WebElement training;
		for (int i = 1; i < servicesElem.length; i++ ){
			training = driver.findElement(By.xpath(servicesElem[i]));
			//Perform click operation by passing WebElement 'training' and invoking perform as follows: 
			//builder.click(training).build().perform();
			builder.moveToElement(training).perform();	
		}
	}
	
	@Test (dependsOnMethods = "selectAfterMouseOverServices")
	public void selectAfterMouseOverResources() {
		
		//Set the Resources web element
		String [] resourcesElem = {".//*[@id='menu']/li[6]/a/span",			//'Services menu'
									".//*[@id='menu-item-3680']/a/span",		//'Free Articles'
									".//*[@id='menu-item-3678']/a/span",		//'Poscasts'
									".//*[@id='menu-item-3724']/a/span",		//'Workshops'
									".//*[@id='menu-item-3534']/a/span",		//'Videos'
									".//*[@id='menu-item-3488']/a/span",		//'ISTQB Material'
									".//*[@id='menu-item-3258']/a/span",		//'Free Email Course'
									".//*[@id='menu-item-3259']/a/span",		//'Webinars'
									".//*[@id='menu-item-4396']/a/span",		//'Seminars'
									".//*[@id='menu-item-4138']/a/span",		//'All Resources'						
								};
		
		//To identify web element 'Training' on skiva home page using xpath (use firepath to find xpath)
		// and assign it to mou WebElement
		WebElement mou = driver.findElement(By.xpath(resourcesElem[0]));
		
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
		
		WebElement training;
		for (int i = 1; i < resourcesElem.length; i++ ){
			training = driver.findElement(By.xpath(resourcesElem[i]));
			//Perform click operation by passing WebElement 'training' and invoking perform as follows: 
			//builder.click(training).build().perform();
			builder.moveToElement(training).perform();	
		}
	}
	
	@Test (dependsOnMethods = "selectAfterMouseOverResources")
	public void selectAfterMouseOverCareer() {
		
		//Set the Career web element
		String [] careerElem = {".//*[@id='menu']/li[8]/a/span",			//'Career menu'
									".//*[@id='menu-item-3491']/a/span",		//'Experienced Professionals'
									".//*[@id='menu-item-3492']/a/span",		//'Internship Opportunities'
									".//*[@id='menu-item-4093']/a/span",		//'Submit Resume'						
								};
		
		//To identify web element 'Training' on skiva home page using xpath (use firepath to find xpath)
		// and assign it to mou WebElement
		WebElement mou = driver.findElement(By.xpath(careerElem[0]));
		
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
		
		WebElement training;
		for (int i = 1; i < careerElem.length; i++ ){
			training = driver.findElement(By.xpath(careerElem[i]));
			//Perform click operation by passing WebElement 'training' and invoking perform as follows: 
			//builder.click(training).build().perform();
			builder.moveToElement(training).perform();	
		}
	}
	
	@AfterClass
	public void closeBroswer() {
		driver.close();
	}
}
