package gradleselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

    @Test
    public void test1()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\root\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
