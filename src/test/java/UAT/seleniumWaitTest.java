package UAT;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumWaitTest {

	private RemoteWebDriver driver;
	private WebDriverWait wait;

	@BeforeEach // runs before EACH test
	void waittest() {

		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
//		this allows the website to wait and checks it during the 3 seconds.
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(4));

	}

	@Test
	void testwait() {
		this.driver.get("http://127.0.0.1:5500/03%20flow%20of%20control/index1.html");

		WebElement header2 = this.driver.findElement(By.tagName("h2"));
		Assertions.assertEquals("project time out", header2.getText());

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("results"),
				"Leeds,Leeds,Leeds marching on together"));
		WebElement name = this.driver.findElement(By.id("results"));

		Assertions.assertEquals("Leeds,Leeds,Leeds marching on together", name.getText());
	}

}
