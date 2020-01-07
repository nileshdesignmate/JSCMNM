import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
 
public class cal {
 
    WebDriver driver;
    ATUTestRecorder recorder;
 
    @Before
    public void setUp() throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
        Date date = new Date();
 
        //create an object of ATUTestRecorder class and pass 3 parameters explained above.
        recorder = new ATUTestRecorder("C:/Recordings/","Script_Video_" + dateFormat.format(date), false);
 
        //To start video recording.
        recorder.start();
    }
 
    @Test
    public void testApp() throws InterruptedException {
    	
    	driver = new FirefoxDriver();
		Dimension d = new Dimension(1280, 720);
		driver.manage().window().setSize(d);
		
       // driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
                   
    }
 
    @After
    public void tearDown() throws ATUTestRecorderException {
         //close browser
         driver.quit();
        //Stop the recording
          recorder.stop();
    }
 
}