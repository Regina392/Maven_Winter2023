package Day5_11212023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_GoogleSearchTest {
    public static void main(String[] args) throws InterruptedException {
        // set up the chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //define the web driver
        WebDriver driver = new ChromeDriver();
        //navigate to google com web page
        driver.navigate().to("https://www.google.com");
        //maximize the window
        driver.manage().window().maximize();
        //search for cars(using relative xpath)
        driver.findElement(By.xpath("//*[@name= 'q']")).sendKeys("cars");
        //search for cars (using absolute xpath)
        //driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("cars");
        //hit submit on Google search button
        driver.findElement(By.xpath("//*[@name= 'btnK']")).submit();
        //slow down by 2 seconds
        Thread.sleep(2000);
        //store the results in a string variable
        String searchResults = driver.findElement(By.xpath("//*[@id = 'result-stats' ]")).getText();
        //print out the result to the console
        System.out.println("Search result is " + searchResults);
        //spit the search results using split command
        String[] searchResultsArray = searchResults.split("");
        //print out only the search result number
        System.out.println("Search Result Number is " + searchResultsArray[1]);
        //quit the browser
        driver.quit();
    }//end of main
}//end of class
