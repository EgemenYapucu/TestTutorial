import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tuto2{

	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		System.setProperty("webdriver.chrome.driver","D:\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        	String baseUrl = "http://demo.guru99.com/test/newtours/";
        	String expectedTitle = "Welcome: Mercury Tours";
        	String actualTitle = "";

        	// launch Chrome and direct it to the Base URL
        	driver.get(baseUrl);
	
        	// get the actual value of the title
        	actualTitle = driver.getTitle();

        	/*
         	* compare the actual title of the page with the expected one and print
         	* the result as "Passed" or "Failed"
         	*/
        	if (actualTitle.contentEquals(expectedTitle)){
            		System.out.println("Test Passed!");
        	} else {
            		System.out.println("Test Failed");
        	}
		
      		//close Chrome
        	driver.close();
	}

}
