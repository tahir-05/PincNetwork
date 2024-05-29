import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wellnessRequest {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\pinc\\PincNetwork\\src\\drivers\\chromedriver.exe");
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://network.staypinc.com/login");

        positiveLogin(driver);
        logout(driver);
        login(driver, "approval.manager@pincinsure.com", "ApprovalManagerPassword");

      

    }

    public static void positiveLogin(WebDriver driver) throws InterruptedException {

        WebElement EmailAddressField = driver.findElement(By.id("email"));
        EmailAddressField.sendKeys("yogesh.kumar@dev.pincinsure.com");
        Thread.sleep(2000);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Pincdev@123");
        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(2000);
        
        if (driver.getCurrentUrl().equals("https://network.staypinc.com/dashboard")) {
            System.out.println("Login Successful");
        
           /*WebElement markinButton = driver.findElement(By.id("mark-in-out"));
           markinButton.click();
           Thread.sleep(1000);
           System.out.println("Mark in successful!");
           
           WebElement timeElement = driver.findElement(By.cssSelector(".flex-column.font-small-3 b"));
           String timeText = timeElement.getText();
           System.out.println("Time: " + timeText);       */
        } else {
            System.out.println("Login Failed"); 
            System.out.println(" Enter Valid Email And Password ");  
            //driver.quit();
        } 
    
        WebElement wellnesManagment = driver.findElement(By.linkText("Wellness Management"));
        wellnesManagment.click();
        
        WebElement wellnesRequest = driver.findElement(By.linkText("Wellness Requests"));
        wellnesRequest.click();
        Thread.sleep(2000);

        WebElement raiseRequestButton = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-md px-1 font-small-3 shadow round']"));
         raiseRequestButton.click();

         WebElement clientType = driver.findElement(By.cssSelector("span.e-input-group-icon.e-ddl-icon.e-search-icon"));
         clientType.click();
         Thread.sleep(1000);
 
         WebElement clienttypeselect = driver.findElement(By.cssSelector(".col-12.col-md-6.col-lg-6 .e-input-group"));
         clienttypeselect.sendKeys("Existing Client"); 
         Thread.sleep(2000);
 
         WebElement clientNameselect = driver.findElement(By.cssSelector(".col-12.col-md-6.col-lg-6:nth-child(2) .e-input-group"));
         clientNameselect.sendKeys("ABCC");
         Thread.sleep(2000);

         WebElement location = driver.findElement(By.id("address"));
         location.sendKeys("mumbai thane");

         WebElement Date = driver.findElement(By.className("dx-dropdowneditor-icon"));
         Date.click();
 
         WebElement selectedCalCell = driver.findElement(By.cssSelector("td.dx-calendar-today"));
         selectedCalCell.click(); 
         Thread.sleep(2000);
 
         //WebElement remark = driver.findElement(By.id("remarks"));
        // remark.sendKeys("wellness Testing");

         WebElement submitButton = driver.findElement(By.id("save_wellness_management"));
         submitButton.click();
         Thread.sleep(2000);

        
    }

    public static void logout(WebDriver driver) throws InterruptedException {
        WebElement profileMenu = driver.findElement(By.linkText("My Profile")); 
        profileMenu.click();
        Thread.sleep(2000);

        WebElement userDropdown = driver.findElement(By.cssSelector("li.dropdown-user.nav-item .dropdown-toggle.nav-link"));
        userDropdown.click();

        WebElement logoutButton = driver.findElement(By.cssSelector(".dropdown-menu a:nth-child(2)")); 
        logoutButton.click();
        Thread.sleep(1000);




    
}
public static void login(WebDriver driver, String username, String password) throws InterruptedException {

    WebElement EmailAddressField = driver.findElement(By.id("email"));
    EmailAddressField.sendKeys("rahul.chauhan@dev.pincinsure.com");

    WebElement passwordField = driver.findElement(By.id("password"));
    passwordField.sendKeys("Pincdev@123");
   
    WebElement loginButton = driver.findElement(By.id("login"));
    loginButton.click();
    Thread.sleep(2000);

    WebElement WellnesssManagement = driver.findElement(By.linkText("Wellness Management"));
    WellnesssManagement.click();
    Thread.sleep(1000);

    WebElement requestApproval = driver.findElement(By.linkText("Request Approvals"));
    requestApproval.click();
    Thread.sleep(2000);

    WebElement eyeButton2 = driver.findElement(By.xpath("//td[@class='dx-command-edit']//button[2]"));
    eyeButton2.click();
    Thread.sleep(1000);

    WebElement status = driver.findElement(By.id("status"));
    status.sendKeys("Approve");

    WebElement reasonApproval = driver.findElement(By.id("reason"));
    reasonApproval.sendKeys("Testing Approve");

    WebElement SubmitApproval = driver.findElement(By.id("edit_wellness_approval"));
    SubmitApproval.click();

    logout(driver);
    positiveLogin(driver);
    login(driver, "approval.manager@pincinsure.com", "ApprovalManagerPassword");




}

}
