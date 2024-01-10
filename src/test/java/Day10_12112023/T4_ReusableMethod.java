package Day10_12112023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T4_ReusableMethod {

        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            //maxi for windows
            options.addArguments("start-maximized");
            //open in incognito mode
            options.addArguments("incognito");
            //define the webdriver
            WebDriver sumonDriver = new ChromeDriver(options);


            //Part 2//navigate to usps site
            sumonDriver.navigate().to("https://www.google.com");

            Reusable_Methods.submitMethod(sumonDriver,"//*[name='btnK']", "Search Button");

            Reusable_Methods.clickMethod(sumonDriver,"//*[text()='About']","About Link");


        }//end of main
    }//end of class



