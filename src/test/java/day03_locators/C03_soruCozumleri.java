package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_soruCozumleri {
    public static void main(String[] args) throws InterruptedException {
        /*
            1- Bir test class’i olusturun ilgili ayarlari yapin
            2- https://www.automationexercise.com/ adresine gidin
            3- Sayfada 147 adet link bulundugunu test edin.
            4- Products linkine tiklayin
            5- special offer yazisinin gorundugunu test edin
            6- Sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.automationexercise.com");
        List<WebElement> linkElementiSayisi = driver.findElements(By.tagName("a"));

        int expectedLinkSayiyi = 147;
        int actualLinkSayisi = linkElementiSayisi.size();

        if (expectedLinkSayiyi == actualLinkSayisi) {
            System.out.println("Link sayısı testi PASSED");
        } else {
            System.out.println("Link sayısı testi FAİLED");
        }

        WebElement productLinkElementi=driver.findElement(By.partialLinkText("Products"));
        productLinkElementi.click();
        WebElement specialOfferElementi=driver.findElement(By.id("sale_image"));

        if (specialOfferElementi.isDisplayed()){
            System.out.println("Special offer test PASSED");
        }else{
            System.out.println("Special offer test FAİLED");
        }

            driver.close();
    }
}
