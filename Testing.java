package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
public class testcases {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PRATHYUSHA\\Desktop\\selenium jar files\\chrome driver latest\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		 driver.get("https://www.thesparksfoundationsingapore.org/"); 
		 Thread.sleep(3000);
		 System.out.println("Successfully getting the Sparks Foundation Home Page");
		 driver.manage().window().maximize();
		 System.out.println("The chrome window is maximized");
		 Thread.sleep(3000);
		 //to check the title of the page contains the sparks foundation or not
		 if(driver.getTitle().contains("The Sparks Foundation"))
			 System.out.println("Page title contains the sparks foundation");
		 else
			 System.out.println("Page title doesn't contains the sparks foundation");
		 Thread.sleep(300);
		 driver.findElement(By.linkText("GRIP (Internship)")).click();
		 Thread.sleep(3000);
		 System.out.println("Successfully get into grip internship page");
		 driver.findElement(By.linkText("Why Join Us")).click();
		 Thread.sleep(3000);
		 System.out.println("Clicked the why join us button");
         driver.findElement(By.name("Name")).sendKeys("Prathyusha Katepalli");
		 Thread.sleep(3000);
		 System.out.println("automatically entered the name");
		 driver.findElement(By.name("Email")).sendKeys("prathyushakatepalli99@gmail.com");
		 Thread.sleep(3000);
		 System.out.println("automatically entered the gmailid");
		 driver.findElement(By.linkText("Expert Mentor")).click();
		 Thread.sleep(3000);
		 System.out.println("Successfully clicked the Expert Mentor button");
		 driver.findElement(By.linkText("Events Volunteer")).click();
		 Thread.sleep(3000);
		 System.out.println("Successfully clicked the Expert Volunteer button");
		 driver.findElement(By.linkText("Management Volunteer")).click();
		 Thread.sleep(3000);
		 System.out.println("Successfully clicked the Management Volunteer button");
		 driver.findElement(By.linkText("Contact Us")).click();
		 Thread.sleep(4000);
		 System.out.println("automatically clicked the contact us button");
		 //5 Pages
		 driver.findElement(By.linkText("Jobs at Tech in Asia Portal")).click();
		 Thread.sleep(6000);
		 System.out.println("Successfully get into the jobs at tech in asia portal");
		 //Page - 1 
		 driver.findElement(By.linkText("Jobs at Angel.co Portal")).click();
		 Thread.sleep(6000);
		 System.out.println("Successfully get into the jobs at tech in angel.co portal");
		 //Page - 2
		 driver.findElement(By.linkText("Code for India")).click();
		 Thread.sleep(6000);
		 System.out.println("Successfully get into the jobs at tech in Code for India  Page");
         //Page - 3
		 driver.findElement(By.linkText("Internships at Internshala")).click();
		 Thread.sleep(6000);
		 System.out.println("Successfully get into the Internships at Internshala page");
		 //Page - 4
		 driver.findElement(By.linkText("The Sparks Foundation (Global)")).click();
		 Thread.sleep(6000);
		 System.out.println("Successfully get into the Sparks Foundation global page");
		 //Page - 5
		 driver.close();
		 driver.quit();
	}
}