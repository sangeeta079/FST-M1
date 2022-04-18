import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Assessment_7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Open Browser
        driver.get("https://alchemy.hguy.co/lms/");

        //Select My Account
        driver.findElement(By.linkText("All Courses")).click();
        //Get Page title

        if (driver.getTitle().contains("All Courses"))
            System.out.println("Page title is: " + driver.getTitle());

        else
            System.out.println("Page title dose not contain All Courses ");

        List Links = driver.findElements(By.linkText("See more..."));

        System.out.println("Number of Courses in the page : "+Links.size());

        driver.close();
    }
}
