import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutTest {     

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

        }
    } 
}









