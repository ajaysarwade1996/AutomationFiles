import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomate
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
//      driver.findElement(By.xpath("//input[@dir='auto']")).sendKeys("Apple");
//      driver.findElement(By.xpath("//div[@class='nav-search-field ']/input[@id='twotabsearchtextbox']")).sendKeys("Apple");
//        driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
//        driver.findElement(By.xpath("//a[contains(text(),'Electronics ')]")).click();
//        driver.findElement(By.xpath("//a[contains(@data-csa-c-content-id,'nav_cs_help')]")).click();

//        driver.findElement(By.xpath("//a[contains(@href,'/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help')]")).click();
//          driver.findElement(By.xpath("div[@class='nav-progressive-content']/a[contains(text(),'Customer Service')]")).click();
//        driver.findElement(By.xpath("//a[contains(@data-csa-c-id,'ntl9u9-9f4848-6lyek7-m4r40d')]")).click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
       driver.findElement(By.xpath("(//div[@class='left-pane-results-container']//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();


        
    }
}
