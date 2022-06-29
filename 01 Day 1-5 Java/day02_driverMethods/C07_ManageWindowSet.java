package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindowSet
{
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://amazon.com");

        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(10,10));
        driver.manage().window().setSize(new Dimension(300,500));

        int xKoordinati=driver.manage().window().getPosition().getX();
        int yKoordinati=driver.manage().window().getPosition().getY();
        int genislik=driver.manage().window().getSize().getWidth();
        int yukseklik=driver.manage().window().getSize().getHeight();

if (xKoordinati==0 && yKoordinati==0 && genislik==300 && yukseklik==500) {
    System.out.println("Olceklendirme testi PASS");
} else {
    System.out.println("Olceklendirme testi FAILED");
}
driver.close();

    }
}
