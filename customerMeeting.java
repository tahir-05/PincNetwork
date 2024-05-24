import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class customerMeeting {
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

        WebElement meeting= driver.findElement(By.cssSelector("span.menu-title[data-i18n=\"Meetings\"]"));
        meeting.click();

        
       WebElement customerMeeting= driver.findElement(By.cssSelector("span.menu-title[data-i18n=\"Customer Meetings\"]"));
       customerMeeting.click();

        WebElement createCustomerMeeting= driver.findElement(By.id("create_customer_meeting"));
        createCustomerMeeting.click();

          //WebElement meetingWith= driver.findElement(By.cssSelector(".e-input-group.e-control-wrapper.e-ddl.e-lib.e-keyboard"));
          //meetingWith.click();

        //WebElement selectCustomer= driver.findElement(By.cssSelector("span.e-input-group input#customer-field"));
       // selectCustomer.click();
       
       //    WebElement selectCustomer= driver.findElement(By.id("client_id"));
        WebElement selectCustomer= driver.findElement(By.id("customer-field"));
        selectCustomer.click();

        //WebElement meetingType = driver.findElement(By.id("business_type"));
       // meetingType.click();

        WebElement date = driver.findElement(By.cssSelector("div.dx-dropdowneditor-icon"));
        date.click();

         WebElement selectedCalCell = driver.findElement(By.cssSelector("td.dx-calendar-today"));
        selectedCalCell.click(); 

        WebElement meetingAgenda = driver.findElement(By.id("agenda"));
        meetingAgenda.sendKeys("Business Deal");

        WebElement location = driver.findElement(By.id("location"));
        location.sendKeys("Mumbai");

        WebElement accompainedBy= driver.findElement(By.cssSelector("div.css-2b097c-container input[type='text']"));
        accompainedBy.sendKeys("Akshay Kumar");
    
        WebElement submit = driver.findElement(By.id("add_customer"));
        submit.click();











        
     
}

}
