import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class riMeeting {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\pinc\\PincNetwork\\src\\drivers\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://network.staypinc.com/login");

        Login(driver);


    
}
public static void Login(WebDriver driver) throws InterruptedException {

    WebElement EmailAddressField = driver.findElement(By.id("email"));
    EmailAddressField.sendKeys("yogesh.kumar@dev.pincinsure.com");
    
    WebElement passwordField = driver.findElement(By.id("password"));
    passwordField.sendKeys("Pincdev@123");
   
    WebElement loginButton = driver.findElement(By.id("login"));
    loginButton.click();
    Thread.sleep(1000);

    WebElement meeting= driver.findElement(By.cssSelector("span.menu-title[data-i18n=\"Meetings\"]"));
    meeting.click();
    Thread.sleep(2000);

    WebElement riMeeting= driver.findElement(By.linkText("RI Meetings"));
    riMeeting.click();
   
    WebElement Create= driver.findElement(By.cssSelector("ul.nav.nav-pills.float-right > li.nav-item > button.btn.btn-primary.btn-md.px-1.font-small-3.shadow.round"));
    Create.click();
    
    WebElement meetingType = driver.findElement(By.cssSelector("span.e-input-group-icon.e-ddl-icon.e-search-icon"));
    meetingType.click();
    Thread.sleep(1000);

    WebElement meetingtypeselect = driver.findElement(By.cssSelector(".col-12.col-md-6.col-lg-6 .e-input-group"));
    meetingtypeselect.sendKeys("Existing Client"); 
    Thread.sleep(1000);
    
    WebElement clientType = driver.findElement(By.id("ej2_dropdownlist_1"));
    clientType.sendKeys("cedent");
    Thread.sleep(1000);

    WebElement client = driver.findElement(By.id("ej2_dropdownlist_2"));
    client.sendKeys("AASS");
    Thread.sleep(3000);

    /*WebElement business = driver.findElement(By.cssSelector(".dx-texteditor-input"));
    business.click();
    business.sendKeys("Others");
    Thread.sleep(1000);
    business.click();
    //Thread.sleep(1000);*/

    WebElement startDate = driver.findElement(By.className("dx-dropdowneditor-icon"));
    startDate.click();

    WebElement selectedDate = driver.findElement(By.cssSelector("td.dx-calendar-today"));
    selectedDate.click(); 
    Thread.sleep(3000);

    /*WebElement button = driver.findElement(By.xpath("//button[@class='btn']"));
    button.click();

    WebElement contactName = driver.findElement(By.id("contact_name"));
    contactName.sendKeys("Nilesh Pawar");

    WebElement contactDesignation = driver.findElement(By.id("contact_designation"));
    contactDesignation.sendKeys("Manager");

    WebElement mobileNo = driver.findElement(By.id("contact_phone"));
    mobileNo.sendKeys("8452120252");

    WebElement email = driver.findElement(By.id("contact_email"));
    email.sendKeys("nilepawar@gmail.com");
  
    WebElement department = driver.findElement(By.id("department"));
    department.sendKeys("Back Office");

    WebElement officeno = driver.findElement(By.id("office_number"));
    officeno.sendKeys("222044520");

    WebElement submitc = driver.findElement(By.id("office_number"));
    submitc.click(); */

    WebElement checkBox = driver.findElement(By.id("14250"));
    checkBox.click();
    Thread.sleep(1000);

    WebElement meetingAgenda = driver.findElement(By.id("agenda"));
    meetingAgenda.sendKeys("Testing");

    WebElement meetingDescription = driver.findElement(By.id("description"));
    meetingDescription.sendKeys("Testing RI Metings");
    Thread.sleep(5000);

   // WebElement accompainedBy = driver.findElement(By.id("react-select-2-input"));
   // accompainedBy.sendKeys("Akash Jha");
  //  accompainedBy.click();

    WebElement click = driver.findElement(By.id(".dx-texteditor-input"));
    click.click();










}

}
