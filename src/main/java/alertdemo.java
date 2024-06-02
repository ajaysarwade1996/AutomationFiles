import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertdemo
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("D:\\Information Technology\\SOFTWARE TESTING\\Html task\\Html task\\Task1\\signup.html");

        driver.findElement(By.name("submit")).click();

        String alertText = driver.switchTo().alert().getText();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
//      driver.switchTo().alert().dismiss();
        System.out.println(alertText);

        String ExpectedAlertText = "Please enter First name";

        if (ExpectedAlertText.equals(alertText))
        {
            System.out.println("Blank space validation is successfull");
        }
        else
        {
            System.out.println("Blank space validation is not successfull");
        }

        Thread.sleep(2000);
        driver.findElement(By.id("firstname")).sendKeys("Ajaykumar");
        driver.findElement(By.name("submit")).click();

        String AlertTextLastname = driver.switchTo().alert().getText();
        Thread.sleep(2000);

        System.out.println(AlertTextLastname);
        driver.switchTo().alert().accept();

        String ExpectedLastnameAlert = "Please enter last name";

        if (ExpectedLastnameAlert.equals(AlertTextLastname))
        {
            driver.findElement(By.name("lastname")).sendKeys("Sarwade");
            System.out.println("Last name blank space validation is successfull");
        }
        else
        {
            System.out.println("Last name is not entering");
        }




    }
}
