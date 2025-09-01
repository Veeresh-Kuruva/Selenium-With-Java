package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PORTeg {

	@FindBy(id="email") WebElement uid;
	@FindBy(id="pass") WebElement pass;
	@FindBy(name="login") WebElement login;
}
