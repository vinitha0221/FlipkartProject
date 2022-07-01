package baseMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void doLaunchBrowser(String BrowserName, String url) {

		switch (BrowserName) {

		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			driver.get(url);

			break;

		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			driver.get(url);

			break;
		case "edge":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

			driver.get(url);

			break;

		default:
			System.out.println("No Match");
			break;
		}

	}

	public static void doMaximizeBrowser() {

		driver.manage().window().maximize();
	}

	public static void doWaitImplicitly() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static void doSendKeys(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void doClick(WebElement element) {

		element.click();

	}

	public static String doGetText(WebElement element) {

		String text = element.getText();
		return text;
	}

	public static WebElement doGetAllElements(By a, int b) {

		List<WebElement> web = driver.findElements(a);

		WebElement element = web.get(b);

		return element;

	}

	public static void doClearTheTextBox(WebElement element) {

		element.clear();

	}

	public static void doFreezeExecution(int seconds) {

		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void doClickWithJavaScriptExecutor(WebElement element) {

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

	}

	public static void doSendKeysViaJavaScriptExecutor(WebElement el, String input) {
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].value='" + input + "';", el);
	}

	public static void doScrollWindowViaJavaScriptExecutor(WebElement element) {
		JavascriptExecutor e = (JavascriptExecutor) driver;
		e.executeScript("arguments[0].scrollIntoView();", element);

	}

	public static void doSelectDownDropViaText(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void doFreeze() {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void doSwitchWindow(int WindowOrder) {

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowId = new ArrayList<>(windowHandles);
		String id = windowId.get(WindowOrder);
		driver.switchTo().window(id);

	}

	public static void doQuitTheBrowser() {

		driver.quit();

	}

	public static void doCameBack() {

		driver.navigate().back();
	}

	public static void doCaptureScreenShot(String name) {

		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File DestFile = new File(
				"C:\\Users\\Jagan\\eclipse-workspace\\ProjectFlipkart\\Reports\\" + name + ".png");

		try {
			FileUtils.copyFile(SrcFile, DestFile);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
