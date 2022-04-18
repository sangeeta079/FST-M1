import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assessment_6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Open Browser
        driver.get("https://alchemy.hguy.co/lms/");

        //Select My Account
        driver.findElement(By.linkText("My Account")).click();
        //Get Page title

        if (driver.getTitle().contains("My Account"))
            System.out.println("Page title is: " + driver.getTitle());

        else
            System.out.println("Page title dose not contain My Account ");

        //Click on Login

        driver.findElement(By.linkText("Login")).click();

        // Enter Username
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("root");
        //Enter Password
        driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("pa$$w0rd");
        //Click Login Button
        driver.findElement(By.xpath("//*[@id='wp-submit']")).click();

        //Verify Login is successful or not
        WebElement element = driver.findElement(By.className("display-name"));
        String userName = element.getText();
        if (userName.equalsIgnoreCase("root")) {
            System.out.println("Login is successful");
            driver.close();
        }
        else
            System.out.println("Login is Unsuccessful");

    }
}
