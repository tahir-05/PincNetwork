import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {     

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTest\\CrmTest\\src\\drivers\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://network.staypinc.com/login");

        positiveLogin(driver);
        logout(driver);
        forgotPassword(driver);
        negativeLogin(driver);
        
       // driver.quit();
    }

    public static void positiveLogin(WebDriver driver) throws InterruptedException {

        WebElement EmailAddressField = driver.findElement(By.id("email"));
        EmailAddressField.sendKeys("rahul.chauhan@dev.pincinsure.com");
        Thread.sleep(2000);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Pincdev@123");
        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(10000);
        
        if (driver.getCurrentUrl().equals("https://network.staypinc.com/dashboard")) {
            System.out.println("Login Successful");
        
            WebElement markinButton = driver.findElement(By.id("mark-in-out"));
            markinButton.click();
           Thread.sleep(1000);
            System.out.println("Mark in successful!");
           
            WebElement timeElement = driver.findElement(By.cssSelector(".flex-column.font-small-3 b"));
            String timeText = timeElement.getText();
            System.out.println("Time: " + timeText);       
        } else {
            System.out.println("Login Failed"); 
            System.out.println(" Enter Valid Email And Password ");  
            driver.quit();
        }
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
    }

    public static void forgotPassword(WebDriver driver) throws InterruptedException {
        WebElement forgotPasswordButton = driver.findElement(By.xpath("//button[contains(@class, 'btn') and contains(@class, 'pr-0') and contains(@class, 'font-small-3') and contains(@class, 'blue-grey')]"));
        forgotPasswordButton.click();
        Thread.sleep(2000);
    
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("sunnysingh@gmail.com");
        Thread.sleep(2000);
    
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
        Thread.sleep(5000);

        WebElement okButton = driver.findElement(By.className("swal2-confirm"));
        okButton.click();
        Thread.sleep(2000);
        System.out.println("Forgot Password: Email submitted successfully");
    }
    

    public static void negativeLogin(WebDriver driver) throws InterruptedException {
       
        WebElement EmailAddressField = driver.findElement(By.id("email"));
        EmailAddressField.sendKeys("yoesh.kumar@dev.pincinsure.com");
        Thread.sleep(2000);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Pincdev@123");
        Thread.sleep(2000);

        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(5000); 

      
        if (driver.getCurrentUrl().equals("https://network.staypinc.com/dashboard")) {
            System.out.println("Login Successful");
            // Perform additional actions after successful login (e.g., mark-in)
            WebElement markinButton = driver.findElement(By.id("mark-in-out"));
            markinButton.click();
            Thread.sleep(1000);
            System.out.println("Mark in successful!");
            WebElement markintime = driver.findElement(By.className("flex-column font-small-3 "));
            markintime.click();
            Thread.sleep(1000);
            System.out.println("Mark in successful!");

        } else {    
            System.out.println("Login Failed");
            System.out.println("Enter Valid Usermane and password");
            WebElement okButton = driver.findElement(By.className("swal2-confirm"));
            okButton.click();
            EmailAddressField.clear();
            passwordField.clear();
            Thread.sleep(2000);
            positiveLogin(driver);


           // driver.quit();
        }
                WebElement logoutButton = driver.findElement(By.className("dropdown-toggle"));
                logoutButton.click();
                Thread.sleep(1000);
        
                WebElement logoutLink = driver.findElement(By.cssSelector(".dropdown-menu a:nth-child(2)"));
                logoutLink.click();
                Thread.sleep(2000); 
                positiveLogin(driver);
                logout(driver);
                forgotPassword(driver);
                negativeLogin(driver);


                driver.quit();
               }



               
            
      
        } 

     


