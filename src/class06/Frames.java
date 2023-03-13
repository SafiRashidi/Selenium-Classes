package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        // tell your project where the web driver is located
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // max the window
        //driver.manage().window().maximize();
        // go to the syntax project web
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        // switch to the iframe which contains the input box
        driver.switchTo().frame(0);

        // this element will shift the focus to the first frame
        WebElement textBox = driver.findElement(By.xpath("//input[@id='name']"));
        // send some keys
        textBox.sendKeys("abcdef");

        // get the text click on from parent window
        driver.switchTo().defaultContent();

        //        find the text
        WebElement text = driver.findElement(By.xpath("//h3"));
        System.out.println("the text is "+text.getText());

        // get the text "enter name" in iframe
        driver.switchTo().frame("iframe_a");

        WebElement getLabel = driver.findElement(By.xpath("//label"));
        System.out.println("The label is: " + getLabel.getText());

        // switch focus to the main page
        driver.switchTo().defaultContent();

        // 3rd method to an iframe using WebElement
        // clear what ever is written in the text box
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textBox.clear();

    }
}
