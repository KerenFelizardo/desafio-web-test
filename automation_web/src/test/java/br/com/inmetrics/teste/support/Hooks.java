package br.com.inmetrics.teste.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks{
	public static WebDriver driver;
	
	@Before
	public void beforeTest() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\keren\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.inmrobo.tk/accounts/login/");
	}
	
	@After
	public void afterTest() throws Exception{
		driver.close();
	}
}
