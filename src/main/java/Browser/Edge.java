package Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edge {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiklp27gtf_AhVKDd4KHcJGCB0QPAgI");
		
}
		
		
		
		
	}
