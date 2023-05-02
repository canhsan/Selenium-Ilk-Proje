package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMethotlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
       // System.out.println(driver.getWindowHandle());
        System.out.println(driver.getWindowHandles());

        Thread.sleep(5000);
        driver.close();
    }
}
