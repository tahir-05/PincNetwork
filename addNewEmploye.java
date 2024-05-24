import org.openqa.selenium.By;
//mport org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class addNewEmploye {
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
        WebElement hrmsLink = driver.findElement(By.xpath("//a[@href='/dashboard' and .//span[@class='menu-title' and text()='HRMS']]"));
        hrmsLink.click();
        Thread.sleep(2000);

        WebElement addEmployee= driver.findElement(By.xpath("//a[@class='menu-item main-link main-sidebar' and @href='/hrms/registration']"));
        addEmployee.click(); 

        WebElement FirstName = driver.findElement(By.id("first_name"));
        FirstName.sendKeys("Rakhi");

        WebElement lastName = driver.findElement(By.id("last_name"));
        lastName.sendKeys("Sawant");

        WebElement employeeId = driver.findElement(By.id("pinc_employee_id"));
        employeeId.sendKeys("RakS@123");

        WebElement emaild = driver.findElement(By.id("email"));
        emaild.sendKeys("rakhi@gmail.com");

       // WebElement checkBox = driver.findElement(By.xpath("//input[@id='is_on_probation']"));
      //  checkBox.click();

        WebElement mobileNumber = driver.findElement(By.id("mobile_no"));
        mobileNumber.sendKeys("9899554715");

        WebElement genderDropdown = driver.findElement(By.id("gender"));
        genderDropdown.sendKeys("Female");
        genderDropdown.click();

        WebElement entity = driver.findElement(By.xpath("//div[contains(@class, 'dx-texteditor-input-container')]/div[contains(@class, 'dx-tag')]/div[contains(@class, 'dx-tag-content')]/span"));
        entity.click();
       

        //WebElement desiredDateCell = driver.findElement(By.xpath("//td[@data-value='2024/05/17']"));
       // desiredDateCell.click();

       


        














    }

}
