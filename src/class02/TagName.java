package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {
    public static void main(String[] args) {
        // tell your project where the web driver is located
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // maximize
        driver.manage().window().maximize();
// goto amazon web
        driver.get("https://www.amazon.com/");
        // print all the all links in the amazon.com
        driver.findElements(By.tagName("a"));

        // to be continued in the next class
    }
}
