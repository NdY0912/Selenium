package Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title = driver.getTitle();	//give title of webpage	
		System.out.println(title);
		String url = driver.getCurrentUrl(); //give url of page
		System.out.println(url);
		String page_source = driver.getPageSource(); //give pagesource
		System.out.println(page_source);
		driver.close();//close current window
		driver.quit();//close all windows

		
		
		
		
	}

}
