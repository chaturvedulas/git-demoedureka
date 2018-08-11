import org.openqa.selenium.chrome.ChromeDriver;

public class verfiytitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this code uses chromedriver to maximize the window and get the tile of the window
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://www.edureka.co");
       String x = driver.getTitle();
       System.out.println(x);
	}

}
