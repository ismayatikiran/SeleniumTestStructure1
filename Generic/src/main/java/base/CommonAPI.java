package base;

import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonAPI {
    public WebDriver driver = null;

    @BeforeMethod
    public void setUp(){
        //System.setProperty();
        driver = new FirefoxDriver();
       // driver.manage().timeouts().implicitlyWait();

 }

    @AfterMethod

    public void cleanUp(){
        driver.close();
    }

}
