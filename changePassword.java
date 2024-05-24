import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class changePassword {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTest\\CrmTest\\src\\drivers\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://network.staypinc.com/login");

        positiveLogin(driver);
        changePasswordHRMS(driver);
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
        Thread.sleep(10000);
        
        if (driver.getCurrentUrl().equals("https://network.staypinc.com/dashboard")) {
            System.out.println("Login Successful");
        
          //  WebElement markinButton = driver.findElement(By.id("mark-in-out"));
           // markinButton.click();
          // Thread.sleep(1000);
         //   System.out.println("Mark in successful!");
           
          //  WebElement timeElement = driver.findElement(By.cssSelector(".flex-column.font-small-3 b"));
           // String timeText = timeElement.getText();
            //System.out.println("Time: " + timeText);       
        } else {
            System.out.println("Login Failed"); 
            System.out.println(" Enter Valid Email And Password ");  
            driver.quit(); 
        }
            
        }
        public static void changePasswordHRMS(WebDriver driver) throws InterruptedException {
            // Log in with valid credentials
    
        
     WebElement hrmsLink = driver.findElement(By.xpath("//a[@href='/dashboard' and .//span[@class='menu-title' and text()='HRMS']]"));
     hrmsLink.click();
       Thread.sleep(2000);

     WebElement employeeListLink = driver.findElement(By.xpath("//a[@data-i18n='Employee List']"));
     employeeListLink.click();
     Thread.sleep(2000);

     WebElement searchInput = driver.findElement(By.xpath("//input[@aria-label='Search in the data grid']"));
     searchInput.sendKeys("akash");
     Thread.sleep(3000);

    //  WebElement actionPswd = driver.findElement(By.cssSelector(".dx-command-edit button:nth-child(2)"));
    //     actionPswd.click();
    //     Thread.sleep(10000);
    WebElement actionPswd = driver.findElement(By.cssSelector(".dx-command-edit button:nth-of-type(2)"));
    actionPswd.click();
    Thread.sleep(2000);
    WebElement passwordInput = driver.findElement(By.id("password"));
    passwordInput.sendKeys("Pinc@123");
    

    WebElement submitButton = driver.findElement(By.id("save_change_password"));
    submitButton.click();

    WebElement okButton = driver.findElement(By.className("swal2-confirm swal2-styled"));

        // Click the "Ok" button
        okButton.click();
    Thread.sleep(2000);

    positiveLogin(driver);




     
     

    

    


        
        }

    
    } 
    

