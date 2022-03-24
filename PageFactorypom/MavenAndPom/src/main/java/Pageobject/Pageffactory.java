package Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pageffactory {
	@FindBy(how=How.NAME,using="email")
	public static WebElement username;
	@FindBy(name="password")
	public static WebElement passwrd;
	/// without using finby we can use directly by id or name
	public static WebElement email;

}
