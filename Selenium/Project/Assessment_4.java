import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assessment_4 {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Open Browser
        driver.get("https://alchemy.hguy.co/lms");

        String expectedHeading = "Email Marketing Strategies";

        //Get the title of the first info box

        WebElement element = driver.findElement(By.xpath("//div[2]/article/div[2]/h3[@class='entry-title']"));
        String actualHeading = element.getText();

        if (expectedHeading.equalsIgnoreCase(actualHeading)) {
            System.out.println("The expected heading is displaying :" + actualHeading);
            driver.close();
        }
        else
            System.out.println("The expected heading is not displaying : Actual:"+ actualHeading+" Expected :"+ expectedHeading);
    }
}
