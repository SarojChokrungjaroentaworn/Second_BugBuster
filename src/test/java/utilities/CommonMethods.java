package utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends PageInitializer {

	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public static void clearText(WebElement element) {
		element.clear();
	}

	// - clickOnMenuBar()
	public static void clickOnMenuBar(List<WebElement> menuLocator, String menuItem) {

		for (WebElement MainMenu : menuLocator) {
			if (MainMenu.getText().contains(menuItem)) {
				MainMenu.click();
				break;
			}
		}
	}

	public static void clickOnTopBarMenuInAdvance(List<WebElement> Menu, String MenuOption, List<WebElement> subMenu,
			String subMenuOption) {
		clickOnMenuBar(Menu, MenuOption);
		if (subMenu != null) {
			clickOnMenuBar(subMenu, subMenuOption);
		}
	}

	// - selectDropDownBy...
	public static void selectDropDownByVisibleText(WebElement element, String textToBeSelected) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement eachOption : options) {
			if (eachOption.getText().equals(textToBeSelected)) {
				select.selectByVisibleText(textToBeSelected);
				break;
			}
		}
	}

	// selects dropdown value by index
	public static void selectDropDownIndex(WebElement element, int indexValue) {
		Select select = new Select(element);
		int optionSize = select.getOptions().size();
		if (optionSize > indexValue) {
			select.selectByIndex(indexValue);
		}
	}

	// - ...Alert
	public static void acceptAlert() {
		try {
			Alert alert = getDriver().switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	public static void dismissAlert() {
		try {
			Alert alert = getDriver().switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	public static String getTextAlert() {
		String text = "";
		try {
			Alert alert = getDriver().switchTo().alert();
			text = alert.getText();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		return text;
	}

	public static void sendTextAlert(String text) {
		try {
			Alert alert = getDriver().switchTo().alert();
			alert.sendKeys(text);
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

	}

	// - switchToIFrameBy.....
	public static void switchToIFrameByIndex(int index) {
		try {
			getDriver().switchTo().frame(index);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	public static void switchToIFrameByElement(WebElement element) {
		try {
			getDriver().switchTo().frame(element);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	public static void switchToIFrameByName(String name) {
		try {
			getDriver().switchTo().frame(name);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	// - switchToChildWindow

	public static void switchToChildWindow(String parentWindowHandle) {
		try {
			Set<String> windowHandle = getDriver().getWindowHandles();

			for (String eachHandle : windowHandle) {
				if (!eachHandle.contentEquals(parentWindowHandle)) {
					getDriver().switchTo().window(eachHandle);
					break;
				}
			}
		} catch (NoSuchWindowException e) {
			System.out.println(e.getMessage());
		}
	}

	// - hardWait()
	public static void hardWait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.getStackTrace();
		}
	}

	public static void softWait() {
		getDriver().manage().timeouts().implicitlyWait(Constants.implicitWaitTime, TimeUnit.SECONDS);
	}

	// - softWait()
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(getDriver(), Constants.explicitWaitTime);
		return wait;
	}

	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	// - click() and sendKeys() with softWait
	public static void click(WebElement element) {
		waitForVisibility(element).click();
	}

	public static void sendKey(WebElement element, String keys) {
		waitForVisibility(element).sendKeys(keys);
	}

	// - Action class
	public static void hoverOverMouse(WebElement element) {
		Actions action = new Actions(getDriver());
		action.moveToElement(element).build().perform();
	}

	public static void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
		Actions action = new Actions(getDriver());
		action.dragAndDrop(sourceElement, targetElement).build().perform();
	}

	public static void deleteText(WebElement element) {
		Actions action = new Actions(getDriver());
		action.sendKeys(Keys.chord(Keys.CONTROL, "a",Keys.DELETE));
	}

	// - takeScreenShot

	public static void takeScreenShot(WebDriver driver) {

		// create object to SimpleDataFormat class and decide the format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
		// get the current date time with LocalDateTime
		LocalDateTime now = LocalDateTime.now();
		// convert the date into the string with the specified format
		String dateString = now.format(formatter);
		// casting webDriver to takescreenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		// get the screenshot as an outputFile
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		// define the destination path with the unique name
		String desFilePath = "src/test/resources/screenshots/Testing_" + dateString + ".png";
		File desFile = new File(desFilePath);
		// Use FileUtils to copy the screenshot to the dest
		try {
			FileUtils.copyFile(srcFile, desFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
