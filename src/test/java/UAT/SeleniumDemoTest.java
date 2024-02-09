package UAT;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDemoTest {

	private RemoteWebDriver driver;

	@BeforeEach // runs before EACH test
	void newwindow() {

		ChromeOptions opts = new ChromeOptions();
		this.driver = new ChromeDriver(opts);
		this.driver.manage().window().maximize();
	}

	@Test
	void seleniumTest() {
		this.driver.get("https://demoqa.com/text-box");

		WebElement consent = this.driver.findElement(By.cssSelector(
				"body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button"));
		consent.click();

		WebElement fullName = this.driver.findElement(By.id("userName"));
		fullName.sendKeys("Mike Atkinson");

		WebElement email = this.driver.findElement(By.cssSelector("#userEmail"));
		email.sendKeys("mikeatkoo01@gmail.com");

		WebElement submit = this.driver.findElement(By.id("submit"));
		this.driver.executeScript("arguments[0].scrollIntoView(true);", submit);
		submit.click();

		WebElement display = this.driver.findElement(By.id("name"));

		Assertions.assertEquals(true, display.getText().contains("Mike Atkinson"));

		WebElement checkbox = this.driver.findElement(By.cssSelector("#item-1"));
		this.driver.executeScript("arguments[0].scrollIntoView(true);", checkbox);
		checkbox.click();

		WebElement checkboxHome = this.driver.findElement(By.cssSelector("#tree-node > ol > li > span > button > svg"));
		this.driver.executeScript("arguments[0].scrollIntoView(true);", checkboxHome);
		checkboxHome.click();

		WebElement checkboxDocs = this.driver
				.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/span/button"));
		this.driver.executeScript("arguments[0].scrollIntoView(true);", checkboxDocs);
		checkboxDocs.click();

		WebElement checkboxWork = this.driver.findElement(By.cssSelector(
				"#tree-node > ol > li > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li:nth-child(1) > span > button > svg"));
		this.driver.executeScript("arguments[0].scrollIntoView(true);", checkboxWork);
		checkboxWork.click();

		WebElement checkboxReact = this.driver
				.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[1]/span/label/span[1]"));
		checkboxReact.click();
	}

}

//	@AfterEach
//	void tearDown() {
//		this.driver.quit();
//	}
