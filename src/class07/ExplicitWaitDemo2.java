package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo2 {
    public static void main(String[] args) {
        // tell your project where the web driver is located
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to the syntaxprojects.com
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        //        click on alert button
        driver.findElement(By.xpath("//button[@id='alert']")).click();
        //        wait until the alert is present
//        1.
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

    }
}
