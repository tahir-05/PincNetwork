import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class riskRequest{
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\pinc\\PincNetwork\\src\\drivers\\chromedriver.exe");

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

        WebElement clientType = driver.findElement(By.cssSelector("span.e-input-group-icon.e-ddl-icon.e-search-icon"));
        clientType.click();
        Thread.sleep(1000);

        WebElement clienttypeselect = driver.findElement(By.cssSelector(".col-12.col-md-6.col-lg-6 .e-input-group"));
        clienttypeselect.sendKeys("Existing Client"); 
        Thread.sleep(2000);

        WebElement clientNameselect = driver.findElement(By.cssSelector(".col-12.col-md-6.col-lg-6:nth-child(2) .e-input-group"));
        clientNameselect.sendKeys("1 DELL");
        Thread.sleep(2000);

        WebElement location = driver.findElement(By.id("address"));
        location.sendKeys("mumbai thane");

        WebElement occupation = driver.findElement(By.id("occupancy"));
        occupation.sendKeys("testing");

        WebElement sumInsured = driver.findElement(By.id("sum_insured"));
        sumInsured.sendKeys("01");
        Thread.sleep(2000);

        WebElement typeofInspection = driver.findElement(By.cssSelector(".col-12.col-md-6.col-lg-6:nth-child(6) .e-input-group"));
        typeofInspection.sendKeys("Risk Inspection");
        Thread.sleep(2000);
        typeofInspection.click();

        WebElement Date = driver.findElement(By.className("dx-dropdowneditor-icon"));
        Date.click();

        WebElement selectedCalCell = driver.findElement(By.cssSelector("td.dx-calendar-today"));
        selectedCalCell.click(); 

       //WebElement remarksField = driver.findElement(By.id("remarks"));
       //remarksField.sendKeys("This is a test remark.");

       WebElement submitButton = driver.findElement(By.id("save_risk_management"));
       submitButton.click();

  
    } 

}
        
