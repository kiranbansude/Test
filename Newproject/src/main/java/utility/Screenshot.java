package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void clickScreenshot(WebDriver driver,String name) throws  IOException   {
		
		
        File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


		 LocalDateTime datetime = LocalDateTime.now();  
		 
		 DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm_ss"); 
		 String timestamp = datetime.format(myFormat);
		 
		 File destination =new File("C:\\Users\\Lenovo\\git\\Test\\Newproject\\Screenshot\\New folder" + name + "_" +timestamp+ ".png");
			
			
			FileHandler.copy(source, destination);
			
	}

}
