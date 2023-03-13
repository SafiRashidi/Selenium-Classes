package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown_3 {
    public static void main(String[] args) throws InterruptedException {
        // tell your project where the web driver is located
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        driver.manage().window().maximize();
        // go to the syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        // get the drop down
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

        // use select class
        Select sel = new Select(DD);

        // select by value
        sel.selectByValue("New Jersey");

        // select by visible text
        sel.selectByVisibleText("Ohio");
        // to slow
        Thread.sleep(2000);

        // When it comes MultiSelect Drop Down we can also deselect
        sel.deselectByValue("New Jersey");

        sel.deselectByVisibleText("Ohio");

        System.out.println("The drop Down is multiple " +sel.isMultiple());



    }
}
