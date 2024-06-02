import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartAutomate {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\\\chrome-win64\\\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='Pke_EE']")).clear();
        driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Dhoni");
        driver.findElement(By.xpath("//input[@class='Pke_EE']")).submit();

        driver.findElement(By.linkText("Men Printed Round Neck Polyester Yellow T-Shirt")).click();
        Thread.sleep(1000);
//        driver.findElement(By.linkText("M")).click();
//        driver.findElement(By.className("CDDksN io5kcR zmLe5G dpZEpc")).click();
        Thread.sleep(1000);
    }
}