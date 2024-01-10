package Day8_12042023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_Select_Statement {
    public static void main(String[] args) throws InterruptedException {

        //declare webdrivermanager to set up the chromedriver
        WebDriverManager.chromedriver().setup();
        //set chromeoptions for preset of arguments for the driver
        ChromeOptions options =  new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        //declare your web driver and pass the options variable inside the chromedriver
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator site
        driver.navigate().to("https://www.mortgagecalculator.org");
        //wait few seconds to load
        Thread.sleep(3000);
        //clear and enter the down payment
        WebElement homeVal = driver.findElement(By.xpath("//*[@id='homeval']"));
        homeVal.clear();
        homeVal.sendKeys("450000");
        //clear and enter the down payment
        WebElement dPayment = driver.findElement(By.xpath("//*[@id='downpayment']"));
        dPayment.clear();
        dPayment.sendKeys("9000");

        //select January from the month dropdown
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
        //set the select function for the start month dropdown
        Select startMonthDropdown = new Select(startMonth);
        //select by visible text
        startMonthDropdown.selectByVisibleText("Jan");
        //Thread.sleep(1000);
        //verify that it selects back the Dec which is default month
        startMonthDropdown.selectByVisibleText("Dec");

        //Thread.sleep(4000);
        //call quit function to exit your session
        driver.quit();

    }//end of main
}//end of class
