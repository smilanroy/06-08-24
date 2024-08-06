import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target=new File("E:\\screenshot\\New folder\\screen\\run.jpeg");
		
		FileUtils.copyFile(source, target);
		
		
		
		
		
		
	
		
		
		
		
		
	}
}
