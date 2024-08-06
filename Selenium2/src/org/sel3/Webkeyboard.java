package org.sel3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webkeyboard {

	public static void main(String[] args) throws AWTException, InterruptedException  {	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Roy");

		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(3000);
		
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_X);
		robot.keyRelease(KeyEvent.VK_X);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		
		
		

	}

}
