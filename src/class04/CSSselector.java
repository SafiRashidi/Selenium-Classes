package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver=new ChromeDriver();
//        max the window
        driver.manage().window().maximize();

//        goto facebook.com
        driver.get("https://www.facebook.com");

//        click on the button create account using css selector
        WebElement createNewBtn=driver.findElement(By.cssSelector("a[data-testid= 'open-registration-form-button']"));
//        click on the button
        createNewBtn.click();
//        put a sleep statement so that  the browser can open up the window which contains the element
        Thread.sleep(1000);
//        fill in the first Name
        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("abracadbara");
    }
}
