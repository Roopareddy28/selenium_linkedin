package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase02 {
    WebDriver driver;
    public TestCase02()
    {
        System.out.println("Constructor: TestCase1");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }
    public void endTest()
    {
        System.out.println("End Test: TestCases");
        //driver.close();
        //driver.quit();

    }
    public  void testCase02() throws InterruptedException{
        System.out.println("Testcase to Automate linkedin account for typing the text under connections only and select image by giving the path of the image");
        System.out.println("Start Test case: testCase02");
        driver.get("https://www.linkedin.com");
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.findElement(By.name("session_key")).sendKeys("7057401789");
        //Thread.sleep(3000);
        driver.findElement(By.name("session_password")).sendKeys("roopareddy.28");
        driver.findElement(By.linkText("Sign in")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("username")).sendKeys("7057401789");
        driver.findElement(By.id("password")).sendKeys("roopareddy.28");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement pr=driver.findElement(By.xpath("//div[text()='Welcome, Roopa!']"));
        if(pr.isDisplayed())
               {
                driver.findElement(By.xpath("//span[text()='Start a post']")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("All about selenum");
                driver.findElement(By.xpath("//span[text()='Post']")).click();
              }
              System.out.println("End Test case:testcase02");
       
            }
       
 
        }