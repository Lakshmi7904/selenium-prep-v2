package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    @org.testng.annotations.Test
    public void thisIsaSample(){
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
    }
}
