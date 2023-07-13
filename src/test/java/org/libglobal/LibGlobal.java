package org.libglobal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	

    protected static WebDriver driver;
    public static WebDriver LaunchEdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        options.addArguments("--remote-allow-origins=*");
        options.setCapability("ignore-certificate-errors", true);
		driver=new EdgeDriver(options);
		return driver;

	}
    
    public static WebDriver LaunchFirefoxBrowser() {
    	String downloadFilepath = "C:\\path\\to\\MozillaFirefoxDownload";
    	WebDriverManager.firefoxdriver().setup();
    	FirefoxProfile profile = new FirefoxProfile();
    	profile.setPreference("browser.download.dir",downloadFilepath);
    	FirefoxOptions options = new FirefoxOptions();
    	options.setHeadless(true);
    	options.setProfile(profile);
    	WebDriver driver =  new FirefoxDriver(options);
    	
    	 return driver;

	}
	
	public static WebDriver LaunchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(options);
		return driver;

	}

	
	public static void elementWait() {
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
	}
	
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();

	}
	public static void openAppUrl(String url) {
		driver.get(url);
		

	}
	public static String getUrl() {
		return driver.getCurrentUrl();

	}
	public static void closeBrowser() {
		driver.close();

	}
	public static void quitBrowser() {
		driver.quit();

	}
	public static void manageElement() {
		driver.manage();

	}
	public static void switchToElement() {
		driver.switchTo();

	}
	public static String windowHandel() {
		String handle = driver.getWindowHandle();
		return handle;

	}
	public static Set<String> windowHandles() {
		Set<String> handles = driver.getWindowHandles();
		return handles;

	}
	public static Navigation elementNavigate(String url) {
		Navigation navigation = driver.navigate();
		return navigation;

	}
	public static void openCurrentUrl() {
		 driver.getCurrentUrl();
		
		}
	
	
	//WebElement interface methods:
	
	public static void enterValue(WebElement e, String Data) {
		e.sendKeys(Data);
		

	}
	public static void elementClick(WebElement e) {
		e.click();
		}
	public static String elementGetText(WebElement e,String Data) {
		String text = e.getText();
		return text;
		

	}
	public static String elementGetAttribute(WebElement e,String Data) {
		String attribute = e.getAttribute(Data);
		return attribute;

	}
	public static boolean elementIsDisplayed(WebElement e) {
		boolean displayed = e.isDisplayed();
		return displayed;
		

	}
	public static boolean elementIsEnable(WebElement e) {
		boolean enabled = e.isEnabled();
		return enabled;
		

	}
	public static boolean elementIsSelected(WebElement e) {
		boolean selected = e.isSelected();
		return selected;
	}
	
	
	//Navigation interface methods:
	
	public static void pageForward() {
		driver.navigate().forward();

	}
	public static void pageBack() {
		driver.navigate().back();

	}
	public static void pageRefresh() {
		driver.navigate().refresh();

	}
	public static void pageTo(String url) {
		driver.navigate().to(url);

	}
	
	//Action class methods:
	
	public static void moveToElement() {
		Actions ac = new Actions(driver);
		ac.moveToElement(null).perform();

	}
	public static void contextClick() {
		Actions ac = new Actions(driver);
		ac.contextClick().perform();
		

	}
	public static void doubleClick() {
		Actions ac = new Actions(driver);
		ac.doubleClick().perform();

	}
	public static void dragAndDrop(WebElement source,WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target);

	}
	public static void perform() {
		Actions ac = new Actions(driver);
		ac.perform();

	}
	public static void keyUp(String data) {
		Actions ac = new Actions(driver);
		ac.keyUp(data).perform();

	}
	public static void keyDown(String data) {
		Actions ac = new Actions(driver);
		ac.keyDown(data).perform();

	}
	
	//Select class methods:
	
	public static void selectByIndex(WebElement e,int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
		}
	
	public static void selectByValue(WebElement e,String Data) {
		Select s = new Select(e);
		s.selectByValue(Data);
		}
	
	public static void selectByVisibleText(WebElement e,String Data) {
		Select s = new Select(e);
		s.selectByVisibleText(Data);

	}
	public static void deselectAll(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();

	}
	
	public static void deselectByIndex(WebElement e,int index) {
		Select s = new Select(e);
		s.deselectByIndex(index);

	}
	public static void deselectByValue(WebElement e,String Data) {
		Select s = new Select(e);
		s.deselectByValue(Data);

	}
	public static void deselectByVisibleText(WebElement e,String Data) {
		Select s = new Select(e);
		s.deselectByVisibleText(Data);

	}
	public static boolean elementIsMultiple(WebElement e) {
		Select s = new Select(e);
		boolean multiple = s.isMultiple();
		return multiple;
		}
	
	public static List<WebElement> getOptions(WebElement e) {
		Select s = new Select(e);
		List<WebElement> options = s.getOptions();
		return options;
		
		

	}
	public static List<WebElement> getAllSelectedOptions(WebElement e) {
		Select s = new Select(e);
		List<WebElement> list = s.getAllSelectedOptions();
		return list;
		

	}
	
	public static WebElement getFirstSelectedOption(WebElement e) {
		Select s = new Select(e);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		return firstSelectedOption;

	}
	//Alert Interface methods:
	
	public static Alert switchToAlert() {
		Alert al = driver.switchTo().alert();
		return al;
		}
	public static Alert acceptAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
		return al;

	}
	public static Alert denyAlert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
		return al;
	

	}
	public static Alert sendValueAlert(String Data) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(Data);
		return al;

	}
	
	public static String alertGetText(String text) {
		Alert al = driver.switchTo().alert();
		String text1 = al.getText();
		return text1;
		

	}
	//Frames:
	
	public static WebDriver switchToFrameStringId(String text) {
		   WebDriver frame = driver.switchTo().frame(text);
		   return frame;
	}
	public static WebDriver switchToFrameInt(int index) {
		WebDriver frame = driver.switchTo().frame(0);
		return frame;
		}
	public static WebDriver switchToFrameWebElement(WebElement e) {
		WebDriver frame = driver.switchTo().frame(e);
		return frame;
  }
	public static WebDriver switchToParentFrame() {
		WebDriver parentFrame = driver.switchTo().parentFrame();
		return parentFrame;
	}
	public static String getData(String name,int rownum,int cellnum) throws IOException {
		String value = null;
		File excelLoc = new File("C:\\Users\\karth\\eclipse-workspace\\Maven\\Excel\\excel.xlsx");
		FileInputStream stream = new FileInputStream(excelLoc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("data");
		Row r = s.getRow(0);
		org.apache.poi.ss.usermodel.Cell c = r.getCell(0);
		int type = c.getCellType();
		if (type==1) {
			 value = c.getStringCellValue();
			
			
			
		}if (type==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
				 value = dateFormat.format(dateCellValue);
				}else {
					double numericCellValue = c.getNumericCellValue();
					
					long l = (long)numericCellValue;
					value = String.valueOf(l);
					
				}
			return value;
			
			
		}
		return value;
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	   
	
	

}
	
