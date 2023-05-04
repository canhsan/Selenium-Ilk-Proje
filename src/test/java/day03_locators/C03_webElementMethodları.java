package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_webElementMethodları {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusuElementi= driver.findElement(By.id("twotabsearchtextbox"));

        System.out.println(aramaKutusuElementi.isDisplayed());
        System.out.println(aramaKutusuElementi.isEnabled());
        aramaKutusuElementi.isSelected();
        System.out.println(aramaKutusuElementi.getText());
        aramaKutusuElementi.sendKeys("hasan can");
        Thread.sleep(2000);
        aramaKutusuElementi.clear();


        Thread.sleep(1000);
        driver.close();

    }
}
