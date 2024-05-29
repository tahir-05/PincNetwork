import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class riskRequest {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\pinc\\PincNetwork\\src\\drivers\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://network.staypinc.com/login");

        Login(driver);
        logout(driver);
        login(driver, "approval.manager@pincinsure.com", "ApprovalManagerPassword");

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
        Thread.sleep(3000);

        WebElement riskManagment = driver.findElement(By.linkText("Risk Management"));
        riskManagment.click();

        WebElement riskRequest = driver.findElement(By.linkText("Risk Requests"));
        riskRequest.click();
        Thread.sleep(1000);

        WebElement raiseNewRequestButton =driver.findElement(By.cssSelector("ul.nav.nav-pills.float-right > li.nav-item > button.btn.btn-primary.btn-md.px-1.font-small-3.shadow.round"));
        raiseNewRequestButton.click();

        WebElement clientType = driver.findElement(By.cssSelector("span.e-input-group-icon.e-ddl-icon.e-search-icon"));
        clientType.click();
        Thread.sleep(1000);

        WebElement clienttypeselect = driver.findElement(By.cssSelector(".col-12.col-md-6.col-lg-6 .e-input-group"));
        clienttypeselect.sendKeys("Existing Client"); 
        Thread.sleep(2000);

        WebElement clientNameselect = driver.findElement(By.cssSelector(".col-12.col-md-6.col-lg-6:nth-child(2) .e-input-group"));
        clientNameselect.sendKeys("AMUL");
        Thread.sleep(2000);

        WebElement location = driver.findElement(By.id("address"));
        location.sendKeys("mumbai thane");

        WebElement occupation = driver.findElement(By.id("occupancy"));
        occupation.sendKeys("testing");

        WebElement sumInsured = driver.findElement(By.id("sum_insured"));
        sumInsured.sendKeys("01");
        //Thread.sleep(2000);

        WebElement typeofInspection = driver.findElement(By.cssSelector(".col-12.col-md-6.col-lg-6:nth-child(6) .e-input-group"));
        typeofInspection.sendKeys("Risk Inspection");
        Thread.sleep(2000);
        typeofInspection.click();

        WebElement Date = driver.findElement(By.className("dx-dropdowneditor-icon"));
        Date.click();

        WebElement selectedCalCell = driver.findElement(By.cssSelector("td.dx-calendar-today"));
        selectedCalCell.click(); 
        Thread.sleep(2000);

       WebElement submitButton = driver.findElement(By.id("save_risk_management"));
       submitButton.click();
       Thread.sleep(4000);

    }
       public static void logout(WebDriver driver) throws InterruptedException {
        WebElement profileMenu = driver.findElement(By.linkText("My Profile")); 
        profileMenu.click();
        Thread.sleep(2000);

        WebElement userDropdown = driver.findElement(By.cssSelector("li.dropdown-user.nav-item .dropdown-toggle.nav-link"));
        userDropdown.click();
        Thread.sleep(1000);

        WebElement logoutButton = driver.findElement(By.cssSelector(".dropdown-menu a:nth-child(2)")); 
        logoutButton.click();
        Thread.sleep(1000);

    

    }

      //Approval Manager process 

   public static void login(WebDriver driver, String username, String password) throws InterruptedException {

        WebElement EmailAddressField = driver.findElement(By.id("email"));
        EmailAddressField.sendKeys("rahul.chauhan@dev.pincinsure.com");
    
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Pincdev@123");
       
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement riskManagement = driver.findElement(By.linkText("Risk Management"));
        riskManagement.click();
        Thread.sleep(1000);

        WebElement requestApproval = driver.findElement(By.linkText("Request Approvals"));
        requestApproval.click();
        Thread.sleep(2000);

        WebElement eyeButton2 = driver.findElement(By.xpath("//td[@class='dx-command-edit']//button[2]"));
        eyeButton2.click();
        Thread.sleep(1000);

        WebElement remarksApproval = driver.findElement(By.id("remarks"));
        remarksApproval.sendKeys("TESTING"); 
        Thread.sleep(1000);

        WebElement yourAction = driver.findElement(By.id("status"));
        yourAction.sendKeys("Approve");
        Thread.sleep(1000);

        WebElement reasonApproval = driver.findElement(By.id("reason"));
        reasonApproval.sendKeys("Testing Approve");
        Thread.sleep(1000);

        WebElement SubmitApproval = driver.findElement(By.id("edit_risk_management"));
        SubmitApproval.click();
        Thread.sleep(3000);

        logout(driver);
        Login(driver);
        login(driver, "approval.manager@pincinsure.com", "ApprovalManagerPassword");



  
  
    } 

}




        
