package testcases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject{
	
	
	
	@Managed(driver = "chrome")
	WebDriver driver;
	
	@FindBy(name="q")
	WebElement googleSearch;
	
	@Title("Executing Login Test")
	@Test
	public void doLogin() {
		
		open();
		System.out.println(getTitle());
		//driver.get("http://google.com");
		//getDriver().findElement(By.name("q")).sendKeys("Hello Serenity !!!");
		//$("//*[@name='q']").sendKeys("Hello Serenity !!!");
		//typeInto(googleSearch, "Hello Serenity !!!");
		WebElementFacade textBox = find(By.name("q"));
		textBox.shouldBePresent();
		textBox.typeAndEnter("Hello Selenium !!!");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
