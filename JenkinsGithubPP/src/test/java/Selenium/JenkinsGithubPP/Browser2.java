package Selenium.JenkinsGithubPP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser2 {

	public static void main(String args[])
	{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://the-internet.herokuapp.com/");
		 String S=driver.getTitle();
		 System.out.println(S);
	     driver.quit();
		
	}
}



