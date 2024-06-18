import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class oppotunitypool {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Pinc\\Automation\\src\\drivers\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
      
        driver.get("https://network.staypinc.com/login");
        Login(driver);
}
public static void Login(WebDriver driver) throws InterruptedException {

    WebElement EmailAddressField = driver.findElement(By.id("email"));
    EmailAddressField.sendKeys("yogesh.kumar@dev.pincinsure.com");
    Thread.sleep(1000);

    WebElement passwordField = driver.findElement(By.id("password"));
    passwordField.sendKeys("Pincdev@123");
    Thread.sleep(1000);

    WebElement loginButton = driver.findElement(By.id("login"));
    loginButton.click();
    Thread.sleep(1000);

    WebElement opportunity = driver.findElement(By.linkText("Opportunity Pool"));
    opportunity.click();
    Thread.sleep(2000);

    WebElement opportunityPool = driver.findElement(By.cssSelector("a[href='/proposal_pool']"));
    opportunityPool.click();
    Thread.sleep(15000);

    WebElement addOpportunity = driver.findElement(By.cssSelector(".content-header-left:nth-child(2) > ul> li.nav-item > button.btn"));
    addOpportunity.click();
    Thread.sleep(2000);

    WebElement clientType = driver.findElement(By.id("ej2_dropdownlist_0"));
    clientType.sendKeys("lead");
    Thread.sleep(2000);

    WebElement clientName = driver.findElement(By.id("ej2_dropdownlist_1"));
    clientName.sendKeys("7 GREEN SOLAR");
    Thread.sleep(2000);


    /*WebElement opportunityType = driver.findElement(By.id("oppurtunity_type"));
    opportunityType.sendKeys("Fresh");
    Thread.sleep(2000);*/

     WebElement opportunityType1 = driver.findElement(By.id("oppurtunity_type"));
    opportunityType1.sendKeys("Market Roll Over");
    Thread.sleep(2000);

      WebElement policyType = driver.findElement(By.id("policy_type_id"));
      policyType.sendKeys("All Risk Insurance");
      Thread.sleep(2000);

      WebElement Intermediarytype = driver.findElement(By.id("intermediary_type"));
      Intermediarytype.sendKeys("Broker");
      Thread.sleep(2000);

      WebElement brokerType = driver.findElement(By.id("broker_id"));
      brokerType.sendKeys("Broker");
      Thread.sleep(2000);

      WebElement brokerName = driver.findElement(By.id("insurer_id"));
      brokerName.sendKeys("A D NAIK INSURANCE BROKING PRIVATE LIMITED");
      Thread.sleep(1000);

      WebElement insuranceCompany = driver.findElement(By.id("insurer_id"));
      insuranceCompany.sendKeys("ACKO GENERAL INSURANCE LIMITED");
      Thread.sleep(1000);

      WebElement exceptedPremium = driver.findElement(By.id("expected_premium"));
      exceptedPremium.sendKeys("200000");
      Thread.sleep(3000);

      WebElement renewalDate = driver.findElement(By.className("dx-dropdowneditor-icon"));
      renewalDate.click();
      WebElement selectedRenewalDate = driver.findElement(By.cssSelector("td.dx-calendar-today"));
      selectedRenewalDate.click(); 
      Thread.sleep(2000);  

     /*  WebElement clouserDate = driver.findElement(By.className("dx-dropdowneditor-icon"));
      clouserDate.click();
     
      WebElement selectedDate = driver.findElement(By.cssSelector("td.dx-calendar-today"));
      selectedDate.click(); 
      Thread.sleep(2000);  */

      WebElement propabilityRM = driver.findElement(By.id("probability"));
      propabilityRM.sendKeys("25%");
      Thread.sleep(2000);

      WebElement assign = driver.findElement(By.id("product_specialist_id"));
      assign.sendKeys("None");
      Thread.sleep(2000);

      WebElement remark = driver.findElement(By.id("client_remark"));
      remark.sendKeys("Testing");
      Thread.sleep(2000);

      WebElement submitOpportunity = driver.findElement(By.id("save-policy-details"));
      submitOpportunity.click();
      Thread.sleep(2000);


}

}


