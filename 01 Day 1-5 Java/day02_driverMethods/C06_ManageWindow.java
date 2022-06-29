package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_ManageWindow {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://amazon.com");

        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        System.out.println("Sayfanin max halindeki boyutu:" + " "+driver.manage().window().getSize());
        System.out.println("Sayfanin max halindeki konumu:" + " "+driver.manage().window().getPosition());
        driver.manage().window().fullscreen();
        System.out.println("Sayfanin fullscreen halindeki boyutu:" + " " +driver.manage().window().getSize());
        System.out.println("Sayfanin fullscreen halindeki konumu:" + " " +driver.manage().window().getPosition());
        driver.quit();
    }
}
