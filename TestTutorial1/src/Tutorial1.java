import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

};
