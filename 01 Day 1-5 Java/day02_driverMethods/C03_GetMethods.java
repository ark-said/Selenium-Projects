package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());

        String actualTitle = driver.getTitle();

        String arananKelime = "Amazon";

        if (actualTitle.contains(arananKelime)) {
            System.out.println("title test PASS");
        } else {
            System.out.println("title test FAIL");
            System.out.println("Sayfanin title'i" + actualTitle);
        }

        String actualUrl = driver.getCurrentUrl();

        String urlArananKelime = "amazon";

        if (actualUrl.contains(urlArananKelime))
        {
            System.out.println("url test PASS");
        }
else {
            System.out.println("url test FAILED");
            System.out.println("ACtual Url"+actualUrl);
        }

        System.out.println(driver.getWindowHandle());

    String actualPageSource=driver.getPageSource();
    String arananPageSource="alisveris";

        if (actualPageSource.contains(arananPageSource))
        {
            System.out.println("page source test PASS");
        }
        else {
            System.out.println("page source test FAILED");
            System.out.println("page source doesn't contains that word.");
        }

driver.close();

    }
}
