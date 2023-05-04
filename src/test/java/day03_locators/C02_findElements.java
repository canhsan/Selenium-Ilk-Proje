package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //********************************
        driver.get("https://www.automationexercise.com");

        List<WebElement> categoriElementsList=driver.findElements(By.className("panel-title"));

        int expectedSize=3;
        int actualSize= categoriElementsList.size();

        if (expectedSize==actualSize){
            System.out.println("Categori element size testi PASSED");
        }else{
            System.out.println("Categori element size testi FAİLED");
        }
        //System.out.println(categoriElementsList);

        for (WebElement eachElement:categoriElementsList
             ) {
            System.out.println(eachElement.getText()+" ");
        }
        
        



        Thread.sleep(3000);
        driver.close();

    }
}
