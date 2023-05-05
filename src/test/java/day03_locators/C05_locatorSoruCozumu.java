package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_locatorSoruCozumu {
    public static void main(String[] args) throws InterruptedException {
        /*
        1- https://www.amazon.com/ sayfasına gidin.
        2- Arama kutusuna “city bike” yazip aratin
        3- Görüntülenen sonuçların sayısını yazdırın
        4- Listeden ilk urunun resmine tıklayın.
        */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1- https://www.amazon.com/ sayfasına gidin.

        driver.get("https://www.amazon.com");

        //2- Arama kutusuna “city bike” yazip aratin

        WebElement aramaKutusuElementi=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusuElementi.sendKeys("city bike");
        aramaKutusuElementi.submit();








        Thread.sleep(3000);
        driver.close();

    }
}
