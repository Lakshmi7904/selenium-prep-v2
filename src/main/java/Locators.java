import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Locators {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "/Users/ravikiransarangu/Downloads/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver(options);
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //id
        driver.findElement(By.id("inputUsername")).sendKeys("madhuri");
        //name
        driver.findElement(By.name("inputPassword")).sendKeys("madhuri");
        //className
        driver.findElement(By.className("signInBtn")).click();
        //cssSelector
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        //linkText
        driver.findElement(By.linkText("Forgot your password?")).click();
        //xpath
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Lakshmi89");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("lreddy0529@gmail.com!");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("blooms.madhu@gmail.com");
        //xpath by using index
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("3302177904");
        driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

    }
}
