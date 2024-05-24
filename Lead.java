import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
public class Lead {
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

        WebElement Lead= driver.findElement(By.cssSelector("span.menu-title[data-i18n=\"Lead\"]"));
        Lead.click();

        WebElement AddLead= driver.findElement(By.cssSelector("li.nav-item > button.btn.btn-primary.btn-md.px-1.font-small-3.shadow.round"));
        AddLead.click();

        WebElement vertical= driver.findElement(By.cssSelector("span.e-input-group-icon.e-ddl-icon.e-search-icon"));
        vertical.click();

        WebElement corporate = driver.findElement(By.cssSelector(".col-12.col-md-6.col-lg-4.col-xl-3 .e-input-group"));
        corporate.sendKeys("Corporate"); 
       

        WebElement CompanyGName = driver.findElement(By.id("company_group_name"));
        CompanyGName.sendKeys("MH Groups"); 

        WebElement CompanyName = driver.findElement(By.id("name"));
        CompanyName.sendKeys("Mahindra Groups of company"); 

        WebElement address = driver.findElement(By.id("address"));
        address.sendKeys(" Centrum Business park Vasi Navi Mumbai "); 

       // WebElement customerCategory = driver.findElement(By.xpath("//div[@class='col-12 col-md-6 col-lg-6']//input[@id='category']"));
       // customerCategory.click();

      
        WebElement emailAddress = driver.findElement(By.id("email"));
        emailAddress.sendKeys(" mahindragroups@gmail.com ");

        //WebElement labelElement = driver.findElement(By.xpath("//label[text()='Customer Category']"));
       // labelElement.click();
        //WebElement state = driver.findElement(By.cssSelector(".col-12.col-md-6.col-lg-6 #state"));
       // state.sendKeys(" MAHARASHTRA "); 

       WebElement pincode = driver.findElement(By.id("pincode"));
       pincode.sendKeys("400042"); 

        WebElement mobileNo = driver.findElement(By.id("mobile"));
        mobileNo.sendKeys("8108332266"); 

        WebElement svgElement = driver.findElement(By.xpath("//button[@class='btn']/*[local-name()='svg']"));
        svgElement.click();





        
        

    


        




}

}
