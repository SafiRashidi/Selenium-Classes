package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) {
        // tell your project where the web driver is located
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // go to the amazon.com
        driver.get("https://www.amazon.com/");

        //get all the names
        // we know that all links are in tag <a> which is also called anchor tag
        //lets use the locator By tagName for this purpose

        List<WebElement> tags = driver.findElements(By.tagName("a"));
        // in order to print we need to iterator
        for (WebElement tag : tags){
           String link = tag.getAttribute("href");
            System.out.println(link);
        }

    }
}
