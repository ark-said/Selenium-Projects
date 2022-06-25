package day05_mavenProjeOlusturma;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_FirstMavenClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com");

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("Samsung headphones"+ Keys.ENTER);

        WebElement sonucSayisiElementi=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));

        System.out.println(sonucSayisiElementi.getText());

        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

        driver.navigate().back();

       List<WebElement> basliklarListesi = (List<WebElement>) driver.findElement(By.xpath("//a[class='a-link-normal s-navigation-item']"));

        System.out.println("Sayfadaki baslik sayisi" + basliklarListesi.size());

driver.close();



    }
}
