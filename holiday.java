import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class holiday {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumTest\\CrmTest\\src\\drivers\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://network.staypinc.com/login");
        
        positiveLogin(driver);
    }
        public static String getNextWorkday() {
            // Get today's date
            LocalDate today = LocalDate.now();
    
            // Get tomorrow's date
            LocalDate tomorrow = today.plusDays(1);
    
            // Check if tomorrow is Saturday or Sunday
            if (tomorrow.getDayOfWeek() == DayOfWeek.SATURDAY || tomorrow.getDayOfWeek() == DayOfWeek.SUNDAY) {
                // If tomorrow is Saturday or Sunday, get the date for the next Monday
                tomorrow = tomorrow.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            }
    
            // Define the desired date format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    
            // Format tomorrow's date
            String formattedNextWorkday = tomorrow.format(formatter);
    
            // Return the next workday's date
            return formattedNextWorkday;

}



    public static void positiveLogin(WebDriver driver) throws InterruptedException {

        WebElement EmailAddressField = driver.findElement(By.id("email"));
        EmailAddressField.sendKeys("yogesh.kumar@dev.pincinsure.com");
        Thread.sleep(1000);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Pincdev@123");
        Thread.sleep(1000);

        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement hrmsLink = driver.findElement(By.xpath("//a[@href='/dashboard' and .//span[@class='menu-title' and text()='HRMS']]"));
        hrmsLink.click();
        Thread.sleep(1000);

        WebElement holidays = driver.findElement(By.cssSelector("a.menu-item.main-link.main-sidebar[href=\"/holidays\"]"));
        holidays.click();
        Thread.sleep(1000);

        WebElement addholidays = driver.findElement(By.cssSelector("button.btn.btn-primary.btn-md.px-1.font-small-3.shadow.round"));
        addholidays.click();
        
        WebElement title = driver.findElement(By.id("title"));
        title.sendKeys("Election");

        WebElement date = driver.findElement(By.cssSelector("div.dx-dropdowneditor-icon"));
        date.click();
        
       String tomorrowDate = getNextWorkday();

        WebElement datecell = driver.findElement(By.cssSelector("td.dx-calendar-cell[data-value=\""+tomorrowDate+"\"]"));
        datecell.click();
      
        WebElement type = driver.findElement(By.cssSelector("span.e-input-group-icon.e-ddl-icon.e-search-icon"));
        type.click();

       WebElement typeselect = driver.findElement(By.cssSelector(".col-12.col-md-4.col-lg-4 .e-input-group"));
       typeselect.sendKeys("Holiday"); 



        WebElement dropdown = driver.findElement(By.id("branch_address"));
        dropdown.click();

        WebElement selectAllCheckbox = driver.findElement(By.xpath("//div[contains(@class, 'dx-list-select-all-checkbox')]"));
        selectAllCheckbox.click();
        dropdown.click();

        WebElement shortdescription = driver.findElement(By.id("short_description"));
        shortdescription.sendKeys("India Elections");

        WebElement description = driver.findElement(By.id("description"));
        description.sendKeys("vote your party for better world");

        WebElement submit = driver.findElement(By.id("save_holiday"));
        submit.click();
        Thread.sleep(3000);

        driver.quit();




        




}
}

