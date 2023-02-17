package pages;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.List;

public class BasePage  {
public WebDriver driver;

    public void setUp() throws MalformedParameterizedTypeException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.kitapyurdu.com/");
        driver.manage().window().maximize();
    }
    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }
}
