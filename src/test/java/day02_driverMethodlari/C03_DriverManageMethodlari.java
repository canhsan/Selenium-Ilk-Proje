package day02_driverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

        System.out.println("Başlangıçtaki Konum :"+driver.manage().window().getPosition());
        System.out.println("Başlangıçtaki boyut: "+driver.manage().window().getSize());


        driver.manage().window().maximize();
        Thread.sleep(3000);

        System.out.println("Maximize Konum :"+driver.manage().window().getPosition());
        System.out.println("Maximize boyut: "+driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        System.out.println("fullscreen :"+driver.manage().window().getPosition());
        System.out.println("fullscreen: "+driver.manage().window().getSize());

        driver.manage().window().minimize();
        Thread.sleep(3000);

        System.out.println("minimize :"+driver.manage().window().getPosition());
        System.out.println("minimize: "+driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(500,500));
        Thread.sleep(3000);

        System.out.println("İstediğimiz konum :"+driver.manage().window().getPosition());
        System.out.println("İstediğimiz konum: "+driver.manage().window().getSize());



        Thread.sleep(3000);
        driver.close();

    }
}
