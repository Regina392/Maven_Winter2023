package Day7_11282023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_Scroll {
    public static void main(String[] args) throws InterruptedException {
        //set up the chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //add some options for chromeoptions
        options.addArguments("start-maximized");
        //open in incognito mode
        options.addArguments("incognito");
        //run in headless mode (runs in the background)
//        options.addArguments("headless");
        //define the webdriver and pass the options argument
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.mlcalc.com/");
        //declare javascript executor
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll down 800 pixels (based on your need you can adjust the number by + or -200
        jse.executeScript("scroll(0,1500)");
        //wait 2 seconds
        Thread.sleep(2000);
        //scroll up 400 pixels
        jse.executeScript("scroll(0,-400)");
        //wait for 2 seconds
        Thread.sleep(2000);
        //store the calculate button in webelement variable
        WebElement calcButton = driver.findElement(By.xpath("//*[@value = 'Calculate']"));
        //scroll into element
        jse.executeScript("arguments[0].scrollIntoView(true);", calcButton);
        //wait 2 sends
        Thread.sleep(2000);
        //quit the browser
        driver.quit();

    }//end of main
}//end of class
