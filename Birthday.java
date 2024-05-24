import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Birthday {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTest\\CrmTest\\src\\drivers\\chromedriver-win64\\chromedriver.exe");
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://network.staypinc.com/login");

        positiveLogin(driver);
        logout(driver);
      
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

    WebElement customerService =driver.findElement(By.xpath("//span[@class='menu-title' and @data-i18n='Customer Service']"));
    customerService.click();

    WebElement birthdayReminder =driver.findElement(By.xpath("//a[@class='menu-item main-link main-sidebar' and @data-i18n='Birthday Reminder']"));
    birthdayReminder.click();
    
    WebElement addReminder =driver.findElement(By.xpath("//li[@class='nav-item']/button[@class='btn btn-primary btn-md px-1 font-small-3 shadow round']"));
    addReminder.click();

    WebElement name =driver.findElement (By.id("name"));
    name.sendKeys("Mansh");
   

    WebElement mobileNumber=driver.findElement(By.id("mobile"));
    mobileNumber.sendKeys("8808546245");
    
    WebElement email =driver.findElement(By.id("email"));  
    email.sendKeys("mansh@gmail.com");

    WebElement day =driver.findElement(By.cssSelector(".col-12.col-md-4 > .form-group > .e-input-group > input#dob_date"));
    day.sendKeys("25");
    Thread.sleep(2000);

    WebElement month =driver.findElement(By.cssSelector(".col-12.col-md-4 > .form-group > .e-input-group > input#dob_month"));
    month.sendKeys("May");
    Thread.sleep(2000);

    WebElement year =driver.findElement(By.cssSelector(".col-12.col-md-4 > .form-group > .e-input-group > input#dob_year"));
    year.sendKeys("2000");
    Thread.sleep(2000);

    WebElement submit =driver.findElement(By.cssSelector("button#save_birthday_wish"));
    submit.click();
    Thread.sleep(2000);
}

    public static void logout(WebDriver driver) throws InterruptedException {
        WebElement logoutButton = driver.findElement(By.className("dropdown-toggle"));
        logoutButton.click();
        Thread.sleep(4000);

        WebElement logoutLink = driver.findElement(By.cssSelector(".dropdown-menu a:nth-child(2)"));
        logoutLink.click();
        Thread.sleep(3000);     
        System.out.println("Logout Sucessfull");
        System.out.println("Re-Attempt Login");

       positiveLogin(driver);
       logout(driver);




   
}


}
