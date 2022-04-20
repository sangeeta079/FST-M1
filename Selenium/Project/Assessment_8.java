import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assessment_8 {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Open Browser
        driver.get("https://alchemy.hguy.co/lms/");

        driver.findElement(By.linkText("Contact")).click();

        if (driver.getTitle().contains("Contact"))
            System.out.println("Page title is: " + driver.getTitle());
        else
            System.out.println("Page title dose not contain Contact ");

        driver.findElement(By.xpath("//*[@id='wpforms-8-field_0']")).sendKeys("Sangeeta Chakraborty");
        driver.findElement(By.xpath("//*[@id='wpforms-8-field_1']")).sendKeys("sangeeta079@gmail.com");
        driver.findElement(By.xpath("//*[@id='wpforms-8-field_3']")).sendKeys("Automation Testing");
        driver.findElement(By.xpath("//*[@id='wpforms-8-field_2']")).sendKeys("Writing the Selenium automation scripts");

        driver.findElement(By.xpath("//*[@id='wpforms-submit-8']")).click();

        WebElement element = driver.findElement(By.xpath("//section[4]/div[2]/div[2]/div[2]/div[2]/p"));
        String expectedMsg = element.getText();
        System.out.println("Completion message is: "+expectedMsg);

        driver.close();

    }
}
