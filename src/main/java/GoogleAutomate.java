import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleAutomate
{
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\\\chrome-win64\\\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("@__suhuuu__");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).submit();

        








        
    }
}
