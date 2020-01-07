import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;


public class rec {
	 static WebDriver driver;
	    static ATUTestRecorder recorder;
	 
	  
	    
	public static void main(String[] args) throws ATUTestRecorderException 
	{
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
        Date date = new Date();
 
        //create an object of ATUTestRecorder class and pass 3 parameters explained above.
        recorder = new ATUTestRecorder("D:/3D book/","Script_Video_" + dateFormat.format(date), false);
 
        //To start video recording.
        recorder.start();
        
    	driver = new FirefoxDriver();
		Dimension d = new Dimension(1280, 720);
		driver.manage().window().setSize(d);
		
       // driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        
        driver.quit();
        //Stop the recording
        recorder.stop();
          
	}

}
