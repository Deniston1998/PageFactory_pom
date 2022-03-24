package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Webelement {
	
	public static WebElement username (WebDriver driver) {
		return driver.findElement(By.name("email"));
	}
	public static WebElement passwrd(WebDriver driver) {return driver.findElement(By.name("password"));}
	public static WebElement log( WebDriver driver) {return driver.findElement(By.xpath(
			  "//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));}
	public static WebElement prof( WebDriver driver) {return driver.findElement(By.xpath(
			  "//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a"));}
	public static WebElement phono( WebDriver driver) {return driver.findElement(By.name("phone"));}
	public static WebElement addr( WebDriver driver) {return driver.findElement(By.name("address2"));}

}
