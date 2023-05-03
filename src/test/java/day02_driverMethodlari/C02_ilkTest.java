package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ilkTest {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. Yeni bir package olusturalim : day01
        2. Yeni bir class olusturalim : C03_GetMethods
        3. Amazon sayfasina gidelim. https://www.amazon.com/
        4. Sayfa basligini(title) yazdirin
        5. Sayfa basliginin “Amazon” icerdigini test edin
        6. Sayfa adresini(url) yazdirin
        7. Sayfa url’inin “amazon” icerdigini test edin.
        8. Sayfa handle degerini yazdirin
        9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        10. Sayfayi kapatin.
         */
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        System.out.println("Sayfa Başlığı :" + driver.getTitle());
        String expectedIcerik = "Amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedIcerik)) {
            System.out.println("Title amazon içermektedir, test PASSED");
        } else {
            System.out.println("Title amazon içermemektedir, test FAİLED");
        }
        expectedIcerik = "amazon";
        String actualUrl= driver.getCurrentUrl();

         if (actualUrl.contains(expectedIcerik)){
             System.out.println(driver.getCurrentUrl()+"URL amazon içeriyor, URL Test PASSED");
         }else{
             System.out.println("URL amazon içermiyor, URL Test FAİLED");
         }
        System.out.println("Sayfanın handle değeri: "+ driver.getWindowHandle());
         expectedIcerik="alısveris";
         String actualPageSource=driver.getPageSource();
         if (actualPageSource.contains(expectedIcerik)){
             System.out.println("Sayfa kaynak kodları alısveris içeriyor,test PASSED");
         }else{
             System.out.println("Sayfa kaynak kodları alısveris içermiyor,test FAİLED");

         }

        Thread.sleep(3000);
        driver.close();


    }
}
