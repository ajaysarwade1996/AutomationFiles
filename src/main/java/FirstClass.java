import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class FirstClass
{
    public static void main(String[] args) throws InterruptedException, IOException {


        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com");

//        WebDriver driver1 = new EdgeDriver();
//        driver1.get("https://www.google.com");

        driver.get("D:\\Information Technology\\SOFTWARE TESTING\\Html task\\Html task\\Task1\\signup.html");

        driver.findElement(By.id("firstname")).sendKeys("Ajaykumar");
        driver.findElement(By.name("lastname")).sendKeys("Sarwade");

        driver.findElement(By.id("mobilenumber")).sendKeys("9028085735");
        driver.findElement(By.id("emailid")).sendKeys("ajaysarwade1996@gmail.com");
        driver.findElement(By.id("address")).sendKeys("Rupamata apartments Savedi naka Savedi Ahmednagar");



        List<WebElement> glist = driver.findElements(By.id("gender"));
        for (int i=0;i<glist.size();i++)
        {
            String gvalue = glist.get(i).getAttribute("value");
            if (gvalue.equals("female"))
            {
                glist.get(i).click();
            }
        }



//        List<WebElement> clist = driver.findElements(By.id("language"));
//        for (int j=0;j<clist.size();j++)
//        {
//            String cvalue = clist.get(j).getAttribute("value");
//            if (cvalue.equals("marathi"))
//            {
//                clist.get(j).click();
//            }
//        }



        Select countrydropdown = new Select(driver.findElement(By.name("ctry")));
        countrydropdown.selectByVisibleText("India");
//          countrydropdown.selectByIndex(2);
//            countrydropdown.selectByValue("1");


      List<WebElement> langlist =  driver.findElements(By.id("language"));
      for (int k=0;k<langlist.size();k++)
       {
            langlist.get(k).click();
       }


      Select multidropdown = new Select(driver.findElement(By.id("state")));
      multidropdown.selectByVisibleText("Maharashtra");
      multidropdown.selectByVisibleText("Punjab");
      multidropdown.selectByVisibleText("Madhay Pradesh");
      multidropdown.selectByVisibleText("Utar pradesh");

        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.name("filename"))).click();










/*
      driver.findElement(By.name("submit")).click();

      String strTitle = driver.getTitle();
      System.out.println("Page Title :- "+strTitle);
      //Page title - Welcome will  print in terminal

      String currentUrl = driver.getCurrentUrl();
      System.out.println("Current URL :-"+ currentUrl);
      //Current page url will print in terminal

      String actualsuccessmessage = driver.findElement(By.tagName("p")).getText();
      System.out.println("Actual Success message is:- "+ actualsuccessmessage);
      String expectedsuccessmessage = "Sign Up Successfully.";

      if (actualsuccessmessage.equals(expectedsuccessmessage))
      {
          System.out.println("Signup Done");
          Thread.sleep(3000);
//          driver.findElement(By.linkText("Click Here")).click();
          driver.findElement(By.partialLinkText("Click")).click();
      }
      else
      {
          System.out.println("Signup failed");
      }

      String loginpage = driver.findElement(By.tagName("h1")).getText();
      System.out.println("Login page message is:-"+ loginpage);
      String ExpectedLoginPageMessage = "Login Page";

      if (expectedsuccessmessage.equals(actualsuccessmessage))
      {
          driver.findElement(By.name("userid")).sendKeys("admin");
          driver.findElement(By.name("pswrd")).sendKeys("admin");
      }
      Thread.sleep(2000);
      driver.findElement(By.id("login")).click();

      String AfterLogInPageMessage = driver.findElement(By.tagName("p")).getText();
      System.out.println("After Login Page message is :-"+ AfterLogInPageMessage);

      driver.findElement(By.linkText("Logout")).click();

      Thread.sleep(2000);

//      String LogutPageMessage =  driver.findElement(By.tagName("h1")).getText();
//      System.out.println("Logout Done message is "+ LogutPageMessage);

      String ExpLogutPageMessage = "Login Page";

//      if (LogutPageMessage.equals(ExpLogutPageMessage))
//      {
//          System.out.println("Logout done successfully");
//      }
//      else
//      {
//          System.out.println("Logout is unsuccessfull");
//      }


      //Logout Link present ahe ki nahi te check krnyasathi try krt ahe pn error yet ahe kahitri
//      Boolean lgcheck = driver.findElement(By.linkText("Logout")).isDisplayed();
//      System.out.println("Link is present or not"+ lgcheck);

//      smja lgcheck punha punha write karav lagnar ahe tr webelement tayar karaych...
//        WebElement lgoutout = driver.findElement(By.linkText("Logout"));
//        Boolean lgcheck = lgoutout.isDisplayed();



//      Broweser level validation pahu

//        driver.switchTo().alert().accept();
//          driver.switchTo().alert().dismiss();
            
*/



    }
}