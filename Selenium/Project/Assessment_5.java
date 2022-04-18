import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assessment_5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Open Browser
        driver.get("https://alchemy.hguy.co/lms/");

        //Select My Account
        driver.findElement(By.linkText("My Account")).click();
        //Get Page title

        if (driver.getTitle().contains("My Account")) {
            System.out.println("Page title is: " + driver.getTitle() );
            driver.close();
        }
        else System.out.println("Page title dose not contain My Account " );
    }
}
