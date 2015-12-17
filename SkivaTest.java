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
	WebDriver driver;			// driver
	String [] menu;				// Menu Array
	String [] expectTitle;		// Expected Title Array
	String [] expectText;		// Expected Text Array
	int MENUCOUNT = 7;			// Menu count
		
	// Initialization
	@BeforeClass
	public void initBrowser(){
		driver = new FirefoxDriver();
		driver.get("http://www.skiva.com.au/");
		driver.manage().window().maximize();
	}
	
	// Initialize menu, expected title and expected text for 'AboutUs' menu and sub menus
	public void initAboutUs(){
		
		//Set the About us web element
		menu = new String[]{".//*[@id='menu']/li[3]/a/span"};
		
		// Set data for expected title
		expectTitle = new String [] {"About Us - Skiva"};
		
		// Set data for expected text
		expectText = new String[]{"We're more than Your Average IT Company"};
	}
	
	// Initialize menu, expected title and expected text for 'Training' menu and sub menus
	public void initTraining() {	
		//Set the training sub menu web element
		menu = new String []{
			".//*[@id='menu']/li[4]/a/span",			//'Training menu'
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
		
		// Set data for expected title
		expectTitle = new String [] {
			"Training and Internships - Skiva",
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
		
		// Set data for expected Text
		expectText = new String [] {
			"Training and Internships",
			"The Best Way to Start Your Career as a Software Tester",
			"Understanding Software Development Methodologies",
			"Hands-on Agile Testing with Automation Skills",
			"Know How to Deliver a Quality Product to Your Customers",
			"Get Certified while Acquiring Practical Skills",
			"Learn how to Automate and Reduce the Cost of Testing with QTP",
			"Learn how to Automate and Reduce the Cost of Testing with Selenium",
			"Learn how to do Load and Stress Testing with JMeter",
			"Learn How to do Load and Stress Testing with LoadRunner",
			"The Best Way to Start Your Career as a Web Developer",
			"Become a Pro Developer for Microsoft .Net",
			"Learn Java Fundamentals an Easy Way",
			"Learn the hottest in the market",
			"Learn How to Pick Up VB Scripting Skills",
			"Learn How to Pick Up RUBY Scripting Skills",
			"Learn How to Create Scripts with SQL like a Pro",
			"Learn ORACLE like a Pro",
			"Learn How to Create Scripts with SQL like a Pro"
		};
	}
	
	// Initialize menu, expected title and expected text for 'Services' menu and sub menus
	public void initServices() {
		
		//Set the Services web element
		menu = new String [] {
			".//*[@id='menu']/li[5]/a/span",			//'Services menu'
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
	
		// Set data for expected title
		expectTitle = new String[] {
			"Skiva Services - Skiva",
			".Net Development - Skiva",
			"Wordpress Php Development - Skiva",
			"Java Development - Skiva",
			"iPhone App Development - Skiva",
			"Android App Development - Skiva",
			"Windows App Development - Skiva",
			"Software Testing Services - Skiva",
			"Test Management - Skiva",
			"Test Planning and Strategy - Skiva",
			"Performance Testing - Skiva",
			"Functional Testing - Skiva",
			"UAT Testing - Skiva",
			"Security Testing - Skiva",
			"Mobile App Testing - Skiva",
			"Automation Testing - Skiva",
			"Test Process Consulting - Skiva",
			"Test Tool Acquisition - Skiva",
			"Mentoring Services - Skiva",
			"Staff Augmentation - Skiva",
			"Resource Augmentation - Skiva",
			"In-House Training - Skiva",
			"Skiva Training - Skiva",
			"Skiva Training - Skiva",
			"Skiva Training - Skiva"						
		};
		
		// Set data for expected text
		expectText = new String[] {
			"We Provide Services to Enable Process",
			"Quality Software Devlivered with Enhanaced Microsoft Technology",
			"Open Source Solutions Tailored to Fit Your Requirement",
			"Develop Customized Applications and Services",
			"Packing up With the Pulse of Latest Technology",
			"Android App Development",
			"Windows App Development",
			"Software Testing Services",
			"Test Management",
			"Test Planning and Strategy",
			"Performance Testing",
			"Functional Testing",
			"UAT Testing",
			"Security Testing",
			"Mobile App Testing",
			"Automation Testing",
			"Test Process Consulting",
			"Test Tool Acquisition",
			"Mentoring Services",
			"Staff Augmentation",
			"Resource Augmentation",
			"In-House Training",
			"Skiva Center Training",
			"Online Training",
			"Weekend Training"
		};
	}

	// Initialize menu, expected title and expected text for 'Resources' menu and sub menus
	public void initResources() {
		
		//Set the Resources web element
		menu = new String [] {
			".//*[@id='menu']/li[6]/a/span",			//'Services menu'
			".//*[@id='menu-item-3680']/a/span",	//'Free Articles'
			".//*[@id='menu-item-3678']/a/span",	//'Poscasts'
			".//*[@id='menu-item-3724']/a/span",	//'Workshops'
			".//*[@id='menu-item-3534']/a/span",	//'Videos'
			".//*[@id='menu-item-3488']/a/span",	//'ISTQB Material'
			".//*[@id='menu-item-3258']/a/span",	//'Free Email Course'
			".//*[@id='menu-item-3259']/a/span",	//'Webinars'
			//".//*[@id='menu-item-4396']/a/span",	//'Seminars'
			".//*[@id='menu-item-4138']/a/span",	//'All Resources'						
		};
		
		// Set data for expected title
		expectTitle = new String [] {
			"Resources - Skiva",
			"Free Articles - Skiva",
			"Videos - Skiva",
			"Resources - Skiva",
			"Resources - Skiva",
			"ISTQB Material - Skiva",
			"Seminars Archives - Skiva",
			"Workshops Archives - Skiva",
			//"",
			"Resources - Skiva"								
		};
		
		// Set data for expected text
		expectText = new String[]{
			"Resources",
			"Recent Articles",
			"Videos",
			"Skiva’s webinars offer audiences",
			"You can download and listen to these podcasts",
			"Software Testing Certification – ISTQB / ISEB",
			"At Skiva we organize seminars",
			"Bring Skiva Consulting into your organization for on-site workshops",
			//"",
			"Skiva provides a wide assortment of practical information to users"						
		};
	}

	// Initialize menu, expected title and expected text for 'Blog' menu and sub menus
	public void initBlog(){
		//Set the Blog web element
		menu = new String [] {".//*[@id='menu']/li[7]/a/span",};
		
		// Set data for expected title
		expectTitle = new String[] {"Where Testers Go To Grow - Skiva"};
		
		// Set data for expected text
		expectText = new String [] {"A Smarter Way to gain knowledge"};	
	}

	// Initialize menu, expected title and expected text for 'Career' menu and sub menus
	public void initCareer() {
		
		//Set the Career web element
		menu = new String [] {
			".//*[@id='menu']/li[8]/a/span",			//'Career menu'
			".//*[@id='menu-item-3491']/a/span",		//'Experienced Professionals'
			".//*[@id='menu-item-3492']/a/span",		//'Internship Opportunities'
			".//*[@id='menu-item-4093']/a/span",		//'Submit Resume'						
		};
		
		// Set data for expected title
		expectTitle = new String[]{
			"Careers at Skiva - Skiva",
			"Experienced Professionals - Skiva",
			"Internship Opportunities - Skiva",
			"Submit Resume - Skiva"
		};
		
		// Set data for expected text
		expectText = new String[]{
			"Careers at Skiva",
			"Experienced Professionals",
			"Internship Opportunities",
			"Submit Resume"								 
		};
		
	}
	
	// Initialize menu, expected title and expected text for 'Testimonials' menu and sub menus
	public void initTestimonials(){
		//Set the Testimonials web element
		menu = new String [] {".//*[@id='menu']/li[9]/a/span",};
		
		// Set data for expected title
		expectTitle = new String[] {"Testimonials - Skiva"};
		
		// Set data for expected text
		expectText = new String [] {"Testimonials"};	
	}
	
	// Initialize menu, expected title and expected text for 'ContactUS' menu and sub menus
	public void initContactUs(){
		//Set the ContatUs web element
		menu = new String [] {".//*[@id='menu']/li[10]/a/span",};
		
		// Set data for expected title
		expectTitle = new String[] {"Contact Us - Skiva"};
		
		// Set data for expected text
		expectText = new String [] {"Contact Us"};	
	}
	
	@Test
	public void selectAfterMouseOver() {
		
		// Loop until the total count of main menu in homepage
		for (int i = 0; i <= MENUCOUNT; i++){
			switch(i){
			case 0: // About Us
				initAboutUs();
				break;
			case 1:	// Training
				initTraining();
				break;
			case 2:	// Services
				initServices();	
				break;
			case 3:	// Resources
				initResources();
				break;
			/*case 4:	// Blog
				initBlog();
				break;*/
			case 5:	// Career
				initCareer();
				break;
			case 6:	//Testimonials
				initTestimonials();
				break;
			case 7:	// Contact Us
				initContactUs();
				break;	
			}
			
			//Skip Blog for the mean time
			if (i == 4){
				continue;
			}
			
			// Perform Mouse over and click operations
			mouseOverandClick(menu, expectTitle, expectText);
			
		}
		
	}
	
	public void mouseOverandClick(String [] menu, String[] expectedTitle, String[] expectedText ){
				
		//Use Actions Class to perform mouse over action
		//Supply 'driver' object created in initBrowser to the new instance of Actions class and save in builder
		Actions builder = new Actions(driver);
				
		WebElement webElem;
		for (int i = 0; i < menu.length; i++ ){
			
			// Mouse over to main menu to find sub menu element
			if (i > 0){
				webElem = driver.findElement(By.xpath(menu[0]));
				
				//To put mouseOver on a menu on skiva.com.au
				//builder will not give you moveToElement method which is used for mouseOver
				//pass 'mou' WebElement to moveToElement element and invoke perform as follows for mouseover effect
				builder.moveToElement(webElem).perform();
			}
			
			// Perform Mouse Over operation
			// To put mouseOver on menu on skiva.com.au
			// builder will not give you moveToElement method which is used for mouseOver
			// pass 'mou' WebElement to moveToElement element and invoke perform as follows for mouseover effect
			webElem = driver.findElement(By.xpath(menu[i]));
			builder.moveToElement(webElem).perform();
			
			// Perform click operation by passing WebElement and invoking perform as follows: 
			builder.click(webElem).build().perform();
			
			// Verify page Title
			assertTrue(expectedTitle[i].equals(driver.getTitle()));
			
			// Verify Text content
			assertTrue(driver.getPageSource().contains(expectedText[i]));
				
		}
	}	
	
	@AfterClass
	public void closeBroswer() {
		driver.close();
	}
}
