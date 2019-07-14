package tests.Cucumber;

import java.awt.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;

public class StepDefinition {
	WebDriver driver;
	@Before(order=1)
	public void abcert() {
		System.out.println("before Test1");
	}
	@Before(order=2)
	public void abcert1() {
		System.out.println("before Test2");
	}
	@Given("^open the site$")
	public void abc() {
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Govardhan\\Downloads\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");*/
	}
	
	@Then("^Enter the value$")
	public void bbc(io.cucumber.datatable.DataTable abc) throws InterruptedException {
		java.util.List<String> a=abc.asList();
		driver.findElement(By.cssSelector("input[role=\"combobox\"]")).sendKeys(a.get(0));
		Thread.sleep(15000);
	}
	
	@Then("^Enter the (.*) value$")
	public void dbc(String ab) {
		System.out.println(ab);
	}
	
	@Then("^enter the value$")
	public void edc(io.cucumber.datatable.DataTable dt) {
		Map<String,String> st = dt.asMap(String.class, String.class);
		System.out.println(st);
	}
	
	@After(order=2)
	public void tearDown() {
		System.out.println("after Test1");
	}
	@After(order=1)
	public void tearDown1() {
		System.out.println("after Test2");
	}
	WebDriver driver1;
	@Given("^ope the browser$")
	public void opener(){
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium-dependency list\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@When("^navigated to brand site$")
	public void b() {
		driver.get("http://demo.guru99.com/test/newtours/register.php");

		org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(1250, 1000);
		driver.manage().window().maximize();
	}
	Select s;
	@And("^find the element and select value$")
	public void c() {
		s = new Select(driver.findElement(By.cssSelector("select[name='country']")));
		s.selectByIndex(10);
	}
	
	@Then("^deselect the values$")
	public void d() {
		System.out.println(s.getFirstSelectedOption());
	}
	
	@Given("^display the values$")
	public void e() {
		System.out.println(s.getOptions());
	}
	
	@But("^quit the browser$")
	public void f() {
		System.out.println(s.getOptions());
	}
	
	@Given("^login with (.*) and (.*)$")
	public void login(String name,String pass) {
		System.out.println(name+"-----"+pass);
	}
	
	@Given("^user (?:click|tap|clicks|ref) on button$")
	public void login1(String name,String pass) {
		System.out.println(name+"-----"+pass);
	}

}
