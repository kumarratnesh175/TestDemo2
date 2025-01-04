package orangrhrm;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmDemo {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\DataDriverFramework\\src\\utilities\\datadriver.properties");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("urldata");
		String user = p.getProperty("usernamedata");
		String pass = p.getProperty("passworddata");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get(url);
		d.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
		d.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		d.close();
		
		
	}

}
