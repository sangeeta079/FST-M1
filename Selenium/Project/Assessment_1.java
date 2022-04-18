import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assessment_1 {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://alchemy.hguy.co/lms");

        String expHeading = "Alchemy LMS – An LMS Application";
        String actualHeading = driver.getTitle();


        if (expHeading.equalsIgnoreCase(actualHeading))
            System.out.println("The expected heading is displaying :"+ actualHeading);
        else
            System.out.println("The expected heading is not displaying. Actual: "+ actualHeading+"Expected :"+ expHeading);

        driver.close();

    }
}
