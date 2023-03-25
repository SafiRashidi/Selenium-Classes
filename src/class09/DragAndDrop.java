package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {
        // tell your project where the web driver is located
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/droppable/");

                driver.switchTo().frame(0);

//        get the element which u want to drag
        WebElement draggable = driver.findElement(By.id("draggable"));

//        get the dropable element

        WebElement dropable = driver.findElement(By.id("droppable"));

// action class
        Actions action= new Actions(driver);
        action.dragAndDrop(draggable,dropable).perform();

    }
}
