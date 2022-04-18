import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assessment_2 {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        driver.get("https://alchemy.hguy.co/lms");

        String expHeading = "Learn from Industry Experts";
        WebElement element = driver.findElement(By.className("uagb-ifb-title"));
        String actualHeading = element.getText();

        if (expHeading.equalsIgnoreCase(actualHeading))
            System.out.println("The expected heading is displaying :"+ actualHeading);
        else
            System.out.println("The expected heading is not displaying : "+ actualHeading);

        driver.close();

    }
}
