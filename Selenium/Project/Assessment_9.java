import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assessment_9 {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
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

        driver.findElement(By.linkText("All Courses")).click();

        //Get Page title
        if (driver.getTitle().contains("All Courses"))
            System.out.println("Page title is: " + driver.getTitle());

        else
            System.out.println("Page title dose not contain All Courses ");

        //
        driver.findElement(By.xpath("//a[@class='btn btn-primary'][1]")).click();

        driver.findElement(By.xpath("//div[@class='ld-item-title'][1]")).click();

        //Get Page title
        if (driver.getTitle().contains("Developing Strategy"))
            System.out.println("Page title is: " + driver.getTitle());

        else
            System.out.println("Page title dose not contain Developing Strategy ");


        driver.close();

    }
}
