
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Leaverequest {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTest\\CrmTest\\src\\drivers\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://network.staypinc.com/login");

        positiveLogin(driver);

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
        Thread.sleep(5000);
        
        if (driver.getCurrentUrl().equals("https://network.staypinc.com/dashboard")) {
            System.out.println("Login Successful");
        
           // WebElement markinButton = driver.findElement(By.id("mark-in-out"));
          //  markinButton.click();
           //Thread.sleep(1000);
          //  System.out.println("Mark in successful!");
           
            //WebElement timeElement = driver.findElement(By.cssSelector(".flex-column.font-small-3 b"));
           // String timeText = timeElement.getText();
           // System.out.println("Time: " + timeText);       
        } else {
            System.out.println("Login Failed"); 
            System.out.println(" Enter Valid Email And Password ");  
            //driver.quit();
        }
        WebElement hrmsLink = driver.findElement(By.xpath("//a[@href='/dashboard' and .//span[@class='menu-title' and text()='HRMS']]"));
        hrmsLink.click();
        Thread.sleep(2000);

        WebElement leaveRequest = driver.findElement(By.cssSelector(".is-shown a[data-i18n='Leave Requests']"));
        leaveRequest.click();
        Thread.sleep(2000); 

        WebElement raiseNewLeaveRequestButton = driver.findElement(By.cssSelector("li.nav-item button.btn"));
        raiseNewLeaveRequestButton.click();
        Thread.sleep(2000); 

        // Cal OPEN
       WebElement calendarClick= driver.findElement(By.cssSelector("div.dx-dropdowneditor-icon"));
       calendarClick.click();   

        // Select Date
        WebElement selectedCalCell = driver.findElement(By.cssSelector("td.dx-calendar-today"));
        selectedCalCell.click();  
        Thread.sleep(2000);

       // WebElement inputsElement = driver.findElement(By.className("<div class=\"dx-texteditor-buttons-container\"><div></div><div class=\"dx-button-normal dx-button-mode-contained dx-widget dx-dropdowneditor-button\" aria-label=\"Select\" role=\"button\"><div class=\"dx-button-content\"><div class=\"dx-dropdowneditor-icon\"></div></div></div></div>"));
      //  inputsElement.click();



    // Assuming you have initialized your WebDriver instance as "driver"
    //WebElement spanElement = driver.findElement(By.xpath("//span[@class='e-input-group e-control-wrapper e-ddl e-lib e-keyboard']"));
    //spanElement.click();

// You can also locate the input element inside the <span> element
WebElement spanElement = driver.findElement(By.xpath("//span[@class='e-input-group e-control-wrapper e-ddl e-lib e-keyboard']"));
WebElement inputElement = spanElement.findElement(By.id("leave_type"));
    
    inputElement.sendKeys("Standard Leave");
    inputElement.click();

   WebElement textarea = driver.findElement(By.id("reason"));
   textarea.sendKeys("Going for health checkup");
   Thread.sleep(2000);
    
           // SUBMIT BTN 
    //    WebElement addNewRequest = driver.findElement(By.cssSelector("div.content-wrapper button#leave-request"));

    } 
}


