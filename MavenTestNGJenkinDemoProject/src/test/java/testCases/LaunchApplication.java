package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class LaunchApplication {

	String baseUrl = "https://snapfinance--7sqa.sandbox.my.site.com/s/onboarding?inviteCode=442d9f50-3720-4020-b777-f8c64b307bb2";
	WebDriver driver;

	@BeforeTest
	public void init() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_107\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);

		Thread.sleep(5000);
	}

	@Test
	public void validateApplicationIsLaunched() {

		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Onboarding");

	}

	@AfterTest
	public void stop() {

		driver.quit();
	}

}
