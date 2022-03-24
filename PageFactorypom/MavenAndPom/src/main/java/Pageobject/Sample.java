package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void samplke() {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\MavenAndPom\\src\\driver\\chromedriver.exe");
	        WebDriver driver= new ChromeDriver();
	        driver.get("https://www.phptravels.net/login");
	      //with pom-------------------------
	    //   Webelement.username(driver).sendKeys("user@phptravels.com");
	   //    Webelement.passwrd(driver).sendKeys("demouser");
	        //---------------------with page factory------------------------
	        PageFactory.initElements(driver,Pageffactory.class);
	        Pageffactory.username.sendKeys("denistonsf199");
	        Pageffactory.passwrd.sendKeys("132234535345");
	        Pageffactory.email.clear();
	        
			/*
			 * WebElement gmail = driver.findElement(By.name("email"));
			 * gmail.sendKeys("user@phptravels.com"); WebElement password =
			 * driver.findElement(By.name("password")); password.sendKeys("demouser");
			 * WebElement login = driver.findElement(By.xpath(
			 * "//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
			 * login.click(); WebElement profile =driver.findElement(By.xpath(
			 * "//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a")); profile.click();
			 * WebElement phone = driver.findElement(By.name("phone"));
			 * phone.sendKeys("111223333"); WebElement address=
			 * driver.findElement(By.name("address2")); address.sendKeys("12tg anna nagar");
			 */
		
	}

}
