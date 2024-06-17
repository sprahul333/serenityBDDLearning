package testcases;

import static java.time.temporal.ChronoUnit.SECONDS;

import java.time.Duration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class SerenityGmailTest extends PageObject{
	
	
	
	@Managed(driver = "firefox")
	WebDriver driver;
	
	
	
	@Title("Executing Login Test")
	@Test
	public void doLogin() {
		
		open();
		/*
		 * System.out.println(getImplicitWaitTimeout());
		 * System.out.println(getWaitForTimeout()); setImplicitTimeout(10,SECONDS);
		 * System.out.println(getImplicitWaitTimeout());
		 */	
		
		//setImplicitTimeout(10,SECONDS);
		System.out.println(getWaitForTimeout());
		System.out.println(getImplicitWaitTimeout());
		find(By.id("identifierId")).sendKeys("trainer@way2automation.com");
		find(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		//withTimeoutOf(Duration.ofSeconds(10)).find(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("trainer@way2automation");
		//waitForCondition().until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("trainer@way2automation.com");
		
		
		waitForCondition().withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5)).withMessage("Exception will finding the element and waited for 10 seconds").until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"password\"]/div[1]/div/div[111]/input"))).sendKeys("trainer@way2automation.com");
		
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
