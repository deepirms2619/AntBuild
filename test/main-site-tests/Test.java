import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test {

	public static void main(String args[]) {

		System.out.println("Execution is going on");
		System.out.println("Finished Execution");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
	}
}
