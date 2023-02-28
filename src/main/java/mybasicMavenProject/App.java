package mybasicMavenProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      WebDriver wd;
      System.setProperty("webdriver.chrome.driver", "Path of Chrome driver file");
      wd =new ChromeDriver();
      wd.get("URL");
      
      //No of Coloumns
      
      List<WebElement> col=wd.findElements(By.xpath("/table/thead/tr/th"));
      System.out.println("No. of Cols are:"+col.size());
      
      
      //No of Rows
      
      List<WebElement> row=wd.findElements(By.xpath("/table/tbody/tr/td[1]"));
      System.out.println("No. of Cols are:"+row.size());
    }
}
