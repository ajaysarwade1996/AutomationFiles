import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_2nd
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("D:\\Information Technology\\SOFTWARE TESTING\\Html task\\Html task\\Task1\\signup.html");

        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Ajaykumar");
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Sarwade");
        driver.findElement(By.xpath("//input[@value='male']")).click();

        Select countrydropdown = new Select(driver.findElement(By.xpath("//select[@id='country']")));
        countrydropdown.selectByVisibleText("India");

        driver.findElement(By.xpath("//input[@value='English']")).click();
        driver.findElement(By.xpath("//input[@value='hindi']")).click();

        Select multiplestatedropdownbox = new Select(driver.findElement(By.xpath("//select[@name='state']")));
        multiplestatedropdownbox.selectByVisibleText("Maharashtra");
//        multiplestatedropdownbox.selectByVisibleText("Madhay Pradesh");

        driver.findElement(By.xpath("//input[@id='mobilenumber']")).sendKeys("9028085735");
        driver.findElement(By.xpath("//input[@id='emailid']")).sendKeys("ajaysarwade1996@gmail.com");
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("D-9 Rupamata Apartments Savedi Ahmednagar");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        String TitleString = driver.getTitle();
        System.out.println("Title of the page is:-"+TitleString);
    }
}
