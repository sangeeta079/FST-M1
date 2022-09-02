import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-attributes");
        String pageTitle= driver.getTitle();
        System.out.println(pageTitle);

        driver.findElement(By.xpath("//input[starts-with(@class, 'username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[starts-with(@class, 'password')]")).sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        WebElement login= driver.findElement(By.xpath("//div[@id='action-confirmation']"));
        wait.until(ExpectedConditions.visibilityOf(login));

        String loginMessage = login.getText();
        System.out.println(loginMessage);

        driver.quit();

    }
}