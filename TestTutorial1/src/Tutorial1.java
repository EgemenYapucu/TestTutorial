import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial1 {
	
	public static void main(String[] args) {
		
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// launch Chrome and direct it to the google.com
		driver.get("https://www.google.com");
		
		//close Chrome
		driver.close();
	}

};

