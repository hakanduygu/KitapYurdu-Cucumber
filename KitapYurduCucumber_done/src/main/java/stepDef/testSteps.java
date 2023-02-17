package stepDef;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.BasePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class testSteps extends BasePage {
    @Before
    public void open() throws MalformedParameterizedTypeException {
        setUp();
        System.out.println("KitapYurdu websitesine gidildi.");

    }

    @Given("click login button")
    public void click_login_button() {
        WebElement loginElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]"));
        loginElement.click();

    }

    @And("type email")
    public void type_email() {
        WebElement mailElement = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
        mailElement.sendKeys("hakkoman9@hotmail.com");

    }

    @And("type password")
    public void type_password() {
        WebElement passwordElement = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]"));
        passwordElement.sendKeys("SK+4k3!Z3SC6Hs");
    }

    @And("click submit button")
    public void click_submit_button() throws InterruptedException {
        WebElement submitElement = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/button[1]"));
        submitElement.click();
        Thread.sleep(10000);
    }

    @And("go menu bar")
    public void go_menu_bar() throws InterruptedException {
        By menuBar = new By.ByXPath("/html[1]/body[1]/div[1]/div[4]/div[1]/ul[1]/li[1]/div[2]/ul[1]/li[1]/span[1]");
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(menuBar);
        actions.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(menuBar));
        Thread.sleep(1000);

    }

    @And("click mostseller books")
    public void click_mostseller_books() throws InterruptedException {
        WebElement mostsellerElement = driver.findElement(new By.ByXPath("/html[1]/body[1]/div[1]/div[4]/div[1]/ul[1]/li[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/strong[1]"));
        mostsellerElement.click();
        Thread.sleep(1000);
    }

    @And("select random product")
    public void select_random_product() throws InterruptedException {
        Random rand = new Random();
        int randomBook = rand.nextInt(tumkitaplar().size());
        tumkitaplar().get(randomBook).click();
        Thread.sleep(1000);
    }
    private List<WebElement> tumkitaplar(){
        By selectRandomProductLocator = new By.ByClassName("product-cr");
        return findAll(selectRandomProductLocator);
    }

    @And("add product to cart")
    public void add_product_to_cart() throws InterruptedException {
       WebElement addCartElement = driver.findElement(By.id("button-cart"));
       addCartElement.click();
       Thread.sleep(1000);
       WebElement textElement = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/h2[1]/a[1]"));
       String actualName = textElement.getText();
       System.out.println(actualName);
    }
    @And("go profile bar")
    public void go_profile_bar() throws InterruptedException {
        By profileBarMenuLocator = new By.ByXPath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/b[1]");
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(profileBarMenuLocator);
        actions.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.elementToBeClickable(profileBarMenuLocator));
        Thread.sleep(1000);
    }

    @And("click logout button")
    public void click_logout_button() {
        WebElement logoutButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/ul[1]/li[4]/a[1]"));
        logoutButton.click();
    }

    @And("click login button again")
    public void click_login_button_again() {
        WebElement loginElement = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]"));
        loginElement.click();

    }

    @And("type email again")
    public void type_email_again() {
        WebElement mailElement = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
        mailElement.sendKeys("hakkoman9@hotmail.com");

    }

    @And("type password again")
    public void type_password_again() {
        WebElement passwordElement = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]"));
        passwordElement.sendKeys("SK+4k3!Z3SC6Hs");

    }

    @And("click submit button again")
    public void click_submit_button_again() throws InterruptedException {
        WebElement submitElement = driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/button[1]"));
        submitElement.click();
        Thread.sleep(10000);

    }

    @And("go cart bar")
    public void go_cart_bar() throws InterruptedException {
        WebElement cartBarElement = driver.findElement(By.id("cart"));
        cartBarElement.click();
        Thread.sleep(1000);
    }

    @When("click cart button")
    public void click_cart_button() {
        WebElement cartButtonElement = driver.findElement(By.id("js-cart"));
        cartButtonElement.click();
    }
    @Then("check same product added")
        public void check_same_product_added() throws InterruptedException {
        WebElement cartBarElement = driver.findElement(By.id("cart"));
        cartBarElement.click();
        Thread.sleep(1000);
        WebElement urunumuzKitap = driver.findElement(new By.ByXPath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/a[1]"));
        String actualName = urunumuzKitap.getText();
        Thread.sleep(1000);
        WebElement sepettekiKitap = driver.findElement(new By.ByXPath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/a[1]"));
        String expectedName = sepettekiKitap.getText();
        Thread.sleep(1000);
        System.out.println(actualName);
        System.out.println(expectedName);
        Assert.assertEquals(actualName,expectedName,"TEST BAŞARISIZ");
    }
}