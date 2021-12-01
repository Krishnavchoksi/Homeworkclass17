package SeleniumSessions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Year;

public class Registration {
    public static void main(String[] args) throws Exception  {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
        WebElement female = driver.findElement(By.className("forcheckbox"));
        female.click();
        System.out.println(female.isSelected());
        driver.findElement(By.id("FirstName")).sendKeys("Krishna");
        Thread.sleep(3000);
        driver.findElement(By.id("LastName")).sendKeys("Choksi");
        Thread.sleep(3000);
        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        Thread.sleep(3000);
        WebElement month = driver.findElement(By.name("DateOfBirthMonth"));
        Thread.sleep(3000);
        WebElement year = driver.findElement(By.name("DateOfBirthYear"));
        Thread.sleep(3000);
        Select select = new Select(Day);
        Thread.sleep(3000);
        select.selectByVisibleText("23");
        Thread.sleep(3000);
        Select select1 = new Select((month));
        Thread.sleep(3000);
        select1.selectByVisibleText("May");
        Thread.sleep(3000);
        Select select2 = new Select(year);
        select2.selectByVisibleText("2020");
        driver.findElement(By.id("Email")).sendKeys("kisuchoksi@gmail.com");
        driver.findElement(By.name("Company")).sendKeys("unify testing");
        driver.findElement(By.name("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        Thread.sleep(3000);
        driver.findElement(By.id("register-button")).click();


    }
}
