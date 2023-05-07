package day04_xpath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_cssSelector {
    public static void main(String[] args) throws InterruptedException {
        //1- bir class olusturun
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // 2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
       // 3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
       // 4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
       // 5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedIcerik="Spend less";
        String actualTitle= driver.getTitle();
        System.out.println(actualTitle);
        if (expectedIcerik.contains(actualTitle)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title testi FAİLED");
        }
       // 6- Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
       // 7- Birthday butonuna basin
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/div[1]/div/div/div/div/div[2]/div[3]/div/div/a/img")).click();
       // 8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("//*[@id=\"acs-product-block-0\"]/div[1]/a/img")).click();
       // 9- Gift card details’den 25 $’i secin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"gc-mini-picker-amount-1\"]")).click();
       // 10-Urun ucretinin 25$ oldugunu test edin
        WebElement ucretDeğer=driver.findElement(By.xpath("//*[@id=\"gc-buy-box-text\"]/span"));
        System.out.println(ucretDeğer.getText());

        String expectedDeger="$25.00";
        String actulaDeger=ucretDeğer.getText();
        if (expectedDeger.equals(actulaDeger)){
            System.out.println("Hediye kart ucret testi PASSED");
        }else {
            System.out.println("Hediye kart ucret testi FAİLED");
        }
        // 11-Sayfayi kapatin

        Thread.sleep(3000);
        driver.close();

    }
}
