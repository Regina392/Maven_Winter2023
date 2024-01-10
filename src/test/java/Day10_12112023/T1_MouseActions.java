package Day10_12112023;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_MouseActions {
    public static void main(String[] args) throws InterruptedException {

        //set up the chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //maxi for windows
        options.addArguments("start-maximized");
        //open in incognito mode
        options.addArguments("incognito");
        //define the webdriver
        WebDriver driver = new ChromeDriver(options);

        //navigate to usps site
        driver.navigate().to("https://www.usps.com");
        Thread.sleep(3000);
        //declare the mouse Actions
        Actions mouseAction = new Actions(driver);
        //hover to Quick Tools Module
        WebElement quickTool = driver.findElement(By.xpath("//*[text()='Quick Tools']"));
        mouseAction.moveToElement(quickTool).perform();
        //Click on Track a package using mouse click
        WebElement tracPackage = driver.findElement(By.xpath("//*[@id='tracking-input']"));
        //when the element is under textarea, you may need to click on that text box first and then use sendKeys
       // mouseAction.moveToElement(searchField).sendKeys("1181818181818818188").perform();
        //mouseAction.moveToElement(searchField).sendKeys("1181818181818818188").perform();







    }//end of main
    }//end of class

