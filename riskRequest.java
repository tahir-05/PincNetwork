import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
public class riskRequest{
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTest\\CrmTest\\src\\drivers\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://network.staypinc.com/login");

        Login(driver);

    } 


    public static void Login(WebDriver driver) throws InterruptedException {

        WebElement EmailAddressField = driver.findElement(By.id("email"));
        EmailAddressField.sendKeys("yogesh.kumar@dev.pincinsure.com");
        Thread.sleep(2000);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Pincdev@123");
        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(5000);

        WebElement riskManagment = driver.findElement(By.linkText("Risk Management"));
        riskManagment.click();

        WebElement riskRequest = driver.findElement(By.linkText("Risk Requests"));
        riskRequest.click();

        WebElement raiseNewRequestButton =driver.findElement(By.cssSelector("ul.nav.nav-pills.float-right > li.nav-item > button.btn.btn-primary.btn-md.px-1.font-small-3.shadow.round"));
        raiseNewRequestButton.click();

        WebElement clientType =driver.findElement(By.cssSelector("span.e-input-group-icon.e-ddl-icon.e-search-icon"));
         clientType.click();
         //WebElement typeselect = driver.findElement(By.cssSelector(".col-12.col-md-6 > .form-group:nth-child(1) > .e-input-group > input#client_type"));
        //typeselect.sendKeys("Client");
        
        WebElement location = driver.findElement(By.id("address"));
        location.sendKeys("mumbai thane");

        WebElement occupation = driver.findElement(By.id("occupancy"));
        occupation.sendKeys("testing");

        WebElement sumInsured = driver.findElement(By.id("sum_insured"));
        sumInsured.sendKeys("01");

       // WebElement typeOfInpection =driver.findElement(By.cssSelector("span.e-input-group-icon.e-ddl-icon.e-search-icon\")"));
        //typeOfInpection.click();

        WebElement date = driver.findElement(By.id("inspection_date"));
        date.sendKeys("2024-05-23");
        


        



       







        

       

       





    }

}
