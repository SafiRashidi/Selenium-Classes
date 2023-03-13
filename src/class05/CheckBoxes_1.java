package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes_1 {
    public static void main(String[] args) {
        // tell your project where the web driver is located
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to the syntax project web
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (int i = 0; i < checkBoxes.size() ; i++) {
            String value=checkBoxes.get(i).getAttribute("value");
            if (value.equalsIgnoreCase("Option-2"));
            checkBoxes.get(i).click();
        }

        // second way

        for (WebElement checkBox : checkBoxes) {
            String option = (checkBox.getAttribute("value"));

            if (checkBox.isEnabled() && option.equalsIgnoreCase("Option 1")) ;
            checkBox.click();
        }
    }
}

