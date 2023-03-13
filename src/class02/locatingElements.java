package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        // tell your project where the web driver is located
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //open facebook.com
        driver.get("https://www.facebook.com/");

        // send in the username
        driver.findElement(By.id("email")).sendKeys("moazzam");
        // send the password
        driver.findElement(By.name("pass")).sendKeys("Ahbhfeyi");
        // click on the button create New Account
    //    driver.findElement(By.linkText("Create new account")).click();

        // click on forgotten password
        driver.findElement(By.partialLinkText("password?")).click();

        driver.quit();

    }
}
