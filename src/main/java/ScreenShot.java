import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenShot
{
    public static void main(String [] args) throws InterruptedException, IOException
    {
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\\\chrome-win64\\\\chrome.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        TakesScreenshot scrShot = ((TakesScreenshot)driver);

        File ScrFile = scrShot.getScreenshotAs(OutputType.FILE);
        System.out.println(ScrFile);

        File DestFile = new File("E:\\Ajay-data\\Automation\\ScreenShot/demo_take_screenshot.png");

        FileHandler.copy(ScrFile , DestFile);

    }
}
