package Day9_12052023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Group_Action_Item {
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
        //navigate to mortgage calculator website
        driver.navigate().to("https://www.geico.com/");

        driver.findElement(By.xpath("//*[@class='product-checkbox']")).click();
        //click on start my quote
        driver.findElement(By.xpath("//*[@id='bundleModalBtn']")).click();
        //click zipcode box
        driver.findElement(By.xpath("//*[@id='bundle-modal-zip']")).click();
        //enter zip in box
        driver.findElement(By.xpath("//*[@id='bundle-modal-zip']")).sendKeys("11218");
        //sleep
        Thread.sleep(3000);
        //
        driver.findElements(By.xpath("//*[@data-product='homeowners']")).get(1).click();
        //sleep
        Thread.sleep(3000);
        //click continue
        driver.findElements(By.xpath("//*[@value=‘Continue']")).get(0).click();

        //quit driver
       // driver.quit();


    }//end of main
}//end of class
