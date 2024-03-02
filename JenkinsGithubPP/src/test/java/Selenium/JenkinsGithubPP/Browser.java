package Selenium.JenkinsGithubPP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String args[])
	{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.youtube.com/");
		 String S=driver.getTitle();
		 System.out.println(S);
	     driver.quit();
		
	}
}



