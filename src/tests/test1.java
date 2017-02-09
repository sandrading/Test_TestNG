package tests;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class test1 {
	
	private WebDriver driver;



//    @BeforeTest
//    public void beforeTest(){
//        //driver = new FirefoxDriver();
////        DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
////        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);   
////        driver = new InternetExplorerDriver(ieCapabilities);
////        
//        File file = new File("C:/Selenium/iexploredriver.exe");  
//        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());  
//        WebDriver driver = new InternetExplorerDriver(); 
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("http://www.baidu.com");
//    }

//    @AfterTest
//    public void afterTest(){
//        driver.quit();
//    }
//    
    @Test
    public void f()
    {
    	 
         driver = new InternetExplorerDriver(); 
         driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.get("http://www.baidu.com");
        System.out.println("heloo");
//        By inputBox = By.id("kw");
//        By searchButton = By.id("su");

//        //智能等待元素加载出来
//        intelligentWait(driver, 10, inputBox);
//        //智能等待元素加载出来
//        intelligentWait(driver, 10, searchButton);
//        driver.findElement(inputBox).sendKeys("中国");
//        driver.findElement(searchButton).click();

    }
    
    /**这是智能等待元素加载的方法*/
    public void intelligentWait(WebDriver driver,int timeOut, final By by) {
        try {
            (new WebDriverWait(driver, timeOut)).until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });


        } catch (TimeoutException e) {
        Assert.fail("超时L !! " + timeOut + " 秒之后还没找到元素 [" + by + "]", e);
        }
    }



}
